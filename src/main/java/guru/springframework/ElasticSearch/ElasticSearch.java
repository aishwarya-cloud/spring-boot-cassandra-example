package guru.springframework.ElasticSearch;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qualys.platform.schema.indexing.IndexingEventCreator;
import guru.springframework.domain.model.es.AssetData;
import guru.springframework.domain.model.es.ModuleData;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Slf4j
@Service
public class ElasticSearch {
    @Autowired
  ObjectMapper jacksonObjectMapper;

    public void indexDocument(AssetData assetData2,ModuleData moduleData) throws JsonProcessingException {
        System.out.println("Inside Index Document");
        String assetDataJsonString = null;
        String moduleDataJsonString = null;

        if(moduleData != null)
        {
            ObjectMapper objectMapper = new ObjectMapper();
            moduleDataJsonString = objectMapper.writeValueAsString(moduleData);
        }
        if(assetData2 != null)
        {
            ObjectMapper objectMapper = new ObjectMapper();
            assetDataJsonString = objectMapper.writeValueAsString(assetData2);
        }
        String eventDocument = IndexingEventCreator
                .getInstance()
                .getIndexingEventDocument("qualys_ics_idx_v1",
                        "_doc",
                        assetData2.getAssetUuid(),
                        assetDataJsonString);

        String eventModuleDocument = IndexingEventCreator
                .getInstance()
                .getIndexingEventDocument("qualys_ics_idx_v1",
                        "_doc",
                        moduleData.getModuleId().toString(),
                        moduleDataJsonString);

        // Kafka Configurations
        String bootSrapServer = "127.0.0.1:9092";
        String serializer = "org.apache.kafka.common.serialization.StringSerializer";
        // Create Producer Properties
        Properties properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,bootSrapServer); // "bootstrap.servers"
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, org.apache.kafka.common.serialization.StringSerializer.class.getName()); // "key.serializer"
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,org.apache.kafka.common.serialization.StringSerializer.class.getName()); // "value.serializer"
        try {
            //Create Producer
            KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties);
            //Create a producer record
            ProducerRecord<String, String> assetDataRecord = new ProducerRecord<String, String>("fisrt-topic",assetData2.getAssetUuid(), eventDocument);
            ProducerRecord<String, String> moduleDataRecord = new ProducerRecord<String, String>("fisrt-topic",moduleData.getModuleId().toString(), eventModuleDocument);
            //Send data
            producer.send(assetDataRecord);
            producer.send(moduleDataRecord);
            //flush data
            producer.flush();
            producer.close();
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
        }
    }
}

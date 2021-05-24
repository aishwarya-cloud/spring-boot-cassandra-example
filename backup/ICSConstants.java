package guru.springframework.domain;

public class ICSConstants {

    //Logging Constants
    public static final String CUSTOMER_UUID = "customerUuid";
    public static final String LE_ID = "leId";
    public static final String LE_ASSET_ID = "leAssetIdList";
    public static final String ASSET_UUID = "assetUuid";
    public static final String TIMESTAMP = "timestamp";

    //Kafka configuration constants
    public static String NUM_OF_RETRIES = "num.of.tries";

    // Redis KEY Seperator
    public static final String CACHE_KEY_SEPERATOR = ":";

    //kafka
    public static String KAFKA_RETRY_MESSAGE = "Retrying kafka message : {} on topic : {} with key : {}. Retry count : {}";

    public static final String GENERIC_DEVICE = "generic";

    //Cassandra
    public static final String ASSET_TABLE = "asset";
    public static final String NETWORKPROTOCOL_TABLE = "networkprotocol";
    public static final String PASSIVESENSORDETAILS_TABLE = "passivesensordetails";
    public static final String ASSETPURGELOG_TABLE = "assetpurgelog";
}

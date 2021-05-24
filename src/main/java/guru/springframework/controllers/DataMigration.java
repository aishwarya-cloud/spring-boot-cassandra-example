package guru.springframework.controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import guru.springframework.ElasticSearch.ElasticSearch;
import guru.springframework.domain.Cassandra.Assets;
import guru.springframework.domain.Cassandra.NetworkInterface;
import guru.springframework.domain.Cassandra.NetworkProtocol;
import guru.springframework.domain.Cassandra.PassiveSensorDetails;
import guru.springframework.domain.Cassandra.UDT.AssetMigrate;
import guru.springframework.domain.Oracle.*;
import guru.springframework.domain.model.es.*;
import guru.springframework.repositories.Cassandra.AssetsRepository;
import guru.springframework.repositories.Cassandra.NetworkProtocolRepository;
import guru.springframework.repositories.Oracle.OracleModuleRepository;
import guru.springframework.services.Cassandra.AssetsService;
import guru.springframework.services.Cassandra.NetworkProtocolService;
import guru.springframework.services.Cassandra.PassiveSensorDetailsService;
import guru.springframework.services.Oracle.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service

public class DataMigration {
    private AssetsRepository assetsRepository;
    private OracleModuleRepository oracleModuleRepository;
    private OraclePassiveSensorDetailsService oraclePassiveSensorDetailsService;
    private OracleNetworkInterfaceService oracleNetworkInterfaceService;
    private NetworkProtocolService networkProtocolService;
    private OracleAssetModuleService oracleAssetModuleService;
    private OracleModuleService oracleModuleService;
    private OracleAssetComponentService oracleAssetComponentService;
    private OracleAssetMigrateHistoryService oracleAssetMigrateHistoryService;
    private OracleAssetsService oracleAssetsService;
    private AssetsService assetsService;
    private PassiveSensorDetailsService passiveSensorDetailsService;
    private NetworkProtocolRepository networkProtocolRepository;

    @Autowired
    public void setAssetsRepository(AssetsRepository assetsRepository) {
        this.assetsRepository = assetsRepository;
    }

    @Autowired
    public void setOracleModuleRepository(OracleModuleRepository oracleModuleRepository) {
        this.oracleModuleRepository = oracleModuleRepository;
    }

    @Autowired
    public void setNetworkProtocolRepository(NetworkProtocolRepository networkProtocolRepository) {
        this.networkProtocolRepository = networkProtocolRepository;
    }

    @Autowired
    public void setOraclePassiveSensorDetailsService(OraclePassiveSensorDetailsService oraclePassiveSensorDetailsService) {
        this.oraclePassiveSensorDetailsService = oraclePassiveSensorDetailsService;
    }

    @Autowired
    public void setOracleNetworkInterfaceService(OracleNetworkInterfaceService oracleNetworkInterfaceService) {
        this.oracleNetworkInterfaceService = oracleNetworkInterfaceService;
    }

    @Autowired
    public void setNetworkProtocolService(NetworkProtocolService networkProtocolService) {
        this.networkProtocolService = networkProtocolService;
    }

    @Autowired
    public void setOracleAssetModuleService(OracleAssetModuleService oracleAssetModuleService) {
        this.oracleAssetModuleService = oracleAssetModuleService;
    }
    @Autowired
    public void setOracleAssetComponentService(OracleAssetComponentService oracleAssetComponentService) {
        this.oracleAssetComponentService = oracleAssetComponentService;
    }

    @Autowired
    public void setOracleModuleService(OracleModuleService oracleModuleService) {
        this.oracleModuleService = oracleModuleService;
    }

    @Autowired
    public void setOracleAssetMigrateHistoryService(OracleAssetMigrateHistoryService oracleAssetMigrateHistoryService) {
        this.oracleAssetMigrateHistoryService = oracleAssetMigrateHistoryService;
    }

    @Autowired
    public void setOracleAssetsService(OracleAssetsService oracleAssetsService) {
        this.oracleAssetsService = oracleAssetsService;
    }

    @Autowired
    public void setAssetsService(AssetsService assetsService) {
        this.assetsService = assetsService;
    }
    @Autowired
    public void setPassiveSensorDetails(PassiveSensorDetailsService passiveSensorDetailsService1) {
        this.passiveSensorDetailsService = passiveSensorDetailsService1;
    }

    public Boolean UpdatePassiveSensorDetails()
    {

        PassiveSensorDetails passiveSensorDetails = new PassiveSensorDetails();

        List<PassiveSensorDetails> passiveSensorDetailsList = passiveSensorDetailsService.listAll();

        System.out.println("Passive Sensor List Size is ################"+ passiveSensorDetailsList.size());

        for(PassiveSensorDetails passiveSensorDetails1 : passiveSensorDetailsList) {
            OraclePassiveSensorDetails oraclePassiveSensorDetails = new OraclePassiveSensorDetails();
            oraclePassiveSensorDetails.setCustomerUuid(passiveSensorDetails1.getCustomerUuid().toString());
            if(passiveSensorDetails1.getLeId() != null)
                oraclePassiveSensorDetails.setLeId(passiveSensorDetails1.getLeId());
            if(passiveSensorDetails1.getLocation() != null)
                oraclePassiveSensorDetails.setLocation(passiveSensorDetails1.getLocation());
            if(passiveSensorDetails1.getName() != null)
                oraclePassiveSensorDetails.setName(passiveSensorDetails1.getName());
            if(passiveSensorDetails1.getState() != null)
                oraclePassiveSensorDetails.setState(passiveSensorDetails1.getState().toString());
            try{
                oraclePassiveSensorDetailsService.saveOrUpdate(oraclePassiveSensorDetails);
            }
            catch (Exception e)
            {
                log.error(e.getMessage());
            }

        }


        return true;
    }
    private AssetModule UpdateOracleAssetModule(Long id, OracleModule oracleModule, Assets assets)
    {
        AssetModule assetModule = new AssetModule();

        OracleAssetModule oracleAssetModule = new OracleAssetModule();
        if(oracleModule.getCustomerUuid() != null) {
            oracleAssetModule.setCustomerUuid(oracleModule.getCustomerUuid().toString());
            assetModule.setCustomerUuid(oracleModule.getCustomerUuid().toString());
        }

        if(assets.getAssetUuid() != null) {
            oracleAssetModule.setAssetUuid(assets.getAssetUuid().toString());
            assetModule.setAssetUuid(assets.getAssetUuid().toString());
        }

        if(oracleModule.getModuleUUID() != null) {
            oracleAssetModule.setModuleUuid(oracleModule.getModuleUUID());
            assetModule.setModuleUuid(oracleModule.getModuleUUID());
        }

        if(oracleModule.getFirmwareVersion() != null)
            oracleAssetModule.setFirmwareVersion(oracleModule.getFirmwareVersion());
            if(assets.getFirstSeen() != null)
                oracleAssetModule.setFirstSeen(Date.from(assets.getFirstSeen()));

            if(assets.getLastSeen() != null)
                oracleAssetModule.setLastSeen(Date.from(assets.getLastSeen()));

            if(assets.getModel() != null) {
                oracleAssetModule.setModel(assets.getModel());
                assetModule.setModelName(assets.getModel());
            }

            if(oracleModule.getModuleType() != null)
                oracleAssetModule.setModuleType(oracleModule.getModuleType());

            if(oracleModule.getManufacturer() != null)
                oracleAssetModule.setManufacturer(oracleModule.getManufacturer());

            if(assets.getSerialNo() != null)
                oracleAssetModule.setSerialNo(assets.getSerialNo());

            if(assets.getHardwareVersion() != null)
                oracleAssetModule.setHardwareVersion(assets.getHardwareVersion());

            oracleAssetModule.setAssetRelation(1);
            assetModule.setAssetRelation(1);
            oracleAssetModule.setAssetId(id);
            assetModule.setAssetId(id);
            oracleAssetModule.setModule(oracleModule);
            assetModule.setModuleId(oracleModule.getId());
           try
           {
               oracleAssetModuleService.saveOrUpdate(oracleAssetModule);
               assetModule.setAssetModuleId(oracleAssetModule.getId());
           }
           catch (Exception e)
           {
               log.error(e.getMessage());
           }
        return assetModule;
    }

    private List<AssetModule> UpdateOracleModule(Long id,Assets assets, ModuleData moduleData)
    {
        List<OracleModule> oracleModuleList = oracleModuleRepository.findByFirmwareVersionAndModelAndModuleTypeAndManufacturer(assets.getFirmwareVersion(), assets.getModel() , assets.getHardwareCategory2(), assets.getEquipmentVendor());
        List<AssetModule> assetModuleList = new ArrayList<>();
        AssetModule assetModule = null;

        if(oracleModuleList.size() > 0)
        {
             assetModule = UpdateOracleAssetModule(id, oracleModuleList.iterator().next() , assets);
        }
        else
        {
            OracleModule oracleModule = new OracleModule();
            oracleModule.setModuleUUID(UUID.randomUUID().toString());
            moduleData.setModuleUuid(oracleModule.getModuleUUID());

            if (assets.getCustomerUuid() != null) {
                oracleModule.setCustomerUuid(assets.getCustomerUuid().toString());
                moduleData.setCustomerUuid(assets.getCustomerUuid().toString());
            }

            if (assets.getFirmwareVersion() != null) {
                oracleModule.setFirmwareVersion(assets.getFirmwareVersion());
                moduleData.setFirmwareVersion(assets.getFirmwareVersion());
            }

            if (assets.getModel() != null) {
                oracleModule.setModel(assets.getModel());
                moduleData.setModelName(assets.getModel());
            }

            if (assets.getHardwareCategory2() != null) {
                oracleModule.setModuleType(assets.getHardwareCategory2());
                moduleData.setType(assets.getHardwareCategory2());
            }

            if (assets.getEquipmentVendor() != null) {
                oracleModule.setManufacturer(assets.getEquipmentVendor());
                moduleData.setManufacturer(assets.getEquipmentVendor());
            }

            oracleModule.setVulnCount(0);
            moduleData.setVulnCount(0);

            try {
                this.oracleModuleService.saveOrUpdate(oracleModule);
                moduleData.setModuleId(oracleModule.getId());
            } catch (Exception e) {
                log.error(e.getMessage());
            }
            if (oracleModule.getId() != null) {
                 assetModule = UpdateOracleAssetModule(id, oracleModule, assets);
            }
        }

        assetModuleList.add(assetModule);
        return assetModuleList;
    }

    private Boolean  UpdateOracleAssetComponent(Long id, Assets assets)
    {
        OracleAssets oracleAssets = new OracleAssets();
        OracleAssetComponent oracleAssetComponent = new OracleAssetComponent();
        oracleAssetComponent.setAssetId(id);
        if(assets.getCustomerUuid() != null)
            oracleAssetComponent.setCustomerUuid(assets.getCustomerUuid().toString());

        if(assets.getAssetUuid() != null)
            oracleAssetComponent.setAssetUuid(assets.getAssetUuid().toString());

        if(assets.getSerialNo()!= null)
            oracleAssetComponent.setSerialNo(assets.getSerialNo());

        if(assets.getHardwareVersion() != null)
            oracleAssetComponent.setHardwareVersion(assets.getHardwareVersion());

        if(assets.getFirmwareVersion() != null)
            oracleAssetComponent.setFirmwareVersion(assets.getFirmwareVersion());

        if(assets.getModel() != null)
            oracleAssetComponent.setModel(assets.getModel());

        try
        {
            this.oracleAssetComponentService.saveOrUpdate(oracleAssetComponent);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
        }
        return true;
    }

    private Boolean UpdateOracleAssetMigrateHistory(Long OracleId, Assets assets)
    {
        Set<AssetMigrate> assetMigrateHistorySet = assets.getAssetMigrateHistory();
        for(AssetMigrate assetMigrate:assetMigrateHistorySet)
        {
            OracleAssetMigrateHistory oracleAssetMigrateHistory = new OracleAssetMigrateHistory();
            oracleAssetMigrateHistory.setCustomerUuid(assets.getCustomerUuid().toString());
            oracleAssetMigrateHistory.setAssetUuid(assets.getAssetUuid().toString());
            oracleAssetMigrateHistory.setAssetId(OracleId);
            oracleAssetMigrateHistory.setFirstSeen(Date.from(assetMigrate.getFirstSeen()));
            oracleAssetMigrateHistory.setLastSeen(Date.from(assetMigrate.getLastSeen()));
            oracleAssetMigrateHistory.setLeId(assetMigrate.getLeId());
            try
            {
                oracleAssetMigrateHistoryService.saveOrUpdate(oracleAssetMigrateHistory);
            }
            catch(Exception e)
            {
                log.error(e.getMessage());
            }
        }
        return true;
    }

    public Boolean UpdateOracleAssets()
    {

        Assets assets;
        assets = new Assets();
        //List<Assets> assetsList = assetsRepository.findByCustomerUuidAndAssetUuid(UUID.fromString("88962fea-4a5a-6d95-812d-9224902b2d50"),UUID.fromString("866111c9-d38b-4606-8c81-c4d27d46a937"));
        List<Assets> assetsList = assetsRepository.findByCustomerUuidAndAssetUuid(UUID.fromString("9d4a26dc-4891-e9b6-818c-89d638a32ef4"),UUID.fromString("31f34b72-bca7-46df-a68d-2301da509787"));
        //List<Assets> assetsList = assetsRepository.findByCustomerUuidAndAssetUuid(UUID.fromString("9d4a26dc-4891-e9b6-818c-89d638a32ef4"),UUID.fromString("31f34b72-bca7-46df-a68d-2301da509787"));
        //List<Assets> assetsList = assetsService.listAll();

        System.out.println("Asset List Size is ################"+ assetsList.size());
        Iterator<Assets> assetsIterator = assetsList.iterator();
      //  List<NetworkProtocol> networkProtocolsList = networkProtocolService.listAll();
        AssetData assetData = new AssetData();
        for(Assets assets1 : assetsList)
        {
            OracleAssets oracleAssets = new OracleAssets();
            if(assets1.getCustomerUuid() != null)
            {
                oracleAssets.setCustomerUuid(assets1.getCustomerUuid().toString());
                assetData.setCustomerUuid(assets1.getCustomerUuid().toString());
            }
            if(assets1.getAssetUuid() != null)
            {
                oracleAssets.setAssetUuid(assets1.getAssetUuid().toString());
                assetData.setAssetUuid(assets1.getAssetUuid().toString());
            }
            if(assets1.getAddress() != null)
            {
                oracleAssets.setAddress(assets1.getAddress());
                assetData.setAddress(assets1.getAddress());
            }
            if(assets1.getCategory() != null)
            {
                oracleAssets.setCategory(assets1.getCategory());
            }
            if(assets1.getCriticality() != null)
                oracleAssets.setCriticality(assets1.getCriticality());

            if(assets1.getDeviceLocation() != null)
                oracleAssets.setDeviceLocation(assets1.getDeviceLocation());

            if(assets1.getEquipmentVendor() != null)
                oracleAssets.setEquipmentVendor(assets1.getEquipmentVendor());

            if(assets1.getFirmwareVersion() != null)
                oracleAssets.setFirmwareVersion(assets1.getFirmwareVersion());

            if(assets1.getFirstSeen() != null)
            {
                oracleAssets.setFirstSeen(Date.from(assets1.getFirstSeen()));
                assetData.setFirstSeen(Date.from(assets1.getFirstSeen()).getTime());
            }
            if(assets1.getImportance() != null)
            {
                oracleAssets.setImportance(assets1.getImportance());
                assetData.setImportance(assets1.getImportance());
            }
            if(assets1.getLastSeen() != null)
            {
                oracleAssets.setLastSeen(Date.from(assets1.getLastSeen()));
                assetData.setLastSeen(Date.from(assets1.getLastSeen()).getTime());
            }
            if(assets1.getLeId()!= null)
            {
                oracleAssets.setLeId(assets1.getLeId());
                assetData.setLeId(assets1.getLeId());
            }
            if(assets1.getMacAddress() != null)
            {
                oracleAssets.setMacAddress(assets1.getMacAddress());
                assetData.setMacAddress(assets1.getMacAddress());
            }
            if(assets1.getMacVendor() != null)
                oracleAssets.setMacVendor(assets1.getMacVendor());

            if(assets1.getModel() != null)
            {
                oracleAssets.setModel(assets1.getModel());
                assetData.setModel(assets1.getModel());
            }

            if(assets1.getName() != null)
            {
                oracleAssets.setName(assets1.getName());
                assetData.setName(assets1.getName());
            }

            if(assets1.getDiscoveryProtocol() != null)
                oracleAssets.setDiscoveryProtocols(assets1.getDiscoveryProtocol().toString());

            if(assets1.getDomainName() != null)
                oracleAssets.setDomainName(assets1.getDomainName());

            if(assets1.getHardwareCategory1() != null)
                oracleAssets.setHardwareCategory1(assets1.getHardwareCategory1());

            Hardware hardware = new Hardware();
            if(assets1.getHardwareCategory2() != null)
            {
                oracleAssets.setHardwareCategory2(assets1.getHardwareCategory2());
                hardware.setCategory2(assets1.getHardwareCategory2());
                assetData.setHardware(hardware);
            }
            if(assets1.getHardwareVersion() != null)
            {
                oracleAssets.setHardwareVersion(assets1.getHardwareVersion());
            }

            if(assets1.getDeleted() != null)
                oracleAssets.setDeleted(assets1.getDeleted());

            if(assets1.getLastModified() != null)
                oracleAssets.setLastModified(Date.from(assets1.getLastModified()));

            if(assets1.getLastModifiedBy() != null)
                oracleAssets.setLastModifiedBy(assets1.getLastModifiedBy());

            if(assets1.getOs() != null)
                oracleAssets.setOs(assets1.getOs());

            if(assets1.getPlantLocation() != null)
                oracleAssets.setPlantLocation(assets1.getPlantLocation());

            if(assets1.getProduct() != null)
                oracleAssets.setProduct(assets1.getProduct());

            if(assets1.getPurdueLevel() != null)
                oracleAssets.setPurdueLevel(assets1.getPurdueLevel());

            if(assets1.getRedundancy() != null)
                oracleAssets.setRedundancy(assets1.getRedundancy());

            if(assets1.getSerialNo() != null)
            {
                oracleAssets.setSerialNo(assets1.getSerialNo());
                assetData.setSerialNumber(assets1.getSerialNo());
            }

            if(assets1.getState() != null)
                oracleAssets.setState(assets1.getState());

            if(assets1.getType() != null)
                oracleAssets.setType(assets1.getType());

            this.oracleAssetsService.saveOrUpdate(oracleAssets);
            Long id = oracleAssets.getId();
            if (id != null)
            {
                if (assets1.getAssetMigrateHistory() != null) {
                    UpdateOracleAssetMigrateHistory(id,assets1);
                    System.out.println("Got Asset Migrate data");
                }
                UpdateOracleAssetComponent(id, assets1);
                List<Interface> interfacesList = UpdateNetworkInterface(id, assets1);
                assetData.setInterfaces(interfacesList);
                ModuleData moduleData = new ModuleData();
                List<AssetModule> assetModule = UpdateOracleModule(id,assets1,moduleData);
                assetData.setAssetModules(assetModule);

                ElasticSearch elasticSearch = new ElasticSearch();
                try
                {
                    elasticSearch.indexDocument(assetData,moduleData);
                }
                catch (Exception e)
                {
                    log.error(e.getMessage());
                }
            }
        }
        return true;
    }

    private List<Interface> UpdateNetworkInterface(Long id, Assets assets)
    {
        List<Interface> interfacesList = new ArrayList();
        try
        {
            Map<String, String> networkInterfaceMap = assets.getNetworkInterfaces();
            if (null != networkInterfaceMap && !networkInterfaceMap.isEmpty())
            {
                for (Map.Entry<String, String> entry : networkInterfaceMap.entrySet())
                {
                    Interface ifs = new Interface();
                    String networkInterface = entry.getValue();
                    NetworkInterface networkInterface1 = new ObjectMapper().readValue(networkInterface, NetworkInterface.class);
                    OracleNetworkInterface oracleNetworkInterface = new OracleNetworkInterface();
                    oracleNetworkInterface.setAssetId(id);
                    oracleNetworkInterface.setCustomerUuid(assets.getCustomerUuid().toString());
                    oracleNetworkInterface.setAssetUuid(assets.getAssetUuid().toString());
                    if(networkInterface1.getAddress() != null) {
                        oracleNetworkInterface.setAddress(networkInterface1.getAddress());
                        ifs.setAddress(networkInterface1.getAddress());
                    }
                    if(networkInterface1.getMacAddress() != null) {
                        oracleNetworkInterface.setMacAddress(networkInterface1.getMacAddress());
                        ifs.setMacAddress(networkInterface1.getMacAddress());
                    }
                    if (networkInterface1.getLastSeen() != null)
                        oracleNetworkInterface.setLastSeen(new Date(networkInterface1.getLastSeen()));
                    if(networkInterface1.getGatewayIps() != null) {
                        oracleNetworkInterface.setGatewayIPs(networkInterface1.getGatewayIps().toString());
                        Set<String> set = new HashSet<String>();
                        set.add(networkInterface1.getGatewayIps().toString());
                        ifs.setGatewayIps(set);
                    }
                    if(networkInterface1.getDnsServers() != null)
                        oracleNetworkInterface.setDnsServers(networkInterface1.getDnsServers().toString());

                    List<NetworkProtocol> networkProtocolsList2 = null;
                    try
                    {
                        if(networkInterface1.getAddress() != null)
                         networkProtocolsList2 = networkProtocolRepository.findByCustomerUuidAndAssetUuidAndInterfaceKey(assets.getCustomerUuid(),assets.getAssetUuid(), networkInterface1.getAddress());
                    }
                    catch (Exception e)
                    {
                        log.error(e.getMessage());
                    }

                    if(networkProtocolsList2 != null)
                    {
                        System.out.println("network protocol=="+ networkProtocolsList2.iterator().next().getProtocols());
                        if(networkProtocolsList2.iterator().next().getProtocols() != null)
                        {
                            Set<String> setProtocols = new HashSet<String>();
                            StringJoiner commaSeperatedProtocols = new StringJoiner(",");
                            Iterator<String> protocolSetItr = networkProtocolsList2.iterator().next().getProtocols().iterator();
                            while (protocolSetItr.hasNext())
                            {
                                String protocolName = protocolSetItr.next();
                                commaSeperatedProtocols.add(protocolName);
                                setProtocols.add(protocolName);
                            }
                            oracleNetworkInterface.setProtocols(commaSeperatedProtocols.toString());
                            ifs.setProtocols(setProtocols);
                            System.out.println("list of protocols"+commaSeperatedProtocols.toString());
                        }
                    }
                    interfacesList.add(ifs);
                    oracleNetworkInterfaceService.saveOrUpdate(oracleNetworkInterface);
                }
            }
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
        }
        return interfacesList;
    }
}


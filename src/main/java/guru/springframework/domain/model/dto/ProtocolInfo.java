package guru.springframework.domain.model.dto;

import lombok.Data;

@Data
public class ProtocolInfo {
    private ProtocolField hostname;
    private ProtocolField systemStatus;
    private ProtocolField deviceType;
    private ProtocolField vendorName;
    private ProtocolField firmwareVersion;
    private ProtocolField modelName;
    private ProtocolField deviceId;
    private ProtocolField vendorId;
}

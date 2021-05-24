package guru.springframework.domain.model.redis;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class ProtocolInfoPojo implements Serializable {
    private ProtocolFieldPojo hostname;
    private ProtocolFieldPojo systemStatus;
    private ProtocolFieldPojo deviceType;
    private ProtocolFieldPojo vendorName;
    private ProtocolFieldPojo firmwareVersion;
    private ProtocolFieldPojo modelName;
    private ProtocolFieldPojo deviceId;
    private ProtocolFieldPojo vendorId;
    private ProtocolFieldPojo description;
    private ProtocolFieldPojo product;
    private ProtocolFieldPojo serialNo;
    private ProtocolFieldPojo hardwareVersion;
    private ProtocolFieldPojo firmwareExpansion;
    private ProtocolFieldPojo orderId;
    private ProtocolFieldPojo location;
    private ProtocolFieldPojo macaddress;
    private ProtocolFieldPojo productCode;
    private ProtocolFieldPojo rackNo;
    private ProtocolFieldPojo slotNo;
}

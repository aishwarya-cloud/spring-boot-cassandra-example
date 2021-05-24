package guru.springframework.domain.model.db;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by vkakad on 11/25/2020
 */
@Entity
@Table(name = "PASSIVE_SENSOR")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class PassiveSensor {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "LE_ID")
    private String leId;

    @Column(name = "CUSTOMER_UUID")
    private String customerUuid;

    @Column(name = "STATE")
    private String state;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LOCATION")
    private String location;
}

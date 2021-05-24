package com.qualys.ics.model.datastax.udts;

import com.datastax.driver.mapping.annotations.Field;
import com.datastax.driver.mapping.annotations.UDT;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@UDT(keyspace = "qualys_ics", name="assetmigrate")
public class AssetMigrate {
    @Field
    private String leId;
    //private String sensorName;
    //private String location;
    @Field
    private Instant firstSeen;
    @Field
    private Instant lastSeen;

    @Override
    public int hashCode(){
        return this.getLeId().hashCode();
    }

    @Override
    public boolean equals(Object obj){

        if(this==obj)
            return true;
        if(obj==null || !(obj instanceof AssetMigrate))
            return false;
//        if(this.getFirstSeen()!=null && ((AssetMigrate) obj).getLeId()!=null)
//            return this.getLeId().equals(((AssetMigrate) obj).getLeId()) && this.getFirstSeen().equals(((AssetMigrate) obj).getFirstSeen());
        else
            return this.getLeId().equals(((AssetMigrate) obj).getLeId());
    }
}

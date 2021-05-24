package guru.springframework.domain.model.enums;

/**
 * Created by vkakad on 1/29/2021
 */
public enum AssetRelation {

    PARENT(1),
    CHILD(2);

    private int relation;

    AssetRelation(int relation){
        this.relation = relation;
    }

    public int getRelation(){
        return this.relation;
    }
}

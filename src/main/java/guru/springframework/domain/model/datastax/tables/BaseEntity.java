package guru.springframework.domain.model.datastax.tables;



import java.io.Serializable;

public abstract class BaseEntity<T extends BaseEntity> implements Serializable {

    private static final long serialVersionUID = 7741236749050830159L;

    public T convertToESType(){
        throw new UnsupportedOperationException("This operation is not supported.");
    }

    public T convertToCasType(){
        throw new UnsupportedOperationException("This operation is not supported.");
    }
}


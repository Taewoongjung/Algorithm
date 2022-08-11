package test.generic;

import java.io.Serializable;

public class GenericDTO<T> implements Serializable {
    private T object;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "GenericDTO{" +
                "object=" + object +
                '}';
    }
}

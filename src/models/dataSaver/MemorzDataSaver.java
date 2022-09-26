package models.dataSaver;

public class MemorzDataSaver<T> implements DataSaver<T>{
    private T data;
    @Override
    public void Save(T a) {
        data = a;
    }

    @Override
    public T load() {
        return data;
    }
}

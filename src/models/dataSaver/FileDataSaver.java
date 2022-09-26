package models.dataSaver;

public class FileDataSaver<T> implements DataSaver{
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

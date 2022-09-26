package models;

public class Pair<K,V> {
    private K key;
    private V value;

    public  Pair(K key, V value){
        //this odkayuje na prom ve tride
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

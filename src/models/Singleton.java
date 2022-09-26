package models;

public class Singleton {
    private static String conn;

    public String getConn(){
        if (conn == null) {
            conn  = "open";
        }
        return conn;
    }
}

package models;

public class ExampleClass {
    public int x = 10;
    private int y = 15;
    protected float f1 = 10f;

    public void publicMethod(){
        privateMethod();
        protectedMethod();
    }
    private void privateMethod(){

    }

    protected void protectedMethod(){

    }

    //vnitrni trida - pristupuje se postupne- * nejdriv k ExampleClass
    public class InnerClass{
        public static final int x = 16;
    }
}

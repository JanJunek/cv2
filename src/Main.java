import models.*;
import models.dataSaver.DataSaver;

public class Main {
        public static void main (String[] args){
            System.out.println("dsd");

            ExampleClass exCls = new ExampleClass();
            System.out.println(exCls.x);
            exCls.publicMethod();

            System.out.println(MyMath.pi);

            System.out.println(MyMath.sum(5,8));

            //MyMath aa = new MyMath();

            //pristupovani do vnitrni tridy (nested class)
            System.out.println(ExampleClass.InnerClass.x);

            Box<ExampleClass> box = new Box<>(exCls);

            Box<String> boxString = new Box<>("ahoj");

            Pair<Integer, String> myPair = new  Pair<>(1, "Praha");
            Pair<Integer, String> myPair2 = new  Pair<>(2, "Hradec");

            Car car1 = new Car("skoda");

            DataSaver<Integer> mySaver;

            printStar(5);

            try{
                System.out.println("Saving");
                throw new Exception("File is locked")
            }
            catch (Exception e){
                System.out.println("soubor je uzamcen");
            }

        }
        //rekurze, volani sama sebe
        private static void printStar(int x){
            if (x<1) {
                return;
            }
            System.out.println("*");
            x = x-1;
            printStar(x--);
        }
    }

//VNITRNI TRIDY
//PRIVATE..
//VLAKNO
//XML otazky - co to je - jendoduchy znackovaci jazyk
//VCS - co to je, k cemu to je
//PROTOKOL - standart, podle ktereho probiha komunikace (SSH, HTTP...)
//SOCKET - trida, ktera implementuje sitovou komunikaci
//cv1 a cv2
//doplnovani a vybirani moznosti
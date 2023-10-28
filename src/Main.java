import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int  [] apples = new int [3];
        apples [0]= 1;
        apples [1]= 2;
        apples [2]=3;

        double  [] cats = new double [4];
        cats [0]= 1.57;
        cats [1]= 7.654;
        cats [2]=9.986;

        int  [] spices = new int [] {2,3,6,8,0 };


        System.out.println("Задача 2");
        for (int i =0; i< apples.length; i++) {
            System.out.print(apples[i]);
            if (i != apples.length- 1){
                System.out.print(" ,");
            }
        }
        System.out.println( );

        for (int i =0; i< cats.length; i++) {
            System.out.print( cats [i]);
            if(i != cats.length- 1){
                System.out.print(" ,");
            }
        }
        System.out.println( );
        for (int i =0; i< spices.length; i++) {
            System.out.print(" "  + spices[i]);
            if(i != spices.length-1 ){
                System.out.print(" ,");
            }
        }
        System.out.println( );

        System.out.println("Задача 3");
        for (int i = apples.length - 1; i >= 0; i--) {
            System.out.print(apples[i]);
            if (i !=0) {
                System.out.print(" ,");
            }
        }
        System.out.println();

        for (int i = cats.length - 1; i >= 0; i--) {
            System.out.print(cats[i]+" ");
            if(i !=0){
                System.out.print(" ,");
            }
        }
        System.out.println( );
        for (int i = spices.length - 1; i >= 0; i--) {
            System.out.print(spices[i]+" ");
            if(i !=0){
                System.out.print(" ,");
            }
        }
        System.out.println( );
        System.out.println("Задача 4");
        for (int i =0; i< apples.length; i++) {
            if (apples[i] % 2 !=0){
                apples[i]++;
                System.out.println(Arrays.toString(apples));
            }
        }

    }
}

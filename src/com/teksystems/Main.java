package com.teksystems;

public class Main {

    public static void main(String[] args) {


        //   for (int x = 1; x <= 10; x++)
        //    System.out.println(x);






        //     int x=0;
        //     while (x<=100); {
        //     System.out.println(x);
        //    }
        //   x++;






            /*
            int x=1;
                do {
                System.out.println(x);
                    x++;
            }
                while (x<11);
             */





        // need to make range to omit
        /*
        for (int i = 1; i < 101; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
        }





        for (int x = 0; x < 101; x++) {
            if (x % 5 ==0) {
                System.out.println(x);
            }
        }






           //Nested for Loop
        for (int w = 1; w < 3; w++) {
            System.out.println("Week: " + w);
            for (int d = 1; d < 6; d++) {
                System.out.println("Day " + d);
            }
        }
                */






        //Fibonacci Sequence
        int u = 0;
        int k = 1;
        System.out.println(u);
        System.out.println(k);

        for (int i = 2; i < 51; i++) {
            int v = u + k;
            System.out.println(" " + v);
            u = k;
            k = v;
        }


    }

}


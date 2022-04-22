package ru.skypro;

public class Main {

    public static void main(String[] args) {

        int [] mass1 = new int [3];
        mass1[0] = 1;
        mass1[1] = 2;
        mass1[2] = 3;
        for (int i = 0; i < mass1.length - 1; i++) {
            System.out.print(mass1[i] + ", ");
        }
        System.out.print(mass1[mass1.length - 1]);
        System.out.println();
        for (int i = mass1.length - 1; i >= 0; i--) {
            System.out.print(mass1[i]);
            if(i!= 0) {
                System.out.print(", ");
            }
        }
//==========================================================================================================
        System.out.println();
        double [] mass2 = {1.57, 7.654, 9.986};
        for (int x = 0; x < mass2.length - 1; x++) {
            System.out.print(mass2[x] + ", ");
        }
        System.out.print(mass2[mass2.length - 1]);
        System.out.println( );
        for (int x = mass2.length - 1; x >= 0; x--) {
            System.out.print(mass2[x]);
            if (x!= 0) {
                System.out.print(", ");
            }
        }
//==========================================================================================================
        System.out.println();
        byte [] mass3 = {-1, -2, -3};
        for (int a = 0; a < mass3.length - 1; a++) {
            System.out.print(mass3[a] + ", ");
        }
        System.out.print(mass3[mass3.length - 1]);
        System.out.println( );
        for (int a = mass3.length - 1; a >= 0; a--) {
            System.out.print(mass3[a]);
            if (a!= 0) {
                System.out.print(", ");
            }
        }
        //Задача 4 ============================================================================================
        System.out.println();
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] % 2 != 0) {
                mass1[i] = mass1[i] + 1;
            }
            System.out.print(mass1[i]);
            if (i!= mass1.length - 1) {
                System.out.print(", ");
            }
        }




    }
}

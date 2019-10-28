package atividade02;

public class Exercicio01 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, d = 0;
        int res;
        int numero[][] = null;
        System.out.println("-------------------------------------------------------------------------------------------------");
        for (c = 1; c <= 5; c++) {
            System.out.print("|   tabuada do " + c + "   ");
            if (c == 5) {
                System.out.print("|");
            }
        }
        System.out.println("");
        for (a = 0; a <= 10; a++) {

            for (b = 1; b <= 5; b++) {

                res = a * b;

                if (res >= 10 && a <= 9) {
                    System.out.print("|   " + b + "  *  " + a + " =  " + res + "  ");
                } else if (a == 10) {
                    System.out.print("|   " + b + "  * " + a + " =  " + res + "  ");
                } else {
                    System.out.print("|   " + b + "  *  " + a + " =  " + res + "   ");
                }

                if (b == 5) {
                    System.out.println("|");
                }
            }

        }
        System.out.println("-------------------------------------------------------------------------------------------------");
        for (c = 6; c <= 10; c++) {
            System.out.print("|   tabuada do " + c + "   ");
            if (c == 10) {
                System.out.print("|");
            }
        }
        System.out.println("");
        for (a = 0; a <= 10; a++) {
            for (b = 6; b <= 10; b++) {

                res = a * b;

                if (res >= 10 && a <= 9) {
                    System.out.print("|   " + b + "  *  " + a + " =  " + res + "  ");
                } else if (a == 10) {
                    System.out.print("|   " + b + "  * " + a + " =  " + res + "  ");
                } else {
                    System.out.print("|   " + b + "  *  " + a + " =  " + res + "   ");
                }
                if (b == 10) {
                    System.out.println("|");
                }

            }
        }
        System.out.println("-------------------------------------------------------------------------------------------------");

    }

}

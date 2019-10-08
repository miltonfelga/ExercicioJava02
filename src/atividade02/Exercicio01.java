package atividade02;

public class Exercicio01 {
    public static void main(String[] args) {
        int a=0,b=0,c=0,d=0;
        int res;
        int numero[][] = null,tabuada[][];
        
        for (a=0;a<=10;a++){
            System.out.println("Tabuada do "+numero[a][b]);
            for(b=0;b<=10;b++){
                res=a*b;
                System.out.println(a+" * "+b+" = "+res);
                if(b==10){
                    System.out.println("");
                }
            }
        }
        
    }
    
}

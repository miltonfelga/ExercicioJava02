package atividade02;

import javax.swing.JOptionPane;


public class Exercicio02 {
    public static void main(String[] args) {
        int i,j,media;
        int notas [][]=new int[4][4];
        String aux = null;
        
        for(i=1;i<=6;i++){
            for(j=1;j<=2;j++){
                System.out.println(i);
                System.out.println(j);
                aux = JOptionPane.showInputDialog("Aluno "+i+ " ,nota "+j);
                notas[i][j]=Integer.parseInt(aux);
                
                media=(i+j)/2;
                JOptionPane.showMessageDialog(null, media);
        
            }
        }
        
    }   
}

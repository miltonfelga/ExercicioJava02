package atividade02;

import javax.swing.JOptionPane;

public class Atividade02 {

    public static void main(String[] args) {
        String st = null, aux = null;
        int menu = 0;

        try {
            aux = JOptionPane.showInputDialog(null, "Escolha o exercicio de 1 a 4 ");
            menu = Integer.parseInt(aux);
            switch (menu) {
                case 1:
                    st = "Exercicio 01";
                    Exercicio01.main(args);
                    break;
                case 2:
                    st = "Exercicio 02";
                    Exercicio02.main(args);
                    break;
                case 3:
                    st = "Exercicio 03";
                    Exercicio03.main(args);
                    break;
                case 4:
                    st = "Exercicio 04";
                    Exercicio04.main(args);
                    break;

                default:
                    st = "Inexistente !";
                    JOptionPane.showMessageDialog(null, "Numero invalido , tente novamente de 1 a 4");
                    Atividade02.main(args);
                    
            }
            
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numericos");
            Atividade02.main(args);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
            System.exit(0);
        }

    }

}

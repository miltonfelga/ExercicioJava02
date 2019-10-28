package atividade02;

import javax.swing.JOptionPane;

public class Exercicio03 {

    public static void main(String[] args) {

        int pessoa, idade, qtde = 0;
        double altura, menoraltura = 30, maioraltura = 0, media = 0;
        int hvelho = 0, mvelha = 0;
        String aux, sexo;
        String pessoas[][] = new String[10][10];

        for (pessoa = 1; pessoa < 5; pessoa++) {
            aux = JOptionPane.showInputDialog(null, "Informe a altura da pessoa " + pessoa);
            altura = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog(null, "Informe a idade da pessoa " + pessoa);
            idade = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog(null, "Informe o sexo da pessoa " + pessoa + " (M ou F)");
            sexo = aux;

            if (altura < menoraltura) {
                menoraltura = altura;
            }

            if (altura > maioraltura) {
                maioraltura = altura;
            }

            if ("F".equals(sexo)) {
                qtde = qtde + 1;
                media = media + altura;
                if (idade > mvelha) {
                    mvelha = idade;
                }
            }

            if ("M".equals(sexo)) {
                if (idade > hvelho) {
                    hvelho = idade;
                }
            }
        }
        media = media / qtde;
        JOptionPane.showMessageDialog(null, "Maior altura :" + maioraltura + " Menor altura :" + menoraltura);
        JOptionPane.showMessageDialog(null, "Media de altura das mulheres: " + media);
        JOptionPane.showMessageDialog(null, "Homem mais velho: " + hvelho);
        JOptionPane.showMessageDialog(null, "Mulher mais velha: " + mvelha);
    }
}

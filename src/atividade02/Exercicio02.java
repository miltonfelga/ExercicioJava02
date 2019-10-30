package atividade02;

import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {
        int aluno, nota, media, mediasala = 0;
        int reprovados = 0, exame = 0, aprovados = 0;
        int notas[][] = new int[7][7];
        String aux = null;
        try {
            for (aluno = 1; aluno <= 6; aluno++) {
                media = 0;
                for (nota = 1; nota <= 2; nota++) {

                    aux = JOptionPane.showInputDialog("Aluno " + aluno + " ,nota " + nota);
                    notas[aluno][nota] = Integer.parseInt(aux);

                    media = media + notas[aluno][nota];

                    if (nota == 2) {
                        media = media / 2;
                        JOptionPane.showMessageDialog(null, "media: " + media);

                        mediasala = mediasala + media;

                        if (media < 3) {
                            reprovados = reprovados + 1;
                            JOptionPane.showMessageDialog(null, "Reprovado");
                        }
                        if (media >= 3 && media <= 7) {
                            exame = exame + 1;
                            JOptionPane.showMessageDialog(null, "Exame");
                        }
                        if (media > 7) {
                            aprovados = aprovados + 1;
                            JOptionPane.showMessageDialog(null, "Aprovado");
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Alunos reprovados: " + reprovados);
            JOptionPane.showMessageDialog(null, "Alunos em exame: " + exame);
            JOptionPane.showMessageDialog(null, "Alunos aprovados: " + aprovados);
            mediasala = mediasala / 6;
            JOptionPane.showMessageDialog(null, "Media da sala: " + mediasala);

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numericos");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
            System.exit(0);
        }

    }
}

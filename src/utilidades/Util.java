package utilidades;

/*Arquivo apenas para uso útil e evitar redundância*/

import java.util.Scanner;

public class Util {

    public Scanner sc = new Scanner(System.in);
    public void println(String mensagem) {
        System.out.println("*******************************************\n");
        System.out.println(mensagem);
        System.out.println("*******************************************\n");
    }
    public void devolveIconeMedico(String sexoMedico) {
        String medicoMasculino = "\uD83D\uDC68\u200D\u2695\uFE0F";
        String medicaFeminina = "\uD83D\uDC69\u200D\u2695\uFE0F";
    }
}

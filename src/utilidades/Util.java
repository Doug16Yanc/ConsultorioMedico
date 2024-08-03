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
    public String devolveIconeMedico(String sexoMedico) {
        if (sexoMedico.equals("Masculino")) {
            return "\uD83D\uDC68\u200D\u2695\uFE0F";
        }
        else if (sexoMedico.equals("Feminino")) {
            return "\uD83D\uDC69\u200D\u2695\uFE0F";
        }
        else{
            return "";
        }
    }
}

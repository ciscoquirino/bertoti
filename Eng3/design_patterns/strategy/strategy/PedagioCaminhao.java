package strategy;

import java.util.Scanner;

public class PedagioCaminhao implements Pedagio {
    private Scanner leitor = new Scanner(System.in);
    public void cobrar() {
        Valor v = new Valor();
        System.out.println("Caminhão: Quantos eixos?");
        int eixo = leitor.nextInt();
        System.out.println("Caminhão " + eixo + " eixos: R$" + (v.valor * eixo));
    }
}

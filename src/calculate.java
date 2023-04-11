import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.sum;

public class calculate {
    public static void main(String[] args) throws IOException {

        boolean tf = true;
        while (tf) {

            System.out.println("\n 1 - Soma \n 2 - Subtraçao \n 3 - Multiplicaçao \n 4 - Divisão \n 0 - Sair do programa \n Escolha a operação desejada:  ");
            BufferedReader escolha = new BufferedReader((new InputStreamReader(System.in)));
            int acao = Integer.parseInt(escolha.readLine());

            if (acao >= 1 && acao <= 4) {

                System.out.println("Escreva o Primeiro Numero: ");
                BufferedReader num1 = new BufferedReader((new InputStreamReader(System.in)));
                int x = Integer.parseInt(num1.readLine());
                System.out.println("Escreva o Segundo Numero: ");
                BufferedReader num2 = new BufferedReader((new InputStreamReader(System.in)));
                int y = Integer.parseInt(num2.readLine());
                if (acao == 1) {
                    System.out.println("A soma dos dois numeros é: " + (x + y));
                } else if (acao == 2) {
                    System.out.println("A subtração dos dois numeros é: " + (x - y));
                } else if (acao == 3) {
                    System.out.println("A multiplicaçao dos dois numeros é: " + (x * y));
                } else if (acao == 4) {
                    System.out.println("A divisão dos dois numeros é: " + (x / y));
                }

            } else if (acao == 0) {
                tf = false;
            }else {
                System.out.println("Essa opção não existe tente novamente");
            }

        }
    }
}
/*
                switch (acao) {

                    case 1:
                        System.out.println("A soma dos dois numeros é: " + (x + y));
                        break;
                    case 2:
                        System.out.println("A subtração dos dois numeros é: " + (x - y));
                        break;
                    case 3:
                        System.out.println("A multiplicaçao dos dois numeros é: " + (x * y));
                        break;
                    case 4:
                        System.out.println("A divisão dos dois numeros é: " + (x / y));
                        break;

                }*/
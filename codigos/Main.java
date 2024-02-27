import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        SomaMaxima maxima = new SomaMaxima();
        Conjectura conjectura = new Conjectura();
        Temperatura temperatura = new Temperatura();
        Scanner entrada =  new Scanner(System.in);
        System.out.println();
        System.out.println("==================================================");
        System.out.println("===  Menu de Opções - Desafios de Algoritmos:  ===");
        System.out.println("===        Escolha o desafio desejado:         ===");
        System.out.println("==================================================");
        System.out.println();
        System.out.println("== Conjectura  - 1.");
        System.out.println("== Soma Máxima - 2.");
        System.out.println("== Temperatura - 3.");
        System.out.print("\n== Desafio escolhido: ");
        // Usado para fazer o Tratamento de Erros - try-catch.
        try {
            int opcao = entrada.nextInt();
            if (opcao <= 0 || opcao > 3) {
                System.err.println("!!! Opção Inválida - Programa Finalizado !!!");
            }else {
                switch (opcao) {
                    case 1:
                        System.out.println("\tDesafio Conjectura: ");
                        conjectura.resoverConjectura();
                        break;
                    case 2:
                        System.out.println("\tDesafio Soma Máxima: ");
                        maxima.encontrarSomaMaxima();
                        break;
                    case 3:
                        System.out.println("\tDesafio Temperatura: ");
                        temperatura.calculaTemperatura();
                        break;
                }
            }
        }
        // Exceção (Tratamento de Erro), caso seja digitado letra ao invés de número.
        catch (InputMismatchException e){
            System.err.println("!!! Caractere Inválido - Programa Finalizado !!!");
        }
        // Usada para executar sendo os blocos try ou catch executados ou não.
        finally {
            if (entrada != null){
                entrada.close();
            }
        }
    }
}
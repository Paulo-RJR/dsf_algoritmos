import java.util.*;
public class Conjectura {
    // Aplicando os modificadores de acesso.
    private int numero;
    private int contador = 1;
    private int maior = 0;
    // Adicionando o método construtor padrão.
    public Conjectura() {
    }
    // Método criado para resolução deste desafio.
    // Exibe o número um novamente como maior, caso ele seja digitado.
    public void resoverConjectura(){

        Scanner entrada = new Scanner(System.in);
        System.out.println("==== Algoritmo para Conjectura de Collatz ====");

        System.out.print("Digite um número não negativo: ");
        numero = entrada.nextInt();

        System.out.println("==== Tarefa-1 e Tarefa-2: ====");
        System.out.print("Entrada     Saída-1     Saída-2\n");

        // Mostra o número digitado pelo usuário.
        System.out.print(numero);

        // Mostra o número um como maior, caso seje digitado pelo usuário.
        if(numero == 1){
            maior = numero;
        }

        // Repete o laço enquanto as sequências geradas forem diferentes do número um.
        while (numero != 1){
            // Calculo caso o número informado, seja Par.
            if (numero % 2 == 0){
                numero = numero / 2;
            } else {
                // Calculo caso o número informado, seja Ímpar.
                numero = (3 * numero) + 1;
            }
            // Faz a contagem da quantidade de números gerados pela sequência (Saída-1).
            contador = contador +1;

            // Mostra os resultados da sequência (Apenas para teste).
            // System.out.print(numero + ", ");

            // Mostra o maior número da sequência gerada (Saída-2).
            if (numero >= maior){
                maior = numero;
            }
        }

        // Mostra a quantidade de números gerados na sequência.
        System.out.print("\t\t\t" + contador + "\t\t\t" + maior);
        entrada.close();
    }
}
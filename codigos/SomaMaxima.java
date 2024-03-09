import java.util.Scanner;
public class SomaMaxima {
    // Soma Máxima com o uso da Biblioteca Math.
    private int [] vetor = new int[9];
    private int maiorValorAtual = vetor[0];
    private int maiorValorFinal = vetor[0];
    public SomaMaxima() {
    }
    // Método criado para resolução deste desafio.
    public void encontrarSomaMaxima(){
        Scanner entrada = new Scanner(System.in);
        // Para que o usuário crie o seu Vetor de números.
        System.out.println("\nDigite os nove números para montar o seu Vetor: \n");
        for (int i = 0; i < vetor.length; i++){
            System.out.printf("Digite o " + (i+1) + "º número: ");
            vetor[i] = entrada.nextInt();
        }
        // Mostra o Vetor criado pelo usuário.
        System.out.print("\nVetor: [ ");
        for (int i = 0; i < vetor.length; i++){
            System.out.printf(vetor[i] + " ");
        }
        System.out.print("]\n");
        for (int i = 0; i < vetor.length; i++){
            maiorValorAtual = Math.max(vetor[i], maiorValorAtual + vetor[i]);
            maiorValorFinal = Math.max(maiorValorFinal, maiorValorAtual);
        }
        System.out.println("Soma Máxima: " + maiorValorFinal);
        entrada.close();
    }
}

import java.util.Scanner;
public class SomaMaxima {
    // Aplicando os modificadores de acesso.

    private int [] vetor = new int[9];
    private int somaSub1;
    private int somaSub2;
    private int somaSub3;
    // Adicionando o método construtor padrão.
    public SomaMaxima() {
    }
    public void encontrarSomaMaxima(){
        Scanner entrada = new Scanner(System.in);
        //int somaSub1, somaSub2, somaSub3;
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

        // Realiza a soma dos Subvetores (com quatro elementos) do Vetor criado.
        somaSub1 = vetor[0] + vetor[1] + vetor[2] + vetor[3];
        // Mostra o resultado desta soma.
        //System.out.println("\nSoma: " + somaSub1);

        somaSub2 = vetor[3] + vetor[4] + vetor[5] + vetor[6];
        // Mostra o resultado desta soma.
        //System.out.println("\nSoma: " + somaSub2);

        somaSub3 = vetor[5] + vetor[6] + vetor[7] + vetor[8];
        // Mostra o resultado desta soma.
        //System.out.println("\nSoma: " + somaSub3);
        System.out.println();

        // Para mostrar o Subvetor com o maior resultado da soma.
        if (somaSub1 > somaSub2 && somaSub1 > somaSub3){
            System.out.println("Vetor: [ " +  vetor[0] + " " + vetor[1] + " " + vetor[2] + " " + vetor[3] + " ]" );
            System.out.println("Soma Máxima: " + somaSub1);
        }
        if (somaSub2 > somaSub1 && somaSub2 > somaSub3){
            System.out.println("Vetor: [ " +  vetor[3] + " " + vetor[4] + " " + vetor[5] + " " + vetor[6] + " ]" );
            System.out.println("Soma Máxima: " + somaSub2);
        }
        if (somaSub3 > somaSub2 && somaSub3 > somaSub1){
            System.out.println("Vetor: [ " + vetor[5] + " " + vetor[6] + " " + vetor[7] + " " + vetor[8] + " ]" );
            System.out.println("Soma Máxima: " + somaSub3);
        }
        entrada.close();
    }
}
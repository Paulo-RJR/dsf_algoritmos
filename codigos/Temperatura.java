import java.util.*;
    public class Temperatura {
        // 1º Temperatura - com o uso da Biblioteca Math, sem a Biblioteca Random.
        //Random random = new Random();
        private int quantidadeMedicoes;
        private int tamanhoIntervalo;
        private double entradaUsuario;
        //private int medicao;
        private int soma;
        private int media;
        private int maiorMedia;
        private int menorMedia;
        public Temperatura() {
        }
        public void calculaTemperatura(){
            Scanner entrada = new Scanner(System.in);
            while (true) {
                System.out.print("Digite o número de medições: ");
                quantidadeMedicoes = entrada.nextInt();
                System.out.print("Digite o tamanho dos intervalos: ");
                tamanhoIntervalo = entrada.nextInt();

                // Encerra o programa se o usuário digitar 0 0.
                if (quantidadeMedicoes == 0 && tamanhoIntervalo == 0) {
                    break;
                }
                else {
                    int[] medicoes = new int[quantidadeMedicoes];

                    // Solicitar ao usuário inserir as medições
                    System.out.println("Digite as medições:");

                    for (int i = 0; i < quantidadeMedicoes; i++) {
                        System.out.print("Medição " + (i + 1) + ": ");
                        entradaUsuario = entrada.nextDouble();
                        // Considera apenas a parte inteira (truncamento).
                        medicoes[i] = (int) entradaUsuario;
                    }

                    // Exibir sequência inserida
                    System.out.print("Sequência inserida: ");
                    for (int medicao : medicoes) {
                        System.out.print(medicao + " ");
                    }
                    System.out.println();

                     menorMedia = Integer.MAX_VALUE;
                     maiorMedia = Integer.MIN_VALUE;

                    // Calcula as médias para cada intervalo
                    for (int i = 0; i <= quantidadeMedicoes - tamanhoIntervalo; i++) {
                        soma = 0;

                        // Calcula a soma do intervalo
                        for (int j = 0; j < tamanhoIntervalo; j++) {
                            soma += medicoes[i + j];
                        }
                        media = soma / tamanhoIntervalo;
                        menorMedia = Math.min(menorMedia, media);
                        maiorMedia = Math.max(maiorMedia, media);
                    }
                    System.out.println("Menor Média: " + menorMedia + " | Maior Média: " + maiorMedia);
                    System.out.println("\nObs.: Caso queira sair do programa, digite: \n0 - para as medições e 0 - " +
                            "para os intervalos.");
                }
            }
            entrada.close();
            System.out.println("!!! Programa encerrado - Com Sucesso !!!");
        }
    }

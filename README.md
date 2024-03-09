![GitHub repo size](https://img.shields.io/github/repo-size/Paulo-RJR/dsf_algoritmos)
![GitHub](https://img.shields.io/github/license/Paulo-RJR/dsf_algoritmos)
![GitHub language count](https://img.shields.io/github/languages/count/Paulo-RJR/dsf_algoritmos)
![GitHub top language](https://img.shields.io/github/languages/top/Paulo-RJR/dsf_algoritmos)

***

# Desafios de Algoritmos:

Este repositório será composto por três desafios de programação proprostos através de uma plataforma de conteúdos voltados para 
diversas áreas de técnologia como **Linguagens de Programação**. 
Também para facilitar a utilização dos algoritmos abaixo por parte do usuário foi criado um **Menu** de opções para que este possa  
escolher qual algoritmo queira executar.  

### Menu de escolha:

![Resultado Menu dos Algoritmos](https://github.com/Paulo-RJR/dsf_algoritmos/blob/master/img-executados/menu.png)  

***

## 1º - Desafio - Conjectura de Collatz:

- A Conjectura de Collatz é um problema aberto da Matemática, que diz o seguinte:
  - A partir de um número natural fornecido, construa um sequência tal que o próximo elemento será:
    - 3 x n + 1, se o número for ímpar;
    - n / 2, se o número for par.
  - Até hoje não foi encontrado um contraexemplo, mas essa conjectura também nunca foi provada.
   
  Tarefa-1:
    - Construa um algoritmo que receba um número indicando o valor inicial e devolva qual o tamanho da sequência gerada.
      - Exemplos:  
                Entrada:      
                    1        
                   12        
                    7        
                    9      
                Saída:  
                  1  
                  10  
                  17    
                  20
         
  Tarefa-2:
    - Construa um algoritmo que receba um número indicando o valor inicial e devolva qual o maior número aparece na sequência
    gerada.
      - Exemplos:  
                Entrada:     
                    1        
                   12        
                    7        
                    9      
                Saída:  
                  1  
                  16  
                  52  
                  52      
        
- Obs.: Sua saída não precisa ser tabela, pode ser imediatamente após ler cada valor.

### Resultado final:

![Resultado Conjectura de Collatz](https://github.com/Paulo-RJR/dsf_algoritmos/blob/master/img-executados/collatz.png)  

***

## 2º - Desafio - Soma Máxima:

- Dado um vetor de números inteiros (podendo ser negativos), encontrar o valor da soma dos elementos, de um subvetor (com elementos
  contíguos) tal que esse valor seja o maior possível.  
  - Exemplo:  
    - Entrada: [-2, 1, -3, 4, -1, 2, 1, -5, 4]  
    - Saída: 6  
    - Essa saída corresponde a soma dos elementos do subvetor: [4, -1, 2, 1]  

### Resultado final:

![Resultado Soma Máxima](https://github.com/Paulo-RJR/dsf_algoritmos/blob/master/img-executados/soma1.png)  

***

## 3º - Desafio - Temperatura:

Um grupo de engenheiros está tentando construir um equipamento que será utilizado em condições inóspitas no espaço e sujeito a grandes   
variáções de temperatura. Para isso aqui, na Terra utilizam diferentes câmaras quentes ou frias e ficam trocando aleatoriamente diferentes   
amostras de materiais entre as diferentes câmaras. Essas trocas ocorrem a cada determinado intervalo de tempo. Para entender como a   
temperatura afeta os materiais, diversos dados estatísticos são calculados, como temperatura mímima, máxima, mediana, média, desvio, etc.  
Nesse programa, estamos preocupados apenas com a média. A depender da configuração do teste, o intervalo será diferente.  
  - Sua tarefa é criar um programa que irá ler os dois valores da entrada padrão. o primeiro representando a quantidade de medições e o  
    segundo representando o tamanho do intervalo. Por exemplo, 7 3 indica que 7 medições seguirão e o intervalo considerado será de 3  
    minutos. Suponha então que os sete números seguintes (que serão recebidos por linha) sejam 3 4 8 9 -2 -1 -3. As médias a cada três
    minutos são: (3+4+8=15)15/3=5, (4+8++9=21)21/3=7, (8+9+(-2)=15)15/3=5, (9+(-2)+(-1)=6)6/3=2, ((-1)+(-2)+(-3)=-6)-6/3=-2.   
  - Nesse exemplo, tivemos apenas números inteiros. Mas caso a média seja número decimal, considere somente a parte inteira (truncando).  
  - Depois dos dois valores lidos, N números seguirão, indicando as N leituras (onde N é o primeiro dos dois números lidos).  
  - Para cada um desses conjuntos de N números, seu programa deverá exibir dois números: a menor e a maior média, nessa ordem. No
    exemplo anterior, a menor média foi -2 e a maior foi 7. Exiba somente os valores (-2 7).    
  - Seu programa para quando os pares do início de cada teste for dois zeros (0 0).
    - Exemplos:
        
        Entrada: 7 3                                      
        Números gerados (Random): 3 4 8 9 -2 -1 -3         
        Saída: -2 7  
    
        Entrada: 8 4  
        Númeroa gerados (Random): 1 4 2 6 2 2 2 2 (0 0 Flag)        
        Saída: 2 3   
      
### Resultado final:

![Resultado Temperatura](https://github.com/Paulo-RJR/dsf_algoritmos/blob/master/img-executados/temperatura.png)  


***

## Principais Tecnologia usadas:
  
<img align="center" alt="Paulo-IntelliJ" height="30" width="40" src="https://upload.wikimedia.org/wikipedia/commons/9/9c/IntelliJ_IDEA_Icon.svg"> - IntelliJ IDEA 2023.3.1;  
<img align="center" alt="Paulo-Git" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/git/git-plain.svg"> - Git Bash;  
<img align="center" alt="Paulo-Devicon" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/devicon/devicon-original.svg"> - Devicon;  
<img align="center" alt="Paulo-Markdown" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/markdown/markdown-original.svg"> - Markdown. 


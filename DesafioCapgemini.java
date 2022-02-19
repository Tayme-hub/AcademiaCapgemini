import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;


public class DesafioCapgemini {
    public static void main(String args[]) {
        //--------Menu Basico para cmd---------//
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Desafio programacao academia Capgemini");
        System.out.println("--------------------------------------");
        System.out.println("|          1 - Escada                |");
        System.out.println("|          2 - Validacao de senha    |");
        System.out.println("|          3 - Anagramas             |");
        System.out.println("|          0 - Sair                  |");
        System.out.println("--------------------------------------");
        System.out.println("\n Digite o numero da funcao que deseja executar");
        int opcao = Integer.parseInt(sc.nextLine());

        switch (opcao) {
            case 1:
                Escada();
                break;
            case 2:
                Validacao();
                break;
            case 3:
                Anagrama();
                break;
        }
        //-------------------------------------//
        sc.close();
        System.exit(0);
    }
    
//_________________________________Questao 1________________________________________//
    public static void Escada() {
        //Intanciação e criacao de um objeto scanner//
        Scanner sc = new Scanner(System.in);
        int tamanho;
        int i;
        int j;
        //Entrada do numero de degraus//
        System.out.println("Digite o numero de degraus:");
        tamanho = Integer.parseInt(sc.nextLine());
        sc.close();
        //Criação de uma matriz para o armazenamento dos caracteres que serao usados para desenhar a escada//
        char[][] escada = new char[tamanho][tamanho];
        //laco para o preenchimento da matriz e a impressao da escada no cmd//
        for (i = 0; i < tamanho; i++) {
            for (j = tamanho - 1; j >= 0; j--) {
                //se o numero da coluna for menor ou igual o numero da linha a matriz recebe o caractere * caso contrario recebe " "//
                if (j <= i) {
                    escada[i][j] = '*';
                } else {
                    escada[i][j] = ' ';
                }
                System.out.print(escada[i][j]);
            }
            System.out.println();
        //--------------------------------------------------------------------------------------------------//
        }
    }

//_________________________________Questao 2________________________________________//
    public static void Validacao() {
        //Intanciação e criacao de um objeto scanner//
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha");
        String senha = sc.nextLine();
        sc.close();
        //Declaracoes das variaveis e validação de caracteres digitados na senha//
        int contador = 0;
        int supp = 0;
        boolean dig = senha.matches(".*\\d.*");
        boolean upcase = senha.matches(".*[A-Z].*");
        boolean lowcase = senha.matches(".*[a-z].*");
        boolean specchar = senha.matches(".*[!@#$%^&*()-+].*");

        //Sequencia de ifs para calcular quantos caracteres serao necessarios para entrar nos requisitos//
        if (dig == false)
            contador++;
        if (upcase == false)
            contador++;
        if (lowcase == false)
            contador++;
        if (specchar == false)
            contador++;
        if (senha.length() < 6)
            supp = 6 - senha.length();
        //Se a diferenca entre o numero de caracteres digitados e o minimo exigido for maior que o numero de requisitos nao atendidos
        //sera impresso o valor da diferença, caso contrario sera impresso o numero de requisitos nao atendidos
        if (supp > contador) {
            System.out.println(supp);
        } else
            System.out.println(contador);

    }

//_________________________________Questao 3________________________________________//
    public static void Anagrama() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a palavra");
        String palavra = sc.nextLine();
        sc.close();
        //instanciação do hashmap//
        HashMap < String, Integer > map = new HashMap < > ();

        //laco para passar a string digitada para um vetor de char fazendo as divisoes em substrings e mudando os caracteres de posicoes//
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i; j < palavra.length(); j++) {
                char[] valC = palavra.substring(i, j + 1).toCharArray();
                Arrays.sort(valC);
                String val = new String(valC);
                /*Condicao para popular o hashmap com as sequencias de caracteres e designar suas keys,
                primeiramente no else o map sera populado com as sequencias de caracteres e dado o valor 1
                no if se for encontrado alguma repetição de caractere ou "anagrama" a key referente aos mesmos
                sera incrementado em 1, tendo o valor 2*/
                if (map.containsKey(val)) {
                    map.put(val, map.get(val) + 1);
                } else
                    map.put(val, 1);
            }
            //_________________________________________________________________________________//
        }
        /*logica para incrementar o contador, a cada key = 2 que for encontrado o contador sera incrementado em 1
        a cada key = 1 que for encontrada o contador sera incrementado em 0*/
        int contador = 0;
        for (String key: map.keySet()) {
            int n = map.get(key);
            contador += (n * (n - 1)) / 2;
        }
        System.out.println(contador);
        sc.close();
    }

}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class Util {
    /***
     * Metodo para popular a lista com valores aleatorios
     * @param lista contendo numeros integer
     * @param quantidade de numeros a ser populado
     * @param inicio valor inicial
     * @param fim valor final
     */
    public static void popularAleatorioNumeros(List<Integer> lista, int quantidade, int inicio, int fim) {
        Random gerador = new Random();
        for (; quantidade > 0; quantidade--) {
            lista.add(gerador.nextInt(inicio, fim));
        }
    }

    /***
     * Metodo para popular a lista com palavras aleatorias
     * @param lista contendo tipos String
     * @param quantidade de palavras a ser gerada
     * @param tamanho da palavra gerada
     */
    public static void popularAleatorioPalavras(List<String> lista, int quantidade, int tamanho) {
        String letra = "abcdefghijklmnopqrstuvwxyz ";
        Random gerador = new Random();

        for (; quantidade > 0; quantidade--) {
            String palavraGerada = "";
            char letraSorteada;
            for(int i=0; i<tamanho; i++) {
                letraSorteada = letra.charAt(gerador.nextInt(letra.length()));
                palavraGerada = palavraGerada + letraSorteada;
            }
            lista.add(palavraGerada);
        }
    }

    /***
     * Metodo static que exibe lista de numeros inteiros
     * @param lista contendo numeros inteiros
     */
    public static void exibirListaNumeros(List<Integer> lista) {
        for (Integer item : lista) {
            System.out.println(item);
        }
    }

    /***
     * Metodo static que exibe uma lista de palavras
     * @param lista contendo palavras
     */
    public static void exibirListaPalavras(List<String> lista ) {
        for (String item : lista) {
            System.out.println(item);
        }
    }

    //---------Parte exercicio da aula------------

    /***
     * Metodo static que popula lista com numeros de um arquivo
     * @param lista que sera populada com os numeros
     * @param caminho onde esta o arquivo com os numeros
     */
    public static void PopularNumerosDeArquivo(List<Integer> lista, String caminho) {

        try (BufferedReader leitor = new BufferedReader(new FileReader(caminho))) {
            String linha = leitor.readLine();

            while (linha != null) {
                try {
                    int numero = Integer.parseInt(linha.trim());
                    lista.add(numero);
                    linha = leitor.readLine();
                } catch (NumberFormatException e) {
                    System.out.println("Linha inválida: "+ linha);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: "+ e.getMessage());
            e.printStackTrace();
        }
    }

    /***
     * Metodo static que popula lista com palavras de um arquivo
     * @param lista que sera populada com as palavras
     * @param caminho onde esta o arquivo com as palavras
     */
    public static void popularPalavrasDeArquivo (List<String> lista, String caminho) {

        try (BufferedReader leitor = new BufferedReader(new FileReader(caminho))) {
            String linha = leitor.readLine();

            while (linha != null) {
                if (!linha.isEmpty()) {
                    lista.add(linha);
                }
                linha = leitor.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo"+ e.getMessage());
            e.printStackTrace();
        }
    }

}

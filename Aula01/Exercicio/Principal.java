import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        List<String> listaPalavras = new ArrayList<>();

        Util.popularAleatorioNumeros(listaNumeros, 10, 100, 500);
        Util.exibirListaNumeros(listaNumeros);

        System.out.println("\n----------\n");

        Util.popularAleatorioPalavras(listaPalavras, 10, 6);
        Util.exibirListaPalavras(listaPalavras);

        System.out.println("\n-------------\n");

        //---Parte exercicio da aula----

        List<Integer> listaNumerosArquivo = new ArrayList<>();

        String caminhoNumeros = "numeros.txt"; //path

        Util.PopularNumerosDeArquivo(listaNumerosArquivo, caminhoNumeros);
        Util.exibirListaNumeros(listaNumerosArquivo);

        System.out.println("\n---------------------\n");

        List<String> listaPalavrasArquivo = new ArrayList<>();

        String caminhoPalavras = "palavras.txt"; //path

        Util.popularPalavrasDeArquivo(listaPalavrasArquivo, caminhoPalavras);
        Util.exibirListaPalavras(listaPalavrasArquivo);
    }
}

import random

class Util:
    """_summary_
        classe responsável por métodos de gestão de listas de números inteiros e listas de palavras
    """

    @staticmethod
    def popular_aleatorio_numeros(lista, quantidade, inicio, fim):
        """_summary_
            método de classe que popula uma lista de números inteiros com valores aleatórios
        Args:
            lista (int): estrutura de armazenamento dos números
            quantidade (int): de números a serem gerados
            inicio (int): valor inicial da extensão do número gerado
            fim (int): valor final da extensão do número gerado
        """
        for _ in range(quantidade):
            lista.append(random.randrange(inicio, fim))

    @staticmethod
    def exibir_lista(lista):
        """_summary_
            exibe uma lista de números inteiros ou de palavras
        Args:
            lista (int): contém números inteiros ou palavras
        """
        for item in lista:
            print(item)

    @staticmethod
    def popular_aleatorio_palavras(lista, quantidade, tamanho):
        letras = "abcdefghijklmnopqrstuvwxyz "
        for _ in range(quantidade):
            palavra_gerada = ""
            letra_sorteada = ""
            for _ in range(tamanho):
                letra_sorteada = letras[random.randrange(len(letras))]
                palavra_gerada += letra_sorteada

            lista.append(palavra_gerada)

    # ----- Parte exercicio da aula -----

    @staticmethod
    def popular_numeros_de_arquivo(lista, caminho):
        '''
        Metodo static que popula lista com numeros de um arquivo
        :param lista: que sera populada com os numeros
        :param caminho: onde esta o arquivo com os numeros
        :return: void
        '''
        with open(caminho, "r") as arquivo:
            for linha in arquivo:
                linha = linha.strip()
                if linha.isdigit():
                    lista.append(int(linha))



    @staticmethod
    def popular_palavras_de_arquivo(lista, caminho):
        '''
        Metodo static que popula lista com palavras de um arquivo
        :param lista: que sera populada com as palavras
        :param caminho: onde esta o arquivo com as palavras
        :return: void
        '''
        with open(caminho, "r") as arquivo:
            for linha in arquivo:
                linha = linha.strip()
                if linha:
                    lista.append(linha)

lista_numeros = []
lista2_numeros = []
lista_palavras = []

Util.popular_aleatorio_numeros(lista_numeros, 10, 100, 500)
Util.exibir_lista(lista_numeros)

lista2_numeros.extend(lista_numeros)

Util.popular_aleatorio_palavras(lista_palavras, 10, 6)
Util.exibir_lista(lista_palavras)

#----- Parte exercicio da aula -----

lista_numeros_arquivo = []
caminho = "numeros.txt"

Util.popular_numeros_de_arquivo(lista_numeros_arquivo, caminho)

lista_palavras_arquivo = []
caminho = "palavras.txt"

Util.popular_palavras_de_arquivo(lista_palavras_arquivo, caminho)

Util.exibir_lista(lista_numeros_arquivo)
Util.exibir_lista(lista_palavras_arquivo)

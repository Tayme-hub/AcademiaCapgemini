# Desafio Academia Capgemini
* Primeiramente baixe o arquivo DesafioCapgemini.java e o coloque na sua area de trabalho ou onde achar mais conveniente. (iremos utilizar a area de trabalho como exemplo nos proximos passos)
* Abra o Prompt de comando digitando cmd na barra de pesquisa do windows ou aperte win + r, digite cmd e aperte enter.
* digita "java -version" para verificar se a maquina tem alguma versao do java instalado, caso nao tenha, você tera que baixar e instalar o java.
* O prompt de comando por padrao abre no diretorio do usuario (Users\NomeDoUsuario), você ira precisar navegar ate o pasta onde foi salvo.
* Para fazer isso digite "cd Desktop" ou "cd (nome da pasta onde voce salvou o arquivo(downloads, documentos, etc...).
* Apos navegar ate a pasta onde o arquivo se encontra digite "javac DesafioCapgemini.java" para compilar o programa e "java DesafioCapgemini" para roda-lo.


Sobre as tecnologias usadas nos tres desafios, foi utilizada a linguagem de programação java, e a IDE VSCode.

Sobre as logicas utilizadas nas questoes:
! questão:
A primeira questao foi resolvida utilizando loops for, com ifs para realizar o preenchimento de uma matriz de caracteres para "desenhar uma escada" com o numero de degrais designados pelo usuario

2 Questão:
Nesta questão foi utilizada a função matches para realizar a a validação da senha digitada para com os requisitos.
Para cada requisito foi criado um if, que ira incrementar um contador que sera utilizado em conjunto com uma variavel de suporte para exibir o numero de caracteres minimos que o usuario devera digitar para ter uma senha com todos os requisitos

3 Questão:
Para realizar a questão sobre anagramas foi utilizados hashmaps, e matrizes de caracteres.
Com a string digitada pelo usuario em mãos, a mesma foi divida em uma substring que foi arrumada/embaralhada e uma substring de suporte para podermos compararmos se houva algum "Anagrama" na palavra digitada pelo usuario.

As substrings foram passadas para o map com a key no valor 1, usando a substring de apoio, cada vez que um "anagrama" foi encontrado, os caracteres correspondentes no hashmap tiveram sua key incrementada para 2.

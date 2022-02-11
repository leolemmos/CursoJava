
 <b> O que é JAVA? </b>
 
Java é uma linguagem de programação orientada a objetos desenvolvida pela SunMicrosystems. 
Modelada depois de C++, a linguagem Java foi projetada para ser pequena, simples e portável
a todas as plataformas e sistemas operacionais, tanto o código fonte comoos binários. 
Esta portabilidade é obtida pelo fato da linguagem ser interpretada, ou seja, ocompilador 
gera um código independente de máquina chamado byte-code. No momento da execução este 
byte-code é interpretado por uma máquina virtual instalado na máquina. 
Para portar Java para uma arquitetura hadware/s específica, basta instalar a máquina virtual
(interpretador). Além de ser integrada à Internet, Java também é uma excelente linguagem
para desenvolvimento de aplicações em geral. Dá suporte ao desenvolvimento de software em
larga escala. 

<b>Criando uma APLICAÇÃO</b>

Para começar, criaremos uma simples aplicação em Java: a clássica “Hello World!”, o
exemplo que todos os livros de linguagens usam

<b>O código fonte</b>

Como todas as linguagens de programação, o código fonte será criado em um editor de texto ASCII puro. 
No Unix alguns exemplos são emacs, pico, vi e outros. No Windows, notepad ou dosedit também servem. 

A seguir, o código da aplicação “Hello World!” (arquivo: HelloWorld.java): 

class HelloWorld {
public static void main (String args[]) {
System.out.println(“Hello World!”);
  }
}

<b>Compilando a aplicação</b>
Para compilar a aplicação, basta digitar o comando:

javac HelloWorld.java
Este comando vai gerar o arquivo HelloWorld.class, que é o byte-code da aplicação. Para executar o byte-code basta digitar o comando:
java HelloWorld

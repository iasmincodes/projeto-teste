package POOAULA3.exercico1_interface;
// ex 1 do pdf de conceitos - aula 3 manha 
/*Exercício 1 - Gerenciamento de Arquivos

1. Crie uma Interface chamada LeituraDados.
a. A interface deve ter um atributo constante (public static final) chamado
NOME_PADRAO inicializado com o valor "Data_Process.txt".
b. A interface deve definir um método abstrato chamado lerArquivo(String
caminho) que retorna uma String.

2. Crie duas Classes Concretas que implementem essa interface: LeitorXML e
LeitorCSV. Em ambas as classes, implemente o método lerArquivo(String
caminho):
3. LeitorXML deve retornar: "Lendo XML em: " + caminho + " e estruturando dados."
4. LeitorCSV deve retornar: "Lendo CSV em: " + caminho + " e separando por
vírgulas." */

// ver de rebeca
public interface LeituraDados{
    String NOME_PADRAO = "Data_Process.txt"

    // metodos
    String lerArquivo(String caminho); // pubic abstract ja vem, abo precisa colocar

}

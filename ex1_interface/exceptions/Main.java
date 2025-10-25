package POOAULA3.exceptions;

public class Main {
    public static void main(String[] args) {
    

        try {
            int numeroA = 10;
            int numeroB = 0;
            System.out.println(numeroA/numeroB);
        } catch (ArithmeticException e){
            System.out.println("Erro detectado! Não é possível realizar uma divisão por zero.");
        } finally {
            System.out.println("Execução da calculadora encerrada.");
        }
        
    }

}

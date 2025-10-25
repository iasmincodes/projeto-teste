package ex1_interface.exercico1_interface;
// ver de rebeca
public class LeitorCSV implements leituraDados {

    @Override
    public String lerArquivo(String caminho){
        return "Lendo CSV em " + caminho + |" e eparando por virgulas.";
    }
    
}

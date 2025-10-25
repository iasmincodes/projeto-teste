package POOAULA3.exercico1_interface;
// ver de rebeca
public class LeitorXML implements LeituraDados{
    @Override
    public String lerArquivo(String caminho){
        return "Lendo XML em: " + caminho + " e estruturndo dados.");
    }
}
    

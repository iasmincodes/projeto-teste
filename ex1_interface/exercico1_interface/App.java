package POOAULA3.exercico1_interface;

public class App {
    public static void main(String[] main){
        LeitorCSV csv = new LeitorCSV();
        LeitorXML xml = new LeitorXML();

        System.out.println(csx.lerArquivo("arquivo.csv"));
        System.out.println(xml.lerArquivo("arquivo.xml"));
    }
}

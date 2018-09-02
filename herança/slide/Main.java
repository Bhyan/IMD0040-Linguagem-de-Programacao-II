public class Main{
    public static void main(String[] args){
        CD cds = new CD("Teste", 120, "Artista_Teste", 8);
        DVD dvds = new DVD("Teste1", 200, "Diretor_Teste");

        System.out.println("CD.");
        cds.print();

        System.out.println("DVD.");
        dvds.print();
    }
}

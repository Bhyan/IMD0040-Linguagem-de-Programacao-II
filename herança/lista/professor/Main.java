public class Main{
    public static void main(String[] args){
        ProfessorHorista p1 = new ProfessorHorista("P1", "01", 20, 20, "13");
        ProfessorRegime p2 = new ProfessorRegime("P2", "02", 20, 2000.0);

        System.out.println(p1.salario());
    }
}

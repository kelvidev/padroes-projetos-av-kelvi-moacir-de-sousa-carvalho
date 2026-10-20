public class Main {
    public static void main(String[] args) {
        Matricula brazilEnrollment = new Matricula(new FabricaBrasil());
        brazilEnrollment.confirm("Guilherme enaque", "667.676.767-67", "Java", 500.00);

        Matricula chileEnrollment = new Matricula(new FabricaChile());
        chileEnrollment.confirm("Pablo Emilio Escobar", "66.666.777-7", "Java", 95000.00);
    }
}

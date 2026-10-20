public class Matricula {
     FabricaMatricula factory;

    public Matricula(FabricaMatricula factory) {
        this.factory = factory;
    }

    public void confirm(String studentName, String studentId, String courseName, double amount) {
        DocumentoFiscal fiscalDocument = factory.createFiscalDocument(amount);
        Pagamento payment = factory.createPayment(amount);
        ComprovanteMatricula receipt = factory.createEnrollmentReceipt(studentName, studentId, courseName);

        System.out.println("=== Relatório de Matrícula ===");
        System.out.println(fiscalDocument.describe());
        System.out.println(payment.describe());
        System.out.println(receipt.describe());
        System.out.println();
    }
}

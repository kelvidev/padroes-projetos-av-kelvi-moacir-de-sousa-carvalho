public class FabricaBrasil implements FabricaMatricula {
    @Override
    public DocumentoFiscal createFiscalDocument(double amount) {
        return new NotaFiscalServico(amount);
    }

    @Override
    public Pagamento createPayment(double amount) {
        return new PagamentoPix(amount);
    }

    @Override
    public ComprovanteMatricula createEnrollmentReceipt(String studentName, String studentId, String courseName) {
        return new ComprovanteCpf(studentName, studentId, courseName);
    }
}

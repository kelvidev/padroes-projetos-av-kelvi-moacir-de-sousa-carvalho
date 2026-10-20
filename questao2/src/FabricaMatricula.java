public interface FabricaMatricula {
    DocumentoFiscal createFiscalDocument(double amount);

    Pagamento createPayment(double amount);
    ComprovanteMatricula createEnrollmentReceipt(String studentName, String studentId, String courseName);
}

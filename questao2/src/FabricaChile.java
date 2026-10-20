public class FabricaChile implements FabricaMatricula {
    @Override
    public DocumentoFiscal createFiscalDocument(double amount) {
        return new BoletaElectronica(amount);
    }

    @Override
    public Pagamento createPayment(double amount) {
        return new PagamentoWebpay(amount);
    }

    @Override
    public ComprovanteMatricula createEnrollmentReceipt(String studentName, String studentId, String courseName) {
        return new ComprovanteRut(studentName, studentId, courseName);
    }
}

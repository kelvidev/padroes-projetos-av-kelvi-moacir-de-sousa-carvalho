public class NotaFiscalServico implements DocumentoFiscal {
    double amount;

    public NotaFiscalServico(double amount) {
        this.amount = amount;
    }

    @Override
    public String describe() {
        return String.format("documento: nfse, Valor: R$ %.2f, iss(5%%): R$ %.2f", amount, amount * 0.05);
    }
}

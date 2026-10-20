public class PagamentoWebpay implements Pagamento {
    double amount;

    public PagamentoWebpay(double amount) {
        this.amount = amount;
    }

     @Override
    public String describe() {
        return String.format("Webpay, CLP %.2f", amount);
    }
}

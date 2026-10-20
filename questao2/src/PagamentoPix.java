public class PagamentoPix implements Pagamento {
    double amount;
    public PagamentoPix(double amount) {
        this.amount = amount;
    }
    @Override
    public String describe() {
        return String.format("pix, R$ %.2f", amount);
    }
}

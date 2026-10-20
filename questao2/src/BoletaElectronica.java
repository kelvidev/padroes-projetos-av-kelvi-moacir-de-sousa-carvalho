public class BoletaElectronica implements DocumentoFiscal {
     double amount;

    public BoletaElectronica(double amount) {
        this.amount = amount;
    }

    @Override
    public String describe() {
        return String.format("Documento : Boleta electrónica, valor: CLP %.2f | iva (19%%): CLP %.2f", amount, amount * 0.19);
    }
}

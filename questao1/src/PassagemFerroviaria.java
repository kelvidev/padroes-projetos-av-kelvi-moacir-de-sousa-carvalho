

public class PassagemFerroviaria implements Passagem{
    double tarifa;
    public PassagemFerroviaria(double tarifa){
        this.tarifa = tarifa;
    }
    @Override
    public double calcular() {
        return tarifa * 0.05;
    }

    @Override
    public void imprimir() {
        System.out.println("infos: modal = Passagem Ferroviaria, docs exigidos = documento de identidade com foto e comprovante de reserva, taxa de embarque = "+ calcular());
    }
    
}

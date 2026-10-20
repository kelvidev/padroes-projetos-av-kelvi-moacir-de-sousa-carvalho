

public class PassagemAerea implements Passagem{
    double tarifa;
    public PassagemAerea(double tarifa){
        this.tarifa = tarifa;
    }
    @Override
    public double calcular() {
        return tarifa * 0.08;
    }

    @Override
    public void imprimir() {
        System.out.println("infos: modal = Passagem Aerea, docs exigidos = documento de identidade com foto e bilhete eletrônico (e-ticket).taxa de embarque = "+ calcular());
    }
    
}

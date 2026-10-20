

public class PassagemRodoviaria implements Passagem{
    double tarifa;
    public PassagemRodoviaria(double tarifa){
        this.tarifa = tarifa;
    }
    @Override
    public double calcular() {
        return tarifa * 0.03;
    }

    @Override
    public void imprimir() {
        System.out.println("infos: modal = Passagem Rodoviária, docs exigidos = documento de identidade com foto, taxa de embarque = "+ calcular());
    }
    
}

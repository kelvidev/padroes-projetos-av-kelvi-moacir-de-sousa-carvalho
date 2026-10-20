

public class PassagemAereaFactory  implements  PassagemFactory{
    public PassagemAerea criarPassagem(double tarifa){
        return new PassagemAerea(tarifa);
    }
}

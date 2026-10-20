

public class PassagemRodoviariaFactory  implements  PassagemFactory{
    public PassagemRodoviaria criarPassagem(double tarifa){
        return new PassagemRodoviaria(tarifa);
    }
}

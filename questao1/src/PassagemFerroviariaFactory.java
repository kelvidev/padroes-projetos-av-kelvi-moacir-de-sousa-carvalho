

public class PassagemFerroviariaFactory  implements  PassagemFactory{
    public PassagemFerroviaria criarPassagem(double tarifa){
        return new PassagemFerroviaria(tarifa);
    }
}

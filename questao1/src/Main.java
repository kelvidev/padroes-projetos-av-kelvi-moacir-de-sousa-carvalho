
public class Main {
    public static void main(String[] args) {
        
    PassagemFactory passagemFactory = new PassagemAereaFactory();
    
    Passagem passagem = passagemFactory.criarPassagem(600);

    //Professor, aqui eu tô só mudando a instancia Para mostrar que A tipagem está correta,
    //  dessa forma eu posso até mesmo usar o mesmo objeto por eles terem o mesmo pai
    //Só pra deixar o teste mais divertido mesmo :)

    passagem.imprimir();

    passagemFactory = new PassagemRodoviariaFactory();
    
    passagem = passagemFactory.criarPassagem(600);

    passagem.imprimir();

    passagemFactory = new PassagemFerroviariaFactory();
    
    passagem = passagemFactory.criarPassagem(600);

    passagem.imprimir();

    

    }
}

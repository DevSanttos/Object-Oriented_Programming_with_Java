public class Mago extends Guerreiro{

    public Mago(String nome){
        super(nome);
    }

    public String golpear(){
        return "Mago "+this.nome+" lançou magia";
    }
}

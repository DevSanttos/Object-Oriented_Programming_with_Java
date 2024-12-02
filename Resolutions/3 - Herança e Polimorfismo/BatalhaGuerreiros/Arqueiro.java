public class Arqueiro extends Guerreiro{

    public Arqueiro(String nome){
        super(nome);
    }

    public String golpear(){
        return "Arqueiro "+this.nome+" lançou flechas";
    }
}

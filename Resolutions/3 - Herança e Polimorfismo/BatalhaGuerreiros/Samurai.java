public class Samurai extends Guerreiro {

    public Samurai(String nome){
        super(nome);
    }

    public String golpear(){
        return "Samurai "+this.nome+" desferiu lâminas";
    }
}

import java.util.ArrayList;

public class Time {
    private String nome;
    private ArrayList<Guerreiro> guerreiros;

    public Time(String nome){
        this.nome = nome;
        this.guerreiros = new ArrayList<Guerreiro>();
    }

    public void addGuerreiro(Guerreiro umGuerreiro){
        this.guerreiros.add(umGuerreiro);
    }

    public void atacar(){
        for(Guerreiro umGuerreiro : guerreiros){
            String golpe = umGuerreiro.golpear();
            System.out.printf("%s\n", golpe);
        }
    }
}

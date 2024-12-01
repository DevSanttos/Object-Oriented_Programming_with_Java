public class Estudante {
    private String nome;
    private int numeroMatricula;
    private int quantCreditos;
    
    public Estudante(int numeroMatricula){
        this.numeroMatricula = numeroMatricula;
    }
    
    public boolean setNome(String nome){
        if(!nome.equals(" ")){
            this.nome = nome;
            return true;
        } else return false;
    }
    public String getNome(){
        return this.nome;
    }
    
    public int getNumMatricula(){
        return this.numeroMatricula;
    }
    
    public int getQuantCreditos(){
        return this.quantCreditos;
    }
    
     public boolean adicionarCreditos(int creditosGanhos) {
        if(creditosGanhos <= 100){
            quantCreditos += creditosGanhos;
            return true;
        } else return false;
    }
    
    public String retornaLogin(){
        String primeirasLetras = nome.substring(0,3);
        String converteNumeros = String.valueOf(numeroMatricula);
        converteNumeros = converteNumeros.substring(converteNumeros.length() - 3, converteNumeros.length());
        return primeirasLetras + converteNumeros;
    }
    
    public String representaText(){
        return "Nome: " + nome + ", Matrícula: " + numeroMatricula + ", Login: "+ retornaLogin() + ", Créditos: " + quantCreditos;
    }
}
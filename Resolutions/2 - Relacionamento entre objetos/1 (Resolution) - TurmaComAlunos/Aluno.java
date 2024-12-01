public class Aluno {
    private int matricula;
    private String nome;
    
    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
    
    public int getMatricula() {
        return this.matricula;
    }
    public String getNome() {
        return this.nome;
    }
}
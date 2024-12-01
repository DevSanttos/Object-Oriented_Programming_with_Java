import java.util.ArrayList;

public class Turma {
    private String nomeDisciplina;
    private String nomeProfessor;
    private ArrayList<Aluno> listaAlunos;
    
    public Turma(String nomeDisciplina, String nomeProfessor) {
        this.nomeDisciplina = nomeDisciplina;
        this.nomeProfessor = nomeProfessor;
        this.listaAlunos = new ArrayList<Aluno>();
    }
    
    public String getNomeDisciplina() {
        return this.nomeDisciplina;
    }
    public String getNomeProfessor() {
        return this.nomeProfessor;
    }
    
    public void addAluno(Aluno alun) {
        this.listaAlunos.add(alun);
    }
    public ArrayList<Aluno> getAlunos() {
        return this.listaAlunos;
    }
    
    public int getQuantidadeAlunos() {
        return this.listaAlunos.size();
    }
    public void imprimeAlunos() {
        System.out.println("Nome da disciplina: "+ getNomeDisciplina());
        System.out.println("Nome do professor: "+ getNomeProfessor());
        System.out.println("Imprime os alunos da lista: ");
        for(Aluno alun : listaAlunos) {
            System.out.println("Matricula: "+alun.getMatricula() + "Nome: "+ alun.getNome());
        }
    }
}
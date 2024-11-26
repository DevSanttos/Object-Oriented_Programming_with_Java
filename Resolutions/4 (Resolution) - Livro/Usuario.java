import java.util.List;
import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Livro> livrosEmprestados;
    
    public Usuario(String nome){
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }
    
    public String emprestarLivro(Livro livro){
        if(getEstaDisponivel() == true){
            
        }
    }
    
}
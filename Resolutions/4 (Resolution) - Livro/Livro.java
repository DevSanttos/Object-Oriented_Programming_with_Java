public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicado;
    private boolean disponivel;
    private int limiteLivros = 10;
    private int contaEmprestimos;
    
    public Livro(String titulo, String autor, int anoPublicado){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
    }
    
    public boolean setDisponivel(boolean disponivel){
        if(contaEmprestimos <= limiteLivros){
            this.disponivel = disponivel;
            return true;
        } else return false;
    }
    
    public boolean getEstaDisponivel(){
        return this.disponivel = disponivel;
    }
    public String getTitulo(){
        return this.titulo = titulo;
    }
    public int getAnoPublicado(){
        return this.anoPublicado = anoPublicado;
    }
    public String getAutor(){
        return this.autor = autor;
    }
    public int getLimiteLivros(){
        return this.limiteLivros = limiteLivros;
    }
    public int getContaEmprestimos(){
        return this.contaEmprestimos = contaEmprestimos;
    }
    
    public String emprestar(){
        if(disponivel == true){
            this.disponivel = false;
            contaEmprestimos++;
            return "Emprestimo concluído!";
        } else return "O livro não está disponível!";
    }
    
    public String devolver(){
        if(disponivel == false){
            this.disponivel = true;
            contaEmprestimos--;
            return "Devolução concluída!";
        } else return "O livro não foi emprestado! Logo não é possível devolver.";
    }
}
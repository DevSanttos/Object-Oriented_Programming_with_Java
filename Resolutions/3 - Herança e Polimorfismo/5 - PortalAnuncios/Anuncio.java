
public class Anuncio {
    protected String produto;
    protected double valorVenda;
    protected String cidade;
    protected String estado;

    public Anuncio(String produto, double valorVenda, String cidade, String estado) {
        this.produto = produto;
        this.valorVenda = valorVenda;
        this.cidade = cidade;
        this.estado = estado;
    }
        
    public boolean setProduto(String produto) {
        if (!produto.isEmpty()){
            this.produto = produto;
            return true;
        } else return false;
    }

    public boolean setValorVenda(double valorVenda) {
        if (valorVenda >= 0){
            this.valorVenda = valorVenda;
            return true;
        } else return false;
    }

    public boolean setCidade(String cidade) {
        if (!cidade.isEmpty()){
            this.cidade = cidade;
            return true;
        }else return false;
    }

    public boolean setEstado(String estado) {
        if (!estado.isEmpty()){
            this.estado = estado;
            return true;
        }else return false;
    }
    
    public String getProduto() {
        return this.produto;
    }
    
    public double getValorVenda() {
        return this.valorVenda;
    }
    
    public String getCidade() {
        return this.cidade;
    }
    
    public String getEstado() {
        return this.estado;
    }
    
    public String toString(){
        return "Produto: "+this.produto+", "+
        "Valor: "+this.valorVenda+", "+
        "Estado: "+this.estado+", "+
        "Cidade: "+this.cidade;
    }
}

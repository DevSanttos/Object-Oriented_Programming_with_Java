public abstract class Veiculo {
    protected String modelo;
    protected int ano;
    protected String placa;
    protected double valor;
    
    public Veiculo(String modelo, int ano, String placa, double valor) {
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.valor = valor;
    }
    
    public boolean setModelo(String modelo) {
        if(!modelo.equals(" ")) {
            this.modelo = modelo;
            return true;
        } else return false;
    }
    
    public boolean setAno(int ano) {
        if(ano > 0) {
            this.ano = ano;
            return true;
        } else return false;
    }
    
    public boolean setPlaca(String placa) {
        if(!placa.equals(" ")) {
            this.placa = placa;
            return true;
        } else return false;
    }
    
    public boolean setValor(double valor) {
        if(valor > 0) {
            this.valor = valor;
            return true;
        } else return false;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public int getAno() {
        return this.ano;
    }
    
    public String getPlaca() {
        return this.placa;
    }
    
    public double getValor() {
        return this.valor;
    }
    
    public String toString() {
        return "Modelo: " + this.modelo +
            "Ano: " + this.ano +
            "Placa: " + this.placa + 
            "Valor: " + this.valor;
    }
}
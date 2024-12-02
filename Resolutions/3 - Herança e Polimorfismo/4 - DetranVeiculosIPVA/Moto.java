public class Moto extends Veiculo {
    private int cilindradas;
    
    public Moto(String modelo, int ano, String placa, double valor, int cilindradas) {
        super(modelo, ano, placa, valor);
        this.cilindradas = cilindradas;
    }
    
    public boolean setCilindradas(int cilindradas) {
        if(cilindradas > 0) {
            this.cilindradas = cilindradas;
            return true;
        } else return false;
    }
    
    public int getCilindradas() {
        return this.cilindradas;
    }
    
    @Override
    public double CalculaIPVA() {
        if(this.cilindradas > 200) {
            return this.valor * 0.02;
        } else return 0;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", " +
        "Cilindradas: " + this.cilindradas + ", " +
         "Calculo do IPVA: " + this.CalculaIPVA();
    }
}
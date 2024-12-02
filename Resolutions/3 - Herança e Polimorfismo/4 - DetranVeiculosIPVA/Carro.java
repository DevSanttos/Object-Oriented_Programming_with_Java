public class Carro extends Veiculo {
    private int portas;
    private boolean particular;
    public Carro(String modelo, int ano, String placa, double valor, int portas, boolean particular) {
        super(modelo, ano, placa, valor);
        this.portas = portas;
        this.particular = particular;
    }
    
    public boolean setPortas(int portas) {
        if(portas > 0 && portas < 5) {
            this.portas = portas;
            return true;
        } else return false;
    }
    
    public int getPortas() {
        return this.portas;
    }
    
    @Override
    public double CalculaIPVA() {
        double ipva = super.CalculaIPVA();
        if(particular == false) {
            return 0;
        } else return ipva;
    }
    
    public String toString() {
        return super.toString() + ", " +
        "Portas: " + this.portas + ", " +
        "Calculo IPVA: " + CalculaIPVA();
    }
}
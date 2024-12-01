public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldoAtual;
    
    public ContaBancaria(int numeroConta, String titular){
        this.numeroConta = numeroConta;    
        this.titular = titular;
        this.saldoAtual = 0;
        }
    
    public boolean setSaldoAtual(double saldoAtual){
        if(saldoAtual >= -10000){
            this.saldoAtual = saldoAtual;
            return true;
        } else return false;
    }
    public double getSaldoAtual(){
        return this.saldoAtual;
    }
    public String getTitular(){
        return this.titular;
    }
    public int getNumeroConta(){
        return this.numeroConta;
    }
    
    public double depositar(double quantAdicionar){
        if(quantAdicionar >= 0) {
         return this.saldoAtual += quantAdicionar;   
        } else return this.saldoAtual;
    }
    
    public double sacar(double quantRetirar){
        if(quantRetirar <= this.saldoAtual) {
            return this.saldoAtual -= quantRetirar;
        } else return this.saldoAtual;
    }
}
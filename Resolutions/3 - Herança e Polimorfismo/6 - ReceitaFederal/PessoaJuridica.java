public class PessoaJuridica extends Pessoa {
    private String CNPJ;
    private double faturamentoMes;
    private int enquadramentoEmpresa;
    
    public PessoaJuridica(String nome, String endereco, String CNPJ, double faturamentoMes, int enquadramentoEmpresa) {
        super(nome, endereco);
        this.CNPJ = CNPJ;
        this.faturamentoMes = faturamentoMes;
        this.enquadramentoEmpresa = enquadramentoEmpresa;
    }
    
    public String getCNPJ() {
        return this.CNPJ;
    }
    
    public double getFaturamentoMes() {
        return this.faturamentoMes;
    }
    
    public int getEnquadramentoEmpresa() {
        return this.enquadramentoEmpresa;
    }
    
    public double CalculaImposto() {
        if(this.enquadramentoEmpresa == 1) {
            return this.faturamentoMes * 0.02;
        } else {
            if(this.enquadramentoEmpresa == 2) {
                return this.faturamentoMes * 0.05;
            } else {
                if(this.enquadramentoEmpresa == 3) {
                    return this.faturamentoMes * 0.15;
                } else return 0;
            }
        }
    }
    
    public String toString() {
        return super.toString() + ", " +
            "CNPJ: " + this.CNPJ + ", " +
            "Faturamento no mês: " + this.faturamentoMes + ", " +
            "Enquadramento da Empresa: " + this.enquadramentoEmpresa;
    }
}
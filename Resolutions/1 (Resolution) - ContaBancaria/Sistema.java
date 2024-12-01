public class Sistema {
    public static void main(String[] args) {
        ContaBancaria contaBanc1 = new ContaBancaria(1437532,"Jonathan");
        System.out.println(contaBanc1.getTitular());
        System.out.println(contaBanc1.getNumeroConta());
        contaBanc1.depositar(100);
        System.out.println(contaBanc1.getSaldoAtual());
        contaBanc1.depositar(140);
        System.out.println(contaBanc1.getSaldoAtual());
        contaBanc1.sacar(40);
        System.out.println(contaBanc1.getSaldoAtual());
    }
}
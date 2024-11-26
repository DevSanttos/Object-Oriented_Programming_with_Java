public class Sistema{
    public static void main(String[] args){
        Funcionario fun1 = new Funcionario();
        fun1.setNome("Bob");
        fun1.setQuantHorasTrabalhadas(160);
        fun1.setSalarioHora(6.15);
        fun1.setQuantDependentes(2);
        
        System.out.println(fun1.retornaSalarioBruto());
        System.out.println(fun1.retornaDescontINSS());
        System.out.println(fun1.retornaDescontIR());
        System.out.println(fun1.retornaSalarioLiquido());
        fun1.setSalarioHora(8);
        System.out.println(fun1.retornaSalarioLiquido());
        System.out.println(fun1.retornaRepresentacaoText());
        
        Funcionario fun2 = new Funcionario();
        fun2.setNome("Bia");
        fun2.setQuantHorasTrabalhadas(200);
        fun2.setSalarioHora(12.5);
        fun2.setQuantDependentes(0);
    }
}
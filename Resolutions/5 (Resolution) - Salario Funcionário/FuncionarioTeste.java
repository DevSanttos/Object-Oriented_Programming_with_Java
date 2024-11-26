import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FuncionarioTeste {
    @Test
    public void testeFuncionario1(){
        Funcionario fun1 = new Funcionario();
        fun1.setNome("Bob");
        fun1.setQuantHorasTrabalhadas(160);
        fun1.setSalarioHora(6.15);
        fun1.setQuantDependentes(2);
        
        assertEquals("Bob",fun1.getNome());
        assertEquals(160, fun1.getQuantHorasTrabalhadas());
        assertEquals(6.15, fun1.getSalarioHora(), 0.01);
        assertEquals(2, fun1.getDependentes());
    }
    @Test
    public void testeFuncionario2(){
        Funcionario fun2 = new Funcionario();
        fun2.setNome("Bia");
        fun2.setQuantHorasTrabalhadas(200);
        fun2.setSalarioHora(12.5);
        fun2.setQuantDependentes(0);
        
        assertEquals("Bia", fun2.getNome());
        assertEquals(200, fun2.getQuantHorasTrabalhadas());
        assertEquals(12.4, fun2.getSalarioHora(), 0.1);
        assertEquals(0, fun2.getDependentes());
    }
}
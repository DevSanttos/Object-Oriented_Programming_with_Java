

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class BancoTeste {
    @Test
    public void testeBanco1() {
        
        Banco banco1 = new Banco(234, "Banco BB");
        Agencia agen1 = new Agencia(1, "Ibirama", 2000);
        Agencia agen2 = new Agencia(2, "Oliveira", 2000);
        Agencia agen3 = new Agencia(3, "indaial", 1978);
        
        banco1.addAgencias(agen1);
        banco1.addAgencias(agen2);
        banco1.addAgencias(agen3);
        
        Banco banco2 = new Banco(111, "Caixa");
        Agencia agen4 = new Agencia(54, "Rio baixo", 1999);
        Agencia agen5 = new Agencia(55, "Blumenau", 1999);
        Agencia agen6 = new Agencia(56, "Ibirama", 1999);
        
        banco2.addAgencias(agen4);
        banco2.addAgencias(agen5);
        banco2.addAgencias(agen6);
        
        assertEquals(3, banco1.getQuantAgencias());
        assertEquals(3, banco2.getQuantAgencias());
        
        ArrayList<Agencia> agenciaBanco1 = banco1.getListaAgencia();
        assertEquals(agen1, agenciaBanco1.get(0));
        assertEquals(agen2, agenciaBanco1.get(1));
        assertEquals(agen3, agenciaBanco1.get(2));
        
        ArrayList<Agencia> agenciaBanco2 = banco2.getListaAgencia();
        assertEquals(agen4, agenciaBanco2.get(0));
        assertEquals(agen5, agenciaBanco2.get(1));
        assertEquals(agen6, agenciaBanco2.get(2));
        
        ArrayList<Agencia> agenciaBanco1Ibirama = banco1.getListaAgencia("Ibirama");
        assertEquals(1, agenciaBanco1Ibirama.size());
        assertEquals(agen1, agenciaBanco1Ibirama.get(0));
        
        ArrayList<Agencia> agenBanco2Blumenau = banco2.getListaAgencia("Blumenau");
        assertEquals(1, agenBanco2Blumenau.size());
        assertEquals(agen5, agenBanco2Blumenau.get(0));
        
        ArrayList<Agencia> agenBanco1Ano2000 = banco1.getListaAgencia(2000);
        assertEquals(2, agenBanco1Ano2000.size());
        assertEquals(agen1, agenBanco1Ano2000.get(0));
    }
}

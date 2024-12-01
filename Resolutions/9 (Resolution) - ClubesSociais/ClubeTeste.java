import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class ClubeTeste {
    @Test
    public void testeClube1() {
        Clube clube1 = new Clube("União","Ibirama");
        
        Socio socio1 = new Socio(123, "Ana", 50, 75.50);
        Socio socio2 = new Socio(456, "Maria", 17, 46.30);
        Socio socio3 = new Socio(789, "José", 45, 70.00);
        Socio socio4 = new Socio(111, "Pedro", 15, 50.00);
        
        clube1.addSocios(socio1);
        clube1.addSocios(socio2);
        clube1.addSocios(socio3);
        clube1.addSocios(socio4);
        
        ArrayList<Socio> sociosUniao = clube1.getSocios();
        assertEquals(4, sociosUniao.size());
        assertEquals(socio1, sociosUniao.get(0));
        assertEquals(socio2, sociosUniao.get(1));
        assertEquals(socio3, sociosUniao.get(2));
        assertEquals(socio4, sociosUniao.get(3));
        
        ArrayList<Socio> sociosMenorIdade = clube1.getSociosMenoresDeIdade();
        assertEquals(2, sociosMenorIdade.size());
        assertEquals(socio2, sociosMenorIdade.get(0));
        assertEquals(socio4, sociosMenorIdade.get(1));
        
        assertEquals(31.75, clube1.getIdadeMediaSocios(), 0.01);
        
        ArrayList<Socio> sociosIdadeMaiorQueMedia = clube1.getSociosIdadeMaiorQueMedia();
        assertEquals(2, sociosIdadeMaiorQueMedia.size());
        assertEquals(socio1, sociosIdadeMaiorQueMedia.get(0));
        assertEquals(socio3, sociosIdadeMaiorQueMedia.get(1));
        
        assertEquals(241.8, clube1.getArrecadacaoMensalidades(), 00.1);
        
        socio1.setIdade(51);
        socio1.setValorMensalidade(80.00);
        socio2.setIdade(18);
        socio4.setValorMensalidade(55.50);
        
        clube1.removerSocio(456);
        assertEquals(3, clube1.getSocios().size());
    }
}

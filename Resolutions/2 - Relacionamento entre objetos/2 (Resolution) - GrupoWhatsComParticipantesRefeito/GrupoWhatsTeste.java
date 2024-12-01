import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class GrupoWhatsTeste {
    @Test
    public void testaGrupo1(){
        Grupo grupoA = new Grupo("Grupo A");
        Grupo grupoB = new Grupo("Grupo B");
        
        assertEquals("Grupo A", grupoA.getNome());
        assertEquals("Grupo B", grupoB.getNome());
        
        Participante partic1 = new Participante("Jonathan", 999999999);
        Participante partic2 = new Participante("Lucas", 888888888);
        
        assertEquals("Jonathan", partic1.getNome());
        assertEquals("Lucas", partic2.getNome());
        assertEquals(999999999, partic1.getTelefone());
        assertEquals(888888888, partic2.getTelefone());
        
        grupoA.addParticipante(partic1);
        grupoB.addParticipante(partic2);
        ArrayList<Participante> particGrupoA = grupoA.getParticipantes();
        assertEquals(partic1,particGrupoA.get(0));
        
        ArrayList<Participante> listaGrupoB = grupoB.getParticipantes();
        assertEquals(partic2, listaGrupoB.get(0));
    }
}

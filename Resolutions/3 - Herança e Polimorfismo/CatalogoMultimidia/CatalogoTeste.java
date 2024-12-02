
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class CatalogoTeste {
    @Test
    public void testeCatalogo() {
        Catalogo catalogo1 = new Catalogo("Jonathan");
        Album album1 = new Album("Pulse", 90, "Bom", "Pink", 7);
        
        catalogo1.addItens(album1);
        
        ArrayList<Item> listaItens = catalogo1.getItens();
        assertEquals(1, catalogo1.getItens().size());
        assertEquals(album1, catalogo1.getItens().get(0));
        assertEquals("Título: " +album1.getTitulo()+ ", " +
            "Duração: " +album1.getDuracao()+ ", " +
            "Comentário: "+album1.getComentario()+ ", " +
            "Artista: " + album1.getArtista() + ", " +
            "Faixas: " + album1.getFaixas(), album1.toString()
            );
    }
}

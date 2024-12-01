import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstudanteTeste{
    @Test
    public void testeEstudante1(){
         Estudante est1 = new Estudante(556644);
         est1.setNome("Fernando");
         est1.adicionarCreditos(35);
         assertEquals(556644, est1.getNumMatricula());
         assertEquals("Fernando", est1.getNome());
         assertEquals(35, est1.getQuantCreditos());
         
         System.out.println(est1.retornaLogin());
         System.out.println(est1.representaText());
         est1.adicionarCreditos(4);
         System.out.println(est1.representaText());
         est1.setNome("Fernando Santos");
         System.out.println(est1.retornaLogin());
         System.out.println(est1.representaText());
    }       
    @Test
    public void testeEstudante2(){
         Estudante est2 = new Estudante(579035);
         est2.setNome("Beth");
         est2.adicionarCreditos(80);
         assertEquals(579035, est2.getNumMatricula());
         assertEquals("Beth", est2.getNome());
         
         
         System.out.println(est2.representaText());
         est2.adicionarCreditos(-8);
         System.out.println(est2.representaText());
         est2.setNome("Elizabeth");
         System.out.println(est2.retornaLogin()); 
    }
}

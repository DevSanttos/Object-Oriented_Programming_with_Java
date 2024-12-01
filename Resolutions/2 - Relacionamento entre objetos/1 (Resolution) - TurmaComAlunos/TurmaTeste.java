import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class TurmaTeste {
    @Test
    public void testeTurma() {
        Turma turmaA = new Turma("Biologia", "Koré");
        Turma turmaB = new Turma("Quimica", "Vanessa");
        
        assertEquals("Biologia", turmaA.getNomeDisciplina());
        assertEquals("Quimica", turmaB.getNomeDisciplina());
        assertEquals(0, turmaA.getQuantidadeAlunos());
        assertEquals(0, turmaB.getQuantidadeAlunos());
        assertEquals("Koré", turmaA.getNomeProfessor());
        assertEquals("Vanessa", turmaB.getNomeProfessor());
        
        Aluno alun1 = new Aluno(12451, "Jonathan");
        Aluno alun2 = new Aluno(1441, "Kauã");
        
        assertEquals("Jonathan", alun1.getNome());
        assertEquals(12451, alun1.getMatricula());
        assertEquals(1441, alun2.getMatricula());
        assertEquals("Kauã", alun2.getNome());
        
        turmaA.addAluno(alun1);
        
        assertEquals(1, turmaA.getQuantidadeAlunos());
        
        ArrayList<Aluno> alunosTurma1 = turmaA.getAlunos();
        
        assertEquals(alun1, alunosTurma1.get(0));
    }
}

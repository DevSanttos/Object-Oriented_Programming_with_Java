public class Sistema {
    public static void main(String[] args) {
         Estudante est1 = new Estudante(556644);
         est1.setNome("Fernando");
         est1.adicionarCreditos(35);
         System.out.println(est1.retornaLogin());
         System.out.println(est1.representaText());
         est1.adicionarCreditos(4);
         System.out.println(est1.representaText());
         est1.setNome("Fernando Santos");
         System.out.println(est1.retornaLogin());
         System.out.println(est1.representaText());
         
         Estudante est2 = new Estudante(579035);
         est2.setNome("Beth");
         est2.adicionarCreditos(80);
         System.out.println(est2.representaText());
         est2.adicionarCreditos(-8);
         System.out.println(est2.representaText());
         est2.setNome("Elizabeth");
         System.out.println(est2.retornaLogin());
         
    }
}
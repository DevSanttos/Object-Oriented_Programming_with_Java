public class Animal {
    private String nome;
    private String classe;
    private String familia;
    private int idade;
    private boolean estado;
    private double caloria;
    private double forca;

    public Animal(String nome, String classe, String familia, int idade, boolean estado, double caloria, double forca) {
        this.setNome(nome);
        this.setClasse(classe);
        this.setFamilia(familia);
        this.setIdade(0);
        this.setEstado(true);
        this.setCaloria(10);
        this.setForca(10);
    }

    public boolean setNome(String nome) {
        if (!nome.isBlank()) {
            this.nome = nome;
            return true;
        } else return false;
    }

    public boolean setClasse(String classe) {
        if (!classe.isBlank()) {
            this.classe = classe;
            return true;
        } else return false;
    }

    public boolean setFamilia(String familia) {
        if (!familia.isBlank()) {
            this.familia = familia;
            return true;
        } else return false;
    }

    public boolean setIdade(int idade) {
        if (idade > 0 && idade < 500) {
            this.idade = idade;
            return true;
        } else return false;
    }

    public boolean setEstado(boolean estado) {
        this.estado = estado;
        return true;
    }

    public boolean setCaloria(double caloria) {
        if (caloria >= 0 && caloria < 101) {
            this.caloria = caloria;
            return true;
        } else return false;
    }

    public boolean setForca(double forca) {
        if (forca >= 0 && forca < 101) {
            this.forca = forca;
            return true;
        } else return false;
    }

    public String getNome() {
        return this.nome;
    }

    public String getClasse() {
        return this.classe;
    }

    public String getFamilia() {
        return this.familia;
    }

    public int getIdade() {
        return this.idade;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public double getForca() {
        return this.forca;
    }

    public double getCaloria() {
        return this.caloria;
    }

    public void comer() {
        if (this.getCaloria() != 100 && this.getEstado()) {
            this.setCaloria(getCaloria() +10);
            this.setForca(getForca() - 2);
        }
    }

    public void correr() {
        if (this.getEstado() && this.getCaloria() != 0) {
            this.setCaloria(this.caloria - 5);
            this.setForca(this.caloria - 5);
        }
    }

    public void dormir() {
        if (this.getEstado()) {
            this.setForca(getForca() + 10);
            this.setCaloria(getCaloria() - 2);
        }
    }

    public void morrer() {
        this.setForca(0);
        this.setCaloria(0);
        this.setEstado(false);
    }
}

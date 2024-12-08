public abstract class Figura {
    private String cor;

    public Figura(String cor) {
        this.setCor(cor);
    }

    public boolean setCor(String cor) {
        if (!cor.isBlank()) {
            this.cor = cor;
            return true;
        } else return false;
    }

    public String getCor() {
        return cor;
    }

    public abstract double area();

    public String toString() {
        return "Cor: " + this.getCor();
    }
}

public class Circulo extends Figura {
    private double raio;

    public Circulo(String cor) {
        super(cor);
        this.setRaio(raio);
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double area() {
        return Math.pow(Math.PI * this.getRaio(), 2);
    }

    public double getDiametro() {
        return this.getRaio() * 2;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Raio: " + this.getRaio();
    }
}

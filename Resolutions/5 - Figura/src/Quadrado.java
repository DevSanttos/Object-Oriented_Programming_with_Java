public class Quadrado extends Retangulo {
    private double lado;

    public Quadrado(String cor, double lado) {
        super(cor);
        this.setLado(lado);
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double area() {
        return Math.pow(lado, 2);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Lado: " + getLado();
    }
}
public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(String cor) {
        super(cor);
        this.setBase(base);
        this.setAltura(altura);
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double area() {
        return (this.getBase() * this.getAltura()) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Base: " + this.getBase() + "\n" +
                "Altura: " + this.getAltura();
    }
}

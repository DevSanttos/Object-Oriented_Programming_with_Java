public class Retangulo extends Figura{
    private double base;
    private double altura;

    public Retangulo(String cor) {
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
        return base * altura;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Base: " + this.getBase() + "\n" +
                "Altura: " + this.getAltura();
    }
}

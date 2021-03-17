package LP05.ex02;

public class Equacao {
    private int a;
    private int b;
    private int c;

    public Equacao(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDelta() {
        return (Math.pow(this.b, 2) - (4 * this.a * this.c));
    }

    public double raiz1() {
        return (-this.b + Math.sqrt(this.getDelta()) / (2 * this.a));
    }

    public double raiz2() {
        return (-this.b - Math.sqrt(this.getDelta()) / (2 * this.a));
    }
}

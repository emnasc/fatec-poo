package LP07;

public class Superior {
    private double n1;
    private double n2;
    private double n3;

    public Superior(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "Notas do curso superior { " +
                "Nota da P1: " + n1 +
                ", Nota da P2: " + n2 +
                ", Nota dos trabalhos: " + n3 +
                " }";
    }

    public double calculaMedia() {
        return (n1 * 0.35) + (n2 * 0.5) + (n3 * 0.15);
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }
}

package LP07;

public class Tecnico extends Superior {
    public Tecnico(double n1, double n2, double n3) {
        super(n1, n2, n3);
    }

    @Override
    public String toString() {
        return "Notas do curso técnico { " +
                "Nota do 1º trimestre: " + this.getN1() +
                ", Nota do 2º trimestre: " + this.getN2() +
                ", Nota do 3º trimestre: " + this.getN3() +
                " }";
    }

    @Override
    public double calculaMedia() {
        try {
            double notaFinal = (this.getN1() + (this.getN2() * 2) + (this.getN3() * 2)) / 5;
            return notaFinal;
        } catch (ArithmeticException ae) {
            return 0;
        }
    }
}

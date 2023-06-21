public class Quadrado {
    private double tamanhoLado;

    public void setLado(Double tamanhoLado) {
        this.tamanhoLado = tamanhoLado; 
    }

    public double getLado() {
        return tamanhoLado;
    }

    public static double calcArea(Double tamanhoLado) {
        double area = tamanhoLado*4;
        return area;
    }
}



public class Retangulo extends Ponto {
    private int largura, altura;
    private Ponto pontoInicial;

    public Retangulo(Ponto pontoInicial, int largura, int altura) {
        super();
        this.pontoInicial = pontoInicial;
        this.largura = largura;
        this.altura = altura;
    }

    public Retangulo(int largura, int altura) {
        super();
        this.largura = largura;
        this.altura = altura;
    }

    public Retangulo(){
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double calcArea() {
        double area = largura * altura;
        return area;
    }

    public double calcPerimetro() {
        double perimetro = 2*(largura + altura);
        return perimetro;
    }

    public Ponto calcCentroRetangulo() {
        int  centroX = pontoInicial.getX() + largura /2;
        int centroY = pontoInicial.getY() + altura/2;
        return new Ponto(centroX, centroY);
    }

    public void getCentro() {
        Ponto centro = calcCentroRetangulo();
        System.out.println("Centro do retângulo: (" + centro.getX() + "," + centro.getY() + ")");
    }

    public void alterarRetangulo(Ponto pontoInicial, int largura, int altura) {
        this.pontoInicial = pontoInicial;
        this.largura = largura;
        this.altura = altura;
        System.out.println("Retângulo alterado com sucesso!");
    }
}

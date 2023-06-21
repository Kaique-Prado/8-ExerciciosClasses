public class Ponto {
    private int x, y;

    public Ponto (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ponto() {
    }

    public void setX(int x) {
        this.x= x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void imprimir() {
        System.out.println("Coordenadas do ponto: (" + x + ", " + y + ")");
    }

}

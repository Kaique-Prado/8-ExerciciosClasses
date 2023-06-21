import java.util.Scanner;
public class ProgramaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        System.out.println("Informe os lados do retangulo");
        
        System.out.print("Base:");
        int  base = scanner.nextInt();
        retangulo.setLargura(base);
        
        System.out.print("Altura:");
        int altura = scanner.nextInt();
        retangulo.setAltura(altura);

        scanner.close();
        
        System.out.println("Serão necessarios "+ retangulo.calcArea() +"m² de piso e "+ retangulo.calcPerimetro() +" metros de rodapé para o espaço");
        
    }
}

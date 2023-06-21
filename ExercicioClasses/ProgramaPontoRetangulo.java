import java.util.Scanner; 

public class ProgramaPontoRetangulo{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Ponto pontoInicial = new Ponto(0,0);
        Retangulo retangulo = new Retangulo(pontoInicial,5,3);

        int opcao = 0;
        while (opcao !=4) {
            System.out.println("1. Imprimir valores do retângulo");
            System.out.println("2. Alterar valores do retângulo");
            System.out.println("3. Imprimir centro do retângulo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
        

        switch (opcao) {
            case 1:
                pontoInicial.imprimir();
                System.out.println("Largura do retângulo: " + retangulo.getLargura());
                System.out.println("Altura do retângulo: " + retangulo.getAltura());
                break;
            case 2:
                System.out.print("Digite as coordenadas do ponto inicial (x y): ");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                System.out.print("Digite a largura do retângulo: ");
                int largura = scanner.nextInt();
                System.out.print("Digite a altura do retângulo: ");
                int altura = scanner.nextInt();
                Ponto novoPontoInicial = new Ponto(x, y);
                retangulo.alterarRetangulo(novoPontoInicial, largura, altura);
                break;
            case 3:
                retangulo.getCentro();
                break;
            case 4:
                System.out.println("Encerrando o programa...");
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
        }

        System.out.println();
        }
        scanner.close();
         
    }
}
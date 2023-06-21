
public class Carro {
    private int consumoCombustivel, nivelCombustivel;

    public Carro(int consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
        this.nivelCombustivel = 0;
        System.out.println(consumoCombustivel + " quilometrôs por litro de combustível");
    }

    public void andar(int distancia) {
        int combustivelNecessario = distancia / consumoCombustivel;
        this.nivelCombustivel = nivelCombustivel - combustivelNecessario ;
        if (combustivelNecessario > nivelCombustivel) {
            System.out.println("Não tem combustivel no tanque suficiente para percorrer essa distância");
            return;
        }
        if (nivelCombustivel == 0) {
            System.out.println("Sem combustivel no tanque");
            return;
        }
        System.out.println("anda " + distancia + " quilômetros");
    }

    public void abastecerCarro(int quantidade) {
        this.nivelCombustivel = this.nivelCombustivel + quantidade;
        System.out.println("Abastece " + quantidade + " Litros de combustível.");
    }

    public int mostraQuantidadeCombustivel() {
        return this.nivelCombustivel;
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro(10);
        carro1.abastecerCarro(100);

        carro1.andar(100);
        System.out.println("Quantidade combustivel: "+ carro1.mostraQuantidadeCombustivel());
    }

}

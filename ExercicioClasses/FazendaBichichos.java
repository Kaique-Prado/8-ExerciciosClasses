import java.util.ArrayList;
import java.util.Random;


public class FazendaBichichos extends BichinhoVirtual {
    ArrayList<BichinhoVirtual> bichinhos;
    
    public FazendaBichichos(int quantidadeBichinho) {
        super();
        bichinhos = new ArrayList<BichinhoVirtual>();
        //BichinhoVirtual x = new BichinhoVirtual();
        
        for(int quantidade = 0; quantidade < quantidadeBichinho; quantidade++) {
            int nivelInicialFome = new Random().nextInt(100);
            int nivelInicialSaude = new Random().nextInt(100);
            bichinhos.add(new BichinhoVirtual(nivelInicialFome, nivelInicialSaude));

        }
    }

    public void AlimentarTodosBichos(int quantidade) {
        for (int i = 0; i < bichinhos.size(); i++) {
            BichinhoVirtual bichinho = bichinhos.get(i);
            System.out.println("Bichinho " + (i + 1) + ":");
            bichinho.alimentar(quantidade); 
        }
    }
    
    public void BricarTodosBichos(int tempo) {
        for (BichinhoVirtual bichinho : bichinhos) {
            bichinho.brincar(tempo);
        }
    }

    public void ouvirTodosBichinhos() {
        for (BichinhoVirtual bichinho : bichinhos) {
            bichinho.fazerSom();
        }
    }

    public void exibirStatusBichinhos() {
        for (int quantidade = 0; quantidade < bichinhos.size(); quantidade++) {
            BichinhoVirtual bichinho = bichinhos.get(quantidade);
            System.out.println("Bichinho " + (quantidade + 1) + ":");
            System.out.println("Fome: " + bichinho.getFome());
            System.out.println("Saúde: " + bichinho.getSaude());
            System.out.println("Humor: " + bichinho.getHumor());
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        FazendaBichichos bichos = new FazendaBichichos(5);
        bichos.exibirStatusBichinhos();
        System.out.println("---------------------------------------------");
        bichos.AlimentarTodosBichos(80);
        bichos.exibirStatusBichinhos();
    }
}

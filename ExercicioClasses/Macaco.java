import java.util.ArrayList;
import java.util.List;

public class Macaco {
    private String nome;
    private List<String> bucho;

    public Macaco(String nome) {
        this.nome = nome;
        this.bucho = new ArrayList<String>();
    }

    public void comer(String alimento) {
        bucho.add(alimento);
        System.out.println(nome + " comeu " + alimento);
    }

    public void verBucho() {
        System.out.println("Conteúdo do estômago de " + nome + ":");
        for (String alimento : bucho) {
            System.out.println(alimento);
        }
    }

    public void digerir() {
        System.out.println(nome + " está digerindo...");
        bucho.clear();
    }

    public static void main(String[] args) {
        Macaco macaco1 = new Macaco("Macaco1");
        Macaco macaco2 = new Macaco("Macaco2");

        macaco1.comer("Banana");
        macaco1.comer("Maçã");
        macaco1.comer("Laranja");

        macaco2.comer("Peixe");
        macaco2.comer("Carne");

        macaco1.verBucho();
        macaco2.verBucho();

        macaco1.comer(macaco2.nome);

        macaco1.verBucho();
        macaco2.verBucho();
    }
}

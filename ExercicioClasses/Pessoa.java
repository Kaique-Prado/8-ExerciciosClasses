

public class Pessoa {
    private String nome;
    private int idade;
    private double peso, altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura; 
    }
   
    public void envelhecer() {
      idade++;
      if( idade<21) {
        crescer(0.5);
      }
    }

    public void engordar(Double quantia) {
        peso += quantia;
        
    }

    public void emagrecer(Double quantia) {
        peso -=quantia;
    }

    public void crescer(double quantia) {
        altura += quantia;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso; 
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public static void main(String[] args) {
        Pessoa kaique = new Pessoa("Kaique", 19, 70, 170.0);

        kaique.envelhecer();
        kaique.engordar(2.5);
        kaique.emagrecer(1.0);
        kaique.crescer(1.0);

        System.out.println("Nome: " + kaique.getNome());
        System.out.println("Idade: " + kaique.getIdade());
        System.out.println("Peso: " + kaique.getPeso());
        System.out.println("Altura: " + kaique.getAltura());

        
    }

   
}

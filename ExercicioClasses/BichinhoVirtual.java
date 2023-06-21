public class BichinhoVirtual{
    private String nome, som;
    private int saude, fome, idade;

    public BichinhoVirtual(int fome, int saude) {
        this.fome = fome;
        this.saude = saude;
    }

    public BichinhoVirtual() {
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setFome(int fome) {
        this.fome = fome;
        if(fome>100) {
            this.fome = 100;
            return;
        }
        else if(fome<0) {
            this.fome =0;
            return;
        }
    }

    public int getFome() {
        return fome;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getSaude() {
        return saude;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getHumor() {
        if( this.fome>=70 && getSaude() >=70) {
             return "Estou muito feliz";
        }
        else if (this.fome>=50 && getSaude() >=50) {
            return "Não estou tão bem, mas OK";
        }
        else {
            return "Estou com muita raiva no momento";
        }
    }

    public void setSom(String som) {
        this.som = som;
    }
    public String fazerSom() {
        return som;
    }

    public void alimentar(int quantidade) {
        if(quantidade <= 100 || quantidade>=0) {
            this.fome += quantidade;
        }
        else{
            System.out.println("Quantidade para alimentar inválida");
            return;
        }

        if(this.fome>100) {
            this.fome = 100;
            System.out.println("Estomago Cheio! Não dá para alimentar mais");
            return;
        }
    }

    public void brincar(int tempo) {
        if(tempo>=100 && tempo>=0) {
            this.saude +=this.saude * (tempo/100);
        }
    }

    public void Status() {
        System.out.println("-STATUS-");
        System.out.println("Nome:"+ getNome());
        System.out.println("idade:"+ getIdade());
        System.out.println("Fome:"+ getFome());
        System.out.println("Saúde:"+ getSaude());
        System.out.println("Humor:"+ getHumor());
    }

    
}

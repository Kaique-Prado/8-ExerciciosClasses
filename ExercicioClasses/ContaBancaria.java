public class ContaBancaria {
    private int numeroConta;
    private String nome;
    private Double saldo;

    public ContaBancaria (int numeroConta, String nome, Double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo= saldo;
    }
    
    public ContaBancaria(int numeroConta, String nome) {
        this(numeroConta, nome, 0.0);
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setdeposito(Double depositar) {
        saldo += depositar;  
    }

    public void setSaque(Double sacar) {
        if (sacar > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= sacar; 
        }
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1234, "kaique", 100.0);
        System.out.println(conta.getSaldo());
    }
}

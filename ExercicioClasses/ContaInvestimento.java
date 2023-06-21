public class ContaInvestimento {
    private double taxaJuros, saldo;
    
    public ContaInvestimento( Double saldo, double taxaJuros) {
        this.saldo = saldo;
        this.taxaJuros = taxaJuros;
    }
  
    public void adicioneJuros() {
        double juros = this.saldo * (this.taxaJuros / 100);
        this.saldo +=juros;
    }

    public Double getSaldo() {
        return this.saldo;
    }
    
    public static void main(String[] args) {
        ContaInvestimento conta = new ContaInvestimento(1000.00, 10.0);

        for (int i = 1; i <= 5; i++) {
            conta.adicioneJuros();
            System.out.println("Saldo após " + i + "º mês: R$" + conta.getSaldo());
    }
   
  }
}

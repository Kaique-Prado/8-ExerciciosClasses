public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double percentual) {
        this.salario += this.salario * (percentual / 100);
    }
    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario("Kaique", 10000.00);
        Funcionario funcionario2 = new Funcionario("James", 2000.00);

        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getSalario());
        funcionario1.aumentarSalario(10);
        System.out.println(funcionario1.getSalario());
    }
}

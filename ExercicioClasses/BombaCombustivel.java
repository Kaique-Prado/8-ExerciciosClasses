public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro, quantidadeCombustivel, quantidadeCombustivelBomba;

    public double abastecerPorValor(double valorSerAbastecido) {
        double quantidade = valorLitro - valorSerAbastecido;
        this.quantidadeCombustivelBomba =- quantidade;
        return quantidade;
    }

    public double abastecerPorLitro(double quantidadeCombustivel) {
        double valor = quantidadeCombustivel * valorLitro;
        this.quantidadeCombustivelBomba =- quantidadeCombustivel;
        return valor;
    }

    public void setValorLitro(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    } 

    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public Double getQuantidadeCombustivelBomba() {
        return quantidadeCombustivelBomba;
    }

    public void setQuantidadeCombustivelBomba(double quantidadeCombustivelBomba) {
        this.quantidadeCombustivelBomba = quantidadeCombustivelBomba;
    }

}

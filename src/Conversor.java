public class Conversor {
    private double valorBase;
    private double moedaAlvo;

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
    public void setMoedaAlvo(double moedaAlvo) {
        this.moedaAlvo = moedaAlvo;
    }
    public void converte(){
        System.out.printf("Valor de %.2f convertido para %.2f\n", this.valorBase, this.valorBase * this.moedaAlvo);
    }
}

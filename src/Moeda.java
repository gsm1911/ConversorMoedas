public class Moeda {
    private double BRL, USD, ARS, BOB, COP , CLP;

    public Moeda(double BRL, double USD, double ARS, double BOB, double COP, double CLP) {
        this.BRL = BRL;
        this.USD = USD;
        this.ARS = ARS;
        this.BOB = BOB;
        this.COP  = COP ;
        this.CLP = CLP;
    }

    public double getBRL() {
        return BRL;
    }

    public double getUSD() {
        return USD;
    }

    public double getARS() {
        return ARS;
    }

    public double getBOB() {
        return BOB;
    }

    public double getCOP () {
        return COP ;
    }

    public double getCLP() {
        return CLP;
    }
}

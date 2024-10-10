import java.util.Scanner;

public class Usuario {
    private String moedaEscolhida;

    public String escolheMoedaBase(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha a moeda base:");
        System.out.println("""
                Opções: 0- Encerrar
                        1- Peso Argentino
                        2- Boliviano boliviano
                        3- Real brasileiro
                        4- Peso chileno
                        5- Peso colombiano
                        6- Dólar americano""");
        int escolhaBase = leitor.nextInt();
        while(escolhaBase > 6){
            System.out.println("Valor inválido escolhido.");
            System.out.println("Escolha outro valor: ");
            escolhaBase = leitor.nextInt();
        }
        switch (escolhaBase){
            case 0:
                return "0";
            case 1:
                moedaEscolhida = "ARS";
                break;
            case 2:
                moedaEscolhida = "BOB";
                break;
            case 3:
                moedaEscolhida = "BRL";
                break;
            case 4:
                moedaEscolhida = "CLP";
                break;
            case 5:
                moedaEscolhida = "COP";
                break;
            case 6:
                moedaEscolhida = "USD";
                break;
        }
        return moedaEscolhida;
    }
    public String escolheMoedaAlvo(Conversor conversor, Moeda moedas){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha a moeda para conversão: ");
        System.out.println("""
                Opções: 0- Encerrar
                        1- Peso Argentino
                        2- Boliviano boliviano
                        3- Real brasileiro
                        4- Peso chileno
                        5- Peso colombiano
                        6- Dólar americano""");

        int escolhaAlvo = leitor.nextInt();
        while(escolhaAlvo > 6){
            System.out.println("Valor inválido escolhido.");
            System.out.println("Escolha outro valor: ");
            escolhaAlvo = leitor.nextInt();
        }
        switch (escolhaAlvo){
            case 0:
                return "0";
            case 1:
                conversor.setMoedaAlvo(moedas.getARS());
                break;
            case 2:
                conversor.setMoedaAlvo(moedas.getBOB());
                break;
            case 3:
                conversor.setMoedaAlvo(moedas.getBRL());
                break;
            case 4:
                conversor.setMoedaAlvo(moedas.getCLP());
                break;
            case 5:
                conversor.setMoedaAlvo(moedas.getCOP());
                break;
            case 6:
                conversor.setMoedaAlvo(moedas.getUSD());
                break;
        }
        return "1";
    }

    public String getMoedaEscolhida() {
        return this.moedaEscolhida;
    }
}

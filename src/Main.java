import com.google.gson.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String moedaEscolhida;
        double valorBase;
        String valorBaseString;
        Scanner leitor = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Conversor conversor = new Conversor();
        Connection conector = new Connection();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        while (true) {
            try {
                System.out.println("Digite um valor para ser convertido ou \"sair\" para encerrar:");
                valorBaseString = leitor.next();

                if(valorBaseString.equalsIgnoreCase("sair")){
                    break;
                } else{
                    valorBase = Double.parseDouble(valorBaseString);
                }
                conversor.setValorBase(valorBase);
                
                moedaEscolhida = usuario.escolheMoedaBase();
                if (moedaEscolhida.equals("0")) {
                    break;
                }

                JsonObject jsonObject = conector.getJson(usuario.getMoedaEscolhida());
                Moeda moedas = gson.fromJson(jsonObject.get("conversion_rates"), Moeda.class);

                if (usuario.escolheMoedaAlvo(conversor, moedas).equals("0")) {
                    break;
                }
                conversor.converte();
            }catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Valor inválido inserido.");
            }catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

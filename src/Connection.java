import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Connection {
    private final HttpClient client = HttpClient.newHttpClient();

    public JsonObject getJson(String moedaBase) throws IOException, InterruptedException {
        try{
            String endereco = "https://v6.exchangerate-api.com/v6/397ca2c782ebd16ff85c9469/latest/" + moedaBase;
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return JsonParser.parseString(response.body()).getAsJsonObject();
        } catch (Exception e) {
            throw new RuntimeException("Erro durante obtenção das taxas de câmbio.");
        }
    }

}

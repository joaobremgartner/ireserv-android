package br.eng.joaofaro.ireserv.webservice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 * @author Created by joaofaro on 09/06/17.
 */

public class WebClient {

    private static final String URL_ESTABELECIMENTOS = "http://localhost:8080/api-ireserv/restaurantes";

    public String getEstabelecimentos() {
        try {
            URL url = new URL(URL_ESTABELECIMENTOS);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            conexao.connect();

            Scanner scanner = new Scanner(conexao.getInputStream());
            return scanner.next();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

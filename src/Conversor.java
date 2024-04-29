
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONException;
import org.json.JSONObject;
class Conversor {
    // Reemplaza "YOUR-API-KEY" con tu clave de API real
    private final String API_KEY = "6d8e697b9fc2b9483aa1fe7d";
    private final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/";

    // Método para convertir de Dólar a Peso Argentino
    public void convertirDolarAPesoArgentino(double monto) {
        double tasaCambio = obtenerTasaDeCambio("USD", "ARS");
        double resultado = monto * tasaCambio;
        System.out.println("$" + monto + " USD son " + resultado + " ARS");
    }

    // Método para convertir de Peso Argentino a Dólar
    public void convertirPesoArgentinoADolar(double monto) {
        double tasaCambio = obtenerTasaDeCambio("ARS", "USD");
        double resultado = monto * tasaCambio;
        System.out.println("$" + monto + " ARS son " + resultado + " USD");
    }

    // Método para convertir de Dólar a Real Brasileño
    public void convertirDolarARealBrasileño(double monto) {
        double tasaCambio = obtenerTasaDeCambio("USD", "BRL");
        double resultado = monto * tasaCambio;
        System.out.println("$" + monto + " USD son " + resultado + " BRL");
    }

    // Método para convertir de Peso Brasileño a Dólar
    public void convertirPesoBrasileñoADolar(double monto) {
        double tasaCambio = obtenerTasaDeCambio("BRL", "USD");
        double resultado = monto * tasaCambio;
        System.out.println("$" + monto + " BRL son " + resultado + " USD");
    }

    // Método para convertir de Dólar a Peso Colombiano
    public void convertirDolarAPesoColombiano(double monto) {
        double tasaCambio = obtenerTasaDeCambio("USD", "COP");
        double resultado = monto * tasaCambio;
        System.out.println("$" + monto + " USD son " + resultado + " COP");
    }

    // Método para convertir de Peso Colombiano a Dólar
    public void convertirPesoColombianoADolar(double monto) {
        double tasaCambio = obtenerTasaDeCambio("COP", "USD");
        double resultado = monto * tasaCambio;
        System.out.println("$" + monto + " COP son " + resultado + " USD");
    }

    // Método genérico para obtener la tasa de cambio entre dos monedas
    private double obtenerTasaDeCambio(String monedaBase, String monedaDestino) {
        try {
            String url = API_URL + monedaBase + "/" + monedaDestino;
            JSONObject json = new JSONObject(new Scanner(new URL(url).openStream()).nextLine());
            return json.getDouble("conversion_rate");
        } catch (IOException | JSONException e) {
            e.printStackTrace();
            return -1; // Manejo de errores
        }
    }
}
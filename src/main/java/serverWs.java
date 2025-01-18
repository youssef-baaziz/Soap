import jakarta.xml.ws.Endpoint;
import ws.BanKService;

public class serverWs {
    public static void main(String[] args) {
        // Endpoint.publish("http://localhost:9191/",new BanKService());
        Endpoint.publish("http://0.0.0.0:9191/",new BanKService());
        System.out.println("web service deploye sur http://0.0.0.0:9191/");

    }
}

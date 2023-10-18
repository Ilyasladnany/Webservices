import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        //Permet de demarrer un serveur http(port=9191), ce serveur est uniquement utiliser pour consulter le webservice BanqueServcie
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("web service deployé sur http://0.0.0.0:9191/");


    }
}

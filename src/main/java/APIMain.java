
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class APIMain {
    public static void main(String[] args) throws IOException, InterruptedException{

        String url = "http://localhost:8080/Info/books";
        //ObjectMapper mapper = new ObjectMapper();
       HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        var client = HttpClient.newBuilder().build();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
       // System.out.println(response.statusCode());
        System.out.println(response.body());
        //String str = response.body();
        //System.out.println(str);

        //Movie movie=new Gson().fromJson(str,Movie.class);


        //movie.print();
    }
}

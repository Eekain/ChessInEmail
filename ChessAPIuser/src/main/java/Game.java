import okhttp3.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;

public class Game {

    private static Logger logger = LogManager.getLogger(Main.class);
    public void start() throws IOException{
        //First (more like 1.6.3) try of using the API provided. Now, it does something.
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("http://chess-api-chess.herokuapp.com/api/v1/scoreboard")
                .method("GET", null)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();

            Response response = client.newCall(request).execute();
        System.out.println(response);


    }
}

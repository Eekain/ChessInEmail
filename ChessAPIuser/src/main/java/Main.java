import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        Game g = new Game();
        try {
            g.start();
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }
}


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Battleground {

    public static void main(String[] args) {
        final int port = 666;
        System.out.println("Waiting for players...");
        try {
            ServerSocket gameSocket = new ServerSocket(port);
            ExecutorService fixedPool = Executors.newFixedThreadPool(4);

            while (true) {
                Socket playerSocket = gameSocket.accept();
                fixedPool.submit(new GameHandler(gameSocket, playerSocket));
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }


    }


}

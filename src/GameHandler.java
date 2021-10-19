import characters.Alex;
import characters.Mari;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class GameHandler implements Runnable {

    //** Reference to the ServerSocket and the gameServer
    private ServerSocket gameSocket;

    //*** Mirror to the client socket that will be created when we use accept()
    private final Socket playerSocket;
    public static int option;

    //*** References to Characters
    private Alex alex;
    //private Benny benny;
    private Mari mari;


    public GameHandler(ServerSocket serverSocket, Socket playerSocket) {
        this.gameSocket = serverSocket;
        this.playerSocket = playerSocket;
    }


    @Override
    public void run() {

        try {
            PrintStream printStream = new PrintStream(playerSocket.getOutputStream());
            Prompt prompt = new Prompt(playerSocket.getInputStream(), printStream);
            mari = new Mari(printStream, prompt);
            alex = new Alex(printStream, prompt);
            //****************** NEED to change this
            printStream.println("Put here info on game!!!!!! ");

            String[] options = {"Alex", "Benny", "Mari"};
            MenuInputScanner charSelection = new MenuInputScanner(options);
            charSelection.setMessage("Welcome, adventurer! You can be any MC you want today: ");
            option = prompt.getUserInput(charSelection);

            printStream.println("Thank you for joining our adventure, " + options[option - 1] + ".");

            switch (options[option - 1]) {
                 case "Alex" -> alex.start();
                // case "Benny" -> benny.start();
                case "Mari" -> mari.start();
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }


    }
}
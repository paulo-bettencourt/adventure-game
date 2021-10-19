import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringSetInputScanner;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class Game {

    public PrintStream printStream;
    public Prompt prompt;
    public int counter;
    public int option;
    public int option2;
    public int option3;


    public Game(PrintStream printStream, Prompt prompt) {
        this.printStream = printStream;
        this.prompt = prompt;

    }

    public void start() {

        printStream.println("Let's start our quizz");

        String[] days = {"Use the most restrictive access level possible.", "Avoid public fields except for constants.\n" +
                "\n", "Protected and default might help with sub-classing."};
        MenuInputScanner daySelection = new MenuInputScanner(days);
        daySelection.setMessage("How to decide the proper access control to use for members of your class?\n");
        option = prompt.getUserInput(daySelection);

        switch (days[option - 1]) {
            case "Use the most restrictive access level possible.", "Avoid public fields except for constants.", "Protected and default might help with sub-classing." -> {
                counter++;
                printStream.println("You have scored " + counter + " point");
                firstQuestion();
            }

        }
    }

    public void firstQuestion() {

        String[] firstAnswers = {"Yay", "Nay"};
        MenuInputScanner firstQuestion = new MenuInputScanner(firstAnswers);
        firstQuestion.setMessage("Concerning the The Java Memory Model, does each thread has its own stack?");
        option2 = prompt.getUserInput(firstQuestion);

        switch (firstAnswers[option2 - 1]) {
            case "Yay" -> {
                counter++;
                printStream.println("That is correct! You have scored " + counter + " point so far");
                secondQuestion();
            }
            case "Nay" -> {
                counter--;
                printStream.println("You have chosen poorly! You have scored " + counter + " point so far");
                secondQuestion();
            }
        }
    }

    public void secondQuestion() {

        String[] secondAnswers = {"Yes, they enforced by the compiler", "No, because they are just like ordinary classes"};
        MenuInputScanner secondQuestions = new MenuInputScanner(secondAnswers);
        secondQuestions.setMessage("Are Enumerations type safe?");
        option3 = prompt.getUserInput(secondQuestions);

        switch (secondAnswers[option3 - 1]) {
            case "Yay" -> {
                counter++;
                printStream.println("That is correct! You have scored " + counter + " point so far");
                thirdQuestion();
            }
            case "Nay" -> {
                counter--;
                printStream.println("You have chosen poorly! You have scored " + counter + " point so far");
                thirdQuestion();

            }

        }

    }

    public void thirdQuestion() {

        String[] ThirdAnswers = {"Applications request a connection to the destination, which is used to transfer data",  "Doesn't guarantee delivery of all data after endpoint shutdown"};
        MenuInputScanner thirdQuestions = new MenuInputScanner(ThirdAnswers);
        thirdQuestions.setMessage("Concerning the famous Transmission Control Protocol... Which of the following statements is true?");
        option3 = prompt.getUserInput(thirdQuestions);

        switch (ThirdAnswers[option3 - 1]) {
            case "Applications request a connection to the destination, which is used to transfer data" -> {
                counter++;
                printStream.println("That is correct! You have scored " + counter + " point so far");
                fourthQuestion();
            }
            case "Doesn't guarantee delivery of all data after endpoint shutdown" -> {
                counter--;
                printStream.println("You have chosen poorly! You have scored " + counter + " point so far");
                fourthQuestion();

            }
        }
    }

    public void fourthQuestion() {

        String[] fourthAnswers = {"Yay", "Nay"};
        MenuInputScanner fourthQuestions = new MenuInputScanner(fourthAnswers);
        fourthQuestions.setMessage("All Threads within a process have access to the same variables, allowing them to share data without using IPC mechanisms. True or False?");
        option3 = prompt.getUserInput(fourthQuestions);

        switch (fourthAnswers[option3 - 1]) {
            case "Yay" -> {
                counter++;
                printStream.println("That is correct! You have scored " + counter + " point so far");
                if(counter > 2) {
                    printStream.println("You have more than 2 questions right so you have... WON THE GAME!!");
                }
                printStream.println("You only have " + counter + " correct answers. You need at least 3 to win the game. Sorry, you have LOST THE GAME!");
            }
            case "Nay" -> {
                counter--;
                printStream.println("You have chosen poorly! You have scored " + counter + " point so far");
                if(counter > 2) {
                    printStream.println("You have more than 2 questions right so you have... WON THE GAME!!");
                }
                printStream.println("You only have " + counter + " correct answers. You need at least 3 to win the game. Sorry, you have LOST THE GAME!");
            }
            }
        }
    }

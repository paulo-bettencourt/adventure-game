package characters;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringSetInputScanner;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class Mari {

    public PrintStream printStream;
    public Prompt prompt;
    public int option;
    public int option2;


    public Mari(PrintStream printStream, Prompt prompt) {
        this.printStream = printStream;
        this.prompt = prompt;

    }

    public void start() {

        printStream.println("Thank you for choosing me today! I'm going to make sure you are the best coder in the world!");

        String[] days = {"Friday", "Monday", "Saturday"};
        MenuInputScanner daySelection = new MenuInputScanner(days);
        daySelection.setMessage("Which day is it today? ");
        option = prompt.getUserInput(daySelection);

        printStream.println("Oh! I loveeeee " + days[option - 1] + "s!! ");

        switch (days[option - 1]) {
            case "Friday" -> friday();
            case "Saturday" -> saturday();
            case "Monday" -> monday();

        }
    }

    private void friday() {

        printStream.println("So many things to do today!");

        String[] places = {"Dona Graça's", "Garden", "Academia"};
        MenuInputScanner placeSelection = new MenuInputScanner(places);
        placeSelection.setMessage("Where should I go today? ");
        option2 = prompt.getUserInput(placeSelection);

        switch (places[option2 - 1]) {
            case "Dona Graça's" -> donagraca();
            case "Garden" -> garden();
            case "Academia" -> academia();

        }
    }

    private void donagraca() {

        String[] food = {"Coffee", "Conde da praia", "Graça's special"};
        MenuInputScanner foodSelection = new MenuInputScanner(food);
        foodSelection.setMessage("What should I eat today? ");
        option2 = prompt.getUserInput(foodSelection);

        switch (food[option2 - 1]) {
            case "Coffee" -> printStream.println("Now I'm ready to go to the Academy!");
            case "Conde da praia" -> printStream.println("*nom*, *nom*, *nom*");
            case "Graça's special" -> smokeWithGraca();

        }
    }

    private void garden() {

        String[] activities = {"Take pictures", "Yoga", "Feed the birds"};
        MenuInputScanner activitiesSelection = new MenuInputScanner(activities);
        activitiesSelection.setMessage("What should I do today? ");
        option2 = prompt.getUserInput(activitiesSelection);

        switch (activities[option2 - 1]) {
            case "Take pictures" -> printStream.println("Now I'm ready to go to the Academy!");
            case "Yoga" -> printStream.println("*nom*, *nom*, *nom*");
            case "Feed the birds" -> printStream.println("*You have been attacked by an angry pidgeon, you have now contracted bird flu.*" +
                    "\n THREE MONTHS LATER... \n *You are slowly, but surely becoming a bird*");

        }
    }

    private void academia() {
        printStream.println("Do I want to make the cadets cry today? \n Yes / No ");

        Set<String> thingsToDoOnMonday = new HashSet<>();
        thingsToDoOnMonday.add("Yes");
        thingsToDoOnMonday.add("No");

        StringSetInputScanner questionMonday = new StringSetInputScanner(thingsToDoOnMonday);

        if (prompt.getUserInput(questionMonday).equals("Yes")) {
            printStream.println("Guys, today we are going to develop the Extended 4D graphics... CAR CRASHHHHH!!!!");
        } else {
            printStream.println("You can leave early today, go home. \n #kthxbai");
        }
    }


    private void smokeWithGraca() {
        printStream.println("*inside Mari's head* \n 'Dona Graça is acting weird today... \n Is she feeling okay?' " +
                "\n Dona Graça: 'Hey girl! Do you want to smoke a joint with me?' \n Mari: 'What!?' ... \n " +
                "*8 minutes later...* Mari: 'Dona Graça, that was a great joint <3, thank you, so happy now...");

    }

    private void saturday() {

        printStream.println("I don't want to get out of beeedd... ZzZzzzzz");

        String[] thingsToDoOnSaturday = {"Stay in bed ", "Go to the beach", "Order some breakfast"};
        MenuInputScanner placeSelection = new MenuInputScanner(thingsToDoOnSaturday);
        placeSelection.setMessage("What should I do today? ");
        option2 = prompt.getUserInput(placeSelection);

        switch (thingsToDoOnSaturday[option2 - 1]) {
            case "Stay in bed" -> printStream.println("ZZzZZZZZzzz");
            case "Go to the beach" -> beach();
            case "Order some breakfast" -> printStream.println(" Mari: 'Bubu! Is that you? Why are you working on uberEats?" +
                    "Did you eat my breakfast?' \n Bubu: 'Sorry, Mari... bubu tem fome'");

        }
    }


    private void beach() {
        printStream.println("Yasss, I love the beach!");
        String[] thingsToDoAtTheBeach = {"Get a tan", "Surf", "Read a book"};
        String nameOfTheWind = "...'I have stolen princesses back from sleeping barrow kings. I burned down the \n" +
                "town of Trebon. I have spent the night with Felurian and left with both my sanity and my life. \n" +
                "I was expelled from the University at a younger age than most people are allowed in. I tread \n" +
                "paths by moonlight that others fear to speak of during day. I have talked to Gods, loved women, \n" +
                "and written songs that make the minstrels weep. My name is Kvothe. You may have heard of me...";

        MenuInputScanner beachSelection = new MenuInputScanner(thingsToDoAtTheBeach);
        beachSelection.setMessage("What should I do now? ");
        option2 = prompt.getUserInput(beachSelection);

        switch (thingsToDoAtTheBeach[option2 - 1]) {
            case "Stay in bed" -> printStream.println("Oh no, you forgot to put on sunscreen, you have 3rd degree burns in 89% of your body...");
            case "Go to the beach" -> printStream.println("'I'm suuuurfing in the waveeee...'");
            case "Order some breakfast" -> printStream.println(nameOfTheWind);


        }
    }

    private void monday() {

        printStream.println("OMG! Do I really need to work today?");

        Set<String> thingsToDoOnMonday = new HashSet<>();
        thingsToDoOnMonday.add("Yes");
        thingsToDoOnMonday.add("Hell, no!");

        StringSetInputScanner questionMonday = new StringSetInputScanner(thingsToDoOnMonday);

        if (prompt.getUserInput(questionMonday).equals("Yes")) {
            workToday();
        } else {
            doesNotWorkToday();
        }
    }


    private void workToday() {
        printStream.println("I have arrived to the academy, I'll go get some coffee at Graça's...");

        //**Maybe add something else here?

    }

    private void doesNotWorkToday() {
        printStream.println("***on the phone*** 'I'm so sick today...' *cough*\n 'I can't go and infect you all'" +
                " \n *fake sneeze*");

        printStream.close();

    }









        }


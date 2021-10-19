package characters;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringSetInputScanner;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class Alex {

    public PrintStream printStream;
    public Prompt prompt;
    public int option;
    public int option2;


    public Alex(PrintStream printStream, Prompt prompt) {
        this.printStream = printStream;
        this.prompt = prompt;

    }

    public void start() {

        printStream.println("Cool! Thank you for choosing me today! I'm going to make sure you are the best coder in the world!");

        String[] days = {"Friday", "Monday", "Saturday"};
        MenuInputScanner daySelection = new MenuInputScanner(days);
        daySelection.setMessage("Which day is it today? ");
        option = prompt.getUserInput(daySelection);

        printStream.println("Cool! " + days[option - 1] + " is definitely the best day of the week!! ");

        switch (days[option - 1]) {
            case "Friday" -> friday();
            case "Monday" -> saturday();
            case "Saturday" -> monday();

        }
    }

    private void friday() {

        printStream.println("It's Friday, Friday, gotta get down on Friday... Everybody's lookin' forward to the weekend, weekend!");

        String[] places = {"Dona Graça's", "Praia's Bay", "Academia"};
        MenuInputScanner placeSelection = new MenuInputScanner(places);
        placeSelection.setMessage("Where should I go today? ");
        option2 = prompt.getUserInput(placeSelection);

        switch (places[option2 - 1]) {
            case "Dona Graça's" -> donagraca();
            case "Praia's Bay" -> bay();
            case "Academia" -> academia();

        }
    }

    private void donagraca() {

        String[] food = {"Expresso", "Conde da praia", "Graça's special"};
        MenuInputScanner foodSelection = new MenuInputScanner(food);
        foodSelection.setMessage("What should I eat today? ");
        option2 = prompt.getUserInput(foodSelection);

        switch (food[option2 - 1]) {
            case "Expresso" -> printStream.println("It's about time to take a good ol' cup of coffee before starting my day! What would I do without you Mr Coffee?");
            case "Conde da praia" -> printStream.println("*nom*, *nom*, *nom* I love bringing this mfks as an example to our classes!");
            case "Graça's special" -> drinkWithGraca();

        }
    }

    private void bay() {

        String[] activities = {"Turn on the 420 clock", "Listen to some hip-hop", "Greet the OG's that sometimes go by"};
        MenuInputScanner activitiesSelection = new MenuInputScanner(activities);
        activitiesSelection.setMessage("What should I do today? ");
        option2 = prompt.getUserInput(activitiesSelection);

        switch (activities[option2 - 1]) {
            case "Turn on the 420 clock" -> printStream.println("I smoke two joints in the morning \n I smoke two joints at night \n I smoke two joints in the afternoon \n It makes me feel all right \n I smoke two joints in time of peace \n and in time of war \n I smoke two joints because i smoke two joints \n And then i smoke two more");
            case "Listen to some hip-hop" -> printStream.println("Chico da Tina tu és 'memo fodido (Porque)\n" +
                    "Chico da Tina deixas-me ser teu amigo\n" +
                    "Chico da Tina porque é que és tão ofensivo\n" +
                    "Chico da Tina sê mais compreensivo\n");
            case "Greet the OG's that sometimes go by" -> printStream.println("A wild Sandro G wildly appears out of nowhere! Wacha gonna do when they come for you?");

        }
    }

    private void academia() {
        printStream.println("Do the cadets deserve to suffer today? \n Yay / Nay ");

        Set<String> thingsToDoOnMonday = new HashSet<>();
        thingsToDoOnMonday.add("Yay");
        thingsToDoOnMonday.add("Nay");

        StringSetInputScanner questionMonday = new StringSetInputScanner(thingsToDoOnMonday);

        if (prompt.getUserInput(questionMonday).equals("Yes")) {
            printStream.println("Guys, today we are going to develop the Extended 4D graphics... CAR CRASHHHHH!!!!");
        } else {
            printStream.println("Every day is Code Break day! Let's take the day off and drink a couple o'beers! \n #everydayisfriday");
        }
    }


    private void drinkWithGraca() {
        printStream.println("*inside Alex's head* \n 'Dona Graça is acting weird today... \n Is she feeling okay?' " +
                "\n Dona Graça: 'Hey boy! Hey girl! Superstar DJ's... Here we go! Let's drink some whisky shots?' \n Alex: 'What the hell!?' ... \n " +
                "*8 minutes later after taking 8 MF WHISKY SHOTS...* Alex: 'Dona Graça, you are the real deal <3, thank you, so happy now...");

    }

    private void saturday() {

        printStream.println("Thank Jah it is Saturday!");

        String[] thingsToDoOnSaturday = {"Sleep for a little bit longer", "Imma surfin' on the beach", "Watch some DBZ before work!"};
        MenuInputScanner placeSelection = new MenuInputScanner(thingsToDoOnSaturday);
        placeSelection.setMessage("What should I do today? ");
        option2 = prompt.getUserInput(placeSelection);

        switch (thingsToDoOnSaturday[option2 - 1]) {
            case "Sleep for a little bit longer" -> printStream.println("Like my grandmother used to say... I'm not gonna sleep, just resting my eyes for a while!!");
            case "Imma surfin' on the beach" -> beach();
            case "Watch some DBZ before work!" -> printStream.println("Dragon Ball Z Z Z\n" +
                    "Energia total\n" +
                    "Dragon Ball Z Z Z\n" +
                    "em lutas contra o mal\n" +
                    "Dragon Ball Z Z Z\n" +
                    "é uma força brutal\n" +
                    "Dragon Ball Z Z Z\n" +
                    "para vencer o mal\n" +
                    "\n");

        }
    }


    private void beach() {
        printStream.println("If everybody had an ocean\n" +
                "Across the U.S.A\n" +
                "Then everybody'd be surfin'\n" +
                "Like Californi-a\n" +
                "You'd see them wearing their baggies\n" +
                "Huarache sandals too\n" +
                "A bushy bushy blond hairdo\n" +
                "Surfin' U.S.A");

        String[] thingsToDoAtTheBeach = {"Get a tan", "Swim", "Read a book"};

        String luisadas = "As armas e os barões assinalados,\n" +
                "Que da ocidental praia Lusitana,\n" +
                "Por mares nunca de antes navegados,\n" +
                "Passaram ainda além da Taprobana,\n" +
                "Em perigos e guerras esforçados,\n" +
                "Mais do que prometia a força humana,\n" +
                "E entre gente remota edificaram\n" +
                "Novo Reino, que tanto sublimaram;\n";

        MenuInputScanner beachSelection = new MenuInputScanner(thingsToDoAtTheBeach);
        beachSelection.setMessage("What should I do now? ");
        option2 = prompt.getUserInput(beachSelection);

        switch (thingsToDoAtTheBeach[option2 - 1]) {
            case "Get a tan" -> printStream.println("After this tan... Not even Zézé Camarinha won't be match for me! Imma be lookin' gooooood!");
            case "Swim" -> printStream.println("Doin' the ol'good mariposa style and impressing the gals!");
            case "Read a book" -> printStream.println(luisadas);

        }
    }

    private void monday() {

        printStream.println("OMG! I'm feeling like Garfield today... God damn it!! Do I really need to go to work?!");

        Set<String> thingsToDoOnMonday = new HashSet<>();
        thingsToDoOnMonday.add("Yay");
        thingsToDoOnMonday.add("Nay");

        StringSetInputScanner questionMonday = new StringSetInputScanner(thingsToDoOnMonday);

        if (prompt.getUserInput(questionMonday).equals("Yay")) {
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
        printStream.println("Alex calls Catarina: ***on the phone*** A earthquake just took place and there's no way I'm gonna be able to get to work...' *cough*\n 'And then there's this hugeeee wave that I just saw! It's about to become a Tsunami! Catarina, serious stuff happening here!!'" +
                " \n *fake sneeze* And I also got a cold!");

        printStream.close();

    }









}


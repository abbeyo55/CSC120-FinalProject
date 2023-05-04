/* importing arraylist, array, list, scanner and random to produce game with all features necessary*/
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Scanner;
import java.util.Random;



/**
 * class of Olympic Game
 */
class OlympicGame {
    /**
     * declaring parameters of the Olympic game 
     * CurrentSpot as static 
     * RandomNumber as static
     * */
    protected static int point = 0;
    static Integer CurrentSpot;
    static Integer RandomNumber;

    /**
     * constructor of the olympic game
     * prints text for the start of the game
     * */
    public OlympicGame(){
        System.out.println("...");
        System.out.println("Welcome the Olympic Game");
        System.out.println("In this game, questions will be displayed to test your knowledge on the Olympics - both on its history, facts about sports and more!");
        System.out.println("Good luck!");
        System.out.println("...");
        System.out.println("START:");
        System.out.println("");
    }

    /**
     * Prints out questions and multiple choices
     * @param spot - number of spot that player lands on when playing game
     * 
     * Prints question of the spot given questions below "getQuestion" returns question from OlympicsBoard
     * Assign multiple choices to string list and print by making values of the string in placeholders 0 and 1, anwsers 1 and 2
     * replace values ensures that the anwser list is printable and can be turned into a string (before anwswer seperator it was a list like [answer 1, answer 2] ) 
     */
    public void ask(Integer spot){ 
        System.out.println(map[spot].getQuestion());
        String[] answerQuestion = map[spot].getAnswer();
        
        List <String> answerList = new ArrayList<String>();
        answerList = Arrays.asList(answerQuestion);
        //System.out.println(answerList); needs be to split to allow user to see both parts of the question


        String[] answerSeperator = answerList.toString().replace("[", "").replace("]", "").split(",");
        System.out.println("The options are:" + "\n 0: " + answerSeperator[0] + "\n 1:" + answerSeperator[1]);
    }

    /**
     * Check for the user input and return indexes for placeholders in the OlympicsBoard map 
     * @param CorrectAnswer - string of user input
     * @return Integer of indexes for the multiple choice
     */
    private Integer multipleChoice(String CorrectAnswer){
        if(CorrectAnswer.contains("0")){
            return 0;
        }
        else if(CorrectAnswer.contains("1")){
            return 1;
        }
        else{
            return -1;
        }
    }

    /**
     * Assign points if question is answered correct and decucts points is anwsers are incorrect
     * Ensures that user input matches possible multiple choices of either a or b
     * If correct user gains 3 points, if incorrect user loses 3 points
     * public boolean must use true or false, flase coordinates below in printing response to user that will have them submit another letter ( this is in the main)
     * @param reply - string of the users input
     * @param spot - index of the spot number played by user
     */
    public boolean play(String reply, Integer spot){
        if (reply.equalsIgnoreCase("0") || reply.equalsIgnoreCase("1") ){
            System.out.println("YOUR ANWSER: " + reply);
            System.out.println("The correct answer was: " + map[spot].CorrectAnswer);
            
            if (map[spot].getWrongAnswer() == multipleChoice(reply)){
                point -= 3;
            } 
            if(map[spot].getCorrectAnswer() == multipleChoice(reply)){
                point += 3;
            }
            return true;
        }
        
        else {
            return false;
        }
    }  

    //public boolean help(String reply, Integer spot){
        //if (reply.equalsIgnoreCase("help")){
           // System.out.println("Q1: b / Q2: a / Q3: b ");
            //return true;
        //}
       // else{
           // return false;
        //}
    //}

    /**
     * Create a random number generator where it generates a random number between 1 and 5 (inclusive)
     * Run the random number generator and get random number from 1 to 5
     * this is how user moves along game board 
     * @return random integer (1-5)
     */
    public static Integer random() {
        Random random = new Random();
        int randomNumber = random.nextInt(5) + 1;
        // Prints the random number
        return randomNumber;
    }
    
    /**
     * assigning information, both a question and two responses to each spot on the game 
     * one response is correct, one is incorrect as noted in the CorrectAnswer and WrongAnswer of the OlympicsBoard
     * 50 questions written below
     */
    OlympicsBoard[] map = new OlympicsBoard[51];{
    map[1] = new OlympicsBoard("Who is the most decorated Olympian of all time, with a total of 28 Olympic medals?", 1, 0, "Usain Bolt", "Michael Phelps");
    map[2] = new OlympicsBoard("What is the Olympic motto?", 0, 1, "Faster Higher Stronger", "Unity in Diversity");
    map[3] = new OlympicsBoard("How often are the Summer and Winter Olympics held?", 1, 0, "Every 2 Years", "Every 4 Years");
    map[4] = new OlympicsBoard("Who is the founder of the modern Olympic Games?", 0, 1, "Pierre de Coubertin", "Thomas Bach");
    map[5] = new OlympicsBoard("What is the name of the official Olympic theme song?", 1, 0, "We Will Rock You", "Olympic Fanfare and Theme");
    map[6] = new OlympicsBoard("Who is the only athlete to have won gold medals in both the Summer and Winter Olympics in different sports?", 0, 1, "Eddie Eagan", "Usain Bolt");
    map[7] = new OlympicsBoard("Which country hosted the 2018 Winter Olympics?", 1, 0, "Frace", "South Korea");
    map[8] = new OlympicsBoard("What is the name of the highest honor that can be awarded to an Olympic athlete?", 0, 1, "Olympic Order", "Olympic Medal of Honor");
    map[9] = new OlympicsBoard("Which sport made its Olympic debut in the 2021 Summer Olympics?", 0,1, "Skateboarding", "Surfing");
    map[10] = new OlympicsBoard("In which city were the 2016 Summer Olympics held?", 1, 0, "London", "Rio de Janeiro");
    map[11] = new OlympicsBoard("What is the name of the Olympic mascot for the 2022 Winter Olympics?", 0,1, "Soohorang", "Miga");
    map[12] = new OlympicsBoard("What is the Olympic Truce?", 1, 0, "A tradition of exchanging gifts among athletes", "A period of peace declared during the Olympic Games");
    map[13] = new OlympicsBoard("Who is the first athlete to win five consecutive Olympic gold medals in the same event?", 1, 0, "Serena Williams", "Sir Steve Redgrave");
    map[14] = new OlympicsBoard("Which country has won the most gold medals in the history of the Summer Olympics?", 1, 0, "China", "United States of America");
    map[15] = new OlympicsBoard("Who holds the record for the most gold medals won in a single Olympic Games with 9 golds?", 1, 0, "Jesse Owens", "Mark Spitz");
    map[16] = new OlympicsBoard("What is the name of the stadium that hosted the opening ceremony of the 2008 Summer Olympics in Beijing?", 1, 0, "Wembley Stadium", "Bird's Nest Stadium");
    map[17] = new OlympicsBoard("Who was the first athlete to light the Olympic cauldron at the 1996 Summer Olympics in Atlanta?", 0, 1, "Muhammad Ali", "Cathy Freeman");
    map[18] = new OlympicsBoard("Which country has won the most gold medals in the history of the Winter Olympics?", 0, 1, "Norway", "Germany");
    map[19] = new OlympicsBoard("In which year did the first modern Olympic Games take place?", 0, 1, "1986", "1996");
    map[20] = new OlympicsBoard("In which sport do athletes fight with swords while wearing protective gear?", 1, 0, "Judo", "Fencing");
    map[21] = new OlympicsBoard("What is the duration of the Olympic Games?", 1, 0, "10 Days", "14 Days");
    map[22] = new OlympicsBoard("Who won the most gold medals in a single Olympic Games with 8 golds?", 1, 0, "Jesse Owens", "Michael Phelps");
    map[23] = new OlympicsBoard("What is the name of the official Olympic theme song?", 0, 1, "Olympic Hymn", "Fanfare for the Common Man");
    map[24] = new OlympicsBoard("Who is the fastest man in Olympic history with a world record of 9.58 seconds in the 100m sprint?", 0, 1, "Usian Bolt", "Carl Lewis");
    map[25] = new OlympicsBoard("What is the maximum number of gold medals that can be won by an athlete in a single Olympic Games?", 1, 0, "Six", "Eight");
    map[26] = new OlympicsBoard("Which city has hosted the most Olympic Games in history?", 0, 1, "Athens", "Paris");
    map[27] = new OlympicsBoard("Which country boycotted the 1980 Summer Olympics held in Moscow?", 0, 1, "Unted States", "United Kingdom");
    map[28] = new OlympicsBoard("Which sport has been part of every modern Olympic Games since its inception in 1896?", 0, 1, "Athletics", "Swimming");
    map[29] = new OlympicsBoard("Which country has won the most medals in the history of the Winter Olympics?", 0, 1, "Norway", "Canada");
    map[30] = new OlympicsBoard("What is the Olympic record for the highest number of gold medals won by a female athlete in a single Olympic Games?", 1, 0, "Four", "Six");
    map[31] = new OlympicsBoard("What is the Olympic event where athletes ski and shoot at targets?", 1, 0, "Bobsled", "Biathlon");
    map[32] = new OlympicsBoard("Which Olympic event features gymnasts performing on a floor exercise, vault, uneven bars, and balance beam?", 0, 1, "Artistic Gymnastics", "Rhythmic Gymnastics");
    map[33] = new OlympicsBoard("What is the Olympic event where athletes compete in cycling, swimming, and running in succession?", 1, 0, "Triathlon", "Decathlon");
    map[34] = new OlympicsBoard("In which Olympic sport is the term 'stroke' used?", 0, 1, "Rowing", "Cycling");
    map[35] = new OlympicsBoard("Which Olympic sport involves the use of a foil, epee, or saber?", 0, 1, "Fencing", "Archery");
    map[36] = new OlympicsBoard("What is the weight of an Olympic men's shot put?", 0, 1, "5kg", "10kg");
    map[37] = new OlympicsBoard("In which Olympic sport are competitors required to perform a routine set to music?", 1, 0, "Taekwondo", "Gymnastics");
    map[38] = new OlympicsBoard("What is the distance of a standard Olympic marathon race?", 0, 1, "26.2 miles", "13.1 miles");
    map[39] = new OlympicsBoard("Which Olympic sport involves athletes jumping into water from a platform or springboard?", 1, 0, "Synchronized Swimming", "Diving");
    map[40] = new OlympicsBoard("Which Olympic sport is also known as 'ping pong'?", 1, 0, "Golf", "Table Tennis");
    map[41] = new OlympicsBoard("What is the distance of the shortest Olympic swimming race?", 0, 1, "50 meters", "100 meters");
    map[42] = new OlympicsBoard("Which Olympic sport involves a sequence of lifts in weightlifting?", 1, 0, "Deadlift", "Clean and Jerk");
    map[43] = new OlympicsBoard("What is the maximum number of substitutions allowed in field hockey in the Olympics?", 0, 1, "Unlimited", "Three");
    map[44] = new OlympicsBoard("Which Olympic sport is also known as 'canoe slalom'?", 0, 1, "Whitewater Canoe/Kayak", "Flatwater Canoe/Kayak");
    map[45] = new OlympicsBoard("In which sport do athletes throw a metal ball as far as possible?", 1, 0, "Discuss Throw", "Shot Put");
    map[46] = new OlympicsBoard("In which sport do athletes race down a course marked by flags on skis?", 0, 1, "Alpine Skiing", "Cross-country Skiing");
    map[47] = new OlympicsBoard("In which sport do athletes swim using all four strokes?", 0, 1, "Individual Medley", "Freestyle Swimming");
    map[48] = new OlympicsBoard("In which sport do athletes race down a track on a sled?", 1, 0, "Bobsleigh", "Skeleton");
    map[49] = new OlympicsBoard("In which sport do athletes run and jump over hurdles?", 0, 1, "Hurdling", "Steeplechase");
    map[50] = new OlympicsBoard("In which sport do athletes ride a horse and perform a series of movements in a set pattern?", 1, 0, "Equestrian Jumping", "Dressage");
    }
   
    /**
     * want to print all questions from the game after being placed
     * need to "collect" all the information, gather it and then print out all responses with anwsers
     */
    //public void printResults(){
        //System.out.println(map);
       //}

    /**
     * To start the game, this will run a loop until reaching "50" as that is when the game ends as it reaches the max amount of points on the game board
     * displays answer as to what level of knowledge you know of Olympics when the game ends
     */

    
     
    public static void main(String[] args) {
        OlympicGame RunOlympic = new OlympicGame();
        
            //On spot 0 at the start of the game
            CurrentSpot = 0;
            System.out.println("Beginning game by generating random number to move on gameboard...");
            //Input scanner
            Scanner gameRun = new Scanner(System.in); 

            //Run the random number generator and change location
            RandomNumber = random();
            CurrentSpot += RandomNumber;
            //System.out.println(CorrectAnswer);

            //Only 50 tiles to reach end of game
            while(CurrentSpot < 51){
                System.out.println("Moved " + RandomNumber + " places from last spot on gameboard.");
                System.out.println("You're currently on spot number " + CurrentSpot);
                RunOlympic.ask(CurrentSpot);
                System.out.print("Please type your answer of either 0 or 1: ");

                //Waiting for input
                String reply = gameRun.nextLine(); 

                //Asks question, play game
                while(RunOlympic.play(reply, CurrentSpot) == false){
                    System.out.print("Invalid answer, please select 0 or 1: ");
                    String replyAgain = gameRun.nextLine(); 

                    //if not correcting answer to a or b, code will run again until given correct response (needs to run in a loop)
                    if(RunOlympic.play(replyAgain, CurrentSpot) == false){
                        RunOlympic.play(replyAgain, CurrentSpot);
                } 
                    //will continue to run game when given an a or b
                    if(RunOlympic.play(replyAgain, CurrentSpot) == true){
                        break;
                    }
                } 
                
                //while (true) {
                    //System.out.print("Would you like to redo a question (y/n)? ");
                    //String redo = gameRun.nextLine();
                    //if (redo.equalsIgnoreCase("n")) {
                        //break;
                    //}
                    //if (redo.equalsIgnoreCase("y")) {
                        //System.out.println("You have selected to redo the question above");
                        //break;

                    //} else {
                        //RunOlympic.ask(CurrentSpot);
                    //}
                //}
                

                //Run the random number generator again to move on with the game (if continuing loop) or to reach final result at end of game (ends the loop)
                //problem is when the game ends, this is still printed without question attached, and then the end game message is printed 
                //Seperator
                
                System.out.println();
                System.out.println("...");
                System.out.println("Generating next spot on gameboard...");
                RandomNumber = random ();
                CurrentSpot += RandomNumber;    
                System.out.println("Next Question:");
                System.out.println("...");
                System.out.println();
            }

            //Game is over; count the total score to see the result
            System.out.println("You reached the end of the game.");
            //System.out.println("Your results are:");
            //RunOlympic.printResults();

            System.out.println("Your total point value is: " + point + " when averaging all your points in the game");
            System.out.println();
            System.out.println();
            
            if(point > 40){
                OlympicsMaster Final = new OlympicsMaster();
                 Final.display();
            }
            if(point < 40 & point > 20){
                Master Final = new Master();
                 Final.display();
            }
            if(point < 20 & point > 10){
                Competent Final = new Competent();
                 Final.display();
            }
            if(point < 10 & point > 0){
                Novice Final = new Novice();
                 Final.display();
            }
            if(point < 0){
                StudyUp Final = new StudyUp();
                 Final.display();
            }
            
            //Close scanner
            gameRun.close();

        }
}
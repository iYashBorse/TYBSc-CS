import java.util.Scanner;

class Player{
  private static int totalRuns=0 ;
  private static int totalPlayers=0;
  private int jerNo;
  private String name;
  private int runs;
  private int inn;
  private int notOut;

  Scanner input = new Scanner(System.in);

  public void GetData(){                                          //Method to accept data about player from user
    System.out.println("Enter Jersey number: ");
    jerNo = input.nextInt();
    input.nextLine();
    System.out.println("Enter Player's name: ");
    name = input.nextLine();
    System.out.println("Enter runs: ");
    runs = input.nextInt();
    System.out.println("Enter innings played: ");
    inn = input.nextInt();
    System.out.println("Enter number of times not out: ");
    notOut = input.nextInt();
    totalRuns += runs;                                              //accumulating runs of all players for calculation of average
    totalPlayers++;                                                 //counting no of players for calculation of average
  }

  public void PutData(){                                           //Method to display details of player
    System.out.println(" Jersy Number : "+jerNo+"\n Player Name : "+name+"\n Player Runs : "+runs+"\n Player Innings : "+inn+"\n Player Not Out For : "+notOut+" matches");
  }

  /*CodeLens- Since all the varibles we declared are private to access
  them inside another class we will be using the methods from line 36 to line 56.*/
  public String getName(){
    return name;
  }

  public int getRuns(){
    return runs;
  }

  public int getInnings_played(){
    return inn;
  }

  public static int getTotalPlayers(){
      return totalPlayers;
  }

  public static int getTotalRuns(){
    return totalRuns;
  }

  public int getJerNo(){
    return jerNo;
  }
}

public class CricPlay2{

  public static void main(String[] ar){
    Scanner input = new Scanner(System.in);
    Player[] players= new Player[11];                       //Creating Player array
    int choice , playerNo;

    do{                                                     //Creating Menu
      System.out.println("Enter: \n 0.To Exit \n 1.To Add Player \n 2.To Find Average Runs Of Single Player \n 3.To Find Average Runs Of All The Players");
      choice = input.nextInt();
      switch(choice){
        case 0 : System.exit(0);                                                //exit option
        case 1 : players[Player.getTotalPlayers()] = new Player();              //If user selects option 1, we accept details of player
                System.out.println("Enter details of player : ");
                players[Player.getTotalPlayers()].GetData();
                break;
        case 2 : System.out.println("Enter The Player Jersy Number Whose Average We Want : ");  //if user selects option 2, we calculate average of the player whose jersey no is given
                playerNo = input.nextInt();
                getAverageRuns(playerNo,players);                               //this function will return average of individual player
                break;
        case 3 : getAverageRuns();                                              //this function will return average of all players
                break;
        default : System.out.println("Wrong Choice !!!!!!!");
      }
    }while(choice != 0);
    input.close();
  }

  /* CodeLens- On line 94 we create function 'getAverageRuns' this will compute the
  average runs of individual players and we again create a function with same name
  but no formal parameters on line 110, this will return average runs of all players.
  When we create function with same name but different number of parameters, this is
  called function overloading.*/
  public static void getAverageRuns(int playerNo , Player[] players){
    Player playerFound = null;
    for(int i = 0 ; i < Player.getTotalPlayers() ; i++){                        //will parse through each player
      if(players[i].getJerNo() == playerNo)                                     //checking if given player is there in array or not
        playerFound = players[i];
    }

    if(playerFound == null){
      System.out.println("The Player With The Jersy Number "+playerNo+" Not Found");
    }
    else{
      playerFound.PutData();
      System.out.println("Average Runs By "+playerFound.getName()+" are : "+(playerFound.getRuns()/playerFound.getInnings_played()));
    }
  }

  public static void getAverageRuns(){
    System.out.println("Average Runs By The Team Are : " + (Player.getTotalRuns() / Player.getTotalPlayers()));
  }
}

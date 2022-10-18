import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
	static Random random = new Random();
	static Scanner scanner = new Scanner(System.in);
//	static ArrayList <Cards> playerOneDeck = new ArrayList<>();
//	static ArrayList <Cards> playerTwoDeck = new ArrayList<>();
//	
	public static void main(String[] args) {
		System.out.println("War, War never changes!\nWar Card Game in Java");
		System.out.println("How many players are playing?");
		int a = scanner.nextInt();
//		Cards.createStack();
		System.out.println(a);
		
		if (a == 1) {
			System.out.println("You can't wage war on your own!");
			Game.main(args);
		} else if (a > 1 && a < 51) {
			Players.setPlayers(a);
			for (int i = 0; i < a; i++) {
				Players eachPlayer;
				ArrayList<Cards> eachDeck;
				eachPlayer = Players.playersList.get(i);
				eachDeck = eachPlayer.getDeck();
				System.out.println("INITIAL");
				System.out.println(eachPlayer);
				Collections.shuffle(eachDeck);
				System.out.println("SHUFFLED");
				System.out.println(Players.playersList.get(i));
				System.out.println("Top card: " + eachDeck.get(0));
			}			
		} else {
			System.out.println("Please type in a number from 2-50");
			Game.main(args);
		}
		
		System.out.println(Players.playersList.size());

//		game proper
//		do {
//		    Pre round winner checking
		    Players winningPlayer = null;
		    ArrayList<Cards> winningDeck;
            Cards winningTopCard;
           
			for (int i = 0; i < Players.playersList.size(); i++) {
				Players eachPlayer;
				ArrayList<Cards> eachDeck;
				Cards eachTopCard;
				Players otherPlayer;
                ArrayList<Cards> otherDeck;
                Cards otherTopCard;
                
                eachPlayer = Players.playersList.get(i);
                eachDeck = eachPlayer.getDeck();
                eachTopCard = eachDeck.get(0);

                if (winningPlayer == null){
                    otherPlayer = Players.playersList.get(i + 1);
                    otherDeck = otherPlayer.getDeck();
                    otherTopCard = otherDeck.get(0);
                    if(eachTopCard.getRank()  == otherTopCard.getRank()) {
                        winningPlayer = eachPlayer;
                        System.out.println("Draw. winningPlayer is now player " + winningPlayer.getPlayerNumber() + " who has " + eachTopCard);
                    }
                    else if(eachTopCard.getRank() > otherTopCard.getRank()) {
				        winningPlayer = eachPlayer;
				        System.out.println("winningPlayer is now player " + winningPlayer.getPlayerNumber() + " who has " + eachTopCard);
				    } else if(eachTopCard.getRank() < otherTopCard.getRank()) {
				        winningPlayer = otherPlayer;
				        System.out.println("winningPlayer is now player " + winningPlayer.getPlayerNumber() + " who has " + otherTopCard);
				    }
				    
				} else {
//				    System.out.println("is other player now the winning player?" + otherPlayer);
				    winningDeck = winningPlayer.getDeck();
		            winningTopCard = winningDeck.get(0);
		            if(eachTopCard.getRank() == winningTopCard.getRank()) {
                        winningPlayer = eachPlayer;
                        System.out.println("Draw. winningPlayer is now player " + winningPlayer.getPlayerNumber() + " who has " + eachTopCard);
		            }else if(eachTopCard.getRank() > winningTopCard.getRank()) {
                        winningPlayer = eachPlayer;
                        System.out.println("winningPlayer is now player " + winningPlayer.getPlayerNumber() + " who has " + eachTopCard);
                    } else {
                        System.out.println("winningPlayer is still player " + winningPlayer.getPlayerNumber() + " who has " + winningTopCard);
                    }
				}
//				System.out.println(eachTopCard.getRank());
//				tableRound.add(eachTopCard);
			}
			
//		} while (Players.playersList.size() == 5);
		
//		System.out.println(Players.playersList.get(0));
//		System.out.println(Players.playersList.get(1));
//		System.out.println(Players.playersList.get(2));
//		System.out.println(Players.playersList.get(3));
//		System.out.println(Players.playersList.get(4));
//		playerOneDeck = Players.playersList.get(0).getDeck();
//		System.out.println(playerOneDeck);
		
//		Shuffle
//		for (int i = 0; i < playerOneDeck.size(); i++) {
//			playerOneDeck.set(i, playerOneDeck.get(randomizer()));
//			
//		}
//		
//		System.out.println("Player two, type your name:");
//		String namePlayerTwo =  scanner.nextLine();
//		playerTwoDeck = Cards.createStack();
		
//		System.out.println(playerTwoDeck);
		
	}
}

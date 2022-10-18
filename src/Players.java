import java.util.ArrayList;

public class Players{
	private int playerNumber;
	private ArrayList<Cards> deck = new ArrayList<>();
	static ArrayList<Players> playersList = new ArrayList<>();
	
	public Players(int playerNumber) {
		Cards.createStack();
		this.playerNumber = playerNumber;
		this.deck.addAll(Cards.cardsDeck);
		Cards.clearStack();
	}
	
//	public Players(int playerNumber, ArrayList<Cards> deck) {
//		this.playerNumber = playerNumber;
//		this.deck = deck;
//	}

	static ArrayList<Players> setPlayers(int playerNumber) {
		
		for (int i = 1; i <= playerNumber; i++) {
			playersList.add(new Players(i));
//			playersList.get(i).deck.addAll(Cards.cardsDeck);
		}
		return playersList;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

//	public void setPlayerNumber(int playerNumber) {
//		this.playerNumber = playerNumber;
//	}

	public static ArrayList<Players> getPlayersList() {
		return playersList;
	}

	public static void setPlayersList(ArrayList<Players> playersList) {
		Players.playersList = playersList;
	}

	@Override
	public String toString() {
		return "Player " + playerNumber + ", Deck = " + deck;
	}

	public ArrayList<Cards> getDeck() {
		return deck;
	}

	public void setDeck(ArrayList<Cards> deck) {
		this.deck = deck;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	
	
}

import java.util.ArrayList;

public class Cards implements Comparable<Cards>{
	private Suit suit;
	private Value value;
	private int rank;

	static ArrayList<Cards> cardsDeck = new ArrayList<>();
	
	public Cards(Suit suit, Value value, int rank) {
		this.suit = suit;
		this.value = value;
		this.rank = rank;
	}
	
	static ArrayList<Cards> createStack() {
		for (int i = 1; i < 13; i++) {
			switch (i) {
			case 1:
				for (Value value : Value.values()) {
					cardsDeck.add(new Cards(Suit.DIAMONDS,value,i++));
				} i = 1;
			case 13:
				for (Value value : Value.values()) {
					cardsDeck.add(new Cards(Suit.HEARTS,value,i++));
				} i = 1;
			case 26:
				for (Value value : Value.values()) {
					cardsDeck.add(new Cards(Suit.SPADES,value,i++));
				} i = 1;
			case 39:
				for (Value value : Value.values()) {
					cardsDeck.add(new Cards(Suit.CLUBS,value,i++));
				} i = 1;
			}
		}
		return cardsDeck;
	}
	
	static ArrayList<Cards> clearStack() {
		cardsDeck.clear();
		return cardsDeck;
	}
	
//	public static void main(String[] args) {
//		System.out.println(Cards.createStack());
//	}
	public int getRank() {
		return rank;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return value + " of " + suit + ", RANK = " + rank;
	}

	@Override
	public int compareTo(Cards o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}

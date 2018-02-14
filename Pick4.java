
public class Pick4 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int num = 0;
		int twentyfour = 0;
		String[] ranks = {"Ace","2", "3","4", "5", "6" , "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		int[] deck = new int[52];
		int[] temp = new int[52];
		for (int i = 0; i < deck.length; i++)
		{
			deck[i] = i;
		}
		int counter = 0;
		while(counter <100)
		{
			for (int i = 0; i < deck.length; i++)
			{
				temp[i] = deck[i];
			}
			sum = 0;
			System.out.print("The sum of ");
			for (int i = 0; i < 4; i++)
			{
				num = (int) (Math.random() * 52);
				while(temp[num] == -1)
				{
					num = (int) (Math.random() * 52);
				}
				String suit = suits[temp[num] / 13];
				String rank = ranks[temp[num]% 13];
				sum += (deck[num] % 13) + 1;
				if (sum == 24)
				twentyfour++;
				temp[num] = -1;
				System.out.print(rank +" of "+ suit);
				if (i < 2)
				{
					System.out.print(", ");
				} 
				if (i == 2)
				{
					System.out.print(", and ");
				}
				
			}
		
		
		System.out.print(" is " + sum);
		System.out.println("");
		counter++;
		}
		System.out.println("");
		System.out.println("After picking 4 cards 100 times, there were " + twentyfour + " combinations of 4 that added up to 24");
	}
}
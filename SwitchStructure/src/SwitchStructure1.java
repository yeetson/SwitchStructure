public class SwitchStructure1
{
	public static void main(String[] args) {
		int RandomNum;
		
	/*	Scanner keyboard = new Scanner(System.in); */
		RandomNum= generaterandomNumber();
		System.out.print("Random Number: " );
		System.out.println(RandomNum);
		switch(RandomNum)
		{
		case 1:
		case 2: 
		case 4:
		case 5:
		case 6:
		case 10:
		case 12:
		case 14:
		case 18:
		case 20:
		{
			System.out.println("You Win");
			break;
		}
		case 8:
		case 16:
		{
			System.out.println("You Lose");
			break;
		}
		default:
		{
			System.out.println("You Tie");
			break;
		}
		}
	}

	public  static int generaterandomNumber()
	{
		{
			int min = 1;
			int max = 20;
			{
			    int RandomNum = (int)(Math.random() * max) + min;
			    return RandomNum;
			}       
		}

		}       
		
}
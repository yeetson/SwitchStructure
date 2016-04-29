import java.util.Scanner;
public class eightball
{
	public static void main(String[] args) {
		int RandomNum;
		
		System.out.println("Ask me a Question " );
		Scanner userInput = new Scanner(System.in);
		String name = userInput.nextLine();
		RandomNum= generaterandomNumber();
				
		switch(RandomNum)
		{
		case 1: 
		{
			System.out.println("Ask me again");
			break;
		}
		case 2:
		{
			System.out.println("Maybe");
			break;
		}
		case 3:
		{
			System.out.println("The answer may be yes");
			break;
		}
		case 4:
		{
			System.out.println("The answer is no");
			break;
		}
		case 5:
		{
			System.out.println("That question doesnt have an answer");
			break;
		}
		case 6:
		{
			System.out.println("I think you know the answer to that");
			break;
		}
		case 7:
		{
			System.out.println("Of couse");
			break;
		}
		default:
		{
			System.out.println("My sources tell me no");
			break;
		}
	}
	}

	public  static int generaterandomNumber()
	{
		{
			int min = 1;
			int max = 8;
			{
			    int RandomNum = (int)(Math.random() * max) + min;
			    return RandomNum;
			}       
		}

		}       
		
}
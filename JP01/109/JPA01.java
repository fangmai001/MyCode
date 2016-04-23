public class JPA01
{
	public static void main (String argv[])
	{
		int skill = 6, action = 9, excitment = 8, result;
		result = gameRating(skill, action, excitment); 
		System.out.print("The rating of the game is "); 
		System.out.println(result);
	}
	public static int adder (int _s, int _a, int _e)
	{
		return _s+_a+_e;                                    
	}
	public static int gameRating (int s, int a, int e)
	{
		return adder(s,a,e);                                      
	}
}

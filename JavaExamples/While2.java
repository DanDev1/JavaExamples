package knowingjava;

public class While2 {
	public static void main(String[] args)
	{
		int total = 0;
		int counter = 10;
		while (counter < 21)
		{
			total = counter + counter;
			System.out.println(total+" = " +counter+ " + "+counter);
			counter ++;
		}
	}

}

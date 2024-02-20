import java.util.Random;

public class RandomModule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		// to limit the random, we can put it on the argument of the function
		// the computers always starts with zero, so we can resolve this by adding one
		// int x = random.nextInt(6)+1;
		// double y = random.nextDouble();
		boolean z = random.nextBoolean();
		
		System.out.println(z);
	}

}

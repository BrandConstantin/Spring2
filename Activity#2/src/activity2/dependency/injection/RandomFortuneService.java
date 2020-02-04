package activity2.dependency.injection;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	public String[] myArray = {"10k", "15k", "20k"};
	private Random randomK = new Random();			

	@Override
	public String getFortune() {
		int randomChose = randomK.nextInt(myArray.length);			
		String theFortune =  myArray[randomChose];	
		
		return theFortune;
	}

}

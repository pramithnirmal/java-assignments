package sample1;

public class PayBack {
	
	public static void main(String args[]) {
		System.out.println(payBack(1400));
	}
	
	static float payBack(int amount) {
		float portion1 = 0.25f/100;
		float portion2 = 0.5f/100;
		float portion3 = 0.75f/100;
		float portion4 = 0.01f;
		
		
		if(amount<500) {
			return amount *portion1;
		}
		else if (amount<1500) {
			return 500*portion1+ (amount-500)*portion2;
			
		}else if (amount<2500) {
			return 500* portion1 + 1000*portion2 + (amount-1500)*portion3;
			
		}else {//above 2500;
			return 500*portion1 + 1000*portion2 + 1000*portion3 + (amount-2500)*portion4;
			
		}
		
		
		
	}

}

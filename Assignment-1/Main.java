package sample1;
public class Main{
	
	public static void main (String args[]) {
		System.out.println("Hi how are you?");
		System.out.println(calculateProfit(4));
	}


static int callMax(int x, int y, int z) {
	int[] arr = {x,y,z};
	int max = arr[0];
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]<arr[i+1]) {max = arr[i+1];}
	}
	return max;
}


static boolean checkAlpha(char c) {
	char[] vowels = {'a','e','i','o','u'};
	int i = 0;
	while(i<vowels.length) {
		if(c==vowels[i]) {
			return true;
		}
		i++;
	}
	return false;
}

static double calInterest(int amt) {
	
	if(amt<=1000) {
		return amt*0.04;
	}
	else if(amt>1000 & amt<=5000) {
		return amt*0.045;
	}
	else if(amt>5000) {
		return amt*0.05;
	}
	return -1;
	
	}

static double calTax(int gp) {
	if(0<gp && gp<=240) {return 0;}
	if(240<gp & gp<=480) {return gp*0.15;}
	if(480<gp) {return gp*0.28;}
	else return -1;
}

static boolean isPrimeNumber(int num) {
	if (num==0 | num==1) {return false;}
    if(num==2) {return true;}
	for(int i = 2; i<=num/2.0;i++) {
		if(num%i==0) {
			return false;
		}
	}
	return true;
}

static float calculateProfit(int numAttendees) {
	int revenue   = numAttendees*5;
	double cost   = 20 + numAttendees*0.5;
	float profit = (float) (revenue - cost);
	return profit;
	
}






}
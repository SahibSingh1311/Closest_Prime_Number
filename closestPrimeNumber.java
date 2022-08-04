import java.util.*;

public class closestPrimeNumber{
	public static void main(String[] args){
	int num = 0;
	System.out.println(closestPrime(num));
}
	public static boolean isPrime(int n){
	if(n==2)
		return true;
	if(n==0||n==1||n%2==0)
		return false;
	for(int i=3;i<n/2;i+=2){
		if(n%i==0)
			return false;
	}
	return true;
}
	public static ArrayList<Integer> closestPrime(int num){
	
	int smalln=num;
	int bign=num;
	ArrayList<Integer> ans=new ArrayList();
	
	if(isPrime(num))
		ans.add(num);	

	while(ans.size()<1){
	
		if(isPrime(bign)){
			System.out.println(bign);
			ans.add(bign);
		}
		
		if(smalln>1){
		if(isPrime(smalln)){
			ans.add(smalln);
		}
		smalln--;
	}
	bign++;	
}
	return ans;
}
}

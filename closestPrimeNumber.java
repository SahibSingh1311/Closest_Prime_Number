import java.util.*;

public class closestPrimeNumber{
	public static void main(String[] args){
	int num = 31;
	System.out.println(closestPrime(num));
}
	public static boolean isPrime(int n){
	if(n==0)
		return false;
	if(n==1)
		return false;
	if(n==2)
		return true;
	if(n%2==0)
		return false;
	for(int i=3;i<n/2;i+=2){
		if(n%i==0)
			return false;
	}
	return true;
}
	public static ArrayList<Integer> closestPrime(int num){
	
	boolean small = true;
	boolean big = true;
	int smalln=num;
	int bign=num;
	ArrayList<Integer> ans=new ArrayList();
	
	if(isPrime(num))
		ans.add(num);	

	while(big || small){
	if(big){
		if(isPrime(bign)){
			big = false;
			ans.add(bign);
		}
	bign++;
}
	if(small){
		if(isPrime(smalln)){
			small = false;
			ans.add(smalln);
		}
		smalln--;
}
	if(ans.size()>=1)
		return ans;
}
	return ans;
}
}

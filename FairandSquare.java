import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigInteger;

public class FairandSquare {
	
	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}

	public static int reverse(int number) {
		int result = 0;
		while (number != 0) {
			int remainder = number % 10;
	
			result = result * 10 + remainder;
	
			number /= 10;
		}
		return result;
	}
	
	public final static boolean isPerfectSquare(long n)
	{
	  if (n < 0)
	    return false;

	  long tst = (long)(Math.sqrt(n) + 0.5);
	  return tst*tst == n;
	}
	
	public static void main(String[] args){
	
		try {
			BufferedReader br = new BufferedReader(new FileReader("C-large-1.in"));
			FileWriter fstream = new FileWriter("output.txt");
			BufferedWriter out = new BufferedWriter(fstream);
			int numCases = Integer.parseInt(br.readLine());
			
			for(int i =0; i<numCases;i++){
				String[] s = br.readLine().split(" ");
				int low = Integer.parseInt(s[0]);
	        	int high = Integer.parseInt(s[1]);

	        	int count = 0;
	        	//need to count how many fair and square numbers between low and high inclusive
	        	for(int j = low; j < high+1; j++){
	        		if(isPalindrome(j) && isPerfectSquare(j)){
	        			if(isPalindrome((int)Math.sqrt(j))){
	        				count++;
	        			}
	        		}
	        		
	        	}
	        	
	        	
	        	out.write("Case #"+(i+1)+": " + count + "\n");
				
			}
			
			
			
			out.close();
	    } catch (Exception e) {
	        System.err.println("Error:" + e.getMessage());
	    }
	}

}

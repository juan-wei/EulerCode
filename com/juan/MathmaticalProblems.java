import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
class MathmaticalProblems implements ProblemsInterface{


	public void sumOfMultipleOf3And5(int threshold){
		long sum = 0;
		for(int i=1; i<threshold; i++){
			if ((i%3 == 0) || (i%5 == 0) ) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	private long[] generateFibonacci(long threshold){
		long[] nums = new long[100000];
		nums[1]=1;
		nums[2]=1;

		for(int i=3;;i++){
			long sum = nums[i-2]+nums[i-1];
			if (sum > threshold) {
				break;
			}
			nums[i] = sum;
		}
		return  nums;
	}
	private boolean isEven(long num){
		if (num%2 == 0) {
			return true;
		}else{
			return false;
		}

	}

	public  void getSumOfEven(long threshold){
		long[] nums = generateFibonacci(threshold);
		long sum = 0;
		for (int i=0; i< nums.length ; i++ ) {
			if (isEven(nums[i])) {
				sum += nums[i];
			}
		}
		System.out.println(sum);
	}

	public void getLargestPrimeFactor(long num){
		int flag = 0;
		long max = 0;
		for (long i=2; i<num; i++ ) {
			if(num%i == 0){
				max = i;
				flag++;
				System.out.print(i+"x");
				num = num/i;
				i--;
			}
			
			
		}
		System.out.println(num);
		if(flag==0){
			System.out.println("\n"+num+"is prime numember");
		}else {
			System.out.println("\n"+"the largest prime factor: "+(max>num?max:num));
		}

	}

	public void getPalindromicNumber(){
		long num = 0;
		for(int a=9; a>0; a--)
			for (int b=9; b>=0; b--) 
				for(int c=9; c>=0; c--){
					num = 11*(9091*a+910*b+100*c);
					for(int i=90; i>=10; i--){
						long remander = num/(11*i);
						if(num%(11*i)==0){
							if(remander>=100 && remander<=999){
								System.out.println(num+"="+(11*i)+"*"+remander);
								System.out.println(num);
								return;
								
							}
								
						}
					}
				}
		System.out.println(num);
	}

	private long getGongYueShu(long x, long y){
		long big = x>y?x:y;
		long small = x<y?x:y;
		long temp = 0;
		while(big%small != 0){
			temp = small;
			small = big%small;
			big = temp;
		}
		return small;
	}
	public void getSmallestProduct(int num){
		long product = 1;
		for(int i=2; i<=num; i++){
			product = (i*product)/getGongYueShu(product,i);
		}
		System.out.println(product);
	}

	public void getDifference(long big){
		long sum = 0;
		for(int i=1; i<= big; i++){
			for(int j=i+1; j<=big; j++){
				
				sum += i*j;
			}
		}
		System.out.println(sum*2);

	}

	public void getSpecifiedPrime(int total){
		int count = 0;
		int num = 2;
		
		while(count<total){
			boolean isPrime = true;
			for(int i=2; i<=(int)Math.sqrt((double)num);i++){
				if(num%i == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				count += 1;
			}
			num++;
		}
		System.out.println(num-1);
	}

	//find the greatest product of five consecutive digits in the 1000-digit number
	public void getLargestProductInASeries(int digit){
		String numString = 	"73167176531330624919225119674426574742355349194934"+
							  	"96983520312774506326239578318016984801869478851843"+
							  	"85861560789112949495459501737958331952853208805511"+
								"12540698747158523863050715693290963295227443043557"+
								"66896648950445244523161731856403098711121722383113"+
								"62229893423380308135336276614282806444486645238749"+
								"30358907296290491560440772390713810515859307960866"+
								"70172427121883998797908792274921901699720888093776"+
								"65727333001053367881220235421809751254540594752243"+
								"52584907711670556013604839586446706324415722155397"+
								"53697817977846174064955149290862569321978468622482"+
								"83972241375657056057490261407972968652414535100474"+
								"82166370484403199890008895243450658541227588666881"+
								"16427171479924442928230863465674813919123162824586"+
								"17866458359124566529476545682848912883142607690042"+
								"24219022671055626321111109370544217506941658960408"+
								"07198403850962455444362981230987879927244284909188"+
								"84580156166097919133875499200524063689912560717606"+
								"05886116467109405077541002256983155200055935729725"+
								"71636269561882670428252483600823257530420752963450";
		
		long max = 0;
		
		for(int i=digit; i<numString.length(); i++){
			int product = 1;
			for(int j=i;j>i-digit; j--)
				product *= Integer.parseInt(String.valueOf(numString.charAt(j)));
			
			if(product >= max){
				max = product;
			}
		}
		
		System.out.println(max);
	}

	//Special Pythagorean triplet
	public void getProductOfSepcialPythagorean(int sum){
		for(int a=3; a<(sum-3)/3; a++){
			for(int b=a+1; b<(sum-a)/2; b++){
				if((a*a + b*b) == (sum-a-b)*(sum-a-b)){
					System.out.println(a*b*(sum-a-b));
					return;
				}
			}
		}
	}

	//get the sum of specified primes
	public void getSumOfPrime(long threshold){
		long sum = 0;
		outer:
		for(long i=2; i<= threshold; i++){
			for(long j=2; j<=(long)Math.sqrt((double)i); j++){
				if(i%j == 0)
					continue outer;
			}
			sum += i;
		}

		System.out.println(sum);
	}

	public void getSolution11(){
		int[][] nums=  {{8, 02, 22, 97, 38, 15, 00, 40, 00, 75, 04, 05, 07, 78, 52, 12, 50, 77, 91, 8},
					    {49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 04, 56, 62, 00},
					    {81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 03, 49, 13, 36, 65},
						{52, 70, 95, 23, 04, 60, 11, 42, 69, 24, 68, 56, 01, 32, 56, 71, 37, 02, 36, 91},
						{22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80},
						{24, 47, 32, 60, 99, 03, 45, 02, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50},
						{32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70},
						{67, 26, 20, 68, 02, 62, 12, 20, 95, 63, 94, 39, 63, 8, 40, 91, 66, 49, 94, 21},
						{24, 55, 58, 05, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72},
						{21, 36, 23, 9, 75, 00, 76, 44, 20, 45, 35, 14, 00, 61, 33, 97, 34, 31, 33, 95},
						{78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 03, 80, 04, 62, 16, 14, 9, 53, 56, 92},
						{16, 39, 05, 42, 96, 35, 31, 47, 55, 58, 88, 24, 00, 17, 54, 24, 36, 29, 85, 57},
						{86, 56, 00, 48, 35, 71, 89, 07, 05, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58},
						{19, 80, 81, 68, 05, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 04, 89, 55, 40},
						{04, 52, 8, 83, 97, 35, 99, 16, 07, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66},
						{88, 36, 68, 87, 57, 62, 20, 72, 03, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69},
						{04, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18, 8, 46, 29, 32, 40, 62, 76, 36},
						{20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 04, 36, 16},
						{20, 73, 35, 29, 78, 31, 90, 01, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 05, 54},
						{01, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 01, 89, 19, 67, 48}
					   };
		long product = 0;
		long max = 0;
		//Transverse
		for (int i=0; i<20; i++) {
			for(int j=0; j<16; j++){
				product = nums[i][j]*nums[i][j+1]*nums[i][j+2]*nums[i][j+3];
				if(product > max)
					max = product;
			}
		}
		//Vertical
		for (int j=0; j<20; j++) {
			for(int i=0; i<16; i++){
				product = nums[i][j]*nums[i+1][j]*nums[i+2][j]*nums[i+3][j];
				if(product > max)
					max = product;
			}
		}
		//Diagonal
		for (int i=0; i<16; i++) {
			for(int j=0; j<16; j++){
				product = nums[i][j]*nums[i+1][j+1]*nums[i+2][j+2]*nums[i+3][j+3];
				if(product > max)
					max = product;
			}
		}
		//Against angle
		for (int i=0; i<16; i++) {
			for(int j=3; j<20; j++){
				product = nums[i][j]*nums[i+1][j-1]*nums[i+2][j-2]*nums[i+3][j-3];
				if(product > max)
					max = product;
			}
		}

		System.out.println(max);
	}

	private long[] getPrimeFactors(long n){

		String str = n+" = ";
		long[] factors = new long[65535];
		for (long i=2; i<=n; i++ ) {
			if(n%i == 0){
				factors[(int)i] += 1;
				str = str+i+" * ";
				n = n/i;
				i--;
			}	
		}
		System.out.println(str.substring(0,str.length()-2));
		return factors;
	}
	public void getSolution12(){
		long n = 0;
		long[] factors = new long[65535];
		int count = 0;
		
		for(int i=7;;i++){
			count = 1;
			
			n = i*(i+1)/2;
			if(isEven(n)){
				factors = getPrimeFactors(n);
				for(int j=1; j<factors.length;j++){
					if(factors[j] != 0){
						count *= (factors[j]+1);
					}
				}
				if(count >= 500){
					System.out.println("count = "+count);
					System.out.println(n);
					return;
				}

				System.out.println(n);
			}
		}
	}

	public void getSolution13(){
		try{
			BigInteger[] nums = new BigInteger[100];
			FileReader reader = new FileReader("E:\\GitHub\\EulerCode\\com\\juan\\txt13.txt");
			BufferedReader br = new BufferedReader(reader);
			String str = null;
			int i = 0;
			while((str = br.readLine()) != null){
				nums[i++] = new BigInteger(str);
			}
			br.close();
			reader.close();
			
			BigInteger sum = nums[0];
			for(int j=1; j<nums.length; j++){
				sum = sum.add(nums[j]);
			}
			String sumString = String.valueOf(sum);
			System.out.println(sumString.substring(0, 10));
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
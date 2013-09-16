import java.util.Arrays;
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
		// long number =0;
		long max = 0;
		// int index = 0;
		
		// System.out.println(numString.length());
		for(int i=digit; i<numString.length(); i++){
			int product = 1;
			for(int j=i;j>i-digit; j--)
				product *= Integer.parseInt(String.valueOf(numString.charAt(j)));
			
			if(product >= max){
				max = product;
				// index = i;
			}
		}

		// System.out.println(max);
		// System.out.println(index);
		
		
		System.out.println(max);

	}
}
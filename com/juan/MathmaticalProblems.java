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
								return num;
								
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
}
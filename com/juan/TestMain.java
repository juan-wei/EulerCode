class TestMain  
{
	public static void main(String[] args) 
	{
		ProblemsInterface problems = new MathmaticProbles();

		// problems.sumOfMultipleOf3And5(Integer.parseInt(args[0]));
		// problem.getSumOfEven(Long.parseLong(args[0]));
		// problem.getLargestPrimeFactor(Long.parseLong(args[0]));
		// problem.getPalindromicNumber();
		// problem.getSmallestProduct(Integer.parseInt(args[0]));
		// problem.getDifference(Integer.parseInt(args[0]));
		problems.getSpecifiedPrime(Integer.parseInt(args[0]));
		
	}
}

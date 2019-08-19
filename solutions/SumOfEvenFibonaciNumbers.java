/**
* 
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

*/
public class SumOfEvenFibonaciNumbers {

	public static void main(String[] args) {
		int p1 = 1, p2 = 1, sum = 0, fib = 0;

		int n = 10;
		int i = 1;
		while(i < n) {
			fib = p1 + p2;
			p1 = p2;
			p2 = fib;

			if(fib % 2 == 0) {
				sum += fib;
			}
			i++;
		}
		System.out.println("Sum of Even numbers: " + sum);
	}
}


/**
 TestCase
 
 p1 | p2 | i < n    | fib  | sum 
--------------------------------
 1  | 1  | 1 < 10=T | 1+1=2|2%2==0 ->T = 2
 1  | 2  | 2 < 10=T | 1+2=3|3%2==1 ->F = 2
 2  | 3  | 3 < 10=T | 2+3=5|5%2==1 ->F = 2
 3  | 5  | 4 < 10=T | 2+5=8|8%2==0 ->T = 10
 
*/
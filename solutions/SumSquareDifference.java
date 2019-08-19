/**
The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum
*/
public class SumSquareDifference {
  public static void main(String[] args) {
    int sumOfSqure = 0, squareOfSum = 0, result = 0;
    int N = 100;

    for (int i = 1; i <= N; i++) {
      sumOfSqure += power(i, 2);
      squareOfSum += i;
    }
    int squreOfSumResult = power(squareOfSum, 2);
    result = squreOfSumResult - sumOfSqure;
    System.out.println("Sum Of Squre: " + sumOfSqure);
    System.out.println("Squre Of Sum: " + squareOfSum);
    System.out.println("Result : " + result);
  
  }

  public static int power(int base, int exp) {
    int result = 1;
    while(exp != 0) {
      result *= base;
      --exp;
    }
    return result;
  }
}

/**
TestCase for power
------------------

base | exp | while (exp != 0) | result
========================================
1	2	2 != 0 ->T --2| result = 1 * 1 = 1
		1 != 0 ->T --1| result = 1 * 1 = 1
		0 != 0 ->F 	result = 1
--------------------------------------------------
2	2	2 != 0 ->T --2| result = 1 * 2 = 2
		1 != 0 ->T --1| result = 2 * 2 = 4
		0 != 0 ->F 	result = 4
--------------------------------------------------
3	2	2 != 0 ->T --2| result = 1 * 3 = 3;
		1 != 0 ->T --1| result = 3 * 3 = 9;
		0 != 0 ->F	result = 9
--------------------------------------------------
55	2	2 != 0 ->T --2| result = 1 * 55 = 55;
		1 != 0 ->T --1| result = 55 * 55 = 3025
		0 != 0 ->F	result = 3025 


*/

package java_version.재귀;

import java.util.Scanner;

public class q_10870 {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		System.out.println(fibonacci(N));
	}
 
	// 피보나치 함수
	static int fibonacci(int N) {
		if (N == 0)	return 0;
		if (N == 1)	return 1;
		return fibonacci(N - 1) + fibonacci(N - 2);
	}
}

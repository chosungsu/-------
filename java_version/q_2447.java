package java_version;

import java.util.Scanner;

//3의 거듭제곱 사용
//별 찍기-3
//가운데는 비우는 로직
public class q_2447 {
    static char[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //arr에는 N * N의 배열을 생성한다.
        arr = new char[N][N];
        StringBuilder sb = new StringBuilder();

        //공백으로 선생성시킨다.
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = ' ';
            }
        }

        star(0, 0, N);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void star(int x, int y, int n) {
        if (n == 1) {
            arr[x][y] = '*';
            return;
        }

        n /= 3;

        for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               if (i == 1 && j == 1) {
                   continue;
               }

               star(x + (i * n), y + (j * n), n);
           }
        }
    }
}

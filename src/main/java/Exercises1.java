public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public long factorial(int n) {
        int x = 1;
        for(int i = 1; i <= n; i++)
            x = x * i;
        return x;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
}


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public char[][] generateTriangle(int rows) {
        char[][] triangle = new char[rows][];
        for (int i = 0; i < rows; i++) {
            triangle[i] = new char[i+1] ;
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = '*';
            }
        }
        return triangle ;
    }


    public static void main(String[] args) {
        int rows = 5 ;
        char[][] triangle = new char[rows][];
        for (int i = 0; i < rows; i++) {
            triangle[i] = new char[i+1] ;
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = '*';
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
    }

}
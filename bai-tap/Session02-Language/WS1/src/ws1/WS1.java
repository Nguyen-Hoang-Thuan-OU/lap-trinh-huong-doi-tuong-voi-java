package ws1;

import java.util.Scanner;

public class WS1 {

    public static void main(String[] args) {
//        boolean result = isPrime(0);
//        System.out.println("0? " + result);
//        System.out.println("10? " + isPrime(10));
//        System.out.println("11? " + isPrime(11));
//        System.out.println("17? " + isPrime(17));

        printPrimeList();
        //printFirst1000Primes();
    }
    
    // Hàm nhập từ bàn phím 2 hệ số a và b
    // đại diện cho phương trình bậc 1: ax + b = 0
    // sau đó in ra nghiệm của phương trình
    // (* Chưa hoàn thành *)
    public static void solveLinearEquation() {
        System.out.print("a: ");
        Scanner a = new Scanner(System.in);
        
        System.out.print("b: ");
        Scanner b = new Scanner(System.in);
    }
    
    // Hàm in ra 1000 số nguyên tố đầu tiên
    // (* Chưa hoàn thành *)
    public static void printFirst1000Primes() {
        int count = 0;
        
        for (int i = 2; i < 99999; i++) {
            if (isPrime(i) == true) {
                count++;
                System.out.print(i + "  ");
                
                if (count == 1000)
                    break;
            }
        }
        System.out.println("");
    }
    
    // Hàm in ra các số nguyên tố trong đoạn 1..1000
    public static void printPrimeList() {
        System.out.println("The list of prime numbers from 1..1000");
        for (int i = 0; i <= 1000; i++) {
            // Nếu đúng là số nguyên tố thì mới in ra
            if (isPrime(i)) // if (isPrime(i) == true)
                System.out.print(i + "  ");
        }
        System.out.println("");
    }
    
    // Hàm kiểm tra 1 số
    // có phải là số nguyên tố hay không
    public static boolean isPrime(int n) {
        
        // Số 2 là số nguyên tố nhỏ nhất
        if (n < 2)
            return false;
        
        if (n == 2)
            return true;
        
        // Xét từ 2..n-1, nếu có lỡ chia hết cho bất kì số nào
        // thì xem như không phải là số nguyên tố
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        
        // Đi hết cả for
        // nhưng vẫn không chia hết cho bất kì số nào
        return true;
    }
    
}

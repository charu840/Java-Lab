[Program-1 WAP to calculate numbers](# ASSI-1)

[Program-2 WAP to test primes](# ASSI-2)

## ASSI-1
```
public class Calculator {
  public static void main(String[] args) {   // main method
        // converting command line arguments into integers
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        // calling methods
        add(a, b);
        sub(a, b);
        mul(a, b);
        div(a, b);
    }
    // addition
    public static void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }
    // subtraction
    public static void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }
    // multiplication
    public static void mul(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }
    // division
    public static void div(int a, int b) {
        System.out.println("Division: " + (a / b));
    }
}
```
<img width="1280" height="1024" alt="image" src="https://github.com/user-attachments/assets/900d97f0-3345-4f96-9702-13292031ef3a" />

## ASSI-2
```
public class TestPrime{
    public static void main(String[] args){
        for (int n = 0; n <= 144 ; n++)
            if(isPrime(n)) System.out.println(n + " ");
        //System.out.println(isPrime(5));
    }
    public static boolean isPrime(int n){
        if (n < 2) return false;
        if (n < 4) return true;
        if (n%2 == 0) return false;
        for (int d = 3; d*d <= n ; d += 2)
        {
            //System.out.println(d);  
            System.out.println(n+"%"+d);
            if(n%d == 0) return false;
        }
        return true;
    }
}
```
<img width="836" height="888" alt="image" src="https://github.com/user-attachments/assets/fb50ba18-24c6-4adf-bd4e-0fe6ac0500d6" />


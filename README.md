[Program-1 WAP to Add,Mul,Div,Sub using classes and object](# ASSI-1)

[Program-2 WAP to test primes](# ASSI-2)

## ASSI-1
```
import java.util.Scanner;

class Calculator {
    int a, b;

    // Method for addition
    void add() {
        System.out.println("Addition = " + (a + b));
    }

    // Method for subtraction
    void sub() {
        System.out.println("Subtraction = " + (a - b));
    }

    // Method for multiplication
    void mul() {
        System.out.println("Multiplication = " + (a * b));
    }

    // Method for division
    void div() {
        if (b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Division by zero not possible");
    }
}

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator obj = new Calculator();  // creating object

        System.out.print("Enter first number: ");
        obj.a = sc.nextInt();

        System.out.print("Enter second number: ");
        obj.b = sc.nextInt();

        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }

    @Override
    public String toString() {
        return "Main []";
    }
}
```


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


[PROGRAM-1: Create a class with 4 methods: addition,subtraction,multiplication,division and test all 4 methods in public static void main.](#xyz)

[PROGRAM-2: Write a program to test for, while and do-while loop for  the same problem](#abc)
 
[PROGRAM-3:Write a program using if else to print the grade of input marks](#x)

[PROGRAM-4:Write a program using object and classes for the following problems: a)square of stars for dynamic height and width , b)triangle of stars.](#y)

[PROGRAM-5:Write a program to add 2 distances where each distance is given in m,cm](#z)

[PROGRAM-6:Write a program to add 2 distances where each distance is given in m,cm,mm](#a)

[PROGRAM-7:Write a program to add 2 time in object oriented fashion where each time is given in hr,min](#b)

[PROGRAM-8:Write a program to add 2 time in object oriented fashion where each time is given in hr,min,sec](#c)

[Program-9:Write a Java program to create a class for a one-dimensional array with four methods: one method to take input from the user, two methods to display the array in different ways, and one method to display the array in reverse order. Test all the methods in the main method.](#d)

[PROGRAM-10: write a class with multiple methods to perform matrix operations (transpose, addition, sum of rows, sum of columns, sum of diagonal).](#m)

[PROGRAM-11: Write a program using three classes to print 1-100 ,1-100,1-100 with and without thread and analyse the output and repeat the same program using runnable interface.](#n)

[PROGRAM-12: Using the concept of multithreading the output of all three threads must be synchronised (use join method).](#o)

[PROGRAM-13:Addition of 2 numbers using swing.](#p)

[PROGRAM-14:Make one calculator in swing.](#q)

[PROGRAM-15:Matrix Addition using swing class](#r)

[PROGRAM-16:Create one jframe apply 10 buttons on that after clicking on each button a new structure is created.(Circle, oval rectangle, etc ....)](#s)

[PROGRAM-17:Just using mouse Event create a frame like paint brush with selection of colour and width .](#t)

[PROGRAM-18:Create a package of any 5 classes of your choice and import it.](#v)

[PROGRAM-19:Create one package and sub package import and test it .](#w)

[PROGRAM-20:Create one small array of size 5 apply array out of bounds exception using try catch give a proper message in catch and demonstrate the exception exactly in the same fashion demonstrate arithmetic exception .](#e)

[PROGRAM-21:To test the range of age of one student.write a program using user defined exception.](#f)

[PROGRAM-22:File Handling Programs (given in the PPT)](#g) 

[PROGRAM-23:Inheritance Programs, using interface and abstract classes.](#h)

[PROGRAM-24:Make a registration form with 10 elements and send the data into database (use jdbc connectivity)](#i)

[PROGRAM-25:Collect the code from internet for any five programs of c language. (Fact, armstrong, palindrome, Fibonacci, pattern).](#j)



# xyz 
                                              PROGRAM-1
                                              
```
import java.util.Scanner;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));

        sc.close();
    }
}
```

Output:

<img width="572" height="208" alt="image" src="https://github.com/user-attachments/assets/b635050f-3847-4332-b3a7-a61afa9ccdbe" />






# abc

                                                 PROGRAM-2

                                                 
```
public class LoopTest {

    public static void main(String[] args) {

        System.out.println("Using FOR loop:");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("\nUsing WHILE loop:");
        int j = 1;
        while(j <= 5) {
            System.out.println(j);
            j++;
        }

        System.out.println("\nUsing DO-WHILE loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while(k <= 5);

    }
}
```
Output :

<img width="740" height="678" alt="image" src="https://github.com/user-attachments/assets/2c583ec7-e9f0-4b51-9b62-66f3f109c599" />



# x
                                                PROGRAM-3

                                                
```
import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks;

        System.out.print("Enter your marks: ");
        marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        }
        else if (marks >= 75) {
            System.out.println("Grade: B");
        }
        else if (marks >= 60) {
            System.out.println("Grade: C");
        }
        else if (marks >= 50) {
System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F (Fail)");
        }

        sc.close();
    }
}
```

Output:

<img width="416" height="66" alt="image" src="https://github.com/user-attachments/assets/38b3b330-f04c-486c-bcea-2950a2908292" />



# y

                                              PROGRAM-4

```
import java.util.Scanner;

class StarPatterns {

    void square(int rows, int cols) {
        System.out.println("\nSquare Pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void triangle(int n) {
        System.out.println("\nTriangle Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StarPatterns sp = new StarPatterns();

        System.out.print("Enter number of rows for square: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns for square: ");
        int cols = sc.nextInt();

        // Input for triangle
        System.out.print("Enter height of triangle: ");
        int n = sc.nextInt();

        sp.square(rows, cols);
        sp.triangle(n);

        sc.close();
    }
}

```

Output:

<img width="688" height="574" alt="image" src="https://github.com/user-attachments/assets/d162caef-f3d7-4270-8e80-d2c8a59aac23" />


# z
                                                Program-5

```
import java.util.Scanner;
class Distance {
    int meter, cm;

    void input(Scanner sc) {
        System.out.print("Enter meters: ");
        meter = sc.nextInt();
        System.out.print("Enter centimeters: ");
        cm = sc.nextInt();
    }

    void display() {
        System.out.println(meter + " m " + cm + " cm");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Distance d1 = new Distance();
        Distance d2 = new Distance();
        Distance result = new Distance();

        System.out.println("Enter first distance:");
        d1.input(sc);
        System.out.println("Enter second distance:");
        d2.input(sc);
        
        result.cm = d1.cm + d2.cm;
        result.meter = d1.meter + d2.meter;
        if (result.cm >= 100) {
            result.meter += result.cm / 100;
            result.cm = result.cm % 100;
        }

        System.out.print("Total Distance = ");
        result.display();
    }
}
```              
Output:

<img width="690" height="244" alt="image" src="https://github.com/user-attachments/assets/b7b5285d-1d13-44c7-a0bb-411aeb840a6f" />


# a
                                                   Program-6

```
import java.util.Scanner;
class Distance {
    int meter, cm, mm;

    void input(Scanner sc) {
        System.out.print("Enter meters: ");
        meter = sc.nextInt();
        System.out.print("Enter centimeters: ");
        cm = sc.nextInt();
        System.out.print("Enter millimeters: ");
mm = sc.nextInt();
    }
    void display() {
        System.out.println(meter + " m " + cm + " cm " + mm + " mm");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Distance d1 = new Distance();
        Distance d2 = new Distance();
        Distance result = new Distance();

        System.out.println("Enter first distance:");
        d1.input(sc);
        System.out.println("Enter second distance:");
        d2.input(sc);
        result.mm = d1.mm + d2.mm;
        result.cm = d1.cm + d2.cm;
        result.meter = d1.meter + d2.meter;
        if (result.mm >= 10) {
            result.cm += result.mm / 10;
            result.mm = result.mm % 10;
        }
        if (result.cm >= 100) {
            result.meter += result.cm / 100;
            result.cm = result.cm % 100;
        }

        System.out.print("Total Distance = ");
        result.display();
    }
}
```

Output:

<img width="696" height="310" alt="image" src="https://github.com/user-attachments/assets/f7b57d6c-e6a2-4343-a6d5-e2a1a6b5caf9" />



# b
                                                 Program-7

```
import java.util.Scanner;

class Time {
    int hr, min;

    void input(Scanner sc) {
        System.out.print("Enter hours: ");
        hr = sc.nextInt();
        System.out.print("Enter minutes: ");
        min = sc.nextInt();
    }
    void add(Time t1, Time t2) {
        min = t1.min + t2.min;
        hr = t1.hr + t2.hr;
        if (min >= 60) {
            hr += min / 60;
            min = min % 60;
}
    }

    void display() {
        System.out.println("Total Time = " + hr + " hr " + min + " min");
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Time t1 = new Time();
        Time t2 = new Time();
        Time result = new Time();
        
        System.out.println("Enter first time:");
        t1.input(sc);
        System.out.println("Enter second time:");
        t2.input(sc);

        result.add(t1, t2);
        result.display();
    }
}
```

Output:

<img width="662" height="240" alt="image" src="https://github.com/user-attachments/assets/d3bf9758-76a3-40de-910a-02af3e5a84f7" />


# c
                                                  Program-8

```
import java.util.Scanner;
class Time {
    int hr, min, sec;

    void input(Scanner sc) {
        System.out.print("Enter hours: ");
        hr = sc.nextInt();
        System.out.print("Enter minutes: ");
        min = sc.nextInt();
        System.out.print("Enter seconds: ");
        sec = sc.nextInt();
    }
    void add(Time t1, Time t2) {
        sec = t1.sec + t2.sec;
        min = t1.min + t2.min;
        hr = t1.hr + t2.hr;
        if (sec >= 60) {
            min += sec / 60;
            sec = sec % 60;
        }
        if (min >= 60) {
            hr += min / 60;
            min = min % 60;
        }
    }

    void display() {
        System.out.println("Total Time = " + hr + " hr " + min + " min " + sec + " sec");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Time t1 = new Time();
        Time t2 = new Time();
        Time result = new Time();

        System.out.println("Enter first time:");
        t1.input(sc);
        System.out.println("Enter second time:");
        t2.input(sc);

        result.add(t1, t2);
        result.display();
    }
}
```

Output:

<img width="648" height="310" alt="image" src="https://github.com/user-attachments/assets/e71807d3-336c-418b-bcf8-51f7f4454022" />



# d
                                                  Program-9

```
import java.util.Scanner;

class ArrayOperations {
    int[] arr;
    int size;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        size = sc.nextInt();
        arr = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void output1() {
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void output2() {
        System.out.println("Array using enhanced loop:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    void reverse() {
        System.out.println("Array in reverse:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations obj = new ArrayOperations();

        obj.input();
        obj.output1();
        obj.output2();
        obj.reverse();
    }
}
```

Output:

<img width="652" height="312" alt="image" src="https://github.com/user-attachments/assets/f06f0949-7067-4489-81b9-2e65cffca812" />




# m
                                                  Program-10

```
import java.util.Scanner;

class MatrixOperations {
    int[][] a, b, result;
    int r, c;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        r = sc.nextInt();
        c = sc.nextInt();

        a = new int[r][c];
        b = new int[r][c];
        result = new int[r][c];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }
    }

    void addition() {
        System.out.println("Addition:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = a[i][j] + b[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    void transpose() {
        System.out.println("Transpose of first matrix:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }

    void sumRows() {
        System.out.println("Sum of rows (first matrix):");
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum += a[i][j];
            }
            System.out.println(sum);
        }
    }

    void sumColumns() {
        System.out.println("Sum of columns (first matrix):");
        for (int i = 0; i < c; i++) {
            int sum = 0;
            for (int j = 0; j < r; j++) {
                sum += a[j][i];
            }
            System.out.println(sum);
        }
    }

    void sumDiagonal() {
        int sum = 0;
        for (int i = 0; i < r && i < c; i++) {
            sum += a[i][i];
        }
        System.out.println("Sum of diagonal (first matrix): " + sum);
    }
}

public class TestMatrix {
    public static void main(String[] args) {
        MatrixOperations obj = new MatrixOperations();

        obj.input();
        obj.addition();
        obj.transpose();
        obj.sumRows();
        obj.sumColumns();
        obj.sumDiagonal();
    }
}
```

Output:

<img width="694" height="804" alt="image" src="https://github.com/user-attachments/assets/72e5e3dd-5ed6-499c-af1b-a34ea1a7509e" />




# n
                                                  Program-11

```
//Without Thread (Sequential Execution)
class PrintTask1 {
    void printNumbers() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Class 1: " + i);
        }
    }
}

class PrintTask2 {
    void printNumbers() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Class 2: " + i);
        }
    }
}

class PrintTask3 {
    void printNumbers() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Class 3: " + i);
        }
    }
}

public class SequentialDemo {
    public static void main(String[] args) {
        PrintTask1 t1 = new PrintTask1();
        PrintTask2 t2 = new PrintTask2();
        PrintTask3 t3 = new PrintTask3();

        t1.printNumbers();
        t2.printNumbers();
        t3.printNumbers();
    }
}

//With Thread Class
class ThreadTask1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Thread 1: " + i);
        }
    }
}

class ThreadTask2 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Thread 2: " + i);
        }
    }
}

class ThreadTask3 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Thread 3: " + i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        ThreadTask1 t1 = new ThreadTask1();
        ThreadTask2 t2 = new ThreadTask2();
        ThreadTask3 t3 = new ThreadTask3();

        t1.start();
        t2.start();
        t3.start();
    }
}

//Using Runnable Interface
class RunnableTask1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Runnable 1: " + i);
        }
    }
}

class RunnableTask2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Runnable 2: " + i);
        }
    }
}

class RunnableTask3 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Runnable 3: " + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {

        Thread t1 = new Thread(new RunnableTask1());
        Thread t2 = new Thread(new RunnableTask2());
        Thread t3 = new Thread(new RunnableTask3());

        t1.start();
        t2.start();
        t3.start();
    }
}
```

Output:

<p>
<img width="1312" height="1502" alt="image" src="https://github.com/user-attachments/assets/ea504ab6-4ef9-4508-bed7-78926c036d72" />
</p>

<p>
<img width="1298" height="1502" alt="image" src="https://github.com/user-attachments/assets/3c8d6e1e-24b3-4a82-a645-3925ce48135e" />
</p>

<p>
<img width="1258" height="1496" alt="image" src="https://github.com/user-attachments/assets/5c2c8d22-d708-4bef-a598-4f8ba29f371d" />
</p>

<p>
<img width="1198" height="1496" alt="image" src="https://github.com/user-attachments/assets/5c951c13-31c9-4a37-aae5-f546561b3b02" />
</p>

<p>
<img width="1286" height="1508" alt="image" src="https://github.com/user-attachments/assets/07fd745c-1f36-4212-8c70-8cfc76ee8553" />
</p>

<p>
<img width="1262" height="1498" alt="image" src="https://github.com/user-attachments/assets/dc560f48-bab4-4550-a6c3-6e130f16b431" />
</p>

<p>
<img width="1282" height="1222" alt="image" src="https://github.com/user-attachments/assets/896c656f-32ce-420c-9131-4b1721e70304" />
</p>

<p>
<img width="1262" height="1430" alt="image" src="https://github.com/user-attachments/assets/48662566-87b0-4ea1-a496-e984289a6df2" />
</p>

<p>
<img width="1230" height="1426" alt="image" src="https://github.com/user-attachments/assets/17fa36c0-265d-495b-9400-0426809becc7" />
</p>


# o
                                                  Program-12

```
class ThreadTask1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Thread 1: " + i);
        }
    }
}

class ThreadTask2 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Thread 2: " + i);
        }
    }
}

class ThreadTask3 extends Thread { 
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Thread 3: " + i);
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) {

        ThreadTask1 t1 = new ThreadTask1();
        ThreadTask2 t2 = new ThreadTask2();
        ThreadTask3 t3 = new ThreadTask3();

        try {
            t1.start();
            t1.join();   // wait until Thread 1 completes

            t2.start();
            t2.join();   // wait until Thread 2 completes

            t3.start();
            t3.join();   // wait until Thread 3 completes

        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("All threads completed execution.");
    }
}
```

Output:

<img width="1246" height="1330" alt="image" src="https://github.com/user-attachments/assets/7c95e6c1-fa01-42a7-88ea-5da3299f3ef4" />



# p
                                                  Program-13

```
import javax.swing.*;
import java.awt.event.*;

public class AddTwoNumbersSwing {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Add Two Numbers");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel l1 = new JLabel("Enter First Number:");
        l1.setBounds(50, 30, 150, 25);

        JLabel l2 = new JLabel("Enter Second Number:");
        l2.setBounds(50, 70, 150, 25);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(50, 150, 300, 25);

        JTextField t1 = new JTextField();
        t1.setBounds(200, 30, 120, 25);

        JTextField t2 = new JTextField();
        t2.setBounds(200, 70, 120, 25);

        JButton addButton = new JButton("Add");
        addButton.setBounds(150, 110, 80, 30);

        addButton.addActionListener((ActionEvent e) -> {
            try {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sum = num1 + num2;
                resultLabel.setText("Result: " + sum);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter valid numbers!");
            }
        });

        frame.add(l1);
        frame.add(l2);
        frame.add(t1);
        frame.add(t2);
        frame.add(addButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}
```

Output:

<img width="766" height="426" alt="image" src="https://github.com/user-attachments/assets/15c7ce00-22ea-476d-a857-b51d26cfccd7" />


# q
                                                  Program-14

```
import javax.swing.*;
import java.awt.event.*;

public class SwingCalculator {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField t1 = new JTextField();
        t1.setBounds(50, 30, 120, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(200, 30, 120, 30);

        JButton add = new JButton("+");
        add.setBounds(50, 80, 60, 30);

        JButton sub = new JButton("-");
        sub.setBounds(120, 80, 60, 30);

        JButton mul = new JButton("*");
        mul.setBounds(190, 80, 60, 30);

        JButton div = new JButton("/");
        div.setBounds(260, 80, 60, 30);

        JLabel result = new JLabel("Result:");
        result.setBounds(50, 150, 300, 30);

        add.addActionListener((ActionEvent e) -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            result.setText("Result: " + (a + b));
        });

        sub.addActionListener((ActionEvent e) -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            result.setText("Result: " + (a - b));
        });

        mul.addActionListener((ActionEvent e) -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            result.setText("Result: " + (a * b));
        });

        div.addActionListener((ActionEvent e) -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            
            if (b != 0)
                result.setText("Result: " + (a / b));
            else
                result.setText("Cannot divide by zero");
        });

        frame.add(t1);
        frame.add(t2);
        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);
        frame.add(result);

        frame.setVisible(true);
    }
}
```

Output:

<p>
<img width="764" height="574" alt="image" src="https://github.com/user-attachments/assets/fee4f0a2-1102-4e7b-b0ce-cd0a08b5d818" />
</p>

<p>
<img width="768" height="576" alt="image" src="https://github.com/user-attachments/assets/aba373b0-cacb-4c73-a469-c20da55001ef" />
</p>

<p>
<img width="758" height="572" alt="image" src="https://github.com/user-attachments/assets/88a756f5-1315-48b2-8ec0-84b8bf516c40" />
</p>

<p>
<img width="760" height="574" alt="image" src="https://github.com/user-attachments/assets/307ade7f-2564-4bc9-b376-969ae2ef95bd" />
</p>


# r
                                                  Program-15

```
import javax.swing.*;
import java.awt.event.*;

class MatrixAddFrame extends JFrame {

    JTextField a11, a12, a21, a22;
    JTextField b11, b12, b21, b22;
    JLabel result;

    MatrixAddFrame() {

        setTitle("Matrix Addition");
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        a11 = new JTextField();
        a12 = new JTextField();
        a21 = new JTextField();
        a22 = new JTextField();

        b11 = new JTextField();
        b12 = new JTextField();
        b21 = new JTextField();
        b22 = new JTextField();

        JLabel l1 = new JLabel("Matrix A");
        l1.setBounds(50, 20, 100, 25);

        JLabel l2 = new JLabel("Matrix B");
        l2.setBounds(250, 20, 100, 25);

        a11.setBounds(50, 50, 50, 25);
        a12.setBounds(110, 50, 50, 25);
        a21.setBounds(50, 80, 50, 25);
        a22.setBounds(110, 80, 50, 25);

        b11.setBounds(250, 50, 50, 25);
        b12.setBounds(310, 50, 50, 25);
        b21.setBounds(250, 80, 50, 25);
        b22.setBounds(310, 80, 50, 25);

        JButton addBtn = new JButton("Add");
        addBtn.setBounds(180, 130, 100, 30);

        result = new JLabel("Result:");
        result.setBounds(50, 200, 400, 30);

        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int A[][] = new int[2][2];
                int B[][] = new int[2][2];
                int C[][] = new int[2][2];

                A[0][0] = Integer.parseInt(a11.getText());
                A[0][1] = Integer.parseInt(a12.getText());
                A[1][0] = Integer.parseInt(a21.getText());
                A[1][1] = Integer.parseInt(a22.getText());

                B[0][0] = Integer.parseInt(b11.getText());
                B[0][1] = Integer.parseInt(b12.getText());
                B[1][0] = Integer.parseInt(b21.getText());
                B[1][1] = Integer.parseInt(b22.getText());

                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        C[i][j] = A[i][j] + B[i][j];
                    }
                }

                result.setText("Result: [" + C[0][0] + " " + C[0][1] + "] [" + C[1][0] + " " + C[1][1] + "]");
            }
        });

        add(l1);
        add(l2);

        add(a11); add(a12); add(a21); add(a22);
        add(b11); add(b12); add(b21); add(b22);

        add(addBtn);
        add(result);

        setVisible(true);
    }
}

public class MatrixAdditionSwing {
    public static void main(String[] args) {
        new MatrixAddFrame();
    }
}
```

Output:

<img width="958" height="770" alt="image" src="https://github.com/user-attachments/assets/e0e7f245-9543-4de4-92fa-427c651493eb" />


# s
                                                  Program-16

```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapeDrawer extends JFrame implements ActionListener {

    private DrawPanel panel;

    public ShapeDrawer() {
        setTitle("Shape Drawer");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Drawing panel
        panel = new DrawPanel();
        add(panel, BorderLayout.CENTER);

        // Button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 5, 5, 5));

        String[] buttons = {
                "Circle", "Oval", "Rectangle", "Square", "Line",
                "Triangle", "Arc", "RoundRect", "Polygon", "Star"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.addActionListener(this);
            buttonPanel.add(btn);
        }

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panel.setShape(e.getActionCommand());
    }

    // Drawing Panel
    class DrawPanel extends JPanel {

        private String shape = "";

        public void setShape(String shape) {
            this.shape = shape;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.BLUE);

            switch (shape) {

                case "Circle":
                    g.drawOval(300, 100, 150, 150);
                    break;

                case "Oval":
                    g.drawOval(250, 120, 200, 120);
                    break;

                case "Rectangle":
                    g.drawRect(250, 100, 200, 120);
                    break;

                case "Square":
                    g.drawRect(300, 120, 150, 150);
                    break;

                case "Line":
                    g.drawLine(200, 200, 500, 200);
                    break;

                case "Triangle":
                    int[] tx = {300, 200, 400};
                    int[] ty = {100, 250, 250};
                    g.drawPolygon(tx, ty, 3);
                    break;

                case "Arc":
                    g.drawArc(250, 100, 200, 150, 0, 180);
                    break;

                case "RoundRect":
                    g.drawRoundRect(250, 120, 200, 120, 50, 50);
                    break;

                case "Polygon":
                    int[] px = {250, 300, 350, 400, 350, 300};
                    int[] py = {150, 100, 100, 150, 200, 200};
                    g.drawPolygon(px, py, 6);
                    break;

                case "Star":
                    int[] sx = {350, 370, 420, 380, 400, 350, 300, 320, 280, 330};
                    int[] sy = {100, 150, 150, 180, 230, 200, 230, 180, 150, 150};
                    g.drawPolygon(sx, sy, 10);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new ShapeDrawer();
    }
}
```

Output:

<img width="1564" height="1174" alt="image" src="https://github.com/user-attachments/assets/26f0e2f6-d76a-4908-bb40-442a4e3c425e" />


# t
                                                  Program-17

```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PaintBrush extends JFrame {

    private Color currentColor = Color.BLACK;
    private int brushSize = 5;

    public PaintBrush() {
        setTitle("Smooth Paint Brush");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        DrawArea drawArea = new DrawArea();
        add(drawArea, BorderLayout.CENTER);

        // Controls
        JPanel controls = new JPanel();

        JButton black = new JButton("Black");
        JButton red = new JButton("Red");
        JButton blue = new JButton("Blue");
        JButton green = new JButton("Green");

        black.addActionListener(e -> currentColor = Color.BLACK);
        red.addActionListener(e -> currentColor = Color.RED);
        blue.addActionListener(e -> currentColor = Color.BLUE);
        green.addActionListener(e -> currentColor = Color.GREEN);

        controls.add(black);
        controls.add(red);
        controls.add(blue);
        controls.add(green);

        JLabel label = new JLabel("Brush Size:");
        JSlider slider = new JSlider(1, 30, 5);

        slider.addChangeListener(e -> brushSize = slider.getValue());

        controls.add(label);
        controls.add(slider);

        add(controls, BorderLayout.SOUTH);

        setVisible(true);
    }

    // Line structure
    class Line {
        int x1, y1, x2, y2;
        Color color;
        int size;

        Line(int x1, int y1, int x2, int y2, Color color, int size) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.color = color;
            this.size = size;
        }
    }

    class DrawArea extends JPanel {

        private java.util.List<Line> lines = new ArrayList<>();
        private int lastX, lastY;

        public DrawArea() {
            setBackground(Color.WHITE);

            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    lastX = e.getX();
                    lastY = e.getY();
                }
            });

            addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent e) {

                    int x = e.getX();
                    int y = e.getY();

                    lines.add(new Line(lastX, lastY, x, y, currentColor, brushSize));

                    lastX = x;
                    lastY = y;

                    repaint();
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D) g;

            for (Line line : lines) {
                g2.setColor(line.color);
                g2.setStroke(new BasicStroke(line.size, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                g2.drawLine(line.x1, line.y1, line.x2, line.y2);
            }
        }
    }

    public static void main(String[] args) {
        new PaintBrush();
    }
}
```

Output:

<img width="1760" height="1176" alt="image" src="https://github.com/user-attachments/assets/bd5ef108-198a-4116-af7a-2d2d626630ce" />


# v
                                                  Program-18

```
package mypack;

public class Add {
    public int sum(int a, int b) {
        return a + b;
    }
}
package mypack;

public class Sub {
    public int subtract(int a, int b) {
        return a - b;
    }
}
package mypack;

public class Mul {
    public int multiply(int a, int b) {
        return a * b;
    }
}
package mypack;

public class Div {
    public int divide(int a, int b) {
        return a / b;
    }
}
package mypack;

public class Square {
    public int square(int a) {
        return a * a;
    }
}

//Main Method

import mypack.*;

public class Main {
    public static void main(String[] args) {
        Add a = new Add();
        Sub s = new Sub();
        Mul m = new Mul();
        Div d = new Div();
        Square sq = new Square();

        System.out.println("Addition: " + a.sum(10, 5));
        System.out.println("Subtraction: " + s.subtract(10, 5));
        System.out.println("Multiplication: " + m.multiply(10, 5));
        System.out.println("Division: " + d.divide(10, 5));
        System.out.println("Square: " + sq.square(5));
    }
}

```

Output:

<img width="642" height="214" alt="image" src="https://github.com/user-attachments/assets/4a45fba5-a038-4616-a773-79f87a8735f9" />


# w
                                                  Program-19

```
package mypack;

public class Add {
    public int sum(int a, int b) {
        return a + b;
    }
}
package mypack.subpack;

public class Square {
    public int square(int a) {
        return a * a;
    }
}
import mypack.Add;
import mypack.subpack.Square;

//Main

public class Main {
    public static void main(String[] args) {

        Add a = new Add();
        Square s = new Square();

        System.out.println("Addition: " + a.sum(10, 5));
        System.out.println("Square: " + s.square(5));
    }
}

```

Output:

<img width="520" height="88" alt="image" src="https://github.com/user-attachments/assets/32c646bd-b0f1-4210-94dc-d8b5ac282c21" />


# e
                                                  Program-20

```
public class Main {
    public static void main(String[] args) {

        try {
            int arr[] = new int[5];

            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;
            arr[3] = 40;
            arr[4] = 50;

            System.out.println("Accessing array elements:");
            for (int i = 0; i <= 5; i++) {  
                System.out.println("Element at index " + i + " = " + arr[i]);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System. out.println("Array Index Out Of Bounds Exception caught!");
            System. out.println("You tried to access an invalid index in the array.");
        }

        try {
            int a = 10;
            int b = 0;

            int result = a / b;  
            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            System. out.println("Arithmetic Exception caught!");
            System. out.println("Division by zero is not allowed.");
        }

        System.out.println("Program continues after handling exceptions.");
    }
}

```

Output:

<img width="816" height="348" alt="image" src="https://github.com/user-attachments/assets/c3a8774a-34b1-48fc-b896-4f0b750d9b43" />


# f
                                                  Program-21

```
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 25) {
            throw new InvalidAgeException("Age must be between 18 and 25.");
        } else {
            System. out.println("Valid age. Student allowed.");
        }
    }

    public static void main(String[] args) {

        int age = 16;  

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System. out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}

```

Output:

<img width="918" height="78" alt="image" src="https://github.com/user-attachments/assets/5525c068-9f95-49f5-8a16-3c7185b4c674" />


# g
                                                  Program-22

```
//Character-by-Character

import java.io.*;

public class CharFileCopy {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("source.txt");
            FileWriter fw = new FileWriter("dest_char.txt");

            int ch;

            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System. out.println("File copied using character stream");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

//Byte-by-Byte

import java.io.*;

public class ByteFileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("dest_byte.txt");

            int b;

            while ((b = fis.read()) != -1) {
                fos.write(b);
            }

            fis.close();
            fos.close();

            System. out.println("File copied using byte stream");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

```

Output:

<p>
<img width="710" height="48" alt="image" src="https://github.com/user-attachments/assets/66920324-fc36-4649-8762-1dab3344ff5a" />
</p>

<p>
<img width="694" height="58" alt="image" src="https://github.com/user-attachments/assets/fd8ba24e-618d-456b-a1b0-7f07b60b888b" />
</p>

# h
                                                  Program-23

```
interface Printer {
    void print();
}

abstract class Device {
    abstract void start();

    void stop() {
        System.out.println("Device stopped");
    }
}

class Computer extends Device implements Printer {
    void start() {
        System. out.println("Computer started");
    }

    public void print() {
        System.out.println("Printing from computer");
    }
}

public class Main {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.start();
        c.print();
        c.stop();
    }
}

```

Output:

<img width="616" height="104" alt="image" src="https://github.com/user-attachments/assets/f9809dc7-afef-46a4-b26c-bd69365ca950" />


# i
                                                  Program-24

```
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Main extends JFrame implements ActionListener {

    JTextField t1, t2, t4, t5, t6, t7, t8, t9;
    JRadioButton r1, r2;
    ButtonGroup bg;
    JPasswordField p1;
    JButton submit, reset;

    Connection con;
    PreparedStatement pst;

    Main() {
        setTitle("Registration Form (Oracle)");
        setSize(450, 550);
        setLayout(null);

        JLabel l1 = new JLabel("Name");
        l1.setBounds(50, 30, 100, 25);

        JLabel l2 = new JLabel("Father Name");
        l2.setBounds(50, 70, 100, 25);

        JLabel l3 = new JLabel("Gender");
        l3.setBounds(50, 110, 100, 25);

        JLabel l4 = new JLabel("Age");
        l4.setBounds(50, 150, 100, 25);

        JLabel l5 = new JLabel("Address");
        l5.setBounds(50, 190, 100, 25);

        JLabel l6 = new JLabel("Email");
        l6.setBounds(50, 230, 100, 25);

        JLabel l7 = new JLabel("Mobile");
        l7.setBounds(50, 270, 100, 25);

        JLabel l8 = new JLabel("Course");
        l8.setBounds(50, 310, 100, 25);

        JLabel l9 = new JLabel("Username");
        l9.setBounds(50, 350, 100, 25);

        JLabel l10 = new JLabel("Password");
        l10.setBounds(50, 390, 100, 25);

        t1 = new JTextField();
        t1.setBounds(180, 30, 150, 25);

        t2 = new JTextField();
        t2.setBounds(180, 70, 150, 25);

        t4 = new JTextField();
        t4.setBounds(180, 150, 150, 25);

        t5 = new JTextField();
        t5.setBounds(180, 190, 150, 25);

        t6 = new JTextField();
        t6.setBounds(180, 230, 150, 25);

        t7 = new JTextField();
        t7.setBounds(180, 270, 150, 25);

        t8 = new JTextField();
        t8.setBounds(180, 310, 150, 25);

        t9 = new JTextField();
        t9.setBounds(180, 350, 150, 25);

        r1 = new JRadioButton("Male");
        r1.setBounds(180, 110, 70, 25);

        r2 = new JRadioButton("Female");
        r2.setBounds(250, 110, 80, 25);

        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        p1 = new JPasswordField();
        p1.setBounds(180, 390, 150, 25);

        submit = new JButton("Submit");
        submit.setBounds(80, 440, 100, 30);

        reset = new JButton("Reset");
        reset.setBounds(220, 440, 100, 30);

        submit.addActionListener(this);
        reset.addActionListener(this);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(r1);
        add(r2);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(l6);
        add(t6);
        add(l7);
        add(t7);
        add(l8);
        add(t8);
        add(l9);
        add(t9);
        add(l10);
        add(p1);
        add(submit);
        add(reset);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {
            try {
                Class.forName("oracle.jdbc.OracleDriver");

                con = DriverManager.getConnection(
                        "jdbc:oracle:thin:@localhost:1521:xe",
                        "System",
                        "123");

                String gender = "";
                if (r1.isSelected()) {
                    gender = "Male";
                } else if (r2.isSelected()) {
                    gender = "Female";
                }

                String sql = "INSERT INTO registrationn VALUES (reg_seq.NEXTVAL, ?,?,?,?,?,?,?,?,?,?)";

                pst = con.prepareStatement(sql);

                pst.setString(1, t1.getText());
                pst.setString(2, t2.getText());
                pst.setString(3, gender);
                pst.setInt(4, Integer.parseInt(t4.getText()));
                pst.setString(5, t5.getText());
                pst.setString(6, t6.getText());
                pst.setString(7, t7.getText());
                pst.setString(8, t8.getText());
                pst.setString(9, t9.getText());
                pst.setString(10, new String(p1.getPassword()));

                int x = pst.executeUpdate();

                if (x > 0) {
                    JOptionPane.showMessageDialog(this, "Data Inserted Successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Insertion Failed!");
                }

                pst.close();
                con.close();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Age must be a number");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }

        if (e.getSource() == reset) {
            t1.setText("");
            t2.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
            p1.setText("");
            bg.clearSelection();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}

```

Output:

<p>
<img width="866" height="1074" alt="image" src="https://github.com/user-attachments/assets/843a8a88-83e6-4f24-b7b8-3301cccce3ad" />
</p>

# j
                                                  Program-25

```
import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        long fact = 1;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }
}


```

Output:

<img width="644" height="68" alt="image" src="https://github.com/user-attachments/assets/cc8ed5e1-575b-4594-8371-d57010b2ed51" />


```
import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, temp, remainder, sum = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        temp = n;

        while(temp != 0) {
            remainder = temp % 10;
            sum += remainder * remainder * remainder;
            temp /= 10;
        }

        if(sum == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
```

Output:

<img width="656" height="70" alt="image" src="https://github.com/user-attachments/assets/305b31bf-378b-4737-a640-f22259f327eb" />


```
import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, reverse = 0, remainder, temp;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        temp = n;

        while(temp != 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }

        if(reverse == n)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome");
    }
}

```

Output:

<img width="648" height="70" alt="image" src="https://github.com/user-attachments/assets/352ea813-d01c-4a86-a8b6-2eed0cef224f" />


```
import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, t1 = 0, t2 = 1, next;

        System.out.print("Enter number of terms: ");
        n = sc.nextInt();

        System.out.print("Fibonacci Series: " + t1 + " " + t2 + " ");

        for(int i = 3; i <= n; i++) {
            next = t1 + t2;
            System.out.print(next + " ");
            t1 = t2;
            t2 = next;
        }
    }
}

```

Output:

<img width="644" height="72" alt="image" src="https://github.com/user-attachments/assets/4e560cf0-3020-4136-b155-a1245c5b486e" />


```
class Pattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

```

Output:

<img width="550" height="162" alt="image" src="https://github.com/user-attachments/assets/999c9cd0-b60a-4e45-bb69-754532fce956" />

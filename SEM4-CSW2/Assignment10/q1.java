package assignment10;

class CalculatorThread extends Thread {
char operator;
double number1, number2;
CalculatorThread(char operator, double number1, double number2) {
this.operator = operator;
this.number1 = number1;
this.number2 = number2;
}
public void run() {
double result = 0;
switch (operator) {
case '+':
result = number1 + number2;
System.out.println(number1 + " + " + number2 + " = " + result);
break;
case '-':
result = number1 - number2;
System.out.println(number1 + " - " + number2 + " = " + result);
break;
case '*':
result = number1 * number2;
System.out.println(number1 + " * " + number2 + " = " + result);
break;
case '/':
if (number2 == 0) {
System.out.println("Error: Division by zero");
return;
}
result = number1 / number2;
System.out.println(number1 + " / " + number2 + " = " + result);
break;
default:
System.out.println("Error: Invalid operator");
}
}
}
public class q1 {
public static void main(String[] args) {
CalculatorThread t1 = new CalculatorThread('+', 5, 3);
CalculatorThread t2 = new CalculatorThread('-', 10, 4);
CalculatorThread t3 = new CalculatorThread('*', 7, 2);
CalculatorThread t4 = new CalculatorThread('/', 16, 4);
t1.start();
t2.start();
t3.start();
t4.start();
}
}
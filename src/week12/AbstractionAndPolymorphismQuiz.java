package week12;

public class AbstractionAndPolymorphismQuiz {
    public static void main(String[] args) {

        System.out.println("=============== Question 1 ===============");
        System.out.println("Q: Abstract class and Interface are the only ways to achieve abstraction.\nA: True");

        System.out.println("=============== Question 2 ===============");
        System.out.println("Q: What will be the result of the following code fragment?\nA: Compilation fails at line 2");

        /*
        public interface Test{

            public static void method1(){   // line 1
                System.out.println("Static Method");
            }

            public void method2(){  // line 2
                System.out.println("Instance Method");
            }

            public abstract void method3();    // line 3

            public void method4();  // line 4

        }
        */

        System.out.println("=============== Question 3 ===============");
        System.out.println("Q: What is the primary purpose of abstraction in Java?\nA: To hide implementation details and show only essential features");

        System.out.println("=============== Question 4 ===============");
        System.out.println("Q: It's a must for abstract classes to have at least one abstract method.\nFalse");

        System.out.println("=============== Question 5 ===============");
        System.out.println("Q: What will be the output of the following code fragments?\nCompilation fails at line1, line 2 and line 3");

        /*
        public abstract class Test {

            abstract void printSum(int a, int b);  // line 1

            final abstract void printSum(double a, double b);  // line 2

            public Test(){
                System.out.println("Constructor");
            }

            public static void main(String[] args) {
                Test obj = new Test();   // line 3
            }

        }
        */

        System.out.println("=============== Question 6 ===============");
        System.out.println("Q: What is the main purpose of the abstract method in Java?\nIt forces subclasses to provide their implementation.");

        System.out.println("=============== Question 7 ===============");
        System.out.println("Q: A class can only extend one abstract class but can implement multiple interfaces\nTrue");

        System.out.println("=============== Question 8 ===============");
        System.out.println("Q: Given the following classes: Which two options fail to compile when placed at line n1 of the main method?\nemployee.stockOption = 500;\n((Employee)employee).budget = 30_000;");

        /*
        public class Employee{
            public int salary;
        }


        public class Manager extends Employee{
            public int budget;
        }


        public class Director extends Manager{
            public int stockOptions;
        }


        public class Test{
            public static void main(String[] args) {
                Manager employee = new Director();
                // line 1

            }
        }
        */

        System.out.println("=============== Question 9 ===============");
        System.out.println("Q: Which of the following statements about interfaces in Java is true?\nClasses can implement multiple interfaces, promoting multiple inheritance.");

        System.out.println("=============== Question 10 ===============");
        System.out.println("Q: OOP principle Polymorphism only occurs when a parent class/interface is referenced to the child class' objects\nTrue");

        System.out.println("=============== Question 11 ===============");
        System.out.println("Q: Given the following classes: What will be the output of executing the Test class?\nClassCastException");

        /*
        public abstract class Shape{
            public abstract void draw();
        }


        public class Square extends Shape{
            @Override
            public void draw() {
                System.out.println("Drawing a square");
            }
        }


        public class Circle extends Shape{
            @Override
            public void draw() {
                System.out.println("Drawing a circle");
            }
        }


        public class Test{
            public static void main(String[] args) {
                Shape shape1 = new Circle();
                ((Square)shape1).draw();
            }
        }
        */

        System.out.println("=============== Question 12 ===============");
        System.out.println("Q: Which of the following is the advantage of Polymorphism?\nIt helps us to use a single reference variable name for different objects with different types.");

        System.out.println("=============== Question 13 ===============");
        System.out.println("Q: Given the following classes: What will be the output of executing the Test class?\ntrue\nfalse\ntrue");

        /*
        public abstract class Shape{
            public abstract void draw();
        }

        public class Square extends Shape{
            @Override
            public void draw() {
                System.out.println("Drawing a square");
            }
        }

        public class Circle extends Shape{
            @Override
            public void draw() {
                System.out.println("Drawing a circle");
            }
        }

        public class Test{
            public static void main(String[] args) {
                Shape shape = new Circle();
                System.out.println(shape instanceof Circle);
                System.out.println(shape instanceof Square);
                System.out.println(shape instanceof Object);
            }
        }
        */

        System.out.println("=============== Question 14 ===============");
        System.out.println("Q: Which of these keywords can be used to prevent the inheritance of a class?\nfinal");

        System.out.println("=============== Question 15 ===============");
        System.out.println("Q: In reference type castings, upcasting is done implicitly, and there is no need to use the casting operator. However, downcasting must be done explicitly; otherwise, compilation fails.\nTrue");

    }
}

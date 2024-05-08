package week11;

public class EncapsulationAndInheritanceShortQuiz {

    public static void main(String[] args) {
        System.out.println("=============== Question 1 ===============");
        System.out.println("Q: What will be the output of the following code fragment?\nA: Compilation Error");
        /*
            public class User{
                String company;
                String email;

                public User(){
                    System.out.println("Set the same company info.");
                    this("Cydeo");
                }

                public User(String company) {
                    this.company = company;
                }

                public static void main(String[] args) {
                    User user = new User();
                }
            }
         */

        System.out.println("=============== Question 2 ===============");
        System.out.println("Q: In Java, the _____ is used to declare a variable or method that belongs to the class, rather than an instance of the class.\nA: static");

        System.out.println("=============== Question 3 ===============");
        System.out.println("Q: What is the primary goal of encapsulation?\nA: To hide the internal details of an object and provide controlled access.");

        System.out.println("=============== Question 4 ===============");
        System.out.println("Q: The main purpose of public getter methods in encapsulation is to read and expose the internal data?\nA: true");

        System.out.println("=============== Question 5 ===============");
        System.out.println("Q: What is the main purpose of public setter methods in encapsulation?\nA: To modify the internal data.");

        System.out.println("=============== Question 6 ===============");
        System.out.println("Q: To achieve encapsulation in Java, we need to declare the variables and their getters & setters as private.\nA: False");

        System.out.println("=============== Question 7 ===============");
        System.out.println("Q: Given the following two classes:\nA: Compilation fails in the LogIn class.");

        /*
            public class Credentials {
                private String userName = "BugBusters";
                private String passWord = "WoodenSpoon";

                private String getUserName() {
                    return userName;
                }

                private String getPassWord() {
                    return passWord;
                }
            }

            public class LogIn{
                public static void main(String[] args) {
                    Credentials obj = new Credentials();
                    System.out.println(obj.getPassWord());
                }
            }
         */

        System.out.println("=============== Question 8 ===============");
        System.out.println("Q: Which of the following is not the advantage of OOP Encapsulation?\nA: It helps to reduce the length of the codes.");


        System.out.println("=============== Question 9 ===============");
        System.out.println("Q: Inheritance promotes the _____ relationship between classes, where a subclass _____  superclass?\nA: is-a");

        System.out.println("=============== Question 10 ===============");
        System.out.println("Q: Which of the following is not correct about Inheritance?\nA: Inheritance allows a subclass to access private members of the superclass.");

        System.out.println("=============== Question 11 ===============");
        System.out.println("Q: Which one is not allowed by Java for classes?\nA: Multiple Inheritance");

        System.out.println("=============== Question 12 ===============");
        System.out.println("Q: _____ is a fundamental concept in OOP that allows a subclass to provide a specific implementation for an instance method that is already defined in its superclass.\nA: Method Overriding");

        System.out.println("=============== Question 13 ===============");
        System.out.println("Q: Given the following classes: What will be the output of executing the Test class?\nA: Compilation fails in the Test class.");

    /*
        public class Test {
            protected void print(){
                System.out.println("Hello World!");
            }
        }

        public class Main extends Test{
            @Override
            void print(){
                System.out.println("Hello Cydeo");
            }
            public static void main(String[] args) {
                Main obj = new Main();
                obj.print();
            }
        }
    */


        System.out.println("=============== Question 14 ===============");
        System.out.println("Q: Which of the following is not the benefit of inheritance?\nA: It helps to improve the independence of classes.");

        System.out.println("=============== Question 15 ===============");
        System.out.println("Q: Given the following classes: What will be the output of executing the B class?\nA:\n10\n30");

        /*
        public class A {

            static int a;
            static int b;

            static {
                a = 10;
                b = 20;
            }
        }


        public class B extends A {

            static int a = 30;
            static int b = 40;

            public static void main(String[] args) {
                System.out.println(A.a);
                System.out.println(B.a);
            }
        }
    */

    }
}

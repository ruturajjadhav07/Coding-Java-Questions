//How do you swap two numbers without using a third variable in Java.....Elaborate.



public class SwapNumbers {

        public static void main(String[] args) {
            int a = 10;
            int b = 20;

            System.out.println("Before swapping a is " + a + " and b is " + b);

            a = a + b;
            System.out.println("\nThe value of a now is "+a);                            // here a becomes 30 after passing both a and b value to a variable

            b = a - b;
            System.out.println("\nThe value of b now is "+b);                            // here b becomes 10 after passing both a  and b value.
                                                                                         // But here the value of a is taken from first equation

            a = a - b;
            System.out.println("\nThe value of a  "+a);                                  // here value of a will be 20.It take value of a and b for above both equations.

            System.out.println("\nAfter swapping, a is " + a + " and b is " + b);        //After swapping as it is mentioned it gets valued by solved equations
        }


}

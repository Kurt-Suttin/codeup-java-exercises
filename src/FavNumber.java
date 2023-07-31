public class FavNumber {
    public static void main(String[] args) {
        // Create an int variable named myFavoriteNumber and assign your favorite number to it


        //Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.

//        int myFavoriteNumber = 5;
//        System.out.println(myFavoriteNumber);

        //Create a String variable named myString and assign a string value to it, then print the variable out to the console.

//        String myString = "approved!";
//        System.out.println(myString);

        //Change your code to assign a character value to myString. What do you notice?

//        String myString = 'a';
//        System.out.println(myString);

        //Change your code to assign the value 3.14159 to myString. What happens?

//        String myString = "3.14159";
//        System.out.println(myString);

        //Declare a long variable named myNumber, but do not assign anything to it.

//        long  myNumber;
//        System.out.println(myNumber);

//        Change your code to assign the value 3.14 to myNumber. What do you notice?
        //CASTING EXAMPLE
//        long myNumber = (long) 3.14;
//        System.out.println(myNumber);

//        Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

//        long myNumber = 123L ;
//        System.out.println(myNumber);

// Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

//        float myNumber = 3.14F ;
//        System.out.println(myNumber);

        //Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        float myNumber = 3.14F ;
//        System.out.println(myNumber);

//        float myNumber = (float) 3.14 ;
//        System.out.println(myNumber);

/// Copy and paste the following code blocks one at a time and execute them


//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);


//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
        //Try to create a variable named class. What happens?
        // doesn't work

//        Object is the most generic type in Java. You can assign any value to a variable of type Object.
//        What do you think will happen when the following code is run?

//        String theNumberThree = "three";
//        System.out.println(theNumberThree);
//        Object o = theNumberThree;
//        System.out.println(o);
//        int three = (int) o;
//        System.out.println(three);

////    run time error
//
//        How is the above example different from the code block below?
//
//
//        int three = (int) "three";


//        What are the two different types of errors we are observing?

        // Runtime & Compilation errors

//        Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
//        x = x + 5;

//        int x = 4;
//        x += 5;
//        System.out.println(x);

        //////
        //     int x = 3;
        //     int y = 4;
        //     y = y * x;
        ////

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

//////////////
//
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;



        //

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(y);
        /////////
        //What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?
        // What happens if you increment a numeric variable past the type's capacity?
//btye exampleByte = -200;
//// this throw a compilation error

        byte exampleByte = 127;
//        exampleByte;
        System.out.println(exampleByte);
    }
}

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        ///Create an array that holds 3 Person objects.
        // Assign a new instance of the Person class to each element.
        // Iterate through the array and print out the name of each person in the array.


        String[] people = new String[3];
        Person kurt = new Person("Kurt");
        Person ted = new Person("Ted");
        Person eddy = new Person("Eddy");

        people[0] = kurt.getName();
        people[1] = ted.getName();
        people[2] = eddy.getName();


        for (String person : people) {
            System.out.println(person);
        }
//Create a static method named addPerson.



// It should accept an array of Person objects,
// as well as a single person object to add to the passed array.
// It should return an array whose length is 1 greater than the passed array,
// with the passed person object at the end of the array.

    }
    public static String[] addPerson (String[]oldArray, String newPerson){
        ///copying old array and adding 1 extra index in the array
        String[] newArray = Arrays.copyOf(oldArray, oldArray.length + 1);
        /// pushes (newPerson) to end of array
        newArray[newArray.length - 1] = newPerson;
        // return new version of array
        return newArray;
    }


}

public class ServerNameGenerator {

//    Create two arrays whose elements are strings: one with at least 10 adjectives,
//    another with at least 10 nouns.

    String[] adjectives = new String[10];
    String[] nouns = new String[10];

//    Create a method that will return a random element from an array of strings.

    public String getRandomElement(String[] array) {
        // Get the length of the array
        int length = array.length;

        // Generate a random index between 0 and the length of the array
        int index = (int) (Math.random() * length);

        // Return the element at the random index
        return array[index];
    }




// Add a main method, and inside of your main method select random noun


    public static void main(String[] args) {
//
//        nouns[0] = mall.getRandomElement();

    }

//    Add a main method, and inside of your main method select random noun
//    and adjective and hyphenate the combination
//    display the generated name to the user.

}

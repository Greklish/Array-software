package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class one{
    public static Scanner sc = new Scanner(System.in);
    public static Scanner sc1 = new Scanner (System.in);
    public static char[] charArray1 = {'s', 't', 'r', 'i', 'n', 'g'};
    public static char[] charArray2 = {'s', 'i', 'n', 'g'};
    public static char [] test =new char [50];
    public static char [] test2 =new char [50];
    public static ArrayList<String> stringList = new ArrayList<String>(1);
    public static String stringInput;
    public static boolean remove = true;
    public static boolean ran = false;


    //array som ska randomize i int valet
    public static char [] alfabetArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','y','z'};



    public static void main(String[] args) {

        //program valet!
        boolean quit = false;

        System.out.println("Enter 1 for 'Regular' or 2 for 'Randomize': ");
        while(!quit){
            int actions = sc.nextInt();
            sc.nextLine();
            switch (actions) {

                case 0:
                    quit = true;
                    break;
                case 1:
                    printAll();
                    break;
                case 2:
                    random();
                    ran = true;
                    printAll();
                    break;
            }
        }
    }

    private static boolean detectTInArray(char[] input) {
        int i;

        // i += 1 för att loopa alla arrayer
        for (i = 0; i < input.length; i += 1) {

            toUppercase(input);
        }
        if(!remove){
        removeDuplicate(input);}

        return true;
    }

    private static void toUppercase(char[] input) {
        int i;

        for (i = 0; i < input.length; i++) {
            if (input[i] == 't') {
                input[i] = 'T';

            }

        }
    }

    private static char[] tranformRToT(char[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 'r') {
                input[i] = 't';

            }
        }

        return input;

    }

    public static char[] removeDuplicate (char [] characters) {
        for (int i = 0; i < characters.length; i++) {
            for (int k = i + 1; k < characters.length; k++) {
                if (k != i && characters[k] == characters[i]) {
                    characters[i] -= characters[k];
                }
            }
        }
        return characters;
    }

    public static char[] Emoment(char[] input) {
        Scanner sc = new Scanner(System.in);

        String inputString;
        boolean wrong = true;


        while (wrong) {
            if (!ran) {
                System.out.println("Vad vill du lägga in?:");
                inputString = sc.nextLine();
                input = inputString.toCharArray();
                if (inputString.isEmpty()) {
                    System.exit(0);
                }
                if (input.length > 3) {
                    System.out.println("Man får bara ha högst 3 värden ");

                } else {
                    System.out.println("Välj plats 0-2 ");
                    int input2 = sc1.nextInt();


                    System.out.println("Vad vill du ändra till? ");
                    char input3 = sc1.next().charAt(0);
                    stringInput = String.valueOf(input3);


                    for (int i = 0; i < input.length; i++) {
                        if (i == input2) {
                            input[i] = input3;
                        }
                    }
                }
                System.out.println("e): " + Arrays.toString(input));
                StringArray();

                //rekursion(stringList.size());
                System.out.println("g) (Rekursion): " + rekursion(stringList.size()));
            } else {
                input = test;
                System.out.println("Välj plats 0-2 ");
                int input2 = sc1.nextInt();


                System.out.println("Vad vill du ändra till? ");
                char input3 = sc1.next().charAt(0);
                stringInput = String.valueOf(input3);


                for (int i = 0; i < input.length; i++) {
                    if (i == input2) {
                        input[i] = input3;
                    }
                }
            }
            System.out.println("e): " + Arrays.toString(input));
            StringArray();

            //rekursion(stringList.size());
            System.out.println("g) (Rekursion): " + rekursion(stringList.size()));
        }



return input;

}




        public static boolean areEqual ( char arr1[], char arr2[])
        {
            int n = arr1.length;
            int m = arr2.length;

            // If lengths of array are not equal means
            // array are not equal
            if (n != m) {
                return false;
            }

            // Linearly compare elements
            for (int i = 0; i < n; i++)
                if (arr1[i] != arr2[i]) {
                    return false;
                }

            // If all elements were same.
            return true;
        }



        public static String rekursion(int n){

            if(n>0){



                return "" + stringList.toArray()[n-1]+rekursion(n-1);

            } else{

                return "";
            }
        }

        public static void StringArray() {

                stringList.add(stringInput);
                System.out.println("f) String Array: " + stringList);



        }
        public static char[] random(){

            int input;
            Scanner sc = new Scanner(System.in);
            System.out.println(" Hur många bokstäver: ");
            input= sc.nextInt();
            for (int t = 1; t <= input; t++) {
                Random rnd = new Random();
                char c = (char) (rnd.nextInt(26) + 'a');
                test2[t] = c;
                test[t] += test2[t];
            }
            System.out.println( test);

            return  test;

        }
        public static void printAll(){
            //prints original arrays
            System.out.println("Array 1 original: " + Arrays.toString(charArray1) +
                    "\n" + "Array 2 original: " + Arrays.toString(charArray2));

            // metod som ändrar alla "r" till "t"
            tranformRToT(charArray1);
            System.out.println("a) Array 1 (All 'r' changes to 't'): " + Arrays.toString(charArray1) +
                    "\n" + "a) Array 2 (All 'r' changes to 't'): " + Arrays.toString(charArray2));


            detectTInArray(charArray1);
            detectTInArray(charArray2);


            System.out.println("b) Array 1 (t gets uppercase): " + Arrays.toString(charArray1) +
                    "\n" + "b) Array 2 (t gets uppercase): " + Arrays.toString(charArray2));

            remove=false;
            detectTInArray(charArray1);
            detectTInArray(charArray2);

                System.out.println("c) (remove duplicates) " +  Arrays.toString(charArray1)+
                        "\n" + "c) (remove duplicates) " + Arrays.toString(charArray2));



            //d)
            if (areEqual(charArray1, charArray2)) {
                System.out.println("d) Array 1 and 2 are identical");
            } else {
                System.out.println("d) Array 1 and 2 are not identical");
            }

            //6 står för antal platser i arrayen, mindre än 6 visas inte printrekursion(6);

            Emoment(charArray1);
        }


    }




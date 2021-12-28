import java.util.Scanner;
import java.util.Arrays;

public class Tester {
    public static void main (String[] args){
        String name = "Citrine";
        char symbol = '!';
        System.out.println(ANSI_YELLOW + name + symbol + ANSI_RESET);
        //Initialization of Methods commented out to prevent initialization
       // math();
       // Dog();
       // Sq();
        //Jh();
        //NH();
       // GAss();
       // Case();
      // Loops();

    }
    static void math(){
        double b;
        double c;
        double a;
        
 
        b = 27;
        a = b* 4 - 8;
        b = 2 + a / 3.14;
        c = 5.6 * b* a;
    System.out.println(c);
    }
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    static void Dog(){
    
        String Breedable;
        Scanner fetch = new Scanner(System.in);
        System.out.println("Enter User Name:");
        String user = fetch.nextLine();

        Breedable = "Dog + Cow + Your Fat Ass = " + user;
        if (user.equals("Citrine")){        
            System.out.println(ANSI_YELLOW + "Limey!!" + ANSI_RESET);
        } else {
            System.out.println(Breedable);
        }
        fetch.close();

    }
    static void Sq(){
    String[] newArr = new String[6];

    newArr[0] = "Hello";
    newArr[1] = "I";
    newArr[2] = "am";
    newArr[3] = "not";
    newArr[4] = "good";
    newArr[5] = "yet";

    int[] nums ={2,3,4,5,6};
    int v = nums[3];

    String e = newArr[1]; 
    System.out.println(e);
    System.out.println(v);

    //{1,16,25,35,65,79}

    }
    static void Jh(){
        int[] arr = {1,3,5,7,9,10};

        for (int i = 0; i< arr.length; i++ ){
            if (arr[i] == 5){
            System.out.println(i);
            }
        }
       // int count =  0;
        
    }

    static void NH(){
        //int number;
       // number = 10;
        char gh = 'i';
        int ascii = gh;
        int castAscii = (int)gh;
        System.out.print(ascii);
        System.out.print(castAscii);
    }

    static void GAss(){
        Scanner Grade = new Scanner(System.in);
            int grade = Grade.nextInt();
        if (grade >= 90){
            System.out.println("Grade is a A");
        }else if (grade >= 75){
            System.out.println("Grade is a B");
        }else if(grade >= 65){
            System.out.println("Grade is a C");
        }
        Grade.close();
    }
    static void Case(){
        int number = 44;
        String size;
        switch (number) {

        case 29:
          size = "Small";
          break;
  
        case 42:
          size = "Medium";
          break;
  
        // match the value of week
        case 44:
          size = "Large";
          break;
  
        case 48:
          size = "Extra Large";
          break;
        
        default:
          size = "Unknown";
          break;
  
      }
      System.out.println("Size: " + size);
    }
    static void Loops() {
      //For Each Looping different from for looping seen above
        // create an array
        int[] numbers = {3, 7, 5, -5};
        
        // iterating through the array 
        for (int number: numbers) {
           System.out.println(number);
        }
      }

  }
  class Cevin {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3}, 
            {4, 5, 6, 9}, 
            {7}, 
      };
   //Multi dimesional array and how its counted
   //for (int[] lastArray: a) {
    // second for...each loop access each element inside the row
  //  for(int data: lastArray) {
        System.out.println(a[2][0]);
    }
//}
   
      char[] vowels = {'a', 'e', 'i', 'o', 'u'};
      int[] vowells = {'a', 'e', 'q', 'o', 'u'}; //prints out ascii of char instead of number funny mistake
     
      // iterating through an array using the for-each loop
    //  for (int item: vowells) {
     //   System.out.println(item);
    //  }
    }
   

   class McGraw {
    public static void main(String[] args) {
        int[] n1 = {2, 3, 12, 4, 12, -2};
      
        int[] n3 = new int[5];

        // Creating n2 array of having length of n1 array
        int[] n2 = new int[n1.length];
      
        // copying entire n1 array to n2
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));  
      
        // copying elements from index 2 on n1 array
        // copying element to index 1 of n3 array
        // 2 elements will be copied
        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("n3 = " + Arrays.toString(n3));  
    }
}


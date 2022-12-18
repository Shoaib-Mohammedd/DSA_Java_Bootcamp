public class ArrayList {
    public static void main(String[] args) {
        int [] arr = new int[5];

        int [] rose ; // declaration of array rose is getting defined in stack

        rose = new int[7]; // initialization object is created in the heap memory

        System.out.println( arr[3]);
        System.out.println( rose[3]);

        // String arrays
        String [] names = new String[6];
        System.out.println( names[3]); // so it returns Null value because we didn't initialize it


    }
}

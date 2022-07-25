public class Break_continue {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.println(i);
            System.out.println("Chalte raho");
            if (i==3){
                System.out.println("Ending the loop.");
                break;                          // Breaks the loop.
            }
        }

        // for(int i=0; i<5; i++){
        //     if (i==3){
        //         System.out.println("3 will execute till \"continue\" only.");
        //         continue;
        //     }
        //         System.out.println(i);
        //         System.out.println("Chalte raho");
        // }

    }
}

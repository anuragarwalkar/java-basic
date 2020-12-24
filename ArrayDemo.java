public class ArrayDemo {
   public static void main(String[] args) {
    int items[] = {8, 12, 76, 54};
    int a[] = {1, 2, 3 , 4};
    int b[] = {2, 4, 6 , 8};
    int c[] = {5, 6, 7, 8};

    int d[][] = {
        {1, 2, 3, 4},  // Jagged Arrays
        {2, 4, },
        {5, 7, 8} 
    };

    System.out.println(d[0][0]);
   } 
}

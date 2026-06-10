public class LoopInterchangeable {
    public static void main(String[] args) {
        System.out.println("Answer: TRUE");
        System.out.println("Any task done with a for loop can also be done");
        System.out.println("using while or do-while loops, and vice versa.");
        System.out.println("All three loop types are functionally interchangeable.");

        // Example: print 1-5 using all three loops

        System.out.println("\nUsing for loop:");
        for (int i = 1; i <= 5; i++)
            System.out.print(i + " ");

        System.out.println("\nUsing while loop:");
        int i = 1;
        while (i <= 5)
            System.out.print(i++ + " ");

        System.out.println("\nUsing do-while loop:");
        int j = 1;
        do {
            System.out.print(j++ + " ");
        } while (j <= 5);
    }
}

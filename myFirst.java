import java.util.Scanner;
public class myFirst{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("enter your age");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("your name is "+name+"\tyou are eligible to vote");
        }
        else{
            int ch=18-age;
            System.out.println("sorry!! "+name+"\tyou are not eligible to vote"+"\tyou can try after "+ch+" years");
        } 
        sc.close();

    }
}

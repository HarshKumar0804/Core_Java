package StudentDetails;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        s1.setId(id);
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        s1.setName(name);

        System.out.print("Enter Gender: ");
        char gender = sc.nextLine().charAt(0);
        s1.setGender(gender);

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();
        s1.setBranch(branch);

        System.out.println(s1);
    }
}

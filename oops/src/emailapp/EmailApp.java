package emailapp;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {
        String department;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of the Student ");
        String firstName = sc.next();
        String lastName = sc.next();
        System.out.println("If you want to set alternate email press 1 else press 0");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter alternate Email");
            sc.nextLine();
            String alt = sc.nextLine();
            System.out.println("DEPARTMENT CODES:\n1 for Faculty\n2 for Student\n3 for External Faculty\nEnter department code:");
            Scanner in = new Scanner(System.in);
            int depChoice = in.nextInt();
            if (depChoice == 1) {
                department = "faculty";
            } else if (depChoice == 2) {
                department = "student";
            } else if (depChoice == 3) {
                department = "externalfaculty";
            } else {
                department = "";
            }

            Email em1 = new Email(firstName, lastName , department);
            System.out.println(em1.showInfo());
            em1.setAlternateEmail(alt);
            System.out.println("Alternate Email: " + em1.getAlternateEmail());

        } else {
            System.out.println("DEPARTMENT CODES:\n1 for Faculty\n2 for Student\n3 for External Faculty\nEnter department code:");
            Scanner in = new Scanner(System.in);
            int depChoice = in.nextInt();
            if (depChoice == 1) {
                department = "faculty";
            } else if (depChoice == 2) {
                department = "student";
            } else if (depChoice == 3) {
                department = "externalfaculty";
            } else {
                department = "";
            }
            Email em1 = new Email(firstName, lastName , department);
            System.out.println(em1.showInfo());
        }

       /* em1.setAlternateEmail("js@gmail.com");
        System.out.println(em1.getAlternateEmail());*/

    }


}

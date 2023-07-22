package emailapp;


import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;

    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 5 ;
    private String alternateEmail;
    private String companySufix = "adaniuniversity.com";

    //Constructor to receive firstname and lastname
    public Email(String firstName , String lastName ,String department ){
        this.firstName = firstName;
        this.lastName = lastName;
       // System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName + department + companySufix);

        //call a method asking for the department -- return the department
        //this.department=setDepartment();
       /* if(this.department.equals("")){
            System.out.println("Department: " +"Not Valid");
        }else {
            System.out.println("Department: " + this.department);
        }*/

        //Call a method that returns a random password
        if(department.equals("")){
            this.password = "Not Valid For Password";
            //System.out.println("Password :" + this.password);
        }else {
            this.password = randomPassword(defaultPasswordLength);
            //System.out.println("Your Password is: " + this.password);
        }

        //Combine elements to generate email
        if(department.equals("")){
            this.email = "Not Valid";
           // System.out.println("Email: " + this.email);
        }else {
            this.email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + companySufix;
            //System.out.println("Your email is:" + email);
        }
    }

    //Ask for the department
    /*private String setDepartment(){
        System.out.println("DEPARTMENT CODES:\n1 for Faculty\n2 for Student\n3 for External Faculty\nEnter department code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice==1){
            return "faculty";
        }else if(depChoice==2){
            return "student";
        }else if(depChoice==3){
            return "externalfaculty";
        }else{
            return "";
        }
    }*/

    //Generate a random password
    private String randomPassword(int length ){
        String passwordSet = "abcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        char[] password = new char[length];
        for(int i = 0;i<length;i++){
            int rand = (int)(Math.random()* passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }

    //Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }


    //Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }



    //Change the password
    public void changePassword(String password){
        this.password = password;
    }
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOLLEGE EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb" +
                "\nPassword: " + password;

    }


}

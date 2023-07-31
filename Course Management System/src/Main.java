
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Duc Dat
 */
public class Main {
    public static void main(String[] args) {
        CoLi c = (CoLi) new CourseList();
        ArrayList<Course> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("COURSE MANAGEMENT SYSTEM");
        System.out.println("1. A list of all available courses in the system");
        System.out.println("2. Search and display information of a course by course id");
        System.out.println("3. Record/Add information of course");
        System.out.println("4. Sort all courses by number of credit as ascending");
        System.out.println("5. Update information of a specific course (by course id)");
        System.out.println("0. Exit");
        
        list.add(new Course("PRO192", "OOP with Java", 5));
        list.add(new Course("MAD101", "Discrete mathematics", 4));
        list.add(new Course("OSG202", "Operating Systems", 3));
        list.add(new Course("SSG104", "Communication and In-Group Working Skills", 2));
        list.add(new Course("NWC203c", "Computer Networking", 1));
        
        list.add(new Course("MAE101", "Mathematics for Engineering", 4));
        list.add(new Course("PRF192", "Programming Fundamentals", 5));
        list.add(new Course("CEA201", "Computer Organization and Architecture", 3));
        list.add(new Course("CSI104", "Introduction to Computer Science", 2));
        list.add(new Course("SSL101c", "Academic Skills for University Success", 1));
        
        
        while (true) {
            int choice = 0;
            System.out.print("Selection your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    c.listAll(list);
                    break;                
                case 2:
                    System.out.print("Enter course id: ");
                    String str = sc.nextLine();
                    c.search(list, str);
                    break;
                case 3:
                    c.add(list);
                    break;
                case 4:
                    c.sort(list);
                    break;
                case 5:
                    System.out.print("Enter course id: ");
                    String s = sc.nextLine();
                    c.update(list, s);
                    break;                    
                case 0:
                    System.out.println("Bye Bye !!!!!!!!!");
                    System.exit(0);
                    break;
            }  
        }
    }
}

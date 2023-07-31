
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
public class CourseList implements CoLi {

    public CourseList() {
    }

    @Override
    public void listAll(ArrayList<Course> list) {
        for (Course o : list) {
            System.out.println(o);
        }
    }

    @Override
    public void search(ArrayList<Course> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equalsIgnoreCase(str)) {
                System.out.println("Information of course");
                System.out.println(list.get(i));
            }
        }
    }

    @Override
    public void add(ArrayList<Course> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course id: ");
        String id = sc.nextLine();
        System.out.print("Enter course name: ");
        String name = sc.nextLine();
        System.out.print("Enter course credit: ");
        int credit = Integer.parseInt(sc.nextLine());
        
        Course c = new Course(name, id, credit);
        list.add(c);
    }

    @Override
    public void sort(ArrayList<Course> list) {
        Collections.sort(list, new Comparator<Course>(){
            @Override
            public int compare(Course o1, Course o2) {
                return o1.getCredit() - o2.getCredit();
            }
        });
        for (Course o : list) {
            System.out.println(o);
        }
    }

    @Override
    public void update(ArrayList<Course> list, String str) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equalsIgnoreCase(str)) {
                System.out.println("Information of course");
                System.out.println(list.get(i));
                System.out.print("Enter new course credit: ");
                list.get(i).setCredit(Integer.parseInt(sc.nextLine()));
                System.out.println("Information of course has been updated");
            }
        }
    }
    
    
}

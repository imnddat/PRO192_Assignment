
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Duc Dat
 */
public interface CoLi {
    public void listAll(ArrayList<Course> list);
    public void search(ArrayList<Course> list, String str);
    public void add(ArrayList<Course> list);
    public void sort(ArrayList<Course> list);
    public void update(ArrayList<Course> list, String str);
}

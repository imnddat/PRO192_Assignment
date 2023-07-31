

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Duc Dat
 */
public class Course {
    private int credit;
    private String id;
    private String name;

    public Course() {
    }

    public Course(String id, String name, int credit ) {
        this.credit = credit;
        this.id = id;
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-50s%5d", id, name, credit);
    }
    
    
}

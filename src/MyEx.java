/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shyam
 */
class Emp {

    private Integer id;

    private Integer phone;

    private String name;

    private String address;

    public void display(Integer id, Integer phone, String name, String address) {

        this.id = id;
        this.phone = phone;
        this.name = name;
        this.address = address;

    }
}

public class MyEx {

    public static void main(String[] args) {

        Emp e1 = new Emp();

        e1.display(101, 1232345432,"Ricky","Alabama");
}
}


package com.company;

import com.company.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ContainerDAO con = new ContainerDAO();
        con.add(3);
        con.add(4);
        con.add(5);
        con.add(6);
        con.print();
        con.delete(5);
        System.out.println(con.show());
    }
}

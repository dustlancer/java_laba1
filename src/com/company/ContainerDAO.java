package com.company;

import com.company.NumbersNode;


import java.util.ArrayList;


public class ContainerDAO {
    private NumbersNode head;
    private NumbersNode tail;

    public void add(int number)
    {
        if (head==null)
        {
            head=new NumbersNode();
            tail=new NumbersNode();
            head.setNumber(number);
            head.setNext(null);
            tail=head;
        }else {
            tail.setNext(new NumbersNode());
            tail.getNext().setNumber(number);
            tail.getNext().setNext(null);
            tail=tail.getNext();
        }
    }

    public void delete(int number)
    {
        NumbersNode current=head;
        NumbersNode precurrent=head;
        while(current!=null)
        {
            if(current.getNumber()==number && current==head)
            {
                head=head.getNext();
                current=null;
                current=head;
            }else if(current.getNumber()==number && current!=tail)
            {
                precurrent.setNext(current.getNext());
                current=null;
                current=precurrent.getNext();
            } else if (current.getNumber()==number) {
                tail=precurrent;
                current=null;
            }
            if(current!=null) {
                precurrent = current;
                current = current.getNext();
            }
        }
    }
    public void print()
    {
        NumbersNode current=head;
        while (current!=null)
        {
            System.out.println(current.getNumber());
            current=current.getNext();
        }
    }

    public ArrayList<Integer> show()
    {
        ArrayList<Integer> res=new ArrayList<>();
        NumbersNode current=head;
        while (current!=null)
        {
            res.add(current.getNumber());
            current=current.getNext();
        }
        return res;
    }
}

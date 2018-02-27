package Kap11Exercise2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Opgave2
{
    /*
    Write a method called alternate that accepts two Lists as its parameters and returns a new List
    containing alternating elements from the two lists, in the following order:
    */

    public static void main(String[] args)
    {
        List<Integer>test1 = new LinkedList<Integer>();
        for (int i = 0; i < 10 ; i++) {
            test1.add(i + 1);
        }

        List<Integer>test2 = new LinkedList<Integer>();
        for (int i = 50; i < 80 ; i++) {
            test2.add(i + 1);
        }
        System.out.println("Første liste:\n" + test1);

        System.out.println("Anden liste:\n" + test2);

        System.out.println("Kombineret liste:\n" + alternate(test1, test2));
    }

    public static List<Integer> alternate(List<Integer> listOne, List<Integer> listTwo)
    {
        Iterator<Integer> iterator1 = listOne.iterator();
        Iterator<Integer> iterator2 = listTwo.iterator();
        List<Integer> returningList = new ArrayList<Integer>();

        while(iterator1.hasNext() || iterator2.hasNext())
        {
            if (iterator1.hasNext())
            {
                returningList.add(iterator1.next());
            }

            if (iterator2.hasNext())
            {
                returningList.add(iterator2.next());
            }
        }
        return returningList;
    }
}
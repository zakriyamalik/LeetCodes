package Recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EleminationGame {
    List<Integer> arr=new ArrayList<>();
    int bit=0;
    int counter=0;
    int res;
    int current=0;

    public int lastRemaining(int n) {
        for(int i=0;i<n;i++)
        {
            arr.add(i);
        }
        return check2(arr,current,n);

    }

    private int check2(List<Integer> arr,int current,int n) {
        if(current>=n/2||current<=0&&arr.size()!=n)
        {
            if(arr.size()==1)
            {
                return arr.getFirst();
            }
            else
            {
                current=arr.size();
                bit=1;
                check2(arr,current,n);

            }
        }
        if(bit==0)
        {
            System.out.println(current);
            arr.remove(arr.get(0));
            current+=2;

            res=check2(arr,current,n);
        }
        else
        {

            arr.remove(arr.get(current));
            current-=2;
            res=check2(arr,current,n);
        }

        return res;
    }

    public static void main(String[] args) {
        EleminationGame eleminationGame=new EleminationGame();
        int n=eleminationGame.lastRemaining(9);
        System.out.println("Number is \t"+n);
    }
}

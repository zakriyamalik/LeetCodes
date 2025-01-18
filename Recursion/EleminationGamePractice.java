package Recursion;

import java.util.ArrayList;
import java.util.List;

public class EleminationGamePractice { List<Integer> arr=new ArrayList<>();
    int bit=0;
    int res;
    int current=0;

    public int lastRemaining(int n) {
        for(int i=0;i<n;i++)
        {
            arr.add(i+1);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr.get(i));
        }

        return check2(arr,current,n);

    }

    private int check2(List<Integer> arr,int current,int n) {
        if (arr.size()==1)
        {
            return arr.getFirst();
        }

        if(current>n/2||current<=0&&arr.size()!=n)
        {
            if(arr.size()==2)
            {
                arr.removeFirst();
                return arr.getFirst();
            }
            if (bit == 0) {
                current = arr.size();
                bit = 1;
                return check2(arr, current, n);
            } else {
                current = 0;
                bit = 0;
                return check2(arr, current, n);
            }

        }
        if(bit==0)
        {
           System.out.println(current);
            arr.remove(arr.get(current));
            current+=1;

            res=check2(arr,current,n);
        }
        else
        {
            arr.remove(arr.get(current-1));
            current-=2;
            res=check2(arr,current,n);
        }

        return res;
    }

    public static void main(String[] args) {
        EleminationGamePractice eleminationGame=new EleminationGamePractice();
        int n=eleminationGame.lastRemaining(4);
        System.out.println("Number is \t"+n);
    }
}

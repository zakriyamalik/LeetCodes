package Recursion;

import java.util.ArrayList;
import java.util.List;

public class decodeString {
    List<Integer> sizes=new ArrayList<>();
    int curr_index=0;
    String decoded="";
    List<Integer> starts=new ArrayList<>();
    public String decodeString(String s) {
        return check2(s);


    }

    private String check2(String s) {
        if(curr_index>=s.length())
        {

            return decoded;
        }
        if(Character.isDigit(s.charAt(curr_index)))
        {
            String Tempsize = checkSize(s);
            int size = Integer.parseInt(Tempsize);
            //int size=Integer.parseInt(String.valueOf(s.charAt(curr_index)));
            sizes.add(size);
            curr_index=curr_index+Tempsize.length()+1;
            starts.add(curr_index);
            System.out.println(s.charAt(curr_index)+"\n");
            decodeString(s);
        }
        else if (s.charAt(curr_index)==']')
        {
            int last_size=sizes.getLast();
            sizes.removeLast();
            last_size-=1;
            sizes.add(last_size);
            if(last_size==0)
            {
                sizes.removeLast();
                if(!sizes.isEmpty())
                {
                    int preLast=sizes.getLast();
                    preLast-=1;

                    if(preLast==0)
                    {
                        sizes.removeLast();
                        starts.removeLast();
                        if(!sizes.isEmpty())
                        {
                            curr_index=starts.getLast();
                            decodeString(s);
                        }
                        else
                        {
                            curr_index++;
                            check2(s);
                        }
                    }
                    else
                    {
                        sizes.removeLast();
                        sizes.add(preLast);

                        starts.removeLast();
                        curr_index=starts.getLast();
                        decodeString(s);
                    }
                }
                else
                {
                    curr_index++;
                    check2(s);
                }


            }
            else
            {
                curr_index=starts.getLast();
                decodeString(s);
            }
        }
        else
        {
            decoded+=s.charAt(curr_index);
            curr_index++;
            decoded=check2(s);
        }

        return decoded;
    }

    private String checkSize(String s) {
        String res="";
        int temp=curr_index;
        while (Character.isDigit(s.charAt(temp)))
        {
            res+=s.charAt(temp);
            temp++;
        }
        System.out.println("result is \t"+res);

        return res;
    }

    public static void main(String[] args) {
        String s = "3[z]2[2[y]pq4[2[jk]e1[f]]]ef";
        decodeString dc= new decodeString();
        System.out.println(dc.decodeString(s));
    }
}


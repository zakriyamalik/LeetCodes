//First logic

//package Recursion;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class KthSymbol {
//    List<List> lists=new ArrayList<>();
//    List<Integer> list=new ArrayList<>();
//    int size=0;
//    public void intializer() {
//        list.add(0);
//       lists.addFirst(list);
//    }
//    public int kthGrammar(int n, int k) {
//        intializer();
//        if(n==1)
//        {
//            System.out.println("Element is \t"+lists.getLast().getFirst());
//            return (int) lists.getLast().getFirst();
//        }
//
//      //  System.out.println("size is :\t"+size+" "+lists.size()+" "+lists.getFirst()+" "+lists.get(size-1)+" "+list);
//        for(int i=1;i<n;i++)
//        {
//            size=lists.size();
//            list=lists.get(size-1);
//            List<Integer> tempList=new ArrayList<>();
//            for(int j=0;j<list.size();j++)
//            {
//                if(list.get(j)==0)
//                {
//                    tempList.add(0);
//                    tempList.add(1);
//                }
//                else
//                {
//                    tempList.add(1);
//                    tempList.add(0);
//                }
//            }
//            lists.addLast(tempList);
//
//        }
//        System.out.println("Element is \t"+lists.getLast().get(k-1));
//
//        return (int) lists.getLast().get(k-1);
//    }
//
//    public static void main() {
//        KthSymbol kthSymbol=new KthSymbol();
//        kthSymbol.kthGrammar(2,1);
//    }
//}










//Second logic

//package Recursion;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class KthSymbol {
//    List<Integer> list=new ArrayList<>();
//    List<Integer> tempList=new ArrayList<>();
//    int size=0;
//    public void intializer() {
//        list.add(0);
//
//    }
//    public int kthGrammar(int n, int k) {
//        intializer();
//        if(n==1)
//        {
//            System.out.println("Element is \t"+list.getFirst());
//            return list.getFirst();
//        }
//
//        //  System.out.println("size is :\t"+size+" "+list.size()+" "+list.getFirst()+" "+list.get(size-1)+" "+list);
//        for(int i=1;i<k;i++)
//        {
//            size=list.size();
//            for(int j=0;j<list.size();j++)
//            {
//                if(list.get(j)==0)
//                {
//                    tempList.add(0);
//                    tempList.add(1);
//                }
//                else
//                {
//                    tempList.add(1);
//                    tempList.add(0);
//                }
//            }
//            list=tempList;
//
//        }
//        System.out.println("Element is \t"+list.get(k-1));
//
//        return list.get(k-1);
//    }
//
//    public static void main() {
//        KthSymbol kthSymbol=new KthSymbol();
//        kthSymbol.kthGrammar(2,2);
//    }
//}



//Third logic

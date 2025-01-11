package Recursion;

public class ReachHome {
    public static void main(String[] args) {
        int n=5;
        int src=0;
        int des=n;
        reachingHome(src,des);
        System.out.println("Reached Home\n");
    }

    private static void reachingHome(int src, int des) {
        if(src==des)
        {
            return;
        }
        src++;
        System.out.println("Traveled "+src+" Destination "+des);
        reachingHome(src,des);
    }
}

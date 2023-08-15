import java.util.ArrayList;
public class Threesortecary{
    
    public static void main(String[] args) {
        int a1[]={3,4,5,6};
        int a2[]={2,4,5,7};
        int a3[]={2,3,5,6,};
        int x=0;
        int y=0;
        int z=0;

        ArrayList<Integer> al=new ArrayList<Integer>();
        while(x<a1.length && y<a2.length && z< a3.length){
            if(a1[x]==a2[y] && a2[y]==a3[z]){
            al.add(a1[x]);
            x++;
            y++;
            z++;
            }
            else if(a1[x]<a2[y]){
                x++;

            }
            else if( a2[y]<a3[z]){
                y++;

            }
            else{
                z++;

            }
        }
        for(int sor:al){
            System.out.println(sor);
        }
    
}
}

public class Towerofhoni {
    public static void towerofhaoni(int n,String src,String helper,String des){
                if(n==1){
            System.out.println("tranfer disk"+n+"from"+src+"to"+des);
            return;
        }
        
        towerofhaoni(n-1,src,des,helper);
        System.out.println("tranfer disk"+n+"from"+src+"to"+helper);
        towerofhaoni(n-1,helper,src,des);
    
    }
    public static void main(String[] args) {
        int n=4;
        towerofhaoni(n,"a","b","c");
        
    }
    
}

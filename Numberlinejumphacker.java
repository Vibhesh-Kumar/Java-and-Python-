class Numberlinejumphacker{
    public static String kangaroo(int x1, int v1, int x2, int v2) {
     // if(v1>=v2 && x1>x2){
    //     return "NO";
        
    // }
    // if(v2>v1 && x2>x1){
    //     return "NO";
    // }
    // if((x2-x1) % (v1-v2)==0){
    //     return "YES";
    // }
    // return "NO";

    
    //second method
    
    while(x1<x2){
        x1=x1+v1;
        x2=x2+v2;
        
        if(x1==x2){
            return "YES";
        }
    }
    return "NO";
public static void main(String[] args) {
    String result = kangaroo(0, 3, 4, 2);
System.out.println(result);  // Output: YES

}

}


    }


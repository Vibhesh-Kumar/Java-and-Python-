public class ReverseString {
    public static void main(String[] args) {
        String str="hello";

        //method 1
        char []strg=str.toCharArray();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(strg[i]);
        }

        System.out.println();
       //method 2
            for(int i=str.length()-1;i>=0;i--){
                System.out.print(str.charAt(i));
            }

            System.out.println();


            //method 3
            StringBuffer sb=new StringBuffer(str);
            System.out.println(sb.reverse());

            System.out.println();

//method 4
            StringBuilder sd=new StringBuilder(str);
                System.out.println(sd.reverse());
        
    }
    
}

import java.io.*;
public class Passcon {
    
    public static void main(String[] args) {//console class
        String str;char ch[];
        Console obj=System.console();
        System.out.println("enter the username");
        str=obj.readLine();
        System.out.println("enter the password:");
        ch=obj.readPassword();
        String a=String.valueOf(ch);
        System.out.println("username:"+str);
        System.out.println("Password:"+a);

    }
}

import java.util.Scanner;

class Areaofcircle{
    public static void main(String[] args) {
        int r;
        double pi=3.14;
        System.out.println("Enter the radius of circle:");
        
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        double area=pi*r*r;
        System.out.println(area);
    

    }
}
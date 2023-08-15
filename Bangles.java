import java.util.Scanner;

public class Bangles {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the coordinates of the first bangle's center (x1 y1): ");
      double x1 = sc.nextDouble();
      double y1 = sc.nextDouble();
      
      System.out.print("Enter the radius of the first bangle: ");
      double r1 = sc.nextDouble();
      
      System.out.print("Enter the coordinates of the second bangle's center (x2 y2): ");
      double x2 = sc.nextDouble();
      double y2 = sc.nextDouble();
      
      System.out.print("Enter the radius of the second bangle: ");
      double r2 = sc.nextDouble();
      
      double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
      
      if (distance > r1 + r2) {
         System.out.println("The two bangles are not touching or intersecting.");
      } else if (distance == r1 + r2) {
         System.out.println("The two bangles are touching.");
      } else if (distance < r1 + r2) {
         System.out.println("The two bangles are intersecting.");
      }
      
      System.out.println("The distance between the centers of the bangles is " + distance);
   }
}
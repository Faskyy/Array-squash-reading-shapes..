import java.util.Scanner;

public class Circle extends NamedShape {
   // Private data fields
   private double radius = 0;  // The radius of the Rectangle.

   public Circle() {
      super("Circle");
   }

   public Circle(double radius) {
      this();
      this.radius = radius;
   }

   public double getRadius() {
      return radius;
   }

   @Override
   public double computeArea() {
      return Math.PI * radius * radius;
   }

   @Override
   public double getWidth() {
      return 2 * radius;
   }

   @Override
   public double getHeight() {
      return 2 * radius;
   }

   @Override
   public void readShapeData() {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the radius of the Circle");
      radius = in.nextDouble();
   }
}

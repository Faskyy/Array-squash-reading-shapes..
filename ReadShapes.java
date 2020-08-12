import java.util.Scanner;

public class ReadShapes {

   /**
    * The main program performs the following steps.
    * 1. It asks the user for the type of figure.
    * 2. It asks the user for the characteristics of that figure.
    * 3. It computes the area.
    * 4. It displays the result.
    * @param args The command line arguments -- not used
    */
   public static void main(String args[]) {
      NamedShape myShape;
      double area;
      myShape = getShape(); // Ask for figure type
      myShape.readShapeData(); // Read the shape data
      area = myShape.computeArea(); // Compute the area
      displayResult(area); // Display the result
      System.exit(0); // Exit the program
   }

   /**
    * Ask the user for the type of figure.
    * @return An instance of the selected shape
    */
   public static NamedShape getShape() {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter C for Circle");
      System.out.println("Enter R for Rectangle");
      System.out.println("Enter S for Square");
      System.out.println("Enter T for Triangle");
      String figType = in.next();
      switch (figType) {
         case "C": case "c":
            return new Circle();
         case "R": case "r":
            return new Rectangle();
         case "T": case "t":
            return new Triangle();
         case "S": case "s":
            return new Square();
         default:
            System.out.println("Wrong input. I quit. Rerun me and try again.");
            return null;
      }
   }

   /**
    * Display the result of the computation.
    * @param area The area of the figure
    */
   private static void displayResult(double area) {
      System.out.printf("The area is %.2f%n", area);
   }
}

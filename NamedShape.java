// Abstract class for a 2-dimensional shape.
public abstract class NamedShape implements Shape{

    // Require classes that extend NamedShape to have a name
    private final String name;

    // Initializes the shapeName
    public NamedShape(String shapeName) {
        this.name = shapeName;
    }

    // Get the name of this shape.
    public String getShapeName() { return name; }
   
}

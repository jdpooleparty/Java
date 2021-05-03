package hwweek6assign2;

public class Rectangle {

    private double length = 1;
    private double width = 1;

    //3 argument constructor to initialize private variables with passed parameters
    public Rectangle(double length, double width) {

        this.length = length;
        this.width = width;

    }

    //length getters and setters
    public void setLength(double length) { //setters
        //validate float input between 0-20
        if (length >= 20 || length <= 0) {
            throw new IllegalArgumentException(
                    "Length was out of range");
        }
        this.length = length;
    }

    public double getLength() { //getters
        return length;
    }

    //width getters and setters
    public void setWidth(double width) { //setters
        //validate float input between 0-20
        if (width >= 20 || width <= 0) {
            throw new IllegalArgumentException(
                    "Width was out of range");
        }
        this.width = width;
    }

    public double getWidth() { //getters
        return width;
    }

    public double calculatePerimeter() {
        double perimeterRectangle = (length + width) * 2;
        return perimeterRectangle;
    }

    public double calculateArea() {
        double areaRectangle = length * width;
        return areaRectangle;
    }

    //method to display length width and year
    public void displayDimensions() {

        //call and display methods in nice format
        System.out.println((getLength()) + "/" + (getWidth()));

    }

}

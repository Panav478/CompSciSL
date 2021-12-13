package Problem_Eighteen;

public class Rectangle {
    
    // Variables
    int x;
    int y;
    int width;
    int height;

    // Constructors
    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Methods
    public void getHeight() {
        if (this.height < 0) {
            System.out.println("IllegalArgumentException");
        }
        else {
            System.out.println(this.height);
        }
    }

    public void getWidth() {
        if (this.width < 0) {
            System.out.println("IllegalArgumentException");
        }
        else {
            System.out.println(this.width);
        }
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String createRectangle() {
        String rectangle = "Rectangle[x=" + this.x + ",y=" + this.y + ",width=" + this.width + ",height=" + this.height + "]";
        return rectangle;
    }
}
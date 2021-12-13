package Problem_Twenty;

public class Rectangle {
    
    // Variables
    int x;
    int y;
    int width;
    int height;
    String point;
    
    // Constructors
    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    Rectangle(String point, int width, int height) {
        this.point = point;
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
    
    public String createRectangleOne() {
        String rectangle = "Rectangle[x=" + this.x + ",y=" + this.y + ",width=" + this.width + ",height=" + this.height + "]";
        return rectangle;
    }
    public String createRectangleTwo() {
        String rectangle = "Rectangle[Point:" + this.point + ",width=" + this.width + ",height=" + this.height + "]";
        return rectangle;
    }

    public boolean contains(int x1, int y1) {

        int addWidth = this.x + width;
        int subtractHeight = this.y - height;

        if(((this.x <= x1) && (x1 <= addWidth) && ((this.y >= y1) && (y1 >= subtractHeight)))) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean contains(String point) {

        int tallyMarker = 0;
        int[] tally = new int[2];

        
        for (int i = 0; i < point.length(); i++) {
            if (Character.isDigit(point.charAt(i))) {
                tally[tallyMarker] = point.charAt(i);
                tallyMarker++;
            }
        }

        int x1 = tally[0];
        int y1 = tally[1];

        int addWidth = this.x + width;
        int subtractHeight = this.y - height;

        if(((this.x <= x1) && (x1 <= addWidth) && ((this.y >= y1) && (y1 >= subtractHeight)))) {
            return true;
        }
        else {
            return false;
        }
    }
}

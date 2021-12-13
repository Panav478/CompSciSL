package Problem_Eighteen;

class TestEighteen {
    public static void main(String[] args) {

        // Testing Constructor
        Rectangle rect1 = new Rectangle(5, 7, 3, 2);

        // Testing Methods
        rect1.getHeight();
        rect1.getWidth();
        System.out.println(rect1.getX());
        System.out.println(rect1.getY());
        System.out.println(rect1.createRectangle());
    }
}
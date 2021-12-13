package Problem_Twenty;

public class TestTwenty {
    public static void main(String[] args) {
        
        // Testing Constructors
        Rectangle rect1 = new Rectangle(5, 7, 2, 4);
        Rectangle rect2 = new Rectangle("(5 , 7)", 2, 4);

        // Testing Methods
        System.out.println(rect1.contains(6, 5));
        System.out.println(rect2.contains("(6, 6)"));
    }
}

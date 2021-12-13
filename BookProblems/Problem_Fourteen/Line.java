package Problem_Fourteen;

class Line {
    
    // Variables
    int p1X;
    int p1Y;
    int p2X;
    int p2Y;

    // Constructors
    Line(int pointOneXCord, int pointOneYCord, int pointTwoXCord, int pointTwoYCord) {
        this.p1X = pointOneXCord;
        this.p1Y = pointOneYCord;
        this.p2X = pointTwoXCord;
        this.p2Y = pointTwoYCord;
    }

    // Methods
    public String getP1() {
        String p1 = "(" + this.p1X + ", " + this.p1Y + ")";
        return p1;
    }

    public String getP2() {
        String p2 = "(" + this.p2X + ", " + this.p2Y + ")";
        return p2;
    }

    public String createLine() {
        String line = "[(" + this.p1X + ", " + this.p1Y + ") , " + "(" + this.p2X + ", " + this.p2Y + ")]";
        return line;
    }
}
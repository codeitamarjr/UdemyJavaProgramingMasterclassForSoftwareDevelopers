public class AreaCalculator {
    public static double area(double radius){
        if(radius<0){
            return -1.0D;
        }
        double areaOfACircle=radius*radius*Math.PI;
        return areaOfACircle;
    }

    public static double area(double x, double y){
        if(x<0 | y<0){
            return -1.0D;
        }
        double areaOfARectangle = x*y;
        return areaOfARectangle;
    }
}

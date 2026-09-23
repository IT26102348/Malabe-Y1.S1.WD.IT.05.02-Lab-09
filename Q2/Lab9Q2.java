

public class IT26102348Lab9Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        
        double area = circleArea(radius);

        
        System.out.printf("The area of the circle is: %.2f\n", area);

        scanner.close();
    }

    
    public static double circleArea(double radius) {
        
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}

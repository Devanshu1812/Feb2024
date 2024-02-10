public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // Predefined Fahrenheit value
        double fahrenheit = 274.8;
        
        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        // Display the result
        System.out.println("Fahrenheit: " + fahrenheit + "°F");
        System.out.println("Celsius: " + celsius + "°C");
    }
}

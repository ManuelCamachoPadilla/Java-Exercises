import java.io.BufferedReader;
import java.io.*;

public class GeneratePerimeter {
    public static void main(String[] args) throws IOException {
        GetShapeFactory shapeFactory = new GetShapeFactory();

        System.out.print("Enter shape name (triangle, square or hexagon): ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String shapeName = br.readLine();
        System.out.print("Enter the length of the edges: ");
        double len = Double.parseDouble(br.readLine());

        Shape shape = shapeFactory.getShape(shapeName);

        System.out.print("Perimeter amount for " + shapeName + " of " + len + " length is: ");
        shape.setEdges();
        shape.calculatePerimeter(len);
    }

}
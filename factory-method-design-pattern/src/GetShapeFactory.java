public class GetShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        else if(shapeType.equalsIgnoreCase("TRIANGLE")){
            return new Triangle();
        }
        else if(shapeType.equalsIgnoreCase("HEXAGON")) {
            return new Hexagon();
        }
        return null;
    }
}

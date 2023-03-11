abstract class Shape{
    protected double edges;

    abstract void setEdges();

    public void calculatePerimeter(double units){
        System.out.println(units*edges);
    }

}

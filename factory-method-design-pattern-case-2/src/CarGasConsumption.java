abstract class CarGasConsumption {
    protected double kilometersPerLitre;
    abstract void getGasLitres();
    public void calculateGasConsumption(double kilometres) {
        System.out.println(kilometres*kilometersPerLitre);
    }

}

class GetGasFactory {
    public CarGasConsumption getGas(String carGasConsumption) {
        if(carGasConsumption.equalsIgnoreCase("RAMONA")) return new Ramona();
        else if(carGasConsumption.equalsIgnoreCase("BOCHO")) return new Bocho();
        else if(carGasConsumption.equalsIgnoreCase("KIA")) return new Kia();
        else return null;
    }
}

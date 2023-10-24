package homework_nr_13;

public class Airplane {
    String manufacturer;
    String model;
    int nrOfEngines;
    public Airplane (String manufacturer, String model, int nrOfEngines) throws InvalidAirplaneException {
        if (manufacturer.isEmpty() || manufacturer == null)
            throw new  InvalidManufacturerException("The manufacturer is invalid");
        this.manufacturer = manufacturer;
        if (model.isEmpty() || model == null)
            throw new  InvalidModelException("The model is invalid");
        this.model = model;
        if (nrOfEngines == 0 || nrOfEngines % 2 != 0)
            throw new InvalidNrOfEngineException("The number of Engines is invalid");
        this.nrOfEngines = nrOfEngines;
    }
}

package vitals;

public class GermanLanguage implements Language {
    @Override
    public String temperatureOutOfRange() {
        return "Die Temperatur liegt außerhalb des Bereichs!";
    }

    @Override
    public String socOutOfRange() {
        return "Der Ladezustand liegt außerhalb des Bereichs!";
    }

    @Override
    public String chargeRateOutOfRange() {
        return "Die Ladegeschwindigkeit liegt außerhalb des Bereichs!";
    }
}

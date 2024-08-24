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

    public String warningMessage(String parameterName, String condition) {
        return "Warnung: " + parameterName + " ist " + condition + "!";
    }

    public String breachMessage(String parameterName, String condition) {
        return "Fehler: " + parameterName + " ist " + condition + "!";
    }
}

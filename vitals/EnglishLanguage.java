package vitals;

public class EnglishLanguage implements Language {
    @Override
    public String temperatureOutOfRange() {
        return "Temperature is out of range!";
    }

    @Override
    public String socOutOfRange() {
        return "State of Charge is out of range!";
    }

    @Override
    public String chargeRateOutOfRange() {
        return "Charge Rate is out of range!";
    }
}


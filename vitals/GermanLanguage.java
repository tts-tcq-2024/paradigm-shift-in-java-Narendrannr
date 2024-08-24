package vitals;

public class GermanLanguage implements Language {
    public String warningMessage(String parameterName, String condition) {
        return "Warnung: " + parameterName + " ist " + condition + "!";
    }

    public String breachMessage(String parameterName, String condition) {
        return "Fehler: " + parameterName + " ist " + condition + "!";
    }
}

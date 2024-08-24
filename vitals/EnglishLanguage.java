package vitals;

public class EnglishLanguage implements Language {
    public String warningMessage(String parameterName, String condition) {
        return "Warning: " + parameterName + " is " + condition + "!";
    }

    public String breachMessage(String parameterName, String condition) {
        return "Error: " + parameterName + " is " + condition + "!";
    }
}


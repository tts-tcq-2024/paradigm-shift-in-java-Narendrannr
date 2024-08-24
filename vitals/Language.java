package vitals;

public interface Language {
    String warningMessage(String parameterName, String condition);
    String breachMessage(String parameterName, String condition);
}

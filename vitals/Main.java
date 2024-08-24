package vitals;
/**
* @author AFF1COB
*
*/

public class Main {
    static Language currentLanguage = new EnglishLanguage();

    static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
        return checkParameterBreach(temperature, new ParameterRange(0f, 45f, 5f), "Temperature") &&
               checkParameterBreach(soc, new ParameterRange(20f, 80f, 5f), "SoC") &&
               checkParameterBreach(chargeRate, new ParameterRange(0f, 0.8f, 5f), "Charge Rate");
    }

    static boolean checkParameterBreach(float value, ParameterRange range, String parameterName) {
        if (value < range.lowerLimit) {
            System.out.println(currentLanguage.breachMessage(parameterName, "too low"));
            return false;
        } else if (value > range.upperLimit) {
            System.out.println(currentLanguage.breachMessage(parameterName, "too high"));
            return false;
        }
        checkParameterWarning(value, range, parameterName);
        return true;
    }

    static void checkParameterWarning(float value, ParameterRange range, String parameterName) {
        if (value < range.warningLowerLimit) {
            System.out.println(currentLanguage.warningMessage(parameterName, "approaching lower limit"));
        } else if (value > range.warningUpperLimit) {
            System.out.println(currentLanguage.warningMessage(parameterName, "approaching upper limit"));
        }
    }

    public static void main(String[] args) {
     assert (batteryIsOk(25, 70, 0.7f));
        assert (batteryIsOk(0, 20, 0.0f));
        assert (batteryIsOk(45, 80, 0.7f));
        assert (!batteryIsOk(25, 10, 0.7f));
        assert (!batteryIsOk(25, 70, 0.9f));
        assert (!batteryIsOk(50, 85, 0.0f));
        assert (batteryIsOk(22, 70, 0.5f)); 
        assert (batteryIsOk(78, 70, 0.5f)); 
        assert (batteryIsOk(25, 70, 0.77f)); 
        assert (batteryIsOk(42, 70, 0.5f)); 
        
        currentLanguage = new GermanLanguage();
        assert (!batteryIsOk(-1, 70, 0.5f));
        assert (!batteryIsOk(25, 85, 0.5f));
        assert (!batteryIsOk(25, 15, 0.5f));
        assert (batteryIsOk(25, 70, 0.5f));

        System.out.println("All tests passed.");
    }
}

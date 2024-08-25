package vitals;
/**
* @author AFF1COB
*
*/

public class Main {
	static Language currentLanguage = new EnglishLanguage();
	
    static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
        return temperatureIsOk(temperature) && stateIsOk(soc) && chargeIsOk(chargeRate);
    }

    static boolean temperatureIsOk(float temperature) {
        boolean validTemperatureValue = true;
        if (temperature < 0 || temperature > 45) {
            System.out.println(currentLanguage.temperatureOutOfRange());
            validTemperatureValue = false;
        }
        return validTemperatureValue;
    }

    static boolean stateIsOk(float soc) {
        boolean validStateValue = true;
        if (soc < 20 || soc > 80) {
            System.out.println(currentLanguage.socOutOfRange());
            validStateValue = false;
        }
        return validStateValue;
    }

    static boolean chargeIsOk(float chargeRate) {
        boolean validChargeValue = true;
        if (chargeRate > 0.8) {
            System.out.println(currentLanguage.chargeRateOutOfRange());
            validChargeValue = false;
        }
        return validChargeValue;
    }

    public static void main(String[] args) {
        assert (batteryIsOk(25, 70, 0.7f));
        assert (batteryIsOk(0, 20, 0.0f));
        assert (batteryIsOk(45, 80, 0.7f));
        assert (!batteryIsOk(25, 10, 0.7f));
        assert (!batteryIsOk(25, 70, 0.9f));
        assert (!batteryIsOk(50, 85, 0.0f));
        currentLanguage = new GermanLanguage();
        assert (!batteryIsOk(-1, 70, 0.5f));
        assert (!batteryIsOk(25, 85, 0.5f));
        assert (!batteryIsOk(25, 15, 0.5f));
        assert (batteryIsOk(25, 70, 0.5f));
        
        System.out.println("All tests passed.");
    }
}

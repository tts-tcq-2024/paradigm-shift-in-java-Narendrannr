package vitals;
/**
* @author AFF1COB
*
*/

public class Main {
       static boolean isTemperatureOk(float temperature) {
        return temperature >= 0 && temperature <= 45;
    }

    static boolean isSocOk(float soc) {
        return soc >= 20 && soc <= 80;
    }

    static boolean isChargeRateOk(float chargeRate) {
        return chargeRate <= 0.8;
    }

    static boolean isBatteryOk(float temperature, float soc, float chargeRate) {
        return isTemperatureOk(temperature) && isSocOk(soc) && isChargeRateOk(chargeRate);
    }

    public static void main(String[] args) {
        assert(batteryIsOk(25, 70, 0.7f) == true);
        assert(batteryIsOk(50, 85, 0.0f) == false);
        assert (isBatteryOk(0, 50, 0.7f) == false);  
        assert (isBatteryOk(45, 50, 0.7f) == false);  
        assert (isBatteryOk(25, 15, 0.7f) == false);  
        assert (isBatteryOk(25, 85, 0.7f) == false);  
        assert (isBatteryOk(25, 50, 1.0f) == false);
    }
}

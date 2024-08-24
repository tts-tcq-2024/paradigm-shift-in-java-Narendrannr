package vitals;

public class ParameterRange {
	float lowerLimit;
    float upperLimit;
    float warningLowerLimit;
    float warningUpperLimit;

    ParameterRange(float lowerLimit, float upperLimit, float warningTolerancePercent) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.warningLowerLimit = lowerLimit + warningTolerancePercent * upperLimit / 100;
        this.warningUpperLimit = upperLimit - warningTolerancePercent * upperLimit / 100;
    }
}

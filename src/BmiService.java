public class BmiService {
    public int calculate(int weightKg, double heightM) {
        int bmi;
        bmi = (int) (weightKg / (heightM * heightM));
        return bmi;
    }
}
public class BmiService {
    public float calculate(int mass, float height) {

        float bmi = mass / (height * height); // Индекс массы тела
        return bmi;
    }

}

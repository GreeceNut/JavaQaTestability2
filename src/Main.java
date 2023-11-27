public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 98; // Масса
        float height = 1.87F; // Рост
        float bmi = service.calculate(mass, height);
        int bmi1 = (int) bmi; // перевод индекса из дробного в целое
        System.out.println("Индекс массы тела = " + bmi1);
    }
}
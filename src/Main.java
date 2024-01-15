public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int resultbmi = service.calculate (100, 1.9);
        System.out.println(resultbmi);
    }
}

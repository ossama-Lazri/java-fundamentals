public class TestCustom {

    static void withdraw(double amount) throws CustomException {
        if (amount > 1000) {
            throw new CustomException("Limit exceeded");
        }
    }

    public static void main(String[] args) {
        try {
            withdraw(1500);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
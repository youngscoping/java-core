public class SwitchCaseDemo {
    public static void main(String[] args) {
        int month = 3;

        switch (month) {
            case 2:
                System.out.println("có 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 30 ngày");
                break;
            default:
                System.out.println("31 ngày");
                break;
        }
    }
}

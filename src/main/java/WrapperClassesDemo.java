public class WrapperClassesDemo {
    public static void main(String[] args) {


        // Primitive                        // Wrapper class
        // byte                             Byte
        // short                            Short
        // int                              Integer
        // long                             Long
        // float                            Float
        // double                           Double
        // char                             Character
        // boolean                          Boolean

        // Boxing: Primitive -> Wrapper Class
        int a = 100;
        Integer b = Integer.valueOf(a);

        // Unboxing: WC -> Primitive
        Integer x = Integer.valueOf(100);
        int y = x.intValue();

        // Ứng dun g
        // 1. Ktra kí tự viết hoa hay thường
        System.out.println("Character.isDigit('1') = " + Character.isDigit('1'));
        System.out.println("Character.isUpperCase('a') = " + Character.isUpperCase('a'));

        // Chuyển String sang số
        String s = "123456";
        int n = Integer.parseInt(s);
        System.out.println(s+10);
        System.out.println(n+10);

        double m = Double.parseDouble("123.456");
        System.out.println(m +10);
    }
}

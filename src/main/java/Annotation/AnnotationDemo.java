package Annotation;

public class AnnotationDemo {
    public static void main(String[] args) {
        // Cú pháp: @ + Tên

        // @Override
        AnnotationDemo demo = new AnnotationDemo();
        System.out.println("demo = " + demo);

        // @Deprecated
        int max = Math.maxV1(1, 2);
        System.out.println("max = " + max);

        // @SubpressWarning
        @SuppressWarnings("deprecation")
        int m = Math.maxV1(1, 2);
        System.out.println("max = " + max);
    }

    @Override
    public String toString() {
        return "this is Annotation Demo";
    }


}

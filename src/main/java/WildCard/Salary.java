package WildCard;

public class Salary <N extends Number>{
    private N value;

    public void showInfo() {
        System.out.println(value);
    }

}

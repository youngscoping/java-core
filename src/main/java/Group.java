import java.time.LocalDate;

public class Group {
    int id;
    String name;
    Account creatorId;
    LocalDate createdDate;
    Account[] accounts;
}

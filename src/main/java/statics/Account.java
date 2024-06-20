package statics;

import java.io.Serializable;

public class Account implements Serializable {
    private int id;
    private String username;
    private String password;

    public Account(int id, String password, String username) {
        this.id = id;
        this.password = password;
        this.username = username;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}

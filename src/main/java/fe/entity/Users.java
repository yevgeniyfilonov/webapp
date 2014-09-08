package fe.entity;

public class Users {
    private int id;
    private String login;
    private String pass;
    private boolean delete;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                ", delete=" + delete +
                '}';
    }

    public Users() {
    }

    public Users(int id, String login, String pass, boolean delete) {
        this.id = id;
        this.login = login;
        this.pass = pass;
        this.delete = delete;
    }
}

package Application;

public class Usuario {
    private String name, userName, password, cpf;
    private int viewMinutes;

    public Usuario(String name, String userName, String password,
                   String cpf, int viewMinutes) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.cpf = cpf;
        this.viewMinutes = viewMinutes;
    }

    public int getViewMinutes() {
        return viewMinutes;
    }

    public void setViewMinutes(int viewMinutes) {
        this.viewMinutes = viewMinutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
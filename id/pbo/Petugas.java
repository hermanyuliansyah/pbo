package id.pbo;

public class Petugas {

    private String username, password;
    private boolean loginSatus;

    public Petugas() {
    }

    public Petugas(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setLoginSatus(boolean loginSatus) {
        this.loginSatus = loginSatus;
    }

    public boolean isLoginSatus() {
        return loginSatus;
    }

    public void login(String username, String password){
        System.out.println("Login Berhasil");
        setLoginSatus(true);
    }

    public void menu(){

    }
    
}

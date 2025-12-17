class Login {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 8 characters long!");
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class MainClass 
{
    public static void main(String[] args)
     {
        Login login = new Login();

        login.setUsername("Kusuma");
        login.setPassword("12345678");

        login.setPassword("123");

        System.out.println("Username: " + login.getUsername());
        System.out.println("Password: " + login.getPassword());
    }
}
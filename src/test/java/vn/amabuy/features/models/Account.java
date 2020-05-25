package vn.amabuy.features.models;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Account {
    public static AccountBuilder named(String name){
        return new AccountBuilder(name);
    }
    public static class AccountBuilder{
        private String fullname;
        private String email;
        private String password;
        private String rePassword;
        public AccountBuilder(String name){
            this.fullname=name;

        }
        public AccountBuilder withEmail(String email){
            this.email=email;
            return this;
        }
        public AccountBuilder withPassword(String password){
            this.password=password;
            return this;
        }
        public AccountBuilder withRePassword(String rePassword){
            this.rePassword=rePassword;
            return this;
        }
        public Account build(){
           return new Account(fullname,email,password,rePassword);
        }

    }

    private String fullname;
    private String email;
    private String password;
    private String rePassword;
    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyymmddHHmmss");
    LocalDateTime now=LocalDateTime.now();

    public Account(String fullname, String email, String password, String rePassword) {
        this.fullname = fullname;
        this.email = String.format("%s_%s",dtf.format(now),email);
        this.password = password;
        this.rePassword = rePassword;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

}

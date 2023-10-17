package lexicon.se;

import java.util.Objects;

public class AppUser {
      private String username;
      private String password;
      private AppUser role;

    public AppUser(String username, String password, AppUser role) {
        this.username = username;
        this.password = password;
        this.role = role;



      }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public AppUser getRole() {
        return role;
    }

    public void setUsername(String username) {
        if(username.isEmpty()){
            throw new IllegalArgumentException("username can not be empty!");
        }

        this.username = username;
    }

    public void setPassword(String password) {
        if (password.isEmpty()){
            throw new IllegalArgumentException("password can not be empty!");

        }

        this.password = password;
    }

    public void setRole(AppUser role) {
     if (password == null){
         throw new IllegalArgumentException(" role can not be null!");
     }

        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof AppUser otherUser) {
            return otherUser.getUsername().equals(this.username) &&
             otherUser.getRole().equals(this.role);


        }
        return false ;


    }

    @Override
    public int hashCode() {
        int result = username.hashCode();
        result = 3543278* result + role.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}

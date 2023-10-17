package lexicon.se.dao;

import lexicon.se.AppUser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppUserDAOCollection implements AppUserDAO {
    private ArrayList<AppUser> users;


    @Override
    public AppUser persist(AppUser appUser) {
        users.add(appUser);

        users.remove(a -> a.getUsername().equals(appUser.setUsername(appUser.getUsername());
        return appUser;
    }

    @Override
    public AppUser findByUsername(String username) {
        for (AppUser user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }

        }
        return null;
    }


    @Override
    public Collection<AppUser> findAll() {


        return List.copyOf(users);
    }

    @Override
    public void remove(String username) {
        this.users.remove(a-> a.getUsername().equals(username));



    }
}

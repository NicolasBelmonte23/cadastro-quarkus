package dev.nicolas.sevice;

import dev.nicolas.domain.Users;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsersService {

    public Users create(Users users){
        users.persist(users);
        return users;
    }
}

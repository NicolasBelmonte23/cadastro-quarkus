package dev.nicolas.controller;

import dev.nicolas.domain.Users;
import dev.nicolas.sevice.UsersService;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/users")
public class UserController {

    private final UsersService usersService;

    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }

    @POST
    public Response createUser(Users users) {
        return Response.ok().entity(usersService.create(users)).build();
    }
}

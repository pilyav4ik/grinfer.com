package repository;

import model.api.User;

public interface AuthRepository extends BasicRepository {

    User createUser(User user);

    User login(User user);

}
package main.domain.user.port;

import main.domain.user.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepositoryPort {
    List<User> findAll();
    Optional<User> findById(int id);
}

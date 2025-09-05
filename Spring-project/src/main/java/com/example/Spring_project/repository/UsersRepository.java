package com.example.Spring_project.repository;
import com.example.Spring_project.domain.Users;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


public class UsersRepository {
    private final ConcurrentMap<Long, Users> usersMap = new ConcurrentHashMap<>();
    private static Long userIndex = 0L;

    // CREATE
    public Users save(Users user) {
        user.setUserIdx(++userIndex);
        usersMap.put(user.getUserIdx(), user);
        return user;
    }

    // READ
    public Optional<Users> findByUserIdx(Long userIdx) {
        return Optional.ofNullable(usersMap.get(userIdx));
    }

    public List<Users> findAll() {
        return new ArrayList<>(usersMap.values());
    }

    // DELETE
    public void delete(Long userIdx) {
        usersMap.remove(userIdx);
    }
}

package ru.practicum.app.user;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("FROM User WHERE id in :ids or :ids is null")
    List<User> findAllById(List<Integer> ids, PageRequest pageRequest);

    List<User> findUsersByIdIn(Set<Integer> ids);

}

package com.kaiburr.kaiburrproject.repository;

import com.kaiburr.kaiburrproject.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task, String> {
    List<Task> findByNameContaining(String name);
    @Query("{ assignee: ?0 }")
    List<Task> findByAssignee(String assignee);

}
package com.organise.DailyTasks.Repository;

import com.organise.DailyTasks.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}

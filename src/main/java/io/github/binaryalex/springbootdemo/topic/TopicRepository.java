package io.github.binaryalex.springbootdemo.topic;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Alex on 11/07/2017.
 */
public interface TopicRepository extends CrudRepository<Topic, String> {
}

package io.github.binaryalex.springbootdemo.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Alex on 11/07/2017.
 */
public interface CourseRepository extends CrudRepository<Course, String> {
    public List<Course> findByTopicId(String topicId);
}

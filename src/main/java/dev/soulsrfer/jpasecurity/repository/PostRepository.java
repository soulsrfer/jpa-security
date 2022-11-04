package dev.soulsrfer.jpasecurity.repository;

import dev.soulsrfer.jpasecurity.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
}

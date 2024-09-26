package exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import exercise.model.Post;
import org.springframework.web.bind.annotation.GetMapping;


@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}

package algokelvin.app.userhobbies.repository;

import algokelvin.app.userhobbies.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigRepository extends JpaRepository<Movies, Integer> {
}

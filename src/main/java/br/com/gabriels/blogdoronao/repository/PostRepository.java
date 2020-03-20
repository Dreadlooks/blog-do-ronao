package br.com.gabriels.blogdoronao.repository;

import br.com.gabriels.blogdoronao.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository  extends JpaRepository<Post, Long> {
}

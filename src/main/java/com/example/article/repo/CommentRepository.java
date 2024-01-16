package com.example.article.repo;

import com.example.article.entity.Article;
import com.example.article.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// 연관 관계에 있는 것들은 어떻게 검색할 수 있는가?
public interface CommentRepository extends JpaRepository<Comment, Long> {
  // 어떤 게시글(id = ?)에 작성된 댓글들
  // SELECT * FROM comment article_id = ?
  List<Comment> findAllByArticleId(Long id);
  // ORM은 행을 가지고 다른 행을 찾는 것을 좋아하지 않는다.
  List<Comment> findAllByArticle(Article article);
}

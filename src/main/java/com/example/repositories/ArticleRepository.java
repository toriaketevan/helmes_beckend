package com.example.repositories;

import com.example.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Amelie on 5/10/2017.
 */
public interface ArticleRepository extends JpaRepository<Article, Long> {
}

package com.example.controllers;

import com.example.models.Article;
import com.example.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by Amelie on 5/10/2017.
 */
@RestController
@RequestMapping("/api/article")
public class ArticleController {

    private final ArticleRepository repository;

    @Autowired
    public ArticleController(ArticleRepository repository) {
        this.repository = repository;
    }

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Article>> getArticles() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Article> getArticle(@PathVariable("id") Long id) {
        Article article = repository.findOne(id);
        return new ResponseEntity<>(article, article == null ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Article> createArticle(@RequestBody Article article) {
        Article createArticle = repository.save(article);
        return new ResponseEntity<>(createArticle, HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Article> updateArticle(@PathVariable("id") Long id, @RequestBody Article article) {
        Article existing = repository.findOne(id);
        if (existing == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        article.setId(id);
        Article updatedArticle = repository.save(article);
        return new ResponseEntity<>(updatedArticle, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Article> deleteArticle(@PathVariable("id") Long id) {
        Article existing = repository.findOne(id);
        if (existing == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        repository.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

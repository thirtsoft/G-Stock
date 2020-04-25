package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Article;
import org.sid.service.ArticleService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("**")
@RequestMapping("/admin_stock")
public class ArticleController {
	private ArticleService articleService;
	
	public ArticleController(ArticleService articleService) {
		this.articleService = articleService;
	}
	
	@GetMapping(value = "/articles")
	public List<Article> findAllArticle() {
		return articleService.getAllArticle();
	}
	
	@GetMapping(value = "/articles/{id}")
	public Optional<Article> findArticleById(@PathVariable(value="id") Long id) {
		return articleService.getArticleById(id);

	}
	
	@PostMapping(value = "/articles")
	public Article save(@RequestBody Article article) {
		return articleService.saveArticle(article);
	}
	
	@PutMapping(value = "/articles/{idArticle}")
	public Article update(@PathVariable Long idArticle, @RequestBody Article article) {
		article.setIdArticle(idArticle);
		return articleService.saveArticle(article);
	}
	
	@DeleteMapping(value = "/articles/{idArticle}")
	public void delete(@PathVariable Long idArticle) {
		articleService.deleteArticleById(idArticle);
	}

}

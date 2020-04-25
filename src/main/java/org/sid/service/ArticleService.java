package org.sid.service;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.sid.entites.Article;
import org.sid.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ArticleService {
	@Autowired
	private ArticleRepository articleRepository;
	
	public List<Article> getAllArticle() {
		return articleRepository.findAll();	
	}
	
	public Optional<Article> getArticleById(Long idArticle) {
		return articleRepository.findById(idArticle);
	}
	
	public Article saveArticle(Article article) {
		return articleRepository.save(article);
	}
	
	public Article updateArticle(Article article) {
		return articleRepository.save(article);
	}
	
	public void deleteArticleById(Long idArticle) {
		articleRepository.deleteById(idArticle);
	}

}

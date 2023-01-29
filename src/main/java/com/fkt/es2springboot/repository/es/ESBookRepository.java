package com.fkt.es2springboot.repository.es;

import com.fkt.es2springboot.model.Book;
import org.elasticsearch.search.SearchHits;
import org.springframework.data.elasticsearch.annotations.Highlight;
import org.springframework.data.elasticsearch.annotations.HighlightField;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ESBookRepository extends ElasticsearchRepository<Book,Long> {
    List<Book> findByTitleOrAuthor(String title,String author);

    @Highlight(fields = {
            @HighlightField(name = "title"),
            @HighlightField(name = "author")
    })
    @Query("{\"match\":{\"title\":\"?0\"}}")
    SearchHits find(String keyword);
}

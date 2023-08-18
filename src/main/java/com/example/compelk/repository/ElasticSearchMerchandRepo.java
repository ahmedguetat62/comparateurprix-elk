package com.example.compelk.repository;

import com.example.compelk.entity.ElasticsearchMerchand;
import com.example.compelk.entity.Merchand;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ElasticSearchMerchandRepo extends ElasticsearchRepository<ElasticsearchMerchand,String> {
    List<ElasticsearchMerchand> findAll();

}

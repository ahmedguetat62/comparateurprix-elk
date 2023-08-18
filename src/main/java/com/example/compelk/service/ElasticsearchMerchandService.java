package com.example.compelk.service;

import com.example.compelk.entity.ElasticsearchMerchand;
import com.example.compelk.repository.ElasticSearchMerchandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElasticsearchMerchandService {

    private final ElasticsearchRestTemplate elasticsearchRestTemplate;
    private final ElasticSearchMerchandRepo elasticSearchMerchandRepo;

    @Autowired
    public ElasticsearchMerchandService(ElasticsearchRestTemplate elasticsearchRestTemplate, ElasticSearchMerchandRepo elasticSearchMerchandRepo) {
        this.elasticsearchRestTemplate = elasticsearchRestTemplate;
        this.elasticSearchMerchandRepo = elasticSearchMerchandRepo;
    }

    public void saveElasticsearchMerchand(ElasticsearchMerchand m) {

        //elasticsearchRestTemplate.save(m,);
        System.out.println("m"+m);
        try{

            elasticsearchRestTemplate.save(m);

        }catch(Exception e){
            System.out.println("here => "+e.getMessage());
        }
    }
    public List<ElasticsearchMerchand> getAllMerchand(){
        return elasticSearchMerchandRepo.findAll();
    }

    public Optional<ElasticsearchMerchand> findBySku(String sku) {
        return elasticSearchMerchandRepo.findById(sku);
    }
}

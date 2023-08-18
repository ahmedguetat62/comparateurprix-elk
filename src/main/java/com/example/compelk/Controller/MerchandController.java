package com.example.compelk.Controller;

import com.example.compelk.entity.ElasticsearchMerchand;
import com.example.compelk.entity.Merchand;
import com.example.compelk.service.ElasticsearchMerchandService;
import com.example.compelk.service.MerchandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController

@RequestMapping("/api")
public class MerchandController {
    private final Logger LOGGER = Logger.getLogger(MerchandController.class.getName());

    private final MerchandService merchandService;
    private final ElasticsearchMerchandService elasticsearchMerchandService;

    public MerchandController(MerchandService merchandService, ElasticsearchMerchandService elasticsearchMerchandService) {
        this.merchandService = merchandService;
        this.elasticsearchMerchandService = elasticsearchMerchandService;
    }
    @GetMapping("/getMerchand")
    public void getMerchand() {
        List<Merchand> allMerchands = merchandService.findAll();

        for (Merchand m : allMerchands) {
            if(m != null) {
                ElasticsearchMerchand elasticsearchMerchand = mapToElasticsearchMerchand(m);
                //System.out.println(elasticsearchMerchand.);
                try{
                    elasticsearchMerchandService.saveElasticsearchMerchand(elasticsearchMerchand);
                }catch(NullPointerException e){
                    e.printStackTrace();
                }
            }
        }

    }

    private ElasticsearchMerchand mapToElasticsearchMerchand(Merchand merchand) {
        ElasticsearchMerchand elasticsearchMerchand = new ElasticsearchMerchand();
        elasticsearchMerchand.setSku(merchand.getSku());
        elasticsearchMerchand.setProductName(merchand.getProductName());
        elasticsearchMerchand.setProductUrl(merchand.getProductUrl());
        elasticsearchMerchand.setImageUrl(merchand.getImageUrl());
        elasticsearchMerchand.setPrice(merchand.getPrice());
        elasticsearchMerchand.setCurrency(merchand.getCurrency());
        elasticsearchMerchand.setBrand(merchand.getBrand());
        elasticsearchMerchand.setCategory(merchand.getCategory());
        elasticsearchMerchand.setVariantGroup(merchand.getVariantGroup());
        elasticsearchMerchand.setVariantSize(merchand.getVariantSize());
        elasticsearchMerchand.setColor(merchand.getColor());
        elasticsearchMerchand.setMaterial(merchand.getMaterial());
        elasticsearchMerchand.setModel(merchand.getModel());
        elasticsearchMerchand.setAgeRange(merchand.getAgeRange());
        elasticsearchMerchand.setGender(merchand.getGender());

        return  elasticsearchMerchand;
    }
    @GetMapping("/getData")
    public List<ElasticsearchMerchand> getData(){
        getMerchand();
        return elasticsearchMerchandService.getAllMerchand();
    }
    @GetMapping("/search")
    public Optional<ElasticsearchMerchand> getSingleMerchand(@RequestParam("sku") String sku){
        return elasticsearchMerchandService.findBySku(sku);
    }
}

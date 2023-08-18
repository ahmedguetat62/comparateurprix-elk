package com.example.compelk.service;

import com.example.compelk.entity.Merchand;
import com.example.compelk.repository.MerchandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchandService {

    private final MerchandRepo merchandRepository;

    @Autowired
    public MerchandService(MerchandRepo merchandRepository) {
        this.merchandRepository = merchandRepository;
    }

    public Merchand findBySku(String sku) {
        return merchandRepository.findBySku(sku);
    }
    public List<Merchand> findAll(){
        return merchandRepository.findAll();
    }
}

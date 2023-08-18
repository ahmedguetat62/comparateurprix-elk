package com.example.compelk.repository;
import com.example.compelk.entity.Merchand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchandRepo extends JpaRepository<Merchand,String> {
    Merchand findBySku(String sku);
}

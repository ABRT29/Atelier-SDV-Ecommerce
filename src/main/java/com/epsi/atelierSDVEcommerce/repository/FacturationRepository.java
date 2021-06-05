package com.epsi.atelierSDVEcommerce.repository;

import com.epsi.atelierSDVEcommerce.model.Facturation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


public interface FacturationRepository extends CrudRepository<Facturation, Long> {
    @Query("SELECT * FROM facturation WHERE id = :id")
    public Facturation findFacturationById(@Param("id") Long id);
}

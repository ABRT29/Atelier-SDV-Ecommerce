package com.epsi.atelierSDVEcommerce.repository;

import com.epsi.atelierSDVEcommerce.model.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


public interface ClientRepository extends CrudRepository<Client, Long> {
    @Query("SELECT * FROM client WHERE email = :email")
    public Client findClientByEmail(@Param("email") String email);
}

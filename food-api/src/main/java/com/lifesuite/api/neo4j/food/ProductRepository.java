package com.lifesuite.api.neo4j.food;

import java.util.stream.Stream;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.lifesuite.domain.food.Product;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository extends Neo4jRepository<Product, Long>{
	
	Stream<Product> findByName(@Param("name") String name);
	
}

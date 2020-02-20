package com.example.demo.dao.copy;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.ProductEntity;
@RepositoryRestResource(path="products", collectionResourceRel="products")
public interface ProductRestResource extends PagingAndSortingRepository<ProductEntity,Integer>{
	List<ProductEntity> findByDescription(@Param("ds") String ds);

}

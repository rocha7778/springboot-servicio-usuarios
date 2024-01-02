package com.formacionbdi.springboot.app.usuarios.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.formacionbdi.springboot.app.commons.usuarios.models.entity.Usuario;



@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UsuerRepository extends PagingAndSortingRepository<Usuario, Long>, CrudRepository<Usuario,Long> {
	
	@RestResource(path = "buscar-user-by")
	public Usuario findByUsername(@Param("name") String username);

}

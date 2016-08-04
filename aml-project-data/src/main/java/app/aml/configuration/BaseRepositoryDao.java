package app.aml.configuration;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface BaseRepositoryDao <T, ID extends Serializable> extends Repository<T, ID> {
	void delete(T entity);
	 
    List<T> findAll();
     
    Optional<T> findOne(ID id);
    
    void save(T entity);
    
}

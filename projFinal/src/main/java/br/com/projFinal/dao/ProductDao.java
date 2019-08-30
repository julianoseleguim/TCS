package br.com.projFinal.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.projFinal.model.ProductModel;
import br.com.projFinal.repository.ProductRepository;

@Service
@Transactional
public class ProductDao {
	
	@Autowired    
	private ProductRepository repo;
	
	public List<ProductModel> listall(){
		return repo.findAll();
	}
	
	public ProductModel get(long id) {
		return repo.findById(id).get();
	}
	
	public void save(ProductModel product) {
		repo.save(product);
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
}

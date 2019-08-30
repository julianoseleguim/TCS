package br.com.projFinal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.projFinal.model.MarcaModel;
import br.com.projFinal.repository.MarcaRepository;

@Service
@Transactional
public class MarcaDao {
	
	@Autowired    
	private MarcaRepository repo;
	
	public List<MarcaModel> listall(){
		return repo.findAll();
	}
	
	public MarcaModel get(long id) {
		return repo.findById(id).get();
	}
	
	public void save(MarcaModel marca) {
		repo.save(marca);
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
}

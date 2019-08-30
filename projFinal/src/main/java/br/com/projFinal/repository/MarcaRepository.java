package br.com.projFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projFinal.model.MarcaModel;

public interface MarcaRepository extends JpaRepository<MarcaModel, Long>{
	
	
}

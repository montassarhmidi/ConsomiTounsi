package tn.esprit.spring.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.*;

@Repository
public interface AddRepository extends CrudRepository <Add, Integer> {
	//<Optional> Add findById(int id);

	@Query("select a from Add a where a.priceSponsoring>200 ")
    public List<Add> listAdd();
	
	@Query("select a.Image from Add a where a.id=:id")
	public byte[] getImage(@Param("id") int id);
	
	
	@Query("SELECT a FROM Add a WHERE a.name=: string")
	public Add getAddByName(@Param("string") String msg);
	
	@Query("SELECT a FROM Add a WHERE a.name LIKE CONCAT('%',:string,'%')")
	public List<Add> searchAdd(@Param("string") String msg);
}


package com.portfoliojr.jr.Service;

import com.portfoliojr.jr.Entity.hys;
import com.portfoliojr.jr.Repository.Rhys;
//import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Shys {
    @Autowired 
    Rhys rhys;
    
    public List<hys> list(){
        return rhys.findAll();
    }
    
    public Optional<hys> getOne(int id) {
        return rhys.findById(id);
    }
    
    public Optional<hys> getByNombre(String nombre){
        return rhys.findByNombre(nombre);
    }
    
    public void save(hys skill){
        rhys.save(skill);
    }
    
    public void delete(int id){
        rhys.deleteById(id);
    }
    
    public boolean existsById(int Id){
        return rhys.existsById(Id);
    }
    
    public boolean existsByNombre(String nombre){
        return rhys.existsByNombre(nombre);
    }
}

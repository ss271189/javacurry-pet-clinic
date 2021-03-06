package jc.springframework.service.map;

import jc.springframework.model.BaseEntity;

import java.util.*;

public class AbstractMapService<T extends BaseEntity,ID extends Long> {

    protected Map<Long, T> map= new HashMap<>();

    Set<T> findAll(){
       return new HashSet<>(map.values());
    }
    T findById(ID id){
        return map.get(id);
    }
    T save(T object){
        if(object!=null){
            if(object.getId()==null){
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else{
            throw new RuntimeException();
        }

        return object;
    }
    void deleteByID(ID id){
        map.remove(id);
    }
    void delete(final T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId(){
        try{
            return Collections.max(map.keySet())+1;
        } catch (NoSuchElementException ex){
            return 1L;
        }

    }
}

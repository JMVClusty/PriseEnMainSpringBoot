package com.ERP_Maison.repositery;

import java.util.List;
import java.util.Optional;

// basé sur le tuto: https://www.youtube.com/watch?v=0uLqdBpYAVA&ab_channel=DanVega
public interface DAO<T> {
	
	List<T> list();
	
	void create(T t);
	
	Optional<T> get(int id);
	
	void update(T t, int id);
	
	void delete(int id);

}

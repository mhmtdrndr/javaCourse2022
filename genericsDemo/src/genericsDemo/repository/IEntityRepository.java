package genericsDemo.repository;

import genericsDemo.entity.IEntity;

public interface IEntityRepository<T extends IEntity> {
	
	void add(T entity);
	void delete(T entity);
	void update(T entity);

}

package dmdev.cinema.mappers;

import jakarta.persistence.MappedSuperclass;

import java.util.List;

@MappedSuperclass
public interface BaseMapper <E,D> {
    E toEntity(D d);
    D toDto(E e);
    List<E> toEntities(List<D> list);
    List<D> toDtos(List<E> list);
}

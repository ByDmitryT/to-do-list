package ru.titov.taskmanagerserver.api.repository;

import ru.titov.taskmanagerserver.entity.AbstractEntity;

import java.util.List;
import java.util.Map;

public interface Repository<E extends AbstractEntity> {

    E merge(E entity);

    E getById(String entityId);

    E removeById(String entityId);

    boolean isExists(String entityId);

    List<E> getAll();

    Map<String, E> getData();

}
package ru.lukyanov.repo;

public interface Repo<E> {
    E getById(Long id);

    void update(E entity);
}
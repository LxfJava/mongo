package com.study.mongo.business.service;

import com.study.mongo.business.domain.UserEntity;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @description:
 * @author: 16000
 * @create: 2021/3/18     17:57
 */

public class UserRepository implements
    PagingAndSortingRepository<UserEntity, Long> {

  @Override
  public Iterable<UserEntity> findAll(Sort sort) {
    return null;
  }

  @Override
  public Page<UserEntity> findAll(Pageable pageable) {
    return null;
  }

  @Override
  public <S extends UserEntity> S save(S s) {
    return null;
  }

  @Override
  public <S extends UserEntity> Iterable<S> saveAll(Iterable<S> iterable) {
    return null;
  }

  @Override
  public Optional<UserEntity> findById(Long aLong) {
    return Optional.empty();
  }

  @Override
  public boolean existsById(Long aLong) {
    return false;
  }

  @Override
  public Iterable<UserEntity> findAll() {
    return null;
  }

  @Override
  public Iterable<UserEntity> findAllById(Iterable<Long> iterable) {
    return null;
  }

  @Override
  public long count() {
    return 0;
  }

  @Override
  public void deleteById(Long aLong) {

  }

  @Override
  public void delete(UserEntity userEntity) {

  }

  @Override
  public void deleteAll(Iterable<? extends UserEntity> iterable) {

  }

  @Override
  public void deleteAll() {

  }
}

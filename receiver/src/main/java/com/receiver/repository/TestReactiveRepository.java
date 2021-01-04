package com.receiver.repository;

import com.receiver.domain.TestEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Used only for test connection. We're use embedded mongo.
 */
@Repository
public interface TestReactiveRepository extends ReactiveCrudRepository<TestEntity, Long> {
}

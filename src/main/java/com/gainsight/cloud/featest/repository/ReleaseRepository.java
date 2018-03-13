package com.gainsight.cloud.featest.repository;

import com.gainsight.cloud.featest.model.execution.Release;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReleaseRepository extends ReactiveMongoRepository<Release, String> {
}

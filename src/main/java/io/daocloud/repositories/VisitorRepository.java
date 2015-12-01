package io.daocloud.repositories;

import io.daocloud.domains.Visitor;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Rocky on 15/11/27.
 */
public interface VisitorRepository extends MongoRepository<Visitor,String>{
}

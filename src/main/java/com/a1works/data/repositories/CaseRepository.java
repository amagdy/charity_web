package com.a1works.data.repositories;

import com.a1works.data.entities.Case;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cases", path = "cases")
public interface CaseRepository extends PagingAndSortingRepository<Case, Long> {

}

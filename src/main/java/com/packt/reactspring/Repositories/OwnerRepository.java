package com.packt.reactspring.Repositories;

import com.packt.reactspring.Entyties.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}

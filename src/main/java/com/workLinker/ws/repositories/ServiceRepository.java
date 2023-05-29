package com.workLinker.ws.repositories;

import com.workLinker.ws.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ServiceRepository extends JpaRepository<Service, Long> {

}

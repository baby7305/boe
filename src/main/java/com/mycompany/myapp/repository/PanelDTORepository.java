package com.mycompany.myapp.repository;

import com.mycompany.myapp.service.dto.PanelDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanelDTORepository extends MongoRepository<PanelDTO, String> {
}

package com.project.ppprapport.Services;

import com.project.ppprapport.DTO.OrdonnanceDto;
import com.project.ppprapport.DTO.SearchOrdonnance;
import com.project.ppprapport.Entity.Ordonnance;
import com.project.ppprapport.Exceptions.InvalidOrdonnanceDataException;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IOrdonnanceService {

    void createOrdonnance(Ordonnance ordonnance, String createdBy) throws InvalidOrdonnanceDataException;

    List<Ordonnance> getOrdonnanceForPatient(String nomMalade);

    List<String> getMedecinsForPatient(String nomMalade);

    List<Ordonnance> findAllOrdonnance(String createdBy);

    Ordonnance findOrdonnanceById(Long id, String createdBy);

    ResponseEntity<List<Ordonnance>> searchOrdonnance(SearchOrdonnance searchOrdonnance);

    void update(OrdonnanceDto ordonnanceDto, String createdBy, Long id) throws InvalidOrdonnanceDataException;

    ResponseEntity<Ordonnance> deleteOrdonnance(Long id);
}

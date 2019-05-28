package com.bcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bcs.entity.MasterIncident;

@Repository
public interface MasterIncidentRepository extends JpaRepository<MasterIncident, Integer> {

}

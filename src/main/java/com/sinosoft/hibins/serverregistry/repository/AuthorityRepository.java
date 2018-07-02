package com.sinosoft.hibins.serverregistry.repository;

import com.sinosoft.hibins.serverregistry.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}

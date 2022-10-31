package com.api.specification.repositories;

import com.api.specification.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> , UsuarioRepositoryQueries, JpaSpecificationExecutor<UsuarioModel> {
}

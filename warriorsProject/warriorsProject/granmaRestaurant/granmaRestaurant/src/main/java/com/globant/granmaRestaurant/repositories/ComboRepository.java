package com.globant.granmaRestaurant.repositories;

import com.globant.granmaRestaurant.model.entity.ComboEntity;
import io.micrometer.common.lang.NonNullApi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
@NonNullApi
public interface ComboRepository extends JpaRepository<ComboEntity, Integer> {
    Optional<ComboEntity> findByUuid(String uuid);
    void deleteByUuid(String uuid);

    Optional<ComboEntity> findByFantasyName(String fantasyName);
    List<ComboEntity> findByFantasyNameContainingIgnoreCaseOrderByFantasyNameAsc(String fantasyName);
}

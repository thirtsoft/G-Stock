package org.sid.repository;

import org.sid.entites.MvtStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MvtStockRepository extends JpaRepository<MvtStock, Long> {

}

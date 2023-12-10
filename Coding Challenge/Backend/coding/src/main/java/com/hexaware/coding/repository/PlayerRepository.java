package com.hexaware.coding.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.coding.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer>{

	@Query(value="select p.* from Player p where p.total_matches=(select max(p1.total_matches) from Player p1)",nativeQuery=true)
	public Player getMaxMatchesPlayer();
}

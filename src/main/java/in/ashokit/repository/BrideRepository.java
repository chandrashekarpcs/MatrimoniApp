package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.BrideEntity;

@Repository
public interface BrideRepository extends JpaRepository<BrideEntity, Long> {
	
//	BrideEntity findByBrideNameBrideProfile(String name, String profile);

}

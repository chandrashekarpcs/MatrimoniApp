package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import in.ashokit.entity.BrideEntity;

public interface BrideService {
	
	String saveBride(BrideEntity brideEntity); 
	List<BrideEntity> getAllBrides();
	
	Optional<BrideEntity> getBride(Long id);
	
	BrideEntity getByBrideNameAndBrideProfile(String name, String profile);

}

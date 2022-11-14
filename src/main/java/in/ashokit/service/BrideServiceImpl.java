package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.BrideEntity;
import in.ashokit.repository.BrideRepository;

@Service
public class BrideServiceImpl implements BrideService {

	@Autowired
	private BrideRepository  repo;
	 
	@Override
	public String saveBride(BrideEntity brideEntity) {
		BrideEntity save = repo.save(brideEntity);
		if(save!=null)
		{
			return "You or Your Bride Deatils are saved with US**** ";
		}
		
		return null;
	}

	@Override
	public List<BrideEntity> getAllBrides() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<BrideEntity> getBride(Long id) {
		// TODO Auto-generated method stub
		 Optional<BrideEntity> findById = repo.findById(id);
		 if(findById.isPresent())
		 {
			 return findById;
		 }
		 else
		 {
			 return null;
		 }
	}

	@Override
	public BrideEntity getByBrideNameAndBrideProfile(String name, String profile) {
		// TODO Auto-generated method stub
		return null;
	}

}

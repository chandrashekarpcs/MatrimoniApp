package in.ashokit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.BrideEntity;
import in.ashokit.service.BrideService;

@RestController
@RequestMapping("/marriage")
public class BrideController {
	
	@Autowired
	private BrideService brideService;
	
	@PostMapping("/saveBride")
	
	public String saveBride(@RequestBody BrideEntity brideEntity)
	{
		return brideService.saveBride(brideEntity);
	}
	
   @GetMapping("/getBrides")
	public List<BrideEntity> getAllBrides()
	{
		return brideService.getAllBrides();
	}
   
   @GetMapping("/getBride")
  	public Optional<BrideEntity> getAllBrides(@RequestParam Long id)
  	{
  		return brideService.getBride(id);
  	}
     
   
   @GetMapping("/getBYName")
  	public BrideEntity getAllBrides(@RequestParam String name, @RequestParam String profile)
  	{
  		return brideService.getByBrideNameAndBrideProfile(name, profile);
  	}
     
	

}

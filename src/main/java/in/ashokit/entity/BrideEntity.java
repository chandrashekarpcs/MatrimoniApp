package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Component
@Table(name="bride_tab")
@AllArgsConstructor
@NoArgsConstructor
public class BrideEntity {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="bride_profile")
	private String brideProfile;
	
	@Column(name="bride_name")
	private String brideName;

	@Column(name="bride_phone")
	private String bridePhone;
	
	

}

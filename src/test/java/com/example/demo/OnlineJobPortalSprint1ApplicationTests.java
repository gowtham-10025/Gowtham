package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.CoreMatchers.notNullValue;

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
<<<<<<< HEAD

=======
>>>>>>> branch 'main' of https://github.com/SaptorshiBhattacharjee/OnlineJobPortal_CG_Sprint1
import static org.mockito.Mockito.when;

import com.jobportal.dto.AdminDTO;
import com.jobportal.exception.InvalidAdminException;
import com.jobportal.repository.IAdminDao;
import com.jobportal.service.IAdminService;
import com.jobportal.service.IAdminServiceImpl;
<<<<<<< HEAD




=======
>>>>>>> branch 'main' of https://github.com/SaptorshiBhattacharjee/OnlineJobPortal_CG_Sprint1

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.CrudRepository;

import com.jobportal.OnlineJobPortalSprint1Application;
import com.jobportal.dto.FeedbackDTO;
import com.jobportal.dto.JobDTO;
import com.jobportal.dto.RecruiterDTO;
import com.jobportal.entity.Feedback;
import com.jobportal.entity.Freelancer;
import com.jobportal.entity.Job;
import com.jobportal.entity.JobApplication;
import com.jobportal.entity.Recruiter;
import com.jobportal.entity.Skill;
import com.jobportal.exception.InvalidJobException;
import com.jobportal.exception.InvalidRecruiterException;
import com.jobportal.repository.IJobDao;
import com.jobportal.repository.IRecruiterDao;
import com.jobportal.service.IJobService;
import com.jobportal.service.IJobServiceImpl;
import com.jobportal.service.IRecruiterService;
import com.jobportal.service.IRecruiterServiceImpl;
<<<<<<< HEAD

=======
>>>>>>> branch 'main' of https://github.com/SaptorshiBhattacharjee/OnlineJobPortal_CG_Sprint1

@SpringBootTest(classes = OnlineJobPortalSprint1Application.class)
class OnlineJobPortalSprint1ApplicationTests {

//	@Mock
//	IRecruiterDao iRecruiterDao;
//	
//	@InjectMocks
//	IRecruiterService iRecruiterService = new IRecruiterServiceImpl();

<<<<<<< HEAD

=======
>>>>>>> branch 'main' of https://github.com/SaptorshiBhattacharjee/OnlineJobPortal_CG_Sprint1

	/*@Test
	void saveRecruiter() throws InvalidRecruiterException{
		RecruiterDTO recruiterDto = new RecruiterDTO();
		Feedback feedback1 = new Feedback();
		Feedback feedback2 = new Feedback();
		Feedback feedback3 = new Feedback();
		List<Feedback> feedbacks= new ArrayList<>();
		Collections.addAll(feedbacks,feedback1,feedback2,feedback3);
		recruiterDto.setFirstName("Sri");
		recruiterDto.setLastName("Ram");
		recruiterDto.setFeedbacks(feedbacks);
		
	}*/
	
<<<<<<< HEAD
=======

>>>>>>> branch 'main' of https://github.com/SaptorshiBhattacharjee/OnlineJobPortal_CG_Sprint1
	@Mock
	IAdminDao iAdminDao;
	

	@InjectMocks
<<<<<<< HEAD

=======
>>>>>>> branch 'main' of https://github.com/SaptorshiBhattacharjee/OnlineJobPortal_CG_Sprint1

	IAdminService iAdminService =  new IAdminServiceImpl();

<<<<<<< HEAD



	

=======
>>>>>>> branch 'main' of https://github.com/SaptorshiBhattacharjee/OnlineJobPortal_CG_Sprint1
	IJobService ijobservice = new IJobServiceImpl();
	
	@BeforeEach
	void setup1()throws InvalidJobException {
		Skill skill = new Skill();
		skill.setId(201);
		
		Recruiter recruit = new Recruiter();
		recruit.setId(301);
		JobDTO jobdto = new JobDTO();
        List<JobApplication> jobApplications = jobdto.getJobApplications();
        Freelancer freelancer = new Freelancer();
        Recruiter recruiter = new Recruiter();
        jobdto.setId(jobdto.getId());
        jobdto.setSkill(skill);
        jobdto.setPostedBy(recruiter);
		jobdto.setPostedDate(LocalDate.now());
        jobdto.setAwardedTo(freelancer);
        jobdto.setActive(true);
        jobdto.setJobApplications(jobApplications);
        Job j = jobdto.toJob();
        //assertEquals(1,ijobdao.save(j));
       
}
	@Test
	void setup() {
		Job job = new Job();
		job.setId(1);
		job.setPostedDate(LocalDate.now());
		Boolean active = true;
		job.setActive(active);
		Skill skill = new Skill(1,"Java","Description of java");
		job.setSkill(skill);
		
		Recruiter recruiter = new Recruiter();
		Feedback feedback1 = new Feedback();
		Feedback feedback2 = new Feedback();
		Feedback feedback3 = new Feedback();
		List<Feedback> feedbacks= new ArrayList<>();
		Collections.addAll(feedbacks,feedback1,feedback2,feedback3);
		recruiter.setFirstName("Sri");
		recruiter.setLastName("Ram");
		recruiter.setFeedbacks(feedbacks);
		job.setPostedBy(recruiter);
		
		JobApplication jobapplication1 = new JobApplication();
		JobApplication jobapplication2 = new JobApplication(); 
		JobApplication jobapplication3 = new JobApplication(); 
		List<JobApplication> jobapplication = new ArrayList<>();
		Collections.addAll(jobapplication,jobapplication1,jobapplication2,jobapplication3);
		job.setJobApplications(jobapplication);
<<<<<<< HEAD
=======
	}
>>>>>>> branch 'main' of https://github.com/SaptorshiBhattacharjee/OnlineJobPortal_CG_Sprint1

<<<<<<< HEAD
	}

	
	
	

=======
>>>>>>> branch 'main' of https://github.com/SaptorshiBhattacharjee/OnlineJobPortal_CG_Sprint1
	@Test
	public void addNewAdminTest() throws InvalidAdminException {
		AdminDTO adminDTO  = new AdminDTO();
		adminDTO.setFirstName("John");
		adminDTO.setLastName("Jack");
		adminDTO.setPassword("John123");
		Mockito.when(iAdminDao.save(adminDTO.toAdmin())).thenReturn(adminDTO.toAdmin());
		AdminDTO actual = iAdminService.save(adminDTO);
		Assertions.assertEquals(adminDTO, actual);
	} 
/*	
	@Test
	public void authenticateCustomerTestInValidCredentials() throws InvalidAdminException {
		AdminDTO adminDTOFromRepository  = new AdminDTO();
		adminDTOFromRepository.setFirstName("John");
		adminDTOFromRepository.setLastName("Jack");
		adminDTOFromRepository.setPassword("John123");
		
		AdminDTO adminDTO  = new AdminDTO();
		adminDTO.setFirstName("");
		adminDTO.setLastName("");
		adminDTO.setPassword("");
	
		
		Mockito.when(iAdminDao.save(adminDTO.toAdmin())).thenReturn(adminDTOFromRepository.toAdmin());
	    InValidAdminException exception=Assertions.assertThrows(InvalidAdminException.class,()->InvalidAdminService.saver(adminDTO));
		Assertions.assertEquals("Service.WRONG_CREDENTIALS", exception.getMessage());
	}
*/	
	@Test
	public void updateAdminTests() throws InvalidAdminException {
		AdminDTO adminDTO  = new AdminDTO();
		adminDTO.setId(1);
		adminDTO.setFirstName("John");
		adminDTO.setLastName("Jack");
		adminDTO.setPassword("John123");
		Optional<com.jobportal.entity.Admin> optional= Optional.of(adminDTO.toAdmin());
		Mockito.when(iAdminDao.findById(adminDTO.getId())).thenReturn(optional);
		AdminDTO actual = iAdminService.update(adminDTO);
		Assertions.assertEquals(adminDTO ,actual);
	}
	/*
	@Test
	public void invalidAdminUpdateTests() throws InvalidAdminException{
		AdminDTO adminDTO  = new AdminDTO();
		adminDTO.setId(1);
		adminDTO.setFirstName("John");
		adminDTO.setLastName("Jack");
		adminDTO.setPassword("John123");
		Mockito.when(iAdminDao.findById(adminDTO.getId())).thenReturn(null);
		AdminDTO actual = iAdminService.update(adminDTO);
		Assertions.assertThrows(InvalidAdminException, actual);
		
	}
	*/

}

package com.jobportal.dto;

import com.jobportal.entity.Freelancer;
import com.jobportal.entity.Recruiter;

public class FeedbackDTO {
	private long id;
	private Integer rating;
	private String comment;
	private Recruiter createdBy;
	private Freelancer createdFor;
	
	
	
	public FeedbackDTO() {
		super();
	}
	
	
	public FeedbackDTO(long id, Integer rating, String comment, Recruiter createdBy, Freelancer createdFor) {
		super();
		this.id = id;
		this.rating = rating;
		this.comment = comment;
		this.createdBy = createdBy;
		this.createdFor = createdFor;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Recruiter getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Recruiter createdBy) {
		this.createdBy = createdBy;
	}
	public Freelancer getCreatedFor() {
		return createdFor;
	}
	public void setCreatedFor(Freelancer createdFor) {
		this.createdFor = createdFor;
	}
	@Override
	public String toString() {
		return "FeedbackDTO [id=" + id + ", rating=" + rating + ", comment=" + comment + ", createdBy=" + createdBy
				+ ", createdFor=" + createdFor + "]";
	}

}

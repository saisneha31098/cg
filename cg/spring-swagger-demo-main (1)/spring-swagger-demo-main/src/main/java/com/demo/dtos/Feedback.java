package com.cg.swagger.feedback.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Feedback {
	
	@Id
	@Column
	private int feedbackId;
	@Column
	private double ratings; // ratings should be between 1-5
	@Column
	private String comments;
	
	
	public Feedback() {
		super();
	}
	public Feedback(int feedbackId, double ratings, String comments) {
		super();
		this.feedbackId = feedbackId;
		this.ratings = ratings;
		this.comments = comments;
	}
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", ratings=" + ratings + ", comments=" + comments + "]";
	}
	
}
	
	
	
package com.cg.swagger.feedback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.swagger.feedback.dto.Feedback;
import com.cg.swagger.feedback.service.FeedbackService;

@RestController
@RequestMapping("/Feedback")
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;
	
	@GetMapping("/Feedback")
	public List<Feedback> getAllFeedback()
	{
		return feedbackService.getAllFeedback();
	}
	
	@GetMapping("/Feedback/{feedbackId}")
	public Feedback getFeedbackByfeedbackId(@PathVariable("feedbackId") int feedbackId)
	{
		return feedbackService.getFeedbackByfeedbackId(feedbackId);
	}
	
	@DeleteMapping("/Feedback/{feedbackId}")
	public void deleteFeedback(@PathVariable("feedbackId") int feedbackId)
	{
		feedbackService.deleteFeedback(feedbackId);
	}
	
	@PostMapping("/Feedback")
	public Feedback insertFeedback(@RequestBody Feedback feedback)
	{
		return feedbackService.insertFeedback(feedback);
	
	}
	
	@PutMapping("/Feedback")
	public Feedback updateFeedback(@RequestBody Feedback feedback)
	{
		return feedbackService.updateFeedback(feedback);
	}
}

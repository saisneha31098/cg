package com.cg.swagger.feedback.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.swagger.feedback.dto.Feedback;
import com.cg.swagger.feedback.exception.UnknownUserException;
import com.cg.swagger.feedback.repository.FeedbackRepository;


@Service
public class FeedbackService {
	@Autowired
	FeedbackRepository feedbackRepository;

	

		public Feedback insertFeedback(Feedback feedback) {
       
			Feedback a= feedbackRepository.save(feedback);
			int b=(int)a.getFeedbackId();
			if(b==0)
			{
				try 
				{
					throw new UnknownUserException("Please enter correct details");
					}
					catch(UnknownUserException uue)
					{
						System.out.println(uue);
					}
			
			}
			else
			{
				return a;
			}
			return null;
		}


		
	

	public List<Feedback> getAllFeedback() {
		List<Feedback> li = feedbackRepository.findAll();
		return li;
	}
	public Feedback updateFeedback (Feedback feedback) {
		// TODO Auto-generated method stub
		 
				return feedbackRepository.save(feedback);
	        
	}
		
	
	

	public Feedback getFeedbackByfeedbackId(int feedbackId) {
	
		return feedbackRepository.findById(feedbackId).get();
		
		
	}

	 

	public void deleteFeedback(int feedbackId) {
		// TODO Auto-generated method stub
		
		feedbackRepository.deleteById(feedbackId);
		
}
}
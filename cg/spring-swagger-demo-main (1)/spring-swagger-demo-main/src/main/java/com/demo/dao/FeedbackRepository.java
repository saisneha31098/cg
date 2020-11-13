package com.cg.swagger.feedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.plugin.core.PluginRegistry;

import com.cg.swagger.feedback.dto.Feedback;

import java.util.List;



public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
	List<Feedback> findAll();


}

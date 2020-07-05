package com.cg.PPS.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.PPS.bean.Job;

/**
 * @author Madhura
 *
 */
public interface JobDao extends JpaRepository<Job,Integer> {

}

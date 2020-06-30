package com.cg.PPS.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.PPS.bean.AdminUser;

/**
 * @author Madhura
 *
 */
public interface AdminDao extends JpaRepository<AdminUser,Integer> {
	
}

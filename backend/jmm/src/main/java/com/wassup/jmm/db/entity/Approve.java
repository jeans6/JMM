package com.wassup.jmm.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="approve", schema = "jmm")
@Getter @Setter
public class Approve {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;
	
	@JoinColumn(name = "group_id")
	private String group;

	@JoinColumn(name = "board_id")
	private String board;

	@JoinColumn(name = "user_id")
	private User user;

    @Column(name = "is_approve", length = 1)
	private String isApprove;
	
}
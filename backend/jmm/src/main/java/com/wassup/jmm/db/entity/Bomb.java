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
@Table(name="bomb", schema = "jmm")
@Getter @Setter
public class Bomb {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bomb_id")
	private Integer bombId;
	
	@JoinColumn(name = "user_id")
	private User user;
	
	@JoinColumn(name = "group_id")
	private String group;
	//private Group group;

    @Column(name = "image", length = 1000)
	private String image;
	
}
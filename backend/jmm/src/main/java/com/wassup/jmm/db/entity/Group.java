package com.wassup.jmm.db.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.wassup.jmm.db.entity.type.CommonType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="group", schema = "jmm")
@Getter @Setter
public class Group {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
	private Integer groupId;
	
	@Column(name = "name", length = 50)
	private String name;
	
	@Column(name = "goal", length = 300)
	private String goal;

	@Column(name = "limit")
	private Integer limit;

	@Column(name = "standard", length = 300)
	private String standard;

	@Column(name = "penalty", length = 300)
	private String penalty;

	@Column(name = "start_date")
	private LocalDateTime startDate;

	@Column(name = "end_date")
	private LocalDateTime endDate;

	@Column(name = "created_at")
	private LocalDateTime createdAt;

	@Column(name = "link", length = 1000)
	private String link;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToMany(mappedBy = "group" )
	private List<Board> boards = new ArrayList<>();	

	@OneToMany(mappedBy = "group" )
	private List<Bomb> bombs = new ArrayList<>();	

	@OneToMany(mappedBy = "group" )
	private List<Approve> approves = new ArrayList<>();	

}
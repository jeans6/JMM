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
@Table(name="board", schema = "jmm")
@Getter @Setter
public class Board {
	 
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
	private Integer boardId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "group_id")
	private Group group;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

    @Column(name = "title", length = 300)
	private String title;
	
    @Column(name = "content", length = 1000)
	private String content;
	
    @Column(name = "file", length = 1000)
	private String file;
	
    @Enumerated(EnumType.STRING)
	@Column(name = "is_approve", length = 1)
	private CommonType isApprove;
	
	@Column(name = "created_at")
	private LocalDateTime created_at;
	
	@OneToMany(mappedBy = "board" )
	private List<Approve> approves = new ArrayList<>();	
	
	
}
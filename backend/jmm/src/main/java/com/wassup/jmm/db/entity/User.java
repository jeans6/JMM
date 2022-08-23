package com.wassup.jmm.db.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wassup.jmm.db.entity.type.CommonType;
import com.wassup.jmm.db.entity.type.UserType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="user", schema = "jmm")
@Getter @Setter
public class User {

	@Id
	@Column(name = "user_id", length = 50)
	private String userId;
	
	@Column(name = "nickname", length = 50)
	private String nickname;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "type", length = 1)
	private UserType type;
	
	@Column(name = "image", length = 1000)
	private String image;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "is_del", length = 1)
	private CommonType isDel;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
//	@JsonIgnore
	@OneToMany(mappedBy = "user" )
    private List<Group> groups = new ArrayList<>();	
	
	@OneToMany(mappedBy = "user" )
	private List<Board> boards = new ArrayList<>();	
	
	@OneToMany(mappedBy = "user" )
	private List<Bomb> bombs = new ArrayList<>();	
	
	@OneToMany(mappedBy = "user" )
	private List<Approve> approves = new ArrayList<>();	
	
	
}

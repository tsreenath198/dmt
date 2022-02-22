package com.usk.dmt.entities;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name="support_tracker")
@Data
public class SupportTracker implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="date")
	private Date date;

	@Column(name="description")
	private String description;

	@Column(name="hours")
	private String hours;

	@Column(name="support_by")
	private int supportBy;

	@Column(name="support_to")
	private int supportTo;

}
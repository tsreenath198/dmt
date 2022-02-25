package com.usk.dmt.entities;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name="support_tracker")
@Data
public class SupportTracker extends CommonEntity<Integer> implements Serializable, BaseEntity<SupportTracker> {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="date")
	private Date date;

	@Column(name="hours")
	private String hours;

	@Column(name="support_by")
	private int supportBy;

	@Column(name="support_to")
	private int supportTo;

}
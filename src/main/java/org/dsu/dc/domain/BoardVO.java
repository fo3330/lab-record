package org.dsu.dc.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	private long bno;//누적인원수
	private String title;//이름.
	private long stdno;//학번.
	private String content;//사유,
	private String writer;//pc 번호.	
	private String regdate;//입실 시각.
	private String updateDate;// 퇴실 시각.
}

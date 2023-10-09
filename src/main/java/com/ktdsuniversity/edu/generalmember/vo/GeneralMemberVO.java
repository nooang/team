package com.ktdsuniversity.edu.generalmember.vo;

public class GeneralMemberVO {
	private String generalMemberId;
	private String selfIntro;
	private String jobId;
	private String region;
	private String tierId;
	private String githubUrl;
	private String email;
	
	
	String getGeneralMemberId() {
		return generalMemberId;
	}
	void setGeneralMemberId(String generalMemberId) {
		this.generalMemberId = generalMemberId;
	}
	String getSelfIntro() {
		return selfIntro;
	}
	void setSelfIntro(String selfIntro) {
		this.selfIntro = selfIntro;
	}
	String getJobId() {
		return jobId;
	}
	void setJobId(String jobId) {
		this.jobId = jobId;
	}
	String getRegion() {
		return region;
	}
	void setRegion(String region) {
		this.region = region;
	}
	String getTierId() {
		return tierId;
	}
	void setTierId(String tierId) {
		this.tierId = tierId;
	}
	String getGithubUrl() {
		return githubUrl;
	}
	void setGithubUrl(String githubUrl) {
		this.githubUrl = githubUrl;
	}
	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
}

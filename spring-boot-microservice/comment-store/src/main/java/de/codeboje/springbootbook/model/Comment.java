package de.codeboje.springbootbook.model;

import java.io.Serializable;
import java.time.Instant;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Comment implements Serializable {

	private static final long serialVersionUID = 8926987149780391093L;

	@Id
	private String id;

	@Version
	private Integer version;

	private Instant lastModificationDate;

	private Instant creationDate;

	private String pageId;

	private String username;

	private String emailAddress;

	private boolean spam;
	
	private String comment;

	public boolean isSpam() {
		return spam;
	}

	public void setSpam(boolean spam) {
		this.spam = spam;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Comment)) {

			return false;
		}

		Comment other = (Comment) o;

		// if the id is missing, return false
		if (id == null) {
			return false;
		}

		// equivalence by id
		return id.equals(other.getId());
	}

	public String getComment() {
		return comment;
	}

	public Instant getCreationDate() {
		return creationDate;
	}

	public String getId() {
		return id;
	}

	public Instant getLastModificationDate() {
		return lastModificationDate;
	}

	public String getPageId() {
		return pageId;
	}

	public String getUsername() {
		return username;
	}

	public Integer getVersion() {
		return version;
	}

	public int hashCode() {
		if (id != null) {
			return id.hashCode();
		} else {
			return super.hashCode();
		}
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setCreationDate(Instant creationDate) {
		this.creationDate = creationDate;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setLastModificationDate(Instant lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

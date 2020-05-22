package in.codeblog.tdms.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
public class Document {
    
	@Id
	@GeneratedValue
	private long documentId;
	@NotBlank(message="subject is required")
	private String subject;
	@NotBlank(message="topic is required")
	private String topic;
	@NotBlank(message="subtopic is required") //this is document name.
	private String subTopic;
	@NotBlank(message="tags is required")
	private String tags;
	
	//@NotBlank(message="content is required")
	@Column(columnDefinition="MEDIUMTEXT")
	private String content;
	   @JsonFormat(pattern="yyyy-MM-dd")
	   private Date created_at;
	   @JsonFormat(pattern="yyyy-MM-dd")
	   private Date updated_at;
	
	public Document() {
		super();
	}
	public long getDocumentId() {
		return documentId;
	}
	public void setDocumentId(long documentId) {
		this.documentId = documentId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getSubTopic() {
		return subTopic;
	}
	public void setSubTopic(String subTopic) {
		this.subTopic = subTopic;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@PrePersist
	protected void onCreate() {
		this.created_at=new Date();
	}
	@PreUpdate
	protected void onUpdate() {
		this.updated_at=new Date();
	}
	 
}

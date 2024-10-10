package vn.iostar.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity


@Table(name="Videos")


@NamedQuery(name="Video.findAll", query="SELECT v FROM Video v")
public class Video implements Serializable {
	
	 @Id


	 @Column(name="VideoId")


	 private String videoId;



	 @Column(name="Active")


	 private int active;



	 @Column(name="Description")


	 private String description;



	 @Column(name="Poster")


	 private String poster;



	 @Column(name="Title")


	 private String title;



	 @Column(name="Views")


	 private int views;
	 
	 @ManyToOne
	 @JoinColumn(name="CategoryId")
	 private Category category;
	 
	 public Video() {
	 }
	 
	 
 public String getVideoId() {
		 return this.videoId;
		 }

  public void setVideoId(String videoId) {
		 this.videoId = videoId;
		 }
	
  public Category getCategory() {
	  return this.category;
	  }

	  public void setCategory(Category category) {
	  this.category = category;
	  }



}

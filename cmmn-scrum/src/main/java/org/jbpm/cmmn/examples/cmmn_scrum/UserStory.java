/**Do not edit: generated from uml.*/
package org.jbpm.cmmn.examples.cmmn_scrum;
import org.jbpm.cmmn.examples.cmmn_scrum.SprintPlan;
import org.jbpm.cmmn.examples.cmmn_scrum.User;
import org.jbpm.cmmn.examples.cmmn_scrum.UserStorySize;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
@Entity(name="UserStory")
@Table(name="user_story")
public class UserStory{
  @Id
  @GeneratedValue
  String id;
  @OneToOne()
  @JoinColumns(value={
        @JoinColumn(name="as_user_id",referencedColumnName="id")}
  )
  private User asUser = null;
  @Basic()
  @Column(name="benefit")
  private String benefit = "";
  @Basic()
  @Column(name="goal")
  private String goal = "";
  @Basic()
  @Column(name="name")
  private String name = "";
  @Enumerated()
  private UserStorySize size = null;
  @OneToOne()
  @JoinColumns(value={
        @JoinColumn(name="sprint_backlog_id",referencedColumnName="id")}
  )
  private SprintPlan sprintBacklog = null;
  public UserStory(){
  }
  public String getId(){
    return this.id;
  }
  public void setId(String value){
    this.id=value;
  }
  public User getAsUser(){
    User result = this.asUser;
    return result;
  }
  public String getBenefit(){
    String result = this.benefit;
    return result;
  }
  public String getGoal(){
    String result = this.goal;
    return result;
  }
  public String getName(){
    String result = this.name;
    return result;
  }
  public UserStorySize getSize(){
    UserStorySize result = this.size;
    return result;
  }
  public SprintPlan getSprintBacklog(){
    SprintPlan result = this.sprintBacklog;
    return result;
  }
  public void setAsUser(User newAsUser){
    this.asUser=newAsUser;
  }
  public void setBenefit(String newBenefit){
    this.benefit=newBenefit;
  }
  public void setGoal(String newGoal){
    this.goal=newGoal;
  }
  public void setName(String newName){
    this.name=newName;
  }
  public void setSize(UserStorySize newSize){
    this.size=newSize;
  }
  public void setSprintBacklog(SprintPlan newSprintBacklog){
    SprintPlan oldValue = this.sprintBacklog;
    if(( newSprintBacklog == null || !(newSprintBacklog.equals(oldValue)) )){
      this.sprintBacklog=newSprintBacklog;
      if(!(oldValue == null)){
        oldValue.setIncludedStories(null);
      }
      if(!(newSprintBacklog == null)){
        if(!(this.equals(newSprintBacklog.getIncludedStories()))){
          newSprintBacklog.setIncludedStories(this);
        }
      }
    }
  }
}

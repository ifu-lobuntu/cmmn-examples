/**Do not edit: generated from uml.*/
package org.jbpm.cmmn.examples.cmmn_scrum;
import org.jbpm.cmmn.examples.cmmn_scrum.ProductBacklog;
import org.jbpm.cmmn.examples.cmmn_scrum.ProductDefinition;
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
import javax.persistence.ManyToOne;
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
  @ManyToOne()
  @JoinColumns(value={
        @JoinColumn(name="backlog_id",referencedColumnName="id")}
  )
  private ProductBacklog backlog = null;
  @Basic()
  @Column(name="benefit")
  private String benefit = "";
  @Basic()
  @Column(name="goal")
  private String goal = "";
  @Basic()
  @Column(name="name")
  private String name = "";
  @OneToOne()
  @JoinColumns(value={
        @JoinColumn(name="product_definition_id",referencedColumnName="id")}
  )
  private ProductDefinition productDefinition = null;
  @Enumerated()
  private UserStorySize size = null;
  public UserStory(){
  }
  public UserStory(ProductDefinition owner){
  this.setProductDefinition(owner);
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
  public ProductBacklog getBacklog(){
    ProductBacklog result = this.backlog;
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
  public ProductDefinition getProductDefinition(){
    ProductDefinition result = this.productDefinition;
    return result;
  }
  public UserStorySize getSize(){
    UserStorySize result = this.size;
    return result;
  }
  public void setAsUser(User newAsUser){
    this.asUser=newAsUser;
  }
  public void setBacklog(ProductBacklog newBacklog){
    if(!(newBacklog == null)){
      newBacklog.getStories().add(this);
    } else {
      if(!(this.backlog == null)){
        this.backlog.getStories().remove(this);
      }
    }
    this.backlog=newBacklog;
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
  public void setProductDefinition(ProductDefinition newProductDefinition){
    ProductDefinition oldValue = this.productDefinition;
    if(( newProductDefinition == null || !(newProductDefinition.equals(oldValue)) )){
      this.productDefinition=newProductDefinition;
      if(!(oldValue == null)){
        oldValue.setEnd2Name(null);
      }
      if(!(newProductDefinition == null)){
        if(!(this.equals(newProductDefinition.getEnd2Name()))){
          newProductDefinition.setEnd2Name(this);
        }
      }
    }
  }
  public void setSize(UserStorySize newSize){
    this.size=newSize;
  }
}

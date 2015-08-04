/**Do not edit: generated from uml.*/
package org.jbpm.cmmn.examples.cmmn_scrum;
import org.jbpm.cmmn.examples.cmmn_scrum.ProductPlan;
import org.jbpm.cmmn.examples.cmmn_scrum.UserStory;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity(name="SprintPlan")
@Table(name="sprint_plan")
public class SprintPlan{
  @Id
  @GeneratedValue
  String id;
  @Temporal(TemporalType.DATE)
  @Column(name="end_date")
  private Date endDate = null;
  @OneToOne(mappedBy="sprintBacklog")
  private UserStory includedStories = null;
  @OneToOne()
  @JoinColumns(value={
        @JoinColumn(name="product_plan_id",referencedColumnName="id")}
  )
  private ProductPlan productPlan = null;
  @Temporal(TemporalType.DATE)
  @Column(name="start_date")
  private Date startDate = null;
  public SprintPlan(){
  }
  public SprintPlan(ProductPlan owner){
  this.setProductPlan(owner);
  }
  public String getId(){
    return this.id;
  }
  public void setId(String value){
    this.id=value;
  }
  public Date getEndDate(){
    Date result = this.endDate;
    return result;
  }
  public UserStory getIncludedStories(){
    UserStory result = this.includedStories;
    return result;
  }
  public ProductPlan getProductPlan(){
    ProductPlan result = this.productPlan;
    return result;
  }
  public Date getStartDate(){
    Date result = this.startDate;
    return result;
  }
  public void setEndDate(Date newEndDate){
    this.endDate=newEndDate;
  }
  public void setIncludedStories(UserStory newIncludedStories){
    UserStory oldValue = this.includedStories;
    if(( newIncludedStories == null || !(newIncludedStories.equals(oldValue)) )){
      this.includedStories=newIncludedStories;
      if(!(oldValue == null)){
        oldValue.setSprintBacklog(null);
      }
      if(!(newIncludedStories == null)){
        if(!(this.equals(newIncludedStories.getSprintBacklog()))){
          newIncludedStories.setSprintBacklog(this);
        }
      }
    }
  }
  public void setProductPlan(ProductPlan newProductPlan){
    ProductPlan oldValue = this.productPlan;
    if(( newProductPlan == null || !(newProductPlan.equals(oldValue)) )){
      this.productPlan=newProductPlan;
      if(!(oldValue == null)){
        oldValue.setEnd2Name(null);
      }
      if(!(newProductPlan == null)){
        if(!(this.equals(newProductPlan.getEnd2Name()))){
          newProductPlan.setEnd2Name(this);
        }
      }
    }
  }
  public void setStartDate(Date newStartDate){
    this.startDate=newStartDate;
  }
}

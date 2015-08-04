/**Do not edit: generated from uml.*/
package org.jbpm.cmmn.examples.cmmn_scrum;
import org.jbpm.cmmn.examples.cmmn_scrum.SprintPlan;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity(name="ProductPlan")
@Table(name="product_plan")
public class ProductPlan{
  @Id
  @GeneratedValue
  String id;
  @OneToOne(mappedBy="productPlan",cascade=CascadeType.ALL)
  private SprintPlan end2Name = null;
  public ProductPlan(){
  }
  public String getId(){
    return this.id;
  }
  public void setId(String value){
    this.id=value;
  }
  public SprintPlan getEnd2Name(){
    SprintPlan result = this.end2Name;
    return result;
  }
  public void setEnd2Name(SprintPlan newEnd2Name){
    SprintPlan oldValue = this.end2Name;
    if(( newEnd2Name == null || !(newEnd2Name.equals(oldValue)) )){
      this.end2Name=newEnd2Name;
      if(!(oldValue == null)){
        oldValue.setProductPlan(null);
      }
      if(!(newEnd2Name == null)){
        if(!(this.equals(newEnd2Name.getProductPlan()))){
          newEnd2Name.setProductPlan(this);
        }
      }
    }
  }
}

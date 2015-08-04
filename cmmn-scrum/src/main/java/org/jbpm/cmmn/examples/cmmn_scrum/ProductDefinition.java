/**Do not edit: generated from uml.*/
package org.jbpm.cmmn.examples.cmmn_scrum;
import org.jbpm.cmmn.examples.cmmn_scrum.UserStory;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity(name="ProductDefinition")
@Table(name="product_definition")
public class ProductDefinition{
  @Id
  @GeneratedValue
  String id;
  @OneToOne(mappedBy="productDefinition",cascade=CascadeType.ALL)
  private UserStory end2Name = null;
  public ProductDefinition(){
  }
  public String getId(){
    return this.id;
  }
  public void setId(String value){
    this.id=value;
  }
  public UserStory getEnd2Name(){
    UserStory result = this.end2Name;
    return result;
  }
  public void setEnd2Name(UserStory newEnd2Name){
    UserStory oldValue = this.end2Name;
    if(( newEnd2Name == null || !(newEnd2Name.equals(oldValue)) )){
      this.end2Name=newEnd2Name;
      if(!(oldValue == null)){
        oldValue.setProductDefinition(null);
      }
      if(!(newEnd2Name == null)){
        if(!(this.equals(newEnd2Name.getProductDefinition()))){
          newEnd2Name.setProductDefinition(this);
        }
      }
    }
  }
}

/**Do not edit: generated from uml.*/
package org.jbpm.cmmn.examples.cmmn_scrum;
import org.jbpm.cmmn.examples.cmmn_scrum.ProductBacklog;
import org.jbpm.cmmn.examples.cmmn_scrum.ProductDefinition;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Basic;
import javax.persistence.Column;
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
        @JoinColumn(name="end1_name_id",referencedColumnName="id")}
  )
  private ProductBacklog end1Name = null;
  @Basic()
  @Column(name="name")
  private String name = "";
  @OneToOne()
  @JoinColumns(value={
        @JoinColumn(name="product_definition_id",referencedColumnName="id")}
  )
  private ProductDefinition productDefinition = null;
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
  public ProductBacklog getEnd1Name(){
    ProductBacklog result = this.end1Name;
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
  public void setEnd1Name(ProductBacklog newEnd1Name){
    ProductBacklog oldValue = this.end1Name;
    if(( newEnd1Name == null || !(newEnd1Name.equals(oldValue)) )){
      this.end1Name=newEnd1Name;
      if(!(oldValue == null)){
        oldValue.setEnd2Name(null);
      }
      if(!(newEnd1Name == null)){
        if(!(this.equals(newEnd1Name.getEnd2Name()))){
          newEnd1Name.setEnd2Name(this);
        }
      }
    }
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
}

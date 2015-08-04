/**Do not edit: generated from uml.*/
package org.jbpm.cmmn.examples.cmmn_scrum;
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
@Entity(name="User")
@Table(name="user")
public class User{
  @Id
  @GeneratedValue
  String id;
  @Basic()
  @Column(name="name")
  private String name = "";
  @OneToOne()
  @JoinColumns(value={
        @JoinColumn(name="product_definition_id",referencedColumnName="id")}
  )
  private ProductDefinition productDefinition = null;
  public User(){
  }
  public User(ProductDefinition owner){
  this.setProductDefinition(owner);
  }
  public String getId(){
    return this.id;
  }
  public void setId(String value){
    this.id=value;
  }
  public String getName(){
    String result = this.name;
    return result;
  }
  public ProductDefinition getProductDefinition(){
    ProductDefinition result = this.productDefinition;
    return result;
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

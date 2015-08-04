/**Do not edit: generated from uml.*/
package org.jbpm.cmmn.examples.cmmn_scrum;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name="User")
@Table(name="user")
public class User{
  @Id
  @GeneratedValue
  String id;
  @Basic()
  @Column(name="name")
  private String name = "";
  public User(){
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
  public void setName(String newName){
    this.name=newName;
  }
}

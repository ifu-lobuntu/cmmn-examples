/**Do not edit: generated from uml.*/
package org.jbpm.cmmn.examples.cmmn_scrum;
import org.jbpm.cmmn.examples.cmmn_scrum.UserStory;
import java.util.Set;
import java.util.HashSet;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity(name="ProductBacklog")
@Table(name="product_backlog")
public class ProductBacklog{
  @Id
  @GeneratedValue
  String id;
  @OneToMany(mappedBy="backlog")
  private Set<UserStory> stories = new HashSet<UserStory>();
  public ProductBacklog(){
  }
  public String getId(){
    return this.id;
  }
  public void setId(String value){
    this.id=value;
  }
  public Set<UserStory> getStories(){
    Set<UserStory> result = this.stories;
    return result;
  }
  public void setStories(Set<UserStory> newStories){
    this.stories=newStories;
  }
}

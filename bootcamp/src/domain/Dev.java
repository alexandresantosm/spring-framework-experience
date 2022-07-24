package domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

  private String name;
  private Set<Content> subscribedContents = new LinkedHashSet<>();
  private Set<Content> completedContents = new LinkedHashSet<>();

  public void subscribe (Bootcamp bootcamp) {}

  public void progress () {}

  public void calculateTotalXp () {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Content> getSubscribedContents() {
    return subscribedContents;
  }

  public void setSubscribedContents(Set<Content> subscribedContents) {
    this.subscribedContents = subscribedContents;
  }

  public Set<Content> getCompletedContents() {
    return completedContents;
  }

  public void setCompletedContents(Set<Content> completedContents) {
    this.completedContents = completedContents;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      name,
      subscribedContents,
      completedContents
      );
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null | getClass() != obj.getClass())
      return false;

    var dev = (Dev) obj;
    
    return 
      Objects.equals(name, dev.name) &&
      Objects.equals(subscribedContents, dev.subscribedContents) &&
      Objects.equals(completedContents, dev.completedContents)
      ;
  }
  
}
package domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

  private String name;
  private Set<Content> subscribedContents = new LinkedHashSet<>();
  private Set<Content> completedContents = new LinkedHashSet<>();

  public void subscribe (Bootcamp bootcamp) {

    this.subscribedContents.addAll(bootcamp.getContents());
    bootcamp.getSubscribedDevs().add(this);

  }

  public void progress () {
    
    Optional<Content> bootcampOptional = this.subscribedContents.stream().findFirst();

    if (bootcampOptional.isPresent()) {
      this.completedContents.add(bootcampOptional.get());
      this.subscribedContents.remove(bootcampOptional.get());
    } else {
      System.err.println("Você não está matriculado em nunhum conteúdo!");
    }

  }

  public double calculateTotalXp () {
    return this.completedContents
      .stream()
      .mapToDouble(content -> content.calculateXp())
      .sum()
    ;
  }

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
package wicket.in.action.chapter14.dbdiscounts;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "discount")
public class Discount implements Serializable {

  @Id
  @GeneratedValue
  private Long id;

  @ManyToOne
  private Cheese cheese;

  private String description;

  private double discount;

  private Date from;

  private Date until;

  public Discount() {
    from = new Date();
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.MONTH, 1);
    until = cal.getTime();
  }

  public Discount(Cheese cheese, double discount, String description) {
    this();
    this.cheese = cheese;
    this.discount = discount;
    this.description = description;
  }

  public Discount(Cheese cheese, double discount, Date from,
      Date until, String description) {
    this.cheese = cheese;
    this.discount = discount;
    this.from = from;
    this.until = until;
    this.description = description;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Cheese getCheese() {
    return cheese;
  }

  public Date getFrom() {
    return from;
  }

  public String getDescription() {
    return description;
  }

  public double getDiscount() {
    return discount;
  }

  public Date getUntil() {
    return until;
  }

  public void setCheese(Cheese cheese) {
    this.cheese = cheese;
  }

  public void setFrom(Date date) {
    this.from = date;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  public void setUntil(Date until) {
    this.until = until;
  }

  @Override
  public String toString() {
    return cheese + ", " + discount;
  }
}

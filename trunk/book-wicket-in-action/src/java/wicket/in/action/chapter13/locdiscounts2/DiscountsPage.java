package wicket.in.action.chapter13.locdiscounts2;

import org.apache.wicket.markup.html.WebPage;

public class DiscountsPage extends WebPage {

  public DiscountsPage() {
    add(new UserPanel("userPanel", DiscountsPage.class));
    add(new DiscountsPanel("discounts"));
  }
}
package wicket.in.action.chapter13.locdiscounts2;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class Index extends WebPage {

  public Index() {
    add(new BookmarkablePageLink("toDiscounts", DiscountsPage.class));
  }
}

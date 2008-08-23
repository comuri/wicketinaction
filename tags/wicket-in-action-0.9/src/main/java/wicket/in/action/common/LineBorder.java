/*
 * $Id: BoxBorder.java 5883 2006-05-26 10:12:48Z joco01 $ $Revision: 5883 $
 * $Date: 2006-05-26 03:12:48 -0700 (Fri, 26 May 2006) $
 * 
 * ==============================================================================
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package wicket.in.action.common;

import org.apache.wicket.MarkupContainer;
import org.apache.wicket.markup.html.border.Border;

public final class LineBorder extends Border {

  public LineBorder(MarkupContainer parent, final String id) {
    super(id);
  }
}

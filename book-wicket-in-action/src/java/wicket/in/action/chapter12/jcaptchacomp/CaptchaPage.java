/*
 * $Id: HelloWorld.java 5394 2006-04-16 13:36:52 +0000 (Sun, 16 Apr 2006)
 * jdonnerstag $ $Revision: 1.1 $ $Date: 2006-04-16 13:36:52 +0000 (Sun, 16 Apr
 * 2006) $
 * 
 * ==================================================================== Licensed
 * under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the
 * License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package wicket.in.action.chapter12.jcaptchacomp;

import org.apache.wicket.markup.html.WebPage;

public class CaptchaPage extends WebPage {

  public CaptchaPage() {
    add(new CaptchaForm("captchaForm") {
      @Override
      protected void onSuccess() {
        info(getLocalizer().getString("captcha.validation.succeeded",
            this));
      }
    });
  }
}
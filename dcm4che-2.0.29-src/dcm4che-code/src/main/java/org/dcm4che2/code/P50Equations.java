/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is part of dcm4che, an implementation of DICOM(TM) in
 * Java(TM), available at http://sourceforge.net/projects/dcm4che.
 *
 * The Initial Developer of the Original Code is
 * Agfa HealthCare.
 * Portions created by the Initial Developer are Copyright (C) 2010
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 * See listed authors below.
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 *
 * ***** END LICENSE BLOCK ***** */

package org.dcm4che2.code;

/**
 * P50 Equations.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class P50Equations {

  /** (122261, DCM, "if (age > 60y) P50= 29.3") */
  public static final String IfAgeGreater60yP50_29_3 = "122261\\DCM";

  /** (122259, DCM, "if (age < 18y) P50= 27.2") */
  public static final String IfAgeLesser18yP50_27_2 = "122259\\DCM";

  /** (122257, DCM, "if (age < 1day) P50= 21.6") */
  public static final String IfAgeLesser1dayP50_21_6 = "122257\\DCM";

  /** (122258, DCM, "if (age < 30day) P50= 24.6") */
  public static final String IfAgeLesser30dayP50_24_6 = "122258\\DCM";

  /** (122260, DCM, "if (age < 40y) P50= 27.4") */
  public static final String IfAgeLesser40yP50_27_4 = "122260\\DCM";

  /** (122256, DCM, "if (prem age< 3days) P50= 19.9") */
  public static final String IfPremAgeLesser3daysP50_19_9 = "122256\\DCM";
}

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
 * CID 12030 Ultrasound Contrast/Bolus Agents.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class UltrasoundContrastBolusAgents {

  /** (125901, DCM, "CARDIOsphere") */
  public static final String CARDIOsphere = "125901\\DCM";

  /** (11994-*011-04, NDC, "Definity") */
  public static final String Definity = "11994-*011-04\\NDC";

  /** (125902, DCM, "Echovist") */
  public static final String Echovist = "125902\\DCM";

  /** (125903, DCM, "Imagify") */
  public static final String Imagify = "125903\\DCM";

  /** (125904, DCM, "Levovist") */
  public static final String Levovist = "125904\\DCM";

  /** (00019-2707-03, NDC, "Optison") */
  public static final String Optison = "00019-2707-03\\NDC";

  /** (125905, DCM, "Sonazoid") */
  public static final String Sonazoid = "125905\\DCM";

  /** (125906, DCM, "SonoVue") */
  public static final String SonoVue = "125906\\DCM";

  /** (125907, DCM, "Targestar-B") */
  public static final String TargestarB = "125907\\DCM";

  /** (125908, DCM, "Targestar-P") */
  public static final String TargestarP = "125908\\DCM";
}

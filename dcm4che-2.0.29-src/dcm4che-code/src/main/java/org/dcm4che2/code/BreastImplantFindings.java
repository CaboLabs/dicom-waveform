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
 * CID 6072 Breast Implant Findings.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class BreastImplantFindings {

  /** (111504, DCM, "Asymmetric implants") */
  public static final String AsymmetricImplants = "111504\\DCM";

  /** (111505, DCM, "Calcified implant") */
  public static final String CalcifiedImplant = "111505\\DCM";

  /** (111506, DCM, "Distorted implant") */
  public static final String DistortedImplant = "111506\\DCM";

  /** (111510, DCM, "Explantation") */
  public static final String Explantation = "111510\\DCM";

  /** (111508, DCM, "Free silicone") */
  public static final String FreeSilicone = "111508\\DCM";

  /** (111509, DCM, "Herniated implant") */
  public static final String HerniatedImplant = "111509\\DCM";

  /** (111503, DCM, "Normal implants") */
  public static final String NormalImplants = "111503\\DCM";

  /** (DD-66544, SRT, "Rupture of breast implant") */
  public static final String RuptureOfBreastImplant = "DD-66544\\SRT";

  /** (111507, DCM, "Silicone-laden lymph nodes") */
  public static final String SiliconeLadenLymphNodes = "111507\\DCM";
}

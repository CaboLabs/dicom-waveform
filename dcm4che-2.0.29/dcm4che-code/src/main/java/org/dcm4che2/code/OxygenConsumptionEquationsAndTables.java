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
 * Oxygen Consumption Equations and Tables.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class OxygenConsumptionEquationsAndTables {

  /** (122255, DCM, "Boothby table") */
  public static final String BoothbyTable = "122255\\DCM";

  /** (122254, DCM, "Fleisch table") */
  public static final String FleischTable = "122254\\DCM";

  /** (122253, DCM, "Robertson & Reid table") */
  public static final String RobertsonAndReidTable = "122253\\DCM";

  /** (122250, DCM, "VO2 = 152 * BSA") */
  public static final String VO2_152BSA = "122250\\DCM";

  /** (122251, DCM, "VO2 = 175 * BSA") */
  public static final String VO2_175BSA = "122251\\DCM";

  /** (122252, DCM, "VO2 = 176 * BSA") */
  public static final String VO2_176BSA = "122252\\DCM";

  /** (122249, DCM, "VO2 = VeSTPD * 10 * (FIO2 - FE02)") */
  public static final String VO2_VeSTPD10FIO2FE02 = "122249\\DCM";

  /** (122248, DCM, "VO2female = BSA (138.1 - 17.04 * loge(age) + 0.378*HRf)") */
  public static final String VO2female_BSA138_117_04LogeAge0_378HRf = "122248\\DCM";

  /** (122247, DCM, "VO2male = BSA (138.1 - 11.49 * loge(age) + 0.378*HRf)") */
  public static final String VO2male_BSA138_111_49LogeAge0_378HRf = "122247\\DCM";
}

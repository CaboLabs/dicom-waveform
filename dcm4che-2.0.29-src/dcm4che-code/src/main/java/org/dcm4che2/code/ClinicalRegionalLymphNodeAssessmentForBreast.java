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
 * CID 6161 Clinical Regional Lymph Node Assessment for Breast.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class ClinicalRegionalLymphNodeAssessmentForBreast {

  /** (R-003CB, SRT, "N0: No regional lymph node metastasis histologically...") */
  public static final String N0NoRegionalLymphNodeMetastasisHistologically = "R-003CB\\SRT";

  /** (R-003D0, SRT, "N1: Metastasis in 1to3 axillary lymph nodes...") */
  public static final String N1MetastasisIn1to3AxillaryLymphNodes = "R-003D0\\SRT";

  /** (R-003D7, SRT, "N2a: Metastasis in 4 to 9 axillary lymph nodes (...2.0 mm)...") */
  public static final String N2aMetastasisIn4To9AxillaryLymphNodes2_0Mm___ = "R-003D7\\SRT";

  /** (R-003D8, SRT, "N2b: Metastasis in clinically apparent internal... nodes...") */
  public static final String N2bMetastasisInClinicallyApparentInternalNodes___ = "R-003D8\\SRT";

  /** (R-003D6, SRT, "N2: Metastasis in 4 to 9 axillary lymph nodes...") */
  public static final String N2MetastasisIn4To9AxillaryLymphNodes = "R-003D6\\SRT";

  /** (R-003D9, SRT, "N3a: Metastasis in 10 or more axillary lymph nodes...") */
  public static final String N3aMetastasisIn10OrMoreAxillaryLymphNodes = "R-003D9\\SRT";

  /** (R-003DA, SRT, "N3b: Metastasis in clinically apparent ipsilateral internal...") */
  public static final String N3bMetastasisInClinicallyApparentIpsilateralInternal = "R-003DA\\SRT";

  /** (R-003DB, SRT, "N3c: Metastasis in ipsilateral supraclavicular lymph nodes...") */
  public static final String N3cMetastasisInIpsilateralSupraclavicularLymphNodes = "R-003DB\\SRT";

  /** (G-F749, SRT, "N3: Metastasis to ipsilateral internal mammary lymph node(s)") */
  public static final String N3MetastasisToIpsilateralInternalMammaryLymphNode = "G-F749\\SRT";

  /** (R-003CA, SRT, "NX: Regional lymph nodes cannot be assessed...") */
  public static final String NXRegionalLymphNodesCannotBeAssessed = "R-003CA\\SRT";
}

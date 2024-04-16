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
 * CID 6048 CAD Operating Point Axis Label.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class CADOperatingPointAxisLabel {

  /** (111088, DCM, "Case Sensitivity") */
  public static final String CaseSensitivity = "111088\\DCM";

  /** (111090, DCM, "Case Specificity") */
  public static final String CaseSpecificity = "111090\\DCM";

  /** (111012, DCM, "Certainty of Finding") */
  public static final String CertaintyOfFinding = "111012\\DCM";

  /** (111087, DCM, "False Markers per Case") */
  public static final String FalseMarkersPerCase = "111087\\DCM";

  /** (111086, DCM, "False Markers per Image") */
  public static final String FalseMarkersPerImage = "111086\\DCM";

  /** (111091, DCM, "Image Specificity") */
  public static final String ImageSpecificity = "111091\\DCM";

  /** (111089, DCM, "Lesion Sensitivity") */
  public static final String LesionSensitivity = "111089\\DCM";

  /** (111047, DCM, "Probability of cancer") */
  public static final String ProbabilityOfCancer = "111047\\DCM";
}

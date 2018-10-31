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
 * CID 6052 Breast Imaging Report section title.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class BreastImagingReportSectionTitle {

  /** (121078, DCM, "Addendum") */
  public static final String Addendum = "121078\\DCM";

  /** (F-01710, SRT, "Breast composition") */
  public static final String BreastComposition = "F-01710\\SRT";

  /** (111424, DCM, "Comparison to previous exams") */
  public static final String ComparisonToPreviousExams = "111424\\DCM";

  /** (121076, DCM, "Conclusions") */
  public static final String Conclusions = "121076\\DCM";

  /** (121070, DCM, "Findings") */
  public static final String Findings = "121070\\DCM";

  /** (121072, DCM, "Impressions") */
  public static final String Impressions = "121072\\DCM";

  /** (111413, DCM, "Overall Assessment") */
  public static final String OverallAssessment = "111413\\DCM";

  /** (111423, DCM, "Physical Examination Results") */
  public static final String PhysicalExaminationResults = "111423\\DCM";

  /** (121058, DCM, "Procedure reported") */
  public static final String ProcedureReported = "121058\\DCM";

  /** (111401, DCM, "Reason for procedure") */
  public static final String ReasonForProcedure = "111401\\DCM";

  /** (121074, DCM, "Recommendations") */
  public static final String Recommendations = "121074\\DCM";
}

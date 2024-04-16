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
 * CID 7002 Diagnostic Imaging Report Elements.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class DiagnosticImagingReportElements {

  /** (DD-60002, SRT, "Complication of Procedure") */
  public static final String ComplicationOfProcedure = "DD-60002\\SRT";

  /** (121077, DCM, "Conclusion") */
  public static final String Conclusion = "121077\\DCM";

  /** (121071, DCM, "Finding") */
  public static final String Finding = "121071\\DCM";

  /** (121060, DCM, "History") */
  public static final String History = "121060\\DCM";

  /** (121073, DCM, "Impression") */
  public static final String Impression = "121073\\DCM";

  /** (121110, DCM, "Patient Presentation") */
  public static final String PatientPresentation = "121110\\DCM";

  /** (121069, DCM, "Previous Finding") */
  public static final String PreviousFinding = "121069\\DCM";

  /** (121065, DCM, "Procedure Description") */
  public static final String ProcedureDescription = "121065\\DCM";

  /** (121075, DCM, "Recommendation") */
  public static final String Recommendation = "121075\\DCM";

  /** (121062, DCM, "Request") */
  public static final String Request = "121062\\DCM";

  /** (121111, DCM, "Summary") */
  public static final String Summary = "121111\\DCM";
}

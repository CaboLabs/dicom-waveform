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
 * CID 31 Abstract Priors.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class AbstractPriors {

  /** (109125, DCM, "At last appointment") */
  public static final String AtLastAppointment = "109125\\DCM";

  /** (R-400B2, SRT, "Intraoperative") */
  public static final String Intraoperative = "R-400B2\\SRT";

  /** (G-7292, SRT, "On admission") */
  public static final String OnAdmission = "G-7292\\SRT";

  /** (109120, DCM, "On admission to unit") */
  public static final String OnAdmissionToUnit = "109120\\DCM";

  /** (109121, DCM, "On discharge") */
  public static final String OnDischarge = "109121\\DCM";

  /** (109122, DCM, "On discharge from unit") */
  public static final String OnDischargeFromUnit = "109122\\DCM";

  /** (R-404DA, SRT, "Post-dose") */
  public static final String PostDose = "R-404DA\\SRT";

  /** (109124, DCM, "Post-intervention") */
  public static final String PostIntervention = "109124\\DCM";

  /** (R-413B7, SRT, "Post-operative") */
  public static final String PostOperative = "R-413B7\\SRT";

  /** (R-41FD9, SRT, "Pre-admission") */
  public static final String PreAdmission = "R-41FD9\\SRT";

  /** (R-411C0, SRT, "Pre-dose") */
  public static final String PreDose = "R-411C0\\SRT";

  /** (109123, DCM, "Pre-intervention") */
  public static final String PreIntervention = "109123\\DCM";

  /** (R-413C5, SRT, "Pre-operative") */
  public static final String PreOperative = "R-413C5\\SRT";
}

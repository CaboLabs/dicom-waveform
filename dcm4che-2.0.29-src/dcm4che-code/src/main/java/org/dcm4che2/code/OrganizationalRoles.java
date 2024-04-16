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
 * CID 7452 Organizational Roles.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class OrganizationalRoles {

  /** (121089, DCM, "Attending [Consultant]") */
  public static final String AttendingConsultant = "121089\\DCM";

  /** (121088, DCM, "Fellow") */
  public static final String Fellow = "121088\\DCM";

  /** (121085, DCM, "Intern") */
  public static final String Intern = "121085\\DCM";

  /** (121082, DCM, "Nurse") */
  public static final String Nurse = "121082\\DCM";

  /** (121081, DCM, "Physician") */
  public static final String Physician = "121081\\DCM";

  /** (121105, DCM, "Radiation Physicist") */
  public static final String RadiationPhysicist = "121105\\DCM";

  /** (121084, DCM, "Radiographer") */
  public static final String Radiographer = "121084\\DCM";

  /** (121087, DCM, "Registrar") */
  public static final String Registrar = "121087\\DCM";

  /** (121086, DCM, "Resident") */
  public static final String Resident = "121086\\DCM";

  /** (121090, DCM, "Scrub nurse") */
  public static final String ScrubNurse = "121090\\DCM";

  /** (121093, DCM, "Sonographer") */
  public static final String Sonographer = "121093\\DCM";

  /** (121092, DCM, "Sonologist") */
  public static final String Sonologist = "121092\\DCM";

  /** (121091, DCM, "Surgeon") */
  public static final String Surgeon = "121091\\DCM";

  /** (121083, DCM, "Technologist") */
  public static final String Technologist = "121083\\DCM";
}

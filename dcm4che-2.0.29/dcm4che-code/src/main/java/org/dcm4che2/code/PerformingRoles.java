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
 * CID 7453 Performing Roles.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class PerformingRoles {

  /** (121099, DCM, "Assisting") */
  public static final String Assisting = "121099\\DCM";

  /** (121100, DCM, "Circulating") */
  public static final String Circulating = "121100\\DCM";

  /** (113851, DCM, "Irradiation Administering") */
  public static final String IrradiationAdministering = "113851\\DCM";

  /** (113850, DCM, "Irradiation Authorizing") */
  public static final String IrradiationAuthorizing = "113850\\DCM";

  /** (121094, DCM, "Performing") */
  public static final String Performing = "121094\\DCM";

  /** (121097, DCM, "Recording") */
  public static final String Recording = "121097\\DCM";

  /** (121095, DCM, "Referring") */
  public static final String Referring = "121095\\DCM";

  /** (121096, DCM, "Requesting") */
  public static final String Requesting = "121096\\DCM";

  /** (121101, DCM, "Standby") */
  public static final String Standby = "121101\\DCM";

  /** (121098, DCM, "Verifying") */
  public static final String Verifying = "121098\\DCM";
}

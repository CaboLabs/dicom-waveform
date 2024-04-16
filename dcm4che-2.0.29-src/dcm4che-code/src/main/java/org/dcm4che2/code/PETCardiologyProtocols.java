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
 * CID 3106 PET Cardiology Protocols.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class PETCardiologyProtocols {

  /** (122793, DCM, "PET Myocardial Perfusion, Rest and Stress") */
  public static final String PETMyocardialPerfusionRestAndStress = "122793\\DCM";

  /** (122791, DCM, "PET Myocardial Perfusion, Rest only") */
  public static final String PETMyocardialPerfusionRestOnly = "122791\\DCM";

  /** (122792, DCM, "PET Myocardial Perfusion, Stress only") */
  public static final String PETMyocardialPerfusionStressOnly = "122792\\DCM";

  /** (122797, DCM, "PET Myocardial Viability, Rest and Stress") */
  public static final String PETMyocardialViabilityRestAndStress = "122797\\DCM";

  /** (122795, DCM, "PET Myocardial Viability, Rest only") */
  public static final String PETMyocardialViabilityRestOnly = "122795\\DCM";

  /** (122796, DCM, "PET Myocardial Viability, Stress only") */
  public static final String PETMyocardialViabilityStressOnly = "122796\\DCM";
}

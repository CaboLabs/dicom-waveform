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
 * CID 4052 Phantom Devices.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class PhantomDevices {

  /** (113682, DCM, "ACR Accreditation Phantom - CT") */
  public static final String ACRAccreditationPhantomCT = "113682\\DCM";

  /** (113686, DCM, "ACR Accreditation Phantom - ECT") */
  public static final String ACRAccreditationPhantomECT = "113686\\DCM";

  /** (113688, DCM, "ACR Accreditation Phantom - ECT/PET") */
  public static final String ACRAccreditationPhantomECTPET = "113688\\DCM";

  /** (113684, DCM, "ACR Accreditation Phantom - Mammography") */
  public static final String ACRAccreditationPhantomMammography = "113684\\DCM";

  /** (113683, DCM, "ACR Accreditation Phantom - MR") */
  public static final String ACRAccreditationPhantomMR = "113683\\DCM";

  /** (113687, DCM, "ACR Accreditation Phantom - PET") */
  public static final String ACRAccreditationPhantomPET = "113687\\DCM";

  /** (113689, DCM, "ACR Accreditation Phantom - PET Faceplate") */
  public static final String ACRAccreditationPhantomPETFaceplate = "113689\\DCM";

  /** (113685, DCM, "ACR Accreditation Phantom - Stereotactic Breast Biopsy") */
  public static final String ACRAccreditationPhantomStereotacticBreastBiopsy = "113685\\DCM";

  /** (113691, DCM, "IEC Body Dosimetry Phantom") */
  public static final String IECBodyDosimetryPhantom = "113691\\DCM";

  /** (113690, DCM, "IEC Head Dosimetry Phantom") */
  public static final String IECHeadDosimetryPhantom = "113690\\DCM";

  /** (113692, DCM, "NEMA XR21-2000 Phantom") */
  public static final String NEMAXR212000Phantom = "113692\\DCM";

  /** (113681, DCM, "Phantom") */
  public static final String Phantom = "113681\\DCM";
}

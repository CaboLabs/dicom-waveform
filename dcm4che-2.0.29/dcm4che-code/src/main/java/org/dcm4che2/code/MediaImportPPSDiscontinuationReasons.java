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
 * CID 9302 Media Import PPS Discontinuation Reasons.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class MediaImportPPSDiscontinuationReasons {

  /** (110513, DCM, "Discontinued for unspecified reason") */
  public static final String DiscontinuedForUnspecifiedReason = "110513\\DCM";

  /** (110510, DCM, "Duplicate order") */
  public static final String DuplicateOrder = "110510\\DCM";

  /** (110501, DCM, "Equipment failure") */
  public static final String EquipmentFailure = "110501\\DCM";

  /** (110514, DCM, "Incorrect worklist entry selected") */
  public static final String IncorrectWorklistEntrySelected = "110514\\DCM";

  /** (110524, DCM, "Media Failure") */
  public static final String MediaFailure = "110524\\DCM";

  /** (110523, DCM, "Object Set incomplete") */
  public static final String ObjectSetIncomplete = "110523\\DCM";

  /** (110521, DCM, "Objects incorrectly formatted") */
  public static final String ObjectsIncorrectlyFormatted = "110521\\DCM";

  /** (110522, DCM, "Object Types not supported") */
  public static final String ObjectTypesNotSupported = "110522\\DCM";
}

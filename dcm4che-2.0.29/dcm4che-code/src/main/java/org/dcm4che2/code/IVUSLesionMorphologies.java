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
 * CID 3491 IVUS Lesion Morphologies.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Revision: 13559 $ $Date: 2010-06-16 11:56:08 +0200 (Mi, 16 Jun 2010) $
 * @since Jun 2, 2010
 */
public class IVUSLesionMorphologies {

  /** (D3-80027, SRT, "Arterial (True) Aneurysm") */
  public static final String ArterialTrueAneurysm = "D3-80027\\SRT";

  /** (R-4047B, SRT, "Concentric") */
  public static final String Concentric = "R-4047B\\SRT";

  /** (R-40416, SRT, "Eccentric") */
  public static final String Eccentric = "R-40416\\SRT";

  /** (122390, DCM, "Eroded Plaque") */
  public static final String ErodedPlaque = "122390\\DCM";

  /** (122361, DCM, "False Lumen") */
  public static final String FalseLumen = "122361\\DCM";

  /** (122357, DCM, "In-Stent Neointima") */
  public static final String InStentNeointima = "122357\\DCM";

  /** (122363, DCM, "Plaque Rupture") */
  public static final String PlaqueRupture = "122363\\DCM";

  /** (M-52103, SRT, "Plaque Ulceration") */
  public static final String PlaqueUlceration = "M-52103\\SRT";

  /** (M-32390, SRT, "Pseudo Aneurysm") */
  public static final String PseudoAneurysm = "M-32390\\SRT";

  /** (122356, DCM, "Soft plaque") */
  public static final String SoftPlaque = "122356\\DCM";

  /** (122389, DCM, "Vulnerable Plaque") */
  public static final String VulnerablePlaque = "122389\\DCM";
}

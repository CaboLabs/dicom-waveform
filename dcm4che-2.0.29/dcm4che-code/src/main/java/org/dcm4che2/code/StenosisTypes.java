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
 * CID 3805 Stenosis Types.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class StenosisTypes {

  /** (D3-81100, SRT, "arteriosclerotic vascular disease") */
  public static final String ArterioscleroticVascularDisease = "D3-81100\\SRT";

  /** (M-01460, SRT, "compression") */
  public static final String Compression = "M-01460\\SRT";

  /** (D3-80033, SRT, "cystic adventitial disease") */
  public static final String CysticAdventitialDisease = "D3-80033\\SRT";

  /** (M-35300, SRT, "embolism") */
  public static final String Embolism = "M-35300\\SRT";

  /** (M-300F2, SRT, "entrapment") */
  public static final String Entrapment = "M-300F2\\SRT";

  /** (R-40448, SRT, "fibrous") */
  public static final String Fibrous = "R-40448\\SRT";

  /** (D3-80505, SRT, "Raynaud's disease") */
  public static final String RaynaudDisease = "D3-80505\\SRT";

  /** (R-423C3, SRT, "thrombosis") */
  public static final String Thrombosis = "R-423C3\\SRT";

  /** (D3-80650, SRT, "vasculitis") */
  public static final String Vasculitis = "D3-80650\\SRT";
}

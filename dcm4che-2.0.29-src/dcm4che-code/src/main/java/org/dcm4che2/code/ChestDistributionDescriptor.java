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
 * CID 6128 Chest Distribution Descriptor.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class ChestDistributionDescriptor {

  /** (112154, DCM, "Bat's wing distribution") */
  public static final String BatWingDistribution = "112154\\DCM";

  /** (112155, DCM, "Butterfly distribution") */
  public static final String ButterflyDistribution = "112155\\DCM";

  /** (112156, DCM, "Centrilobular") */
  public static final String Centrilobular = "112156\\DCM";

  /** (112157, DCM, "Coalescent") */
  public static final String Coalescent = "112157\\DCM";

  /** (G-A321, SRT, "Diffuse") */
  public static final String Diffuse = "G-A321\\SRT";

  /** (M-020FA, SRT, "Discoid") */
  public static final String Discoid = "M-020FA\\SRT";

  /** (G-A324, SRT, "Disseminated") */
  public static final String Disseminated = "G-A324\\SRT";

  /** (G-A351, SRT, "Focal") */
  public static final String Focal = "G-A351\\SRT";

  /** (G-A366, SRT, "Generalized") */
  public static final String Generalized = "G-A366\\SRT";

  /** (112158, DCM, "Lobar") */
  public static final String Lobar = "112158\\DCM";

  /** (G-A443, SRT, "Multifocal") */
  public static final String Multifocal = "G-A443\\SRT";

  /** (G-A137, SRT, "Segmental") */
  public static final String Segmental = "G-A137\\SRT";

  /** (G-A572, SRT, "Systemic") */
  public static final String Systemic = "G-A572\\SRT";
}

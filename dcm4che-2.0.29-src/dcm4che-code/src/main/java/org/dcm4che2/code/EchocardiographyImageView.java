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
 * CID 12226 Echocardiography Image View.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class EchocardiographyImageView {

  /** (G-A19C, SRT, "Apical four chamber") */
  public static final String ApicalFourChamber = "G-A19C\\SRT";

  /** (G-0395, SRT, "Apical long axis") */
  public static final String ApicalLongAxis = "G-0395\\SRT";

  /** (G-A19B, SRT, "Apical two chamber") */
  public static final String ApicalTwoChamber = "G-A19B\\SRT";

  /** (G-0396, SRT, "Parasternal long axis") */
  public static final String ParasternalLongAxis = "G-0396\\SRT";

  /** (G-0397, SRT, "Parasternal short axis") */
  public static final String ParasternalShortAxis = "G-0397\\SRT";

  /** (G-0398, SRT, "Parasternal short axis at the aortic valve level") */
  public static final String ParasternalShortAxisAtTheAorticValveLevel = "G-0398\\SRT";

  /** (G-0399, SRT, "Parasternal short axis at the level of the mitral chords") */
  public static final String ParasternalShortAxisAtTheLevelOfTheMitralChords = "G-0399\\SRT";

  /** (G-039A, SRT, "Parasternal short axis at the Mitral Valve level") */
  public static final String ParasternalShortAxisAtTheMitralValveLevel = "G-039A\\SRT";

  /** (G-039B, SRT, "Parasternal short axis at the Papillary Muscle level") */
  public static final String ParasternalShortAxisAtThePapillaryMuscleLevel = "G-039B\\SRT";

  /** (G-039C, SRT, "Right Ventricular Inflow Tract View") */
  public static final String RightVentricularInflowTractView = "G-039C\\SRT";

  /** (G-039D, SRT, "Right Ventricular Outflow Tract View") */
  public static final String RightVentricularOutflowTractView = "G-039D\\SRT";

  /** (G-039E, SRT, "Subcostal long axis") */
  public static final String SubcostalLongAxis = "G-039E\\SRT";

  /** (G-039F, SRT, "Subcostal short axis") */
  public static final String SubcostalShortAxis = "G-039F\\SRT";

  /** (G-03A0, SRT, "Suprasternal long axis") */
  public static final String SuprasternalLongAxis = "G-03A0\\SRT";

  /** (G-03A1, SRT, "Suprasternal short axis") */
  public static final String SuprasternalShortAxis = "G-03A1\\SRT";
}

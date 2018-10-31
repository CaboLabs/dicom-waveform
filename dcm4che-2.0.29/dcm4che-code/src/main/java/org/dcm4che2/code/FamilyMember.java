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
 * CID 7451 Family Member.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class FamilyMember {

  /** (S-101A1, SRT, "Aunt") */
  public static final String Aunt = "S-101A1\\SRT";

  /** (S-101A9, SRT, "Female first cousin") */
  public static final String FemaleFirstCousin = "S-101A9\\SRT";

  /** (S-10164, SRT, "Half-brother") */
  public static final String HalfBrother = "S-10164\\SRT";

  /** (S-10154, SRT, "Half-sister") */
  public static final String HalfSister = "S-10154\\SRT";

  /** (S-101AA, SRT, "Male first cousin") */
  public static final String MaleFirstCousin = "S-101AA\\SRT";

  /** (S-10161, SRT, "Natural brother") */
  public static final String NaturalBrother = "S-10161\\SRT";

  /** (S-10181, SRT, "Natural daughter") */
  public static final String NaturalDaughter = "S-10181\\SRT";

  /** (S-10131, SRT, "Natural father") */
  public static final String NaturalFather = "S-10131\\SRT";

  /** (S-10116, SRT, "Natural grand-father") */
  public static final String NaturalGrandFather = "S-10116\\SRT";

  /** (S-10115, SRT, "Natural grand-mother") */
  public static final String NaturalGrandMother = "S-10115\\SRT";

  /** (S-10121, SRT, "Natural mother") */
  public static final String NaturalMother = "S-10121\\SRT";

  /** (S-10151, SRT, "Natural sister") */
  public static final String NaturalSister = "S-10151\\SRT";

  /** (S-10191, SRT, "Natural son") */
  public static final String NaturalSon = "S-10191\\SRT";

  /** (S-101A2, SRT, "Uncle") */
  public static final String Uncle = "S-101A2\\SRT";
}

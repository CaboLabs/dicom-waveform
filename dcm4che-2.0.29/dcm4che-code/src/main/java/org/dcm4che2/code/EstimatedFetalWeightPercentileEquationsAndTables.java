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
 * CID 12016 Estimated Fetal Weight Percentile Equations and Tables.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class EstimatedFetalWeightPercentileEquationsAndTables {

  /** (33187-6, LN, "Female Singleton BWP by GA, Arbuckle 1993") */
  public static final String FemaleSingletonBWPByGAArbuckle1993 = "33187-6\\LN";

  /** (33188-4, LN, "Female Twins BWP by GA, Arbuckle 1993") */
  public static final String FemaleTwinsBWPByGAArbuckle1993 = "33188-4\\LN";

  /** (33185-0, LN, "FWP by GA, Alexander, 1996") */
  public static final String FWPByGAAlexander1996 = "33185-0\\LN";

  /** (33189-2, LN, "FWP by GA, Brenner 1976") */
  public static final String FWPByGABrenner1976 = "33189-2\\LN";

  /** (33183-5, LN, "FWP by GA, Hadlock 1991") */
  public static final String FWPByGAHadlock1991 = "33183-5\\LN";

  /** (33184-3, LN, "FWP by GA, Williams, 1982") */
  public static final String FWPByGAWilliams1982 = "33184-3\\LN";

  /** (33190-0, LN, "FWP by MA, Hadlock 1985") */
  public static final String FWPByMAHadlock1985 = "33190-0\\LN";

  /** (33186-8, LN, "Male Singleton BWP by GA, Arbuckle 1993") */
  public static final String MaleSingletonBWPByGAArbuckle1993 = "33186-8\\LN";

  /** (33199-1, LN, "Male Twins BWP by GA, Arbuckle 1993") */
  public static final String MaleTwinsBWPByGAArbuckle1993 = "33199-1\\LN";
}

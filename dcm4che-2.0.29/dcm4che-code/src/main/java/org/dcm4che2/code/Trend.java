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
 * CID 3684 Trend.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class Trend {

  /** (D.2.3-4-CC, SCPECG[1.3], "continuing changes of...") */
  public static final String ContinuingChangesOf = "D.2.3-4-CC\\SCPECG[1.3]";

  /** (D.2.3-4-EV, SCPECG[1.3], "evolving") */
  public static final String Evolving = "D.2.3-4-EV\\SCPECG[1.3]";

  /** (D.2.3-4-FR, SCPECG[1.3], "frequent") */
  public static final String Frequent = "D.2.3-4-FR\\SCPECG[1.3]";

  /** (D.2.3-4-IM, SCPECG[1.3], "intermittent") */
  public static final String Intermittent = "D.2.3-4-IM\\SCPECG[1.3]";

  /** (D.2.3-4-MF, SCPECG[1.3], "multifocal") */
  public static final String Multifocal = "D.2.3-4-MF\\SCPECG[1.3]";

  /** (D.2.3-4-MU, SCPECG[1.3], "multiple") */
  public static final String Multiple = "D.2.3-4-MU\\SCPECG[1.3]";

  /** (D.2.3-4-NE, SCPECG[1.3], "new") */
  public static final String New = "D.2.3-4-NE\\SCPECG[1.3]";

  /** (D.2.3-4-OC, SCPECG[1.3], "occasional") */
  public static final String Occasional = "D.2.3-4-OC\\SCPECG[1.3]";

  /** (D.2.3-4-SE, SCPECG[1.3], "serial changes consistent with...") */
  public static final String SerialChangesConsistentWith = "D.2.3-4-SE\\SCPECG[1.3]";

  /** (D.2.3-4-TE, SCPECG[1.3], "temporary") */
  public static final String Temporary = "D.2.3-4-TE\\SCPECG[1.3]";

  /** (D.2.3-4-TR, SCPECG[1.3], "transient") */
  public static final String Transient = "D.2.3-4-TR\\SCPECG[1.3]";

  /** (D.2.3-4-UF, SCPECG[1.3], "unifocal") */
  public static final String Unifocal = "D.2.3-4-UF\\SCPECG[1.3]";
}

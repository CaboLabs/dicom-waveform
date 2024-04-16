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
 * Java(TM), hosted at http://sourceforge.net/projects/dcm4che.
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

import java.lang.reflect.Field;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.dcm4che2.data.BasicDicomObject;
import org.dcm4che2.data.DicomObject;
import org.dcm4che2.data.Tag;
import org.dcm4che2.data.VR;

/**
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13615 $ $Date:: 2010-06-22#$
 * @since Jun 4, 2010
 */
public class Codes {
    
    private static final String CODE_MEANINGS = "org.dcm4che2.code.Meanings";

    public static String[] getContextGroup(Class<?> clazz) {
        Field[] fields = clazz.getFields();
        String[] keys = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            try {
                keys[i] = (String) fields[i].get(null);
            } catch (ClassCastException e) {
                throw new ClassCastException("Static field " + fields[i]
                        + " of " + clazz + " is not of type java.lang.String");
            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException("Static field " + fields[i]
                        + " of " + clazz + " is not accessable");
            }
        }
        return keys;
    }

    public static boolean contextGroupContains(Class<?> clazz, String key) {
        Field[] fields = clazz.getFields();
        for (int i = 0; i < fields.length; i++) {
            try {
                if (key.equals(fields[i].get(null)))
                        return true;
            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException("Static field " + fields[i]
                        + " of " + clazz + " is not accessable");
            }
        }
        return false;
    }

    public static String toKey(String codeValue, String schemeDesignator,
            String schemeVersion) {
        return ((schemeVersion == null)
                ? new StringBuilder(1 + codeValue.length()
                        + schemeDesignator.length())
                    .append(codeValue)
                    .append('\\')
                    .append(schemeDesignator)
                : new StringBuilder(3 + codeValue.length()
                        + schemeDesignator.length()
                        + schemeVersion.length())
                    .append(codeValue)
                    .append('\\')
                    .append(schemeDesignator)
                    .append('[')
                    .append(schemeVersion)
                    .append(']')
            ).toString();
    }

    public static String toString(String codeValue, String schemeDesignator,
            String schemeVersion, String codeMeaning) {
        StringBuilder sb = new StringBuilder(codeValue.length()
                + schemeDesignator.length() + codeMeaning.length()
                + (schemeVersion == null ? 8 : 10 + schemeVersion.length()));
        sb.append('(').append(codeValue).append(", ").append(schemeDesignator);
        if (schemeVersion != null)
            sb.append('[').append(schemeVersion).append(']');
        sb.append(", \"").append(codeMeaning).append("\")");
        return sb.toString();
    }

    public static String toString(DicomObject codeItem) {
        return toString(codeItem.getString(Tag.CodeValue),
                codeItem.getString(Tag.CodingSchemeDesignator),
                codeItem.getString(Tag.CodingSchemeVersion),
                codeItem.getString(Tag.CodeMeaning));
    }

    public static String codeValueOf(String key) {
        return key.substring(0, key.indexOf('\\'));
    }

    public static String codingSchemeDesignatorOf(String key) {
        int begin = key.indexOf('\\') + 1;
        int last = key.length() - 1;
        return key.charAt(last) == ']' 
                ? key.substring(begin, key.lastIndexOf('['))
                : key.substring(begin);
    }

    public static String codingSchemeVersionOf(String key) {
        int last = key.length() - 1;
        return key.charAt(last) == ']'
                ? key.substring(key.lastIndexOf('[') + 1, last)
                : null;
    }

    public static String codeMeaningOf(String key)
            throws MissingResourceException {
        return ResourceBundle.getBundle(CODE_MEANINGS).getString(key);
    }

    public static String codeMeaningOf(String key, Locale locale)
            throws MissingResourceException {
        return ResourceBundle.getBundle(CODE_MEANINGS, locale).getString(key);
    }

   public static DicomObject toCodeItem(String key) {
       return toCodeItem(codeValueOf(key), codingSchemeDesignatorOf(key),
               codingSchemeVersionOf(key), codeMeaningOf(key));
   }

   public static DicomObject toCodeItem(String key, Locale locale) {
       return toCodeItem(codeValueOf(key), codingSchemeDesignatorOf(key),
               codingSchemeVersionOf(key), codeMeaningOf(key, locale));
   }

   public static DicomObject toCodeItem(String codeValue,
            String schemeDesignator, String schemeVersion, String codeMeaning) {
        DicomObject item = new BasicDicomObject(4);
        item.putString(Tag.CodeValue, VR.SH, codeValue);
        item.putString(Tag.CodingSchemeDesignator, VR.SH,
                schemeDesignator);
        if (schemeVersion != null)
            item.putString(Tag.CodingSchemeVersion, VR.SH,
                schemeVersion);
        item.putString(Tag.CodeMeaning, VR.LO, codeMeaning);
        return item;
    }

    public static boolean equals(String key, DicomObject codeItem) {
        return equalsCodeValue(key, codeItem.getString(Tag.CodeValue))
                && equalsCodingScheme(key,
                        codeItem.getString(Tag.CodingSchemeDesignator),
                        codeItem.getString(Tag.CodingSchemeVersion));
    }

    public static boolean equals(String key, String codeValue,
            String schemeDesignator, String schemeVersion) {
        return equalsCodeValue(key, codeValue) 
                && equalsCodingScheme(key, schemeDesignator, schemeVersion);
    }
    

    private static boolean equalsCodeValue(String key, String codeValue) {
        return key.startsWith(codeValue)
                    && key.charAt(codeValue.length()) == '\\';
    }

    private static boolean equalsCodingScheme(String key,
           String schemeDesignator, String schemeVersion) {
       return schemeDesignator.equals(codingSchemeDesignatorOf(key))
               && (schemeVersion == null
                       ? key.charAt(key.length() - 1) != ']'
                       : schemeVersion.equals(codingSchemeVersionOf(key)));
    }

}

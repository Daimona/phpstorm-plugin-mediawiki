/*
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package org.mediawiki;

import com.intellij.lang.javascript.JavaScriptFileType;
import com.intellij.lang.javascript.JavascriptLanguage;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.intellij.psi.codeStyle.PredefinedCodeStyle;

/**
 * @author Reedy
 */
public class MediaWikiJsPredefinedCodeStyle extends PredefinedCodeStyle {
    public MediaWikiJsPredefinedCodeStyle() {
        super("MediaWiki", JavascriptLanguage.INSTANCE);
    }

    @Override
    public void apply(CodeStyleSettings settings) {
        CommonCodeStyleSettings commonSettings = settings.getCommonSettings(getLanguage());

        commonSettings.SPACE_WITHIN_PARENTHESES = true;
        commonSettings.SPACE_WITHIN_METHOD_CALL_PARENTHESES = true;
        commonSettings.SPACE_WITHIN_METHOD_PARENTHESES = true;
        commonSettings.SPACE_WITHIN_IF_PARENTHESES = true;
        commonSettings.SPACE_WITHIN_WHILE_PARENTHESES = true;
        commonSettings.SPACE_WITHIN_FOR_PARENTHESES = true;
        commonSettings.SPACE_WITHIN_CATCH_PARENTHESES = true;
        commonSettings.SPACE_WITHIN_SWITCH_PARENTHESES = true;
        commonSettings.SPACE_WITHIN_ARRAY_INITIALIZER_BRACES = true;
        commonSettings.SPACE_AFTER_TYPE_CAST = true;

        CodeStyleSettings.IndentOptions indentOptions = settings.getIndentOptions(JavaScriptFileType.INSTANCE);
        indentOptions.USE_TAB_CHARACTER = true;
        indentOptions.SMART_TABS = true;
        indentOptions.TAB_SIZE = 4;
        indentOptions.INDENT_SIZE = 4;
        indentOptions.CONTINUATION_INDENT_SIZE = 4;
        indentOptions.LABEL_INDENT_SIZE = 0;
        indentOptions.LABEL_INDENT_ABSOLUTE = false;
        indentOptions.USE_RELATIVE_INDENTS = false;
    }
}

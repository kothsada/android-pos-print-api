/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aevi.print.model;

public class TestPrinterFontBuilder {

    private int id;
    private String name;
    private int width;
    private int height;
    private boolean isDefault;
    private int numColumns;
    private int lineHeight;
    private FontStyle[] supportedFontStyles;

    public TestPrinterFontBuilder withId(int id) {
        this.id = id;
        return this;
    }

    public TestPrinterFontBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public TestPrinterFontBuilder withWidth(int width) {
        this.width = width;
        return this;
    }

    public TestPrinterFontBuilder withHeight(int height) {
        this.height = height;
        return this;
    }

    public TestPrinterFontBuilder withIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    public TestPrinterFontBuilder withNumColumns(int numColumns) {
        this.numColumns = numColumns;
        return this;
    }

    public TestPrinterFontBuilder withLineHeight(int lineHeight) {
        this.lineHeight = lineHeight;
        return this;
    }

    public TestPrinterFontBuilder withSupportedFontStyles(FontStyle[] supportedFontStyles) {
        this.supportedFontStyles = supportedFontStyles;
        return this;
    }

    public PrinterFont build() {
        return new PrinterFont(id, name, width, height, isDefault, numColumns, lineHeight, supportedFontStyles);
    }
}
/* 
* Created by dan-geabunea on 5/3/2016.
* This code is the property of JLG Consulting. Please
* check the license terms for this product to see under what
* conditions you can use or modify this source code.
*/
package jlg.jade.test.asterix.cat062.item380;

import jlg.jade.asterix.cat062.item380.Cat062Item380Subfield16;
import jlg.jade.test.utils.MandatoryFixedLengthAsterixTests;

public class Cat062Item380Subfield16Test extends MandatoryFixedLengthAsterixTests<Cat062Item380Subfield16> {
    @Override
    protected int setExpectedItemSizeInBytes() {
        return 2;
    }

    @Override
    protected Cat062Item380Subfield16 setFixedLengthAsterixDataInstance() {
        return new Cat062Item380Subfield16();
    }
}

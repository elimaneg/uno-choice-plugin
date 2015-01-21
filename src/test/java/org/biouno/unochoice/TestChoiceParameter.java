/*
 * The MIT License (MIT)
 * 
 * Copyright (c) <2014> <Ioannis Moutsatsos, Bruno P. Kinoshita>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.biouno.unochoice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.biouno.unochoice.model.GroovyScript;
import org.junit.Test;

public class TestChoiceParameter {

	@Test
	public void testConstructor() {
		GroovyScript script = new GroovyScript("return ['a', 'b']", "return ['EMPTY!']");
		ChoiceParameter param = new ChoiceParameter(
			"param000", "description", 
			script, CascadeChoiceParameter.ELEMENT_TYPE_FORMATTED_HIDDEN_HTML, true);
		
		assertEquals("param000", param.getName());
		assertEquals("description", param.getDescription());
		assertEquals(script, param.getScript());
		assertEquals("ET_FORMATTED_HIDDEN_HTML", param.getChoiceType());
		assertTrue(param.getFilterable());
	}
}

/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.demo.dynamicdata.kaleoticketdefinitionworkflow;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class EditDataDefinitionFieldAttachmentsTest extends BaseTestCase {
	public void testEditDataDefinitionFieldAttachments()
		throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.selectFrame("relative=top");
		selenium.open("/web/guest/home/");
		selenium.waitForElementPresent("link=Control Panel");
		selenium.clickAt("link=Control Panel",
			RuntimeVariables.replace("Control Panel"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Dynamic Data Lists",
			RuntimeVariables.replace("Dynamic Data Lists"));
		selenium.waitForPageToLoad("30000");
		selenium.waitForVisible("//a[@id='_167_manageDDMStructuresLink']");
		assertEquals(RuntimeVariables.replace("Manage Data Definitions"),
			selenium.getText("//a[@id='_167_manageDDMStructuresLink']"));
		selenium.clickAt("//a[@id='_167_manageDDMStructuresLink']",
			RuntimeVariables.replace("Manage Data Definitions"));
		selenium.waitForVisible("//iframe");
		selenium.selectFrame("//iframe");
		selenium.waitForVisible(
			"//input[@id='_166_toggle_id_ddm_structure_searchkeywords']");
		selenium.type("//input[@id='_166_toggle_id_ddm_structure_searchkeywords']",
			RuntimeVariables.replace("Ticket Definition"));
		selenium.clickAt("//input[@value='Search']",
			RuntimeVariables.replace("Search"));
		selenium.waitForVisible("//span[@title='Actions']/ul/li/strong/a");
		Thread.sleep(5000);
		selenium.clickAt("//span[@title='Actions']/ul/li/strong/a",
			RuntimeVariables.replace("Actions"));
		selenium.waitForVisible(
			"//div[@class='lfr-component lfr-menu-list']/ul/li[1]/a");
		assertEquals(RuntimeVariables.replace("Edit"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list']/ul/li[1]/a"));
		selenium.click("//div[@class='lfr-component lfr-menu-list']/ul/li[1]/a");
		selenium.waitForVisible("//div[@class='aui-diagram-builder-canvas']");
		selenium.clickAt("xPath=(//button[@id='editEvent'])[6]",
			RuntimeVariables.replace("Edit"));
		selenium.waitForVisible("//tbody[@class='yui3-datatable-data']");
		assertEquals(RuntimeVariables.replace("Field Label"),
			selenium.getText(
				"//tbody[@class='yui3-datatable-data']/tr[2]/td[1]"));
		selenium.doubleClickAt("//tbody[@class='yui3-datatable-data']/tr[2]/td[1]",
			RuntimeVariables.replace("Field Label"));
		selenium.waitForVisible("//div[@class='yui3-widget-bd']/input");
		selenium.type("//div[@class='yui3-widget-bd']/input",
			RuntimeVariables.replace("Attachments"));
		selenium.clickAt("//div[@class='yui3-widget-ft']/span/span/button",
			RuntimeVariables.replace("Save"));
		assertEquals(RuntimeVariables.replace("Name"),
			selenium.getText(
				"//tbody[@class='yui3-datatable-data']/tr[5]/td[1]"));
		selenium.doubleClickAt("//tbody[@class='yui3-datatable-data']/tr[5]/td[1]",
			RuntimeVariables.replace("Name"));
		selenium.waitForVisible("//div[@class='yui3-widget-bd']/input");
		selenium.type("//div[@class='yui3-widget-bd']/input",
			RuntimeVariables.replace("attachments"));
		selenium.clickAt("//div[@class='yui3-widget-ft']/span/span/button",
			RuntimeVariables.replace("Save"));
		selenium.clickAt("//div[@class='yui3-widget-ft']/span/span/button",
			RuntimeVariables.replace("Save"));
		assertEquals(RuntimeVariables.replace("ddm-fileupload"),
			selenium.getText(
				"//tbody[@class='yui3-datatable-data']/tr[1]/td[2]"));
		assertEquals(RuntimeVariables.replace("Attachments"),
			selenium.getText(
				"//tbody[@class='yui3-datatable-data']/tr[2]/td[2]"));
		assertEquals(RuntimeVariables.replace("Yes"),
			selenium.getText(
				"//tbody[@class='yui3-datatable-data']/tr[3]/td[2]"));
		assertEquals(RuntimeVariables.replace("No"),
			selenium.getText(
				"//tbody[@class='yui3-datatable-data']/tr[4]/td[2]"));
		assertEquals(RuntimeVariables.replace("attachments"),
			selenium.getText(
				"//tbody[@class='yui3-datatable-data']/tr[5]/td[2]"));
		assertEquals(RuntimeVariables.replace(""),
			selenium.getText(
				"//tbody[@class='yui3-datatable-data']/tr[6]/td[2]"));
		assertEquals(RuntimeVariables.replace("*"),
			selenium.getText(
				"//tbody[@class='yui3-datatable-data']/tr[7]/td[2]"));
		selenium.clickAt("//input[@value='Save']",
			RuntimeVariables.replace("Save"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace(
				"Your request completed successfully."),
			selenium.getText("//div[@class='portlet-msg-success']"));
	}
}
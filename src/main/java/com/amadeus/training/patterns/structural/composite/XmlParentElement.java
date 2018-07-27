/**
 * 
 */
package com.amadeus.training.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author durrah
 *
 */
public class XmlParentElement implements XmlTag ,XmlTag.Parent {

	private String tagName;
	private String startTag;
	private String endTag;
	private List<XmlTag> children;

	public XmlParentElement(String tagName) {
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
		this.children = new ArrayList<>();
	}

	@Override
	public String getTagName() {
		return tagName;
	}

	@Override
	public void setStartTag(String tag) {
		this.startTag = tag;
	}

	@Override
	public void setEndTag(String tag) {
		this.endTag = tag;
	}

	@Override
	public void setTagBody(String tagBody) {

	}

	@Override
	public void addChildTag(XmlTag htmlTag) {
		children.add(htmlTag);
	}

	@Override
	public void removeChildTag(XmlTag htmlTag) {
		children.remove(htmlTag);
	}

	@Override
	public List<XmlTag> getChildren() {
		return children;
	}

	@Override
	public void generateXml() {
		System.out.println(startTag);
		for (XmlTag tag : children) {
			tag.generateXml();
		}
		System.out.println(endTag);

	}

}

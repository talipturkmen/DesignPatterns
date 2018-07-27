/**
 * 
 */
package com.amadeus.training.patterns.structural.composite;

/**
 * @author durrah
 *
 */
public class XmlElement implements XmlTag {

	private String tagName;
	private String startTag;
	private String endTag;
	private String tagBody;

	public XmlElement(String tagName) {
		this.tagName = tagName;
		this.tagBody = "";
		this.startTag = "";
		this.endTag = "";
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
		this.tagBody = tagBody;
	}


	@Override
	public void generateXml() {
		System.out.println(startTag + "" + tagBody + "" + endTag);
	}

}

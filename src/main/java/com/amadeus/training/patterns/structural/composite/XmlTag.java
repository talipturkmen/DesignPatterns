package com.amadeus.training.patterns.structural.composite;

import java.util.List;

public interface XmlTag {
	public abstract String getTagName();

	public abstract void setStartTag(String tag);

	public abstract void setEndTag(String tag);

	public void setTagBody(String tagBody) ;


	interface Parent{
		List<XmlTag> getChildren();
		public void addChildTag(XmlTag htmlTag) ;

		public void removeChildTag(XmlTag htmlTag);
	}

	public abstract void generateXml();
}

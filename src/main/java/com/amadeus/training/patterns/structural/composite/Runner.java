/**
 * 
 */
package com.amadeus.training.patterns.structural.composite;

/**
 * @author durrah
 *
 */
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		XmlTag projectTag = new XmlParentElement("<project>");
		projectTag.setStartTag("<project>");
		projectTag.setEndTag("</project>");

		XmlTag dependencies = new XmlParentElement("<dependencies>");
		dependencies.setStartTag("<dependencies>");
		dependencies.setEndTag("</dependencies>");

	XmlTag dependency1 = new XmlParentElement("<dependency>");
		dependency1.setStartTag("<dependency>");
		dependency1.setEndTag("</dependency>");

		XmlTag groupIdTag = new XmlElement("groupId");
		groupIdTag.setStartTag("<groupId>");
		groupIdTag.setEndTag("<groupId>");
//		dependency1.addChildTag(groupIdTag);

		XmlTag artifactIdTag = new XmlElement("artifactIdTag");
		artifactIdTag.setStartTag("<artifactIdTag>");
		artifactIdTag.setEndTag("<artifactIdTag>");
//		dependency1.addChildTag(artifactIdTag);

//		dependencies.addChildTag(dependency1);

		XmlTag dependency = new XmlParentElement("<dependency>");
		dependency.setStartTag("<dependency>");
		dependency.setEndTag("</dependency>");

		groupIdTag = new XmlElement("groupId");
		groupIdTag.setStartTag("<groupId>");
		groupIdTag.setEndTag("<groupId>");
		groupIdTag.setTagBody("org.projectlombok");
		//dependency.addChildTag(groupIdTag);

		artifactIdTag = new XmlElement("artifactIdTag");
		artifactIdTag.setStartTag("<artifactIdTag>");
		artifactIdTag.setEndTag("<artifactIdTag>");
		artifactIdTag.setTagBody("lombok");
		//dependency.addChildTag(artifactIdTag);

		//dependencies.addChildTag(dependency);

		projectTag.generateXml();

	}

}

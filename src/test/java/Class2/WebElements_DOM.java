package Class2;

public class WebElements_DOM {

    /**
     * Types of WebElements:
     * Input box/field --> Type(method:sendKeys ("type this"))/Clear (method: clear())
     * Buttons --> Click (method: click () )
     * Radio Buttons --> Click
     * CheckBox --> Click
     * Dropdown --> Click
     * hyperlinks (links) --> Click
     *      text associated with a link is called linkText
     *
     * Alert
     * Frames
     */

    /**
     * The BODY:
     *
     * DOM - Document Object Model
     * <tag1>    --> starting of tag1 (tag name cannot have spaces)
     * </tag1>   --> closing of tag1
     *
     * <tag1 attr="value1" attr2="value2" attr3 attr4="value of attr4"> </tag1>
     *      attr1,attr2,attr3,attr4 --> attributes with tag1 (attribute names cannot have spaces)
     *      each attribute may or may not have value (attr3 without attr value)
     *
     * <tag1 attr attr2 attr3 attr4="value of attr4">text with tag1</tag1> //text associated with a tag1
     *      tag1 has text = "text with tag1"
     *
     * <tag1  attr11='val1" attr12"val2" attr13>
     *     <tag2 attr21="value3" attr22="22">
     *         text value
     *     </tag2>
     *     <tag3>
     *         my text value
     *     </tag3>
     *     unique text value
     * </tag1>
     *
     * text with tag2 - text value
     * text with tag3 - my text value
     * text with tag1 - unique text value
     *
     * tag1 (parent), tag2 and tag3 are child of tag1
     * tag2 and tag3 are siblings
     *
     * following-siblings - sibling-tags appearing in dom after tag
     * preceding-sibling - sibling-tags appearing in dom before tag
     *
     * following - tags appearing in dom after the tag
     * preceding - tags appearing in dom before the tag
     *
     * descendant - tags in family chain appearing in dom after the tag
     * ancestor - tags in family chain appearing in dom before the tag
     */



}

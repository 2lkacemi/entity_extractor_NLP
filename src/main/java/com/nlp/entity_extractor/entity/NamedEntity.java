package com.nlp.entity_extractor.entity;

/**
 * text : the word (or group of words) that make up the named entity.
 * type : the category of the named entity (as seen above, person/location/…)
 * description : simply the description of the named entity that we will eventually get from Wikidata
 */
public class NamedEntity {
    private String text;
    private String type;
    private String description;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

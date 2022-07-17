package com.nlp.entity_extractor.service;

import com.nlp.entity_extractor.entity.NamedEntity;

import java.util.List;

/**
 * ervice that will extract all the named entities from a given text, and get their description from Wikidata,
 * so that we finally add them to each NamedEntity object.
 */
public interface INerService{
    public List<NamedEntity> getNamedEntities(String textToAnalyze);
}



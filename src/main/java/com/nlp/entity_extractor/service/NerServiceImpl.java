package com.nlp.entity_extractor.service;

import com.nlp.entity_extractor.entity.NamedEntity;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.springframework.stereotype.Service;
import org.wikidata.wdtk.datamodel.helpers.Datamodel;
import org.wikidata.wdtk.wikibaseapi.BasicApiConnection;
import org.wikidata.wdtk.wikibaseapi.WikibaseDataFetcher;

import java.util.List;
import java.util.Properties;

/**
 * getNamedEntites : That’s the main method of this service, that will call StanfordCoreNLP’s pipeline in order to
 * extract named entities. Also, it will call our second method :
 * addDescription : A private method that takes a NamedEntity object as a parameter, and adds its extracted
 * description to it by simply calling the right setter.
 */
@Service
public class NerServiceImpl implements INerService{

    private StanfordCoreNLP pipeline;
    private WikibaseDataFetcher wbdf;

    public NerServiceImpl() {
        Properties props = new Properties();
        props.setProperty("annotators", "tokenize,ssplit,pos,lemma,ner");
        props.setProperty("ner.applyFineGrained", "false");
        pipeline = new StanfordCoreNLP(props);
        wbdf = new WikibaseDataFetcher(BasicApiConnection.getWikidataApiConnection(), Datamodel.SITE_WIKIDATA);
    }

    @Override
    public List<NamedEntity> getNamedEntities(String textToAnalyze) {

        return null;
    }

    private void addDescription(NamedEntity namedEntity){
    }
}

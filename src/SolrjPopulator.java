import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrInputDocument;

import java.io.IOException;

public class SolrjPopulator {
  public static void main(String[] args) throws IOException, SolrServerException {
	  String urlString = "http://localhost:8983/solr";
	  SolrServer solr = new HttpSolrServer(urlString);
	  SolrInputDocument document = new SolrInputDocument();
	  document.addField("id", "552199");
	  document.addField("name", "Gouda cheese wheel");
	  document.addField("price", "49.99");
	  UpdateResponse response = solr.add(document);
	  // Remember to commit your changes!
	  solr.commit();
  }
}
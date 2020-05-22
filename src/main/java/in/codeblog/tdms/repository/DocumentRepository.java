package in.codeblog.tdms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.codeblog.tdms.domain.Document;

@Repository
public interface DocumentRepository extends CrudRepository<Document, Long>{
    
	
	public Document findByDocumentId(long id);

	@Override
	public Iterable<Document> findAll();
	

}

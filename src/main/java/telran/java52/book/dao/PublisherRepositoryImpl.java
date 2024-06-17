package telran.java52.book.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import telran.java52.book.model.Publisher;

@Repository
public class PublisherRepositoryImpl implements PublisherRepository {
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<String> findPublishersByAuthor(String authorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Publisher> findDistinctByBookAuthorsName(String authorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Publisher> findById(String publisher) {
		
		return Optional.ofNullable(em.find(Publisher.class, publisher));
	}

	@Override
	public Publisher save(Publisher publisher) {
		em.persist(publisher);
		return publisher;
	}

}

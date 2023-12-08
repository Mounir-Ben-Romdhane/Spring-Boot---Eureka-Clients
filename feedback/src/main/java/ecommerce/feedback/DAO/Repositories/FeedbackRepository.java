package ecommerce.feedback.DAO.Repositories;

import ecommerce.feedback.DAO.Entities.Feedback;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends MongoRepository<Feedback,Long> {
}

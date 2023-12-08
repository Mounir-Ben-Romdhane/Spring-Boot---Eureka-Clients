package ecommerce.feedback.DAO.Services;

import ecommerce.feedback.DAO.Entities.Feedback;
import ecommerce.feedback.DAO.Proxy.ProduitProxy;
import ecommerce.feedback.DAO.Repositories.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedBackService implements IFeedbackService{
    @Autowired
    private FeedbackRepository feedbackRepository;

    @Autowired
    private ProduitProxy produitProxy;
    @Override
    public List<Feedback> findAll() {
        return feedbackRepository.findAll();
    }

    @Override
    public Feedback addFeedBack(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    @Override
    public Feedback findById(long id) {
        return feedbackRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Feedback not found"));
    }

    @Override
    public Feedback editFeedBack(Long id, Feedback feedback) {
        Feedback existingFeedback = findById(id);
        existingFeedback.setName(feedback.getName());
        existingFeedback.setDescription(feedback.getDescription());
        return feedbackRepository.save(existingFeedback);
    }

    @Override
    public void deleteFeedBack(long id) {
        feedbackRepository.deleteById(id);
    }


    @Override
    public String getProductByFeignClient(String name){
        return produitProxy.getName(name);
    }

}

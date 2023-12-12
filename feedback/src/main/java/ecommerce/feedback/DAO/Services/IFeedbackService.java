package ecommerce.feedback.DAO.Services;

import ecommerce.feedback.DAO.Entities.Feedback;

import java.util.List;

public interface IFeedbackService {
    List<Feedback> findAll();

    Feedback addFeedBack(Feedback feedback);

    Feedback findById(long id);

    Feedback editFeedBack(Long id,Feedback feedback);

    void deleteFeedBack(long id);


   // public String getProductByFeignClient(String name);

}

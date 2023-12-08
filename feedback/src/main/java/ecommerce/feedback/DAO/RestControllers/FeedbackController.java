package ecommerce.feedback.DAO.RestControllers;

import ecommerce.feedback.DAO.Entities.Feedback;
import ecommerce.feedback.DAO.Repositories.FeedbackRepository;
import ecommerce.feedback.DAO.Services.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedBackService feedBackService;

    @GetMapping("/findAll")
    List<Feedback> findAll(){
        return  feedBackService.findAll();
    }

    @PostMapping("/add")
    public Feedback addFeedback(@RequestBody Feedback feedback) {
        return feedBackService.addFeedBack(feedback);
    }

    @GetMapping("/{id}")
    public Feedback getFeedbackById(@PathVariable long id) {
        return feedBackService.findById(id);
    }

    @PutMapping("/{id}")
    public Feedback updateFeedback(@PathVariable long id, @RequestBody Feedback feedback) {
        return feedBackService.editFeedBack(id, feedback);
    }

    @DeleteMapping("/{id}")
    public void deleteFeedback(@PathVariable long id) {
        feedBackService.deleteFeedBack(id);
    }



}


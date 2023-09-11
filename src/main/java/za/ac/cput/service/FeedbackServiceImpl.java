package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Feedback;
import za.ac.cput.repository.FeedbackRepository;

import java.util.List;

@Service
public class FeedbackServiceImpl implements IFeedbackService {


    private FeedbackRepository repository;

    @Autowired
    private FeedbackServiceImpl(FeedbackRepository repository) {
        this.repository = repository;

    }

    @Override
    public Feedback create(Feedback feedback) {
        // return this.repository.save(feedback);
        return null;
    }

    @Override
    public Feedback read(String s) {

        //return this.repository.findById(id).orElse(null);
        return null;
    }

    @Override
    public Feedback update(Feedback entity) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public List<Feedback> getAll() {
        return null;
    }
}
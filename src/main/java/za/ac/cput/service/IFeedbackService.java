package za.ac.cput.service;
import za.ac.cput.domain.Feedback;

import java.util.List;

public interface IFeedbackService extends IService <Feedback, String> {

    public List<Feedback> getAll();



}

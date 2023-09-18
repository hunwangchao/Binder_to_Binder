package IInterface;


import IInterface.FeedbackData;

interface IFeedback {

      // Provider the “feedback” method to help Server process to notify Client process
      void feedback(in FeedbackData data);
}
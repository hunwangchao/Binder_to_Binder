package com.example.server;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;

import IInterface.FeedbackData;
import IInterface.IFeedback;
import IInterface.IPerformTask;
import IInterface.VerificationData;


public class ServerService extends Service {

    private Binder serverStub;
    private Binder clientProxy;

    private VerificationData verificationData;

    @Override
    public IBinder onBind(Intent intent) {
        serverStub = new IPerformTask.Stub() {
            @Override
            public void performVerify(VerificationData data, IFeedback feedback) throws RemoteException {
                verificationData = data;
                FeedbackData feedbackData = new FeedbackData();
                feedbackData.cookie = "Congratulation, welcome join us " + data.name;
                feedbackData.isPass = true;
                feedback.feedback(feedbackData);
            }
        };
        return  serverStub;
    }
}
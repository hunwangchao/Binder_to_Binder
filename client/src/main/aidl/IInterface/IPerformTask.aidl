// IPerformTask.aidl
package IInterface;

import IInterface.VerificationData;
import IInterface.IFeedback;
// Declare any non-default types here with import statements

interface IPerformTask {

      void performVerify(in VerificationData data,  IFeedback feedback);
}
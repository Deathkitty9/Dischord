package com.cpdev.recording;

public class RecorderService {

//    private static final String TAG = "com.cpdev.recording.RecorderService";
//    private RadioActivity caller;
//
//    private final IBinder mBinder = new RecorderServiceBinder();
//
//    @Override
//    public IBinder onBind(Intent intent) {
//        return mBinder;
//    }
//
//    @Override
//    public int onStartCommand(Intent intent, int flags, int startId) {
//        return START_STICKY;
//    }
//
//    public void startRecording(RadioActivity view, RadioDetails radioDetails) {
//        CharSequence ticketText = new StringBuilder()
//                .append("Recording ")
//                .append(radioDetails.getStationName())
//                .toString();
//        startForeground(0, new Notification(R.drawable.ic_notification_recording, ticketText, System.currentTimeMillis()));
//
//        caller = view;
//        RadioApplication radioApplication = (RadioApplication) this.getApplicationContext();
//        radioApplication.getRecordingTask().execute(radioDetails);
//        //radioApplication.getRecordingTask().attach(view);
//
//        String operation = StringUtils.IsNullOrEmpty(radioDetails.getStationName()) ? "Recording " : "Recording " + radioDetails.getStationName();
//        caller.setStatus(operation);
////        CharSequence tickerText = StringUtils.IsNullOrEmpty(radioDetails.getStationName()) ? operation : operation + radioDetails.getStationName();
////        CharSequence contentText = StringUtils.IsNullOrEmpty(radioDetails.getStationName()) ? operation : operation + radioDetails.getStationName();
////        showNotification(NotificationHelper.RECORDING_ID, radioDetails, operation, operation);
//    }
//
//    public void stopRecording(RadioActivity view) {
//        Log.d(TAG, "Stopping recording");
//        caller = view;
//        RadioApplication radioApplication = (RadioApplication) this.getApplicationContext();
//        RecordingTask recordingTask = radioApplication.getRecordingTask();
//        recordingTask.cancel(true);
//
//        view.setStatus("Stopped recording");
//        cancelNotification(NotificationHelper.RECORDING_ID);
//
//        recordingTask = null;
//        radioApplication.setRecordingTask(recordingTask);
//    }
//
//    public boolean alreadyRecording() {
//        RadioApplication radioApplication = (RadioApplication) this.getApplicationContext();
//        RecordingTask recordingTask = radioApplication.getRecordingTask();
//        return recordingTask.alreadyRecording();
//    }
//
//    public class RecorderServiceBinder extends Binder {
//        public RecorderService getService() {
//            return RecorderService.this;
//        }
//    }
}

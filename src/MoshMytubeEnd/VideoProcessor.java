package MoshMytubeEnd;

public class VideoProcessor {
    public void process(Video video) {
        VideoEncoder encoder = new VideoEncoder();
        encoder.encode(video);

        VideoDatabase database = new VideoDatabase();
        database.store(video);

        EmailService emailService = new EmailService();
        emailService.sendEmail(video.getUser());
    }
}

package hi.vidmot;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.control.ProgressBar;

public class MediaController {

    private static String MYFILE;
    private static final String MYNAME = "file_example_MP4_480_1_5MG.mp4";

    // GUI variables
    @FXML
    private Button fxSpilaButton, fxPausaButton, fxStoppaButton;

    @FXML
    private MediaView fxMediaView;

    @FXML
    private ProgressBar fxProgressBar;

    private MediaPlayer mediaPlayer;

    @FXML
    private void initialize() {

        MYFILE = String.valueOf(getClass().getResource(MYNAME));
        // TODO: Create Media and MediaPlayer with a fixed file with path in MYFILE
        mediaPlayer = new MediaPlayer(new Media(MYFILE));
        // TODO: Set up MediaView with MediaPlayer
        fxMediaView.setMediaPlayer(mediaPlayer);

        // TODO: set up a rule, e.g. binding, making spila button inactive when player is playing
        fxSpilaButton.disableProperty().bind(mediaPlayer.statusProperty().isEqualTo(MediaPlayer.Status.PLAYING));
        // TODO: set a a rule, e.g. binding, making pause button inactive when player is not playing
        fxPausaButton.disableProperty().bind(mediaPlayer.statusProperty().isNotEqualTo(MediaPlayer.Status.PLAYING));
        // TODO: Set up a listener from MediaPlayer's currentTimeProperty to fxSlider
        mediaPlayer.currentTimeProperty().addListener((observable, oldValue, newValue) -> {
            fxProgressBar.setProgress(newValue.toMillis() / mediaPlayer.getTotalDuration().toMillis());
        });
    }

    @FXML
    private void spila() {
        // TODO: Start playback
        mediaPlayer.play();
    }

    @FXML
    private void pausa() {
        // TODO: Pause playback
        mediaPlayer.pause();
    }

    @FXML
    private void stoppa() {
        // TODO: Stop playback
        mediaPlayer.stop();
    }
}

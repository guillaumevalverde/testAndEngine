package gve.testandengine.app;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.ui.activity.SimpleBaseGameActivity;

/**
 * Created by guillaume on 13/03/2014.
 */
public class TowerOfHanoiActivity extends SimpleBaseGameActivity {

    private static int CAMERA_WIDTH = 800;
    private static int CAMERA_HEIGHT = 480;


    @Override
    protected void onCreateResources() {

    }

    @Override
    protected Scene onCreateScene() {
        return null;
    }

    @Override
    public EngineOptions onCreateEngineOptions() {
        final Camera camera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
        return new EngineOptions(true, ScreenOrientation.LANDSCAPE_FIXED,    new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), camera);

    }
}

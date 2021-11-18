package io.ionic.starter;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;
import io.ionic.starter.plugins.ScreenOrientation.ScreenOrientationPlugin;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerPlugin(ScreenOrientationPlugin.class);
    }
}

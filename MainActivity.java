package com.purple.menu;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

// Placeholder app. The real payload is libpurplemenu.so, which must be
// loaded inside the Minecraft process (see README).
public class MainActivity extends Activity {
    @Override protected void onCreate(Bundle b) {
        super.onCreate(b);
        TextView t = new TextView(this);
        t.setText("libpurplemenu.so is inside this APK.\nExtract it and load it into your Minecraft copy (see README).");
        t.setPadding(48, 96, 48, 48);
        setContentView(t);
    }
}

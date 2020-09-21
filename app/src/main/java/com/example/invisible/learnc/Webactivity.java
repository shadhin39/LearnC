package com.example.invisible.learnc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubeThumbnailView;

public class Webactivity extends YouTubeBaseActivity {

    private YouTubePlayerView youtubeplayer;
    private Button pl;
    YouTubePlayer.OnInitializedListener oninitializer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webactivity);

        youtubeplayer=(YouTubePlayerView)findViewById(R.id.Youtubeid);
        pl=findViewById(R.id.Play);
        oninitializer=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                youTubePlayer.loadVideo("KJgsSFOSQv0");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        pl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youtubeplayer.initialize(play.API_KEY,oninitializer);
                pl.setVisibility(View.INVISIBLE);
            }
        });



    }
}

package org.videolan.libvlc;

/**
 * Created by taaalda5 on 7/25/16.
 */

public interface IMediaPlayer {
    interface Callback {
        void onMediaPlayerEvent(int eventType);
    }
}

package ARMK.video.Downloader.UDownloader.ads;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;


import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

import ARMK.video.Downloader.UDownloader.constants.iConstants;



public class FanBanner implements iConstants  {

    public static void LoadAd(Context context , RelativeLayout adContainer , String ID ){
       AdView adView = new AdView(context, ID, AdSize.BANNER_HEIGHT_50);
        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();
    }
}

package kolipaka.tabwithswipeviews;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

/**
 * Created by raghu on 20/9/14.
 */
public class FragmentPageAdapter extends FragmentPagerAdapter {
    public FragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AlbumFragment();
            case 1:
                return new ArtistFragment();
            case 2:
                return new SongsFragment();
            case 3:
                return new NowPlayingFragment();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}

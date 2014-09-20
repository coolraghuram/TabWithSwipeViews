package kolipaka.tabwithswipeviews;

import java.util.Locale;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v13.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MyActivity extends FragmentActivity implements ActionBar.TabListener {

    ActionBar actionbar;
    ViewPager pager;
    FragmentPageAdapter ft;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        pager = (ViewPager) findViewById(R.id.pager);
        ft = new FragmentPageAdapter(getFragmentManager());

        actionbar = getActionBar();
        actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionbar.addTab(actionbar.newTab().setText("Album").setTabListener(this));
        actionbar.addTab(actionbar.newTab().setText("Artist").setTabListener(this));
        actionbar.addTab(actionbar.newTab().setText("Songs").setTabListener(this));
        actionbar.addTab(actionbar.newTab().setText("Now Playing").setTabListener(this));

        pager.setAdapter(ft);

        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                actionbar.setSelectedNavigationItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        //Toast.makeText(getApplicationContext(),"on Tabselected",Toast.LENGTH_SHORT).show();
        pager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        //Toast.makeText(getApplicationContext(),"on TabUnselected",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        //Toast.makeText(getApplicationContext(),"on TabReselected",Toast.LENGTH_SHORT).show();

    }
}

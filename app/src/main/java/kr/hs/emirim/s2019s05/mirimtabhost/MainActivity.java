package kr.hs.emirim.s2019s05.mirimtabhost;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("tag1").setIndicator("아이콘1");
        tabSpec1.setContent(R.id.linear1);
        tabHost.addTab(tabSpec1);

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("tag2").setIndicator("아이콘2");
        tabSpec2.setContent(R.id.linear2);
        tabHost.addTab(tabSpec2);

        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("tag3").setIndicator("아이콘3");
        tabSpec3.setContent(R.id.linear3);
        tabHost.addTab(tabSpec3);

        tabHost.setCurrentTab(0);

    }
}
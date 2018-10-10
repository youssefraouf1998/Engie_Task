package com.example.android.firsttask;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        final ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.getMenu().getItem(1).setActionView(R.layout.menu_image);
        navigationView.getMenu().getItem(6).setActionView(R.layout.menu_image);
        navigationView.getMenu().getItem(12).setActionView(R.layout.menu_navigation_plus);

        toggle.setDrawerIndicatorEnabled(false);
        toggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer(GravityCompat.START);
            }
        });
        toggle.setHomeAsUpIndicator(R.drawable.menu);
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.search_icon) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        NavigationView nv= (NavigationView) findViewById(R.id.nav_view);
        Menu m=nv.getMenu();
        int id = item.getItemId();

        if (id == R.id.nav_posts) {
            boolean b = !m.findItem(R.id.nav_class).isVisible();
            //setting submenus visible state
            m.findItem(R.id.nav_class).setVisible(b);
            m.findItem(R.id.nav_dept).setVisible(b);
            m.findItem(R.id.nav_batch).setVisible(b);
            m.findItem(R.id.nav_campus).setVisible(b);
            return true;
        } else if (id == R.id.nav_walls) {
            boolean b=!m.findItem(R.id.nav_wall_events).isVisible();
            //setting submenus visible state
            m.findItem(R.id.nav_wall_events).setVisible(b);
            m.findItem(R.id.nav_wall_fun).setVisible(b);
            m.findItem(R.id.nav_wall_hadith).setVisible(b);
            m.findItem(R.id.nav_wall_news).setVisible(b);
            m.findItem(R.id.nav_wall_Poetry).setVisible(b);
            return true;
        } else if (id == R.id.nav_com) {

            m.findItem(R.id.nav_share).setVisible(false);
            m.findItem(R.id.nav_send).setVisible(false);

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

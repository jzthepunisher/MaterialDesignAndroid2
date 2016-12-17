package com.soloparaapasionados.materialdesign;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private TextView mTxvMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Material Design sobre Android");

        mTxvMenuItem = (TextView) findViewById(R.id.txvMenuItem);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this,
                mDrawerLayout,
                toolbar,
                R.string.drawer_open,
                R.string.drawer_close);

        mDrawerLayout.setDrawerListener(drawerToggle);
        drawerToggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        //		menuItem.setCheckable(true);
//		menuItem.setChecked(true);  // This helps to know which Menu Item is Clicked

        String itemName = (String) item.getTitle();

        mTxvMenuItem.setText(itemName);

        hideDrawer();

        switch (item.getItemId()) {

            case R.id.item_android:
                // Your Item specific Codes
                break;

            case R.id.item_ios:
                // Your item specific Codes
                break;
        }

        return true;
    }

    // Open the Drawer
    private void showDrawer() {
        mDrawerLayout.openDrawer(GravityCompat.START);
    }

    // Close the Drawer
    private void hideDrawer() {
        mDrawerLayout.closeDrawer(GravityCompat.START);
    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START))
            hideDrawer();
        else
            super.onBackPressed();
    }

    public void muestraComponentesBasicos(View view) {
        Intent intent = new Intent(this,ComponentesBasciosActivity.class);
        startActivity(intent);
    }
    public void muestraNavigationViewAgrupado(View view) {
        Intent intent = new Intent(this,NavigationViewAgrupadoActivity.class);
        startActivity(intent);
    }

    public void muestraNavigationViewAgrupadoConCabecera(View view) {
        Intent intent = new Intent(this,NavigationViewAgrupadoConCabeceraActivity.class);
        startActivity(intent);
    }

    public void muestraFloatingLabelHints(View view) {
        Intent intent = new Intent(this,FloatingLabelHintsActivity.class);
        startActivity(intent);
    }

    public void muestraAppBarLayout(View view) {
        Intent intent = new Intent(this,AppBarLayoutActivity.class);
        startActivity(intent);
    }

    public void muestraCollapsingToolbarLayout(View view) {
        Intent intent = new Intent(this,CollapsingToolBarLayoutActivity.class);
        startActivity(intent);
    }

    public void muestraRadioGroup(View view) {
        Intent intent = new Intent(this,RadioGroupActivity.class);
        startActivity(intent);
    }

    public void muestraRecyclerView(View view) {
        Intent intent = new Intent(this,RecyclerViewActivity.class);
        startActivity(intent);
    }

    public void muestraRecyclerViewDos(View view) {
        Intent intent = new Intent(this,RecyclerViewDosActivity.class);
        startActivity(intent);
    }
}

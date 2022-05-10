package com.example.dashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //to remove the status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //hooks
        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.nav_view);
        toolbar=findViewById(R.id.toolbar);


// for the toolbar

        setSupportActionBar(toolbar);

        // For navigation drawer menu
        //to add the drawer

        //to hide or show items(when logged in don't display login option in drawer menu)

        Menu menu = navigationView.getMenu();
        menu.findItem(R.id.nav_logout).setVisible(false);
        menu.findItem(R.id.nav_profile).setVisible(false);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this , drawerLayout ,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
  drawerLayout.addDrawerListener(toggle);
  toggle.syncState();
  navigationView.setNavigationItemSelectedListener(this);
  //when the application launches it should select the navigation home screen.
        navigationView.setCheckedItem(R.id.nav_home);
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


        switch (menuItem.getItemId()){
         case R.id.nav_home:
             break;
         case R.id.nav_Complaint:
             Intent intent =new Intent (MainActivity.this,Complaint.class);
             startActivity(intent);
             break;

             // services connection
            case R.id.nav_Services:
                Intent intent2 =new Intent (MainActivity.this,Services.class);
                startActivity(intent2);
                break;

                //parkassist connection
            case R.id.nav_parkassist:
                Intent intent3 =new Intent (MainActivity.this,Parkassist.class);
                startActivity(intent3);
                break;

                //buy sell connection
            case R.id.nav_buysell:
                Intent intent4 =new Intent (MainActivity.this,Buysell.class);
                startActivity(intent4);
                break;

                //helpline connection
            case R.id.nav_helpline:
                Intent intent5 =new Intent (MainActivity.this,Helpline.class);
                startActivity(intent5);
                break;

                //Rules connection
            case R.id.nav_rules:
                Intent intent6 =new Intent (MainActivity.this,Rules.class);
                startActivity(intent6);
                break;

     }
     //close drawer menu when option selected.  When an option is selected it will closes the home screen
     drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}

package com.example.rm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

//import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
//import com.smarteist.autoimageslider.SliderAnimations;
//import com.smarteist.autoimageslider.SliderView;

public class Dashboard extends AppCompatActivity {
    //SliderView sliderView;
  //  int[] images={
          //  R.drawable.slider1,
          //  R.drawable.slider2,
          //  R.drawable.slider3,
          //  R.drawable.slider4,
          //  R.drawable.slider5
  //  };


    RecyclerView catRecyclerview;
    DrawerLayout drawerLayout;

    //Category recyclerview
    CategoryAdapter categoryAdapter;
    List<CategoryModel> categoryModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_main_layout);
      //  sliderView=findViewById(R.id.image_slider);
       // SliderAdapter sliderAdapter=new SliderAdapter(images);
      //  sliderView.setSliderAdapter(sliderAdapter);
       // sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
       // sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
       // sliderView.startAutoCycle();
        drawerLayout = findViewById(R.id.drawer_layout);



        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.nav_orders){
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


                }
                else if (item.getItemId()==R.id.nav_rewards){

                }
                else if (item.getItemId()==R.id.nav_cart){

                }
                else if (item.getItemId()==R.id.nav_wishlist){

                }
                else if (item.getItemId()==R.id.nav_account){

                }
                else if (item.getItemId()==R.id.nav_logout){

                }
                return true;
            }
        });



        catRecyclerview=findViewById(R.id.rec_category);
        ImageSlider imageSlider=findViewById(R.id.image_slider);
        List<SlideModel> slideModels=new ArrayList<>();
        //slideModels.add(new SlideModel(R.drawable.slider2, ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.slider3, ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.slider6, ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.slider5, ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.banner10, ScaleTypes.CENTER_CROP));

        slideModels.add(new SlideModel(R.drawable.banner12, ScaleTypes.CENTER_CROP));

        imageSlider.setImageList(slideModels);
        catRecyclerview.setLayoutManager(new LinearLayoutManager(new DashboardNew()));
    }

    public void ClickMenu(View view){
        openDrawer(drawerLayout);
    }

    private void openDrawer(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.START);
    }
}
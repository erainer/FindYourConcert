package net.androidbootcamp.findmyconcert;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button explore = findViewById(R.id.exploreBtn);
        Button crew = findViewById(R.id.sellTicektsBtn);
        Button yourActivity = findViewById(R.id.yourActivityBtn);
        Button friendsActivity = findViewById(R.id.friendsActivityBtn);
        Button buyTickets = findViewById(R.id.buyTicketsBtn);
        Button sellTickets = findViewById(R.id.sellTicektsBtn);

        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, Explore.class));
            }
        });

        crew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, FindYourCrew.class));
            }
        });

        yourActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, YourFeed.class));

            }
        });

        friendsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, FriendsFeed.class));
            }
        });

        buyTickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, BuyTickets.class));

            }
        });

        sellTickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, SellTickets.class));

            }
        });
    }
}

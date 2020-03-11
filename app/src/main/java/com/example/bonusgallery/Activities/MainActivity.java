package com.example.bonusgallery.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.bonusgallery.R;
import com.example.bonusgallery.Utilities.AnimalAdapter;
import com.example.bonusgallery.Utilities.PartyAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Lists
    private List<String> images;
    private String[] animals   ;
    private int[]    parties   ;

    //Same RecyclerView
    private RecyclerView recyclerView ;
    private AnimalAdapter animalAdapter;
    private PartyAdapter partyAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        animals = getAnimalsLinks();
        parties = getPartyPics();

        animalAdapter = new AnimalAdapter(this,animals,R.layout.item_image);
        partyAdapter = new PartyAdapter(this,parties,R.layout.item_image);

        recyclerView.setAdapter(animalAdapter);

    }

    public String[] getAnimalsLinks() {
        String[] links = {
                "https://placekitten.com/200/300",
                "https://placekitten.com/200/301",
                "https://placekitten.com/200/302",
                "https://placekitten.com/200/303",
                "https://placekitten.com/200/304",
                "https://placekitten.com/200/305",
                "https://placekitten.com/200/306",
                "https://placekitten.com/200/307",
                "https://placekitten.com/200/308",
                "https://placekitten.com/200/309",
                "https://placekitten.com/200/310",
                "https://placekitten.com/200/311",
                "https://placekitten.com/200/312",
                "https://placekitten.com/200/313",
                "https://placekitten.com/200/314",
                "https://placekitten.com/200/315",
                "https://placekitten.com/200/316",
                "https://placekitten.com/200/317",
                "https://placekitten.com/200/318",
                "https://placekitten.com/200/319",
                "https://placekitten.com/200/320",
                "https://placekitten.com/200/321",
                "https://placekitten.com/200/322",
                "https://placekitten.com/200/323",
                "https://placekitten.com/200/324",
                "https://placekitten.com/200/325",
                "https://placekitten.com/200/326",
                "https://placekitten.com/200/327"
        };
        return links;
    } /////////////////////////////////////////////////////////////////////// END getAnimalsLinks()

    public int[] getPartyPics(){

        int[] values = {
                R.drawable.ballons,
                R.drawable.christmas,
                R.drawable.concert,
                R.drawable.drinks,
                R.drawable.fiction,
                R.drawable.fire,
                R.drawable.glass,
                R.drawable.fireworks,
                R.drawable.glass,
                R.drawable.guy,
                R.drawable.notice,
                R.drawable.olives,
                R.drawable.ballons,
                R.drawable.christmas,
                R.drawable.concert,
                R.drawable.drinks,
                R.drawable.fiction,
                R.drawable.fire,
                R.drawable.notice,
                R.drawable.olives,
                R.drawable.ballons,
                R.drawable.christmas,
                R.drawable.notice,
                R.drawable.olives,
                R.drawable.ballons,
                R.drawable.christmas,
                R.drawable.concert,
                R.drawable.fireworks,
        };
        return values;
    }/////////////////////////////////////////////////////////////////////////// END getPartyPics()


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

    }//////////////////////////////////////////////////////////////////////END onCreateOptionsMenu()


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.links_adapter){
            recyclerView.setAdapter(animalAdapter);
            Toast.makeText(MainActivity.this,"LINKS",Toast.LENGTH_SHORT).show();
            return true;
        }else if(id == R.id.resources_adapter){
            recyclerView.setAdapter(partyAdapter);
            Toast.makeText(MainActivity.this,"RESOURCES",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }/////////////////////////////////////////////////////// END METHOD - BOTÓN 'BACK' EN ACTION BAR

}

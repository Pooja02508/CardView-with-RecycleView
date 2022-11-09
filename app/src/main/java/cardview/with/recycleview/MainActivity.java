package cardview.with.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView cardRV =findViewById(R.id.cardRV);

        ArrayList<CardViewModel> cardModelArrayList = new ArrayList<CardViewModel>();

        cardModelArrayList.add(new CardViewModel("Food", R.drawable.startup));
        cardModelArrayList.add(new CardViewModel("Beverage", R.drawable.startup));
        cardModelArrayList.add(new CardViewModel("Cosmetic", R.drawable.startup));
        cardModelArrayList.add(new CardViewModel("Food", R.drawable.startup));
        cardModelArrayList.add(new CardViewModel("Beverage", R.drawable.startup));
        cardModelArrayList.add(new CardViewModel("Cosmetic", R.drawable.startup));
        cardModelArrayList.add(new CardViewModel("Food", R.drawable.startup));
        cardModelArrayList.add(new CardViewModel("Beverage", R.drawable.startup));
        cardModelArrayList.add(new CardViewModel("Cosmetic", R.drawable.startup));
        cardModelArrayList.add(new CardViewModel("Food", R.drawable.startup));

        int numberOfColumns = 2;
        cardRV.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        CardAdapter adapter = new CardAdapter(MainActivity.this,cardModelArrayList);
        cardRV.setAdapter(adapter);

    }
}
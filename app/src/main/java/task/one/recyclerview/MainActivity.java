package task.one.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("Kisah Tanah Jawa","Kategori Buku","Deskripsi",R.drawable.kisahtanahjawa));
        lstBook.add(new Book("The Lost Girl of Paris","Kategori Buku","Deskripsi",R.drawable.lostgirlofparis));
        lstBook.add(new Book("The Lost Man","Kategori Buku","Deskripsi",R.drawable.thelostman));
        lstBook.add(new Book("The Suspect","Kategori Buku","Deskripsi",R.drawable.thesuspect));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this, 2));
        myrv.setAdapter(myAdapter);

        RecyclerView myrv1 = (RecyclerView) findViewById(R.id.recyclerview_id2);
        RecyclerViewAdapter myAdapter1 = new RecyclerViewAdapter(this, lstBook);
        myrv1.setLayoutManager(new LinearLayoutManager(this));
        myrv1.setAdapter(myAdapter1);

        RecyclerView myrv2 = (RecyclerView) findViewById(R.id.recyclerview_id3);
        RecyclerViewAdapter myAdapter2 = new RecyclerViewAdapter(this, lstBook);
        myrv2.setLayoutManager (new LinearLayoutManager (this, LinearLayout.HORIZONTAL, false));
        myrv2.setAdapter(myAdapter2);

    }
}

package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<users> nameList = new ArrayList<>();
        for(int i = 0; i < 20; i++)
        {
            Random random = new Random();
            int num1 = random.nextInt();
            int num2 = random.nextInt();
            int num3 = random.nextInt();

            String name = "Name" + num1;
            String desc = "Description" + num2;
            Boolean follow = false;

            if(num3 == 1) {
                follow = true;
            }

            users user = new users(name,desc,i,follow);
            nameList.add(user);

        }

        RecyclerView rv = findViewById(R.id.rv);
        NameAdapter adapter = new NameAdapter(nameList, ListActivity.this);
        LinearLayoutManager layout = new LinearLayoutManager(this);
        rv.setLayoutManager(layout);
        rv.setAdapter(adapter);
    }
}
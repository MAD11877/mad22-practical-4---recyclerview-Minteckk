package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    users user1 = new users("Minteck","hi",1, false
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String desc = i.getStringExtra("Description");
        int number = i.getIntExtra("number", 0);
        boolean userfollows = i.getBooleanExtra("follow", false);
        user1 = new users(name, desc, number, userfollows);

        TextView n = findViewById(R.id.textView);
        n.setText(name);
        TextView d = findViewById(R.id.textView2);
        d.setText(desc);

    }

    public void followed(View view)
    {
        Button btn = findViewById(R.id.button);
        user1.Followed = !(user1.Followed);
        if(!user1.Followed){
            btn.setText("Unfollow");
            Toast.makeText(MainActivity.this, "followed", Toast.LENGTH_SHORT).show();
        }
        else {
            btn.setText("Follow");
            Toast.makeText(MainActivity.this, "Unfollowed", Toast.LENGTH_SHORT).show();
        }
    }
    public void message(View view)
    {
        Button messageBtn = findViewById(R.id.button2);
        messageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent messageIntent = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(messageIntent);
            }
        });
    }

    }





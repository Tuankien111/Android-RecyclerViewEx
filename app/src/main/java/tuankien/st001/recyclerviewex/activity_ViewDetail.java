package tuankien.st001.recyclerviewex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_ViewDetail extends AppCompatActivity {
    ImageView imageView;
    TextView title;
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_detail);

        imageView = findViewById(R.id.imageView2);
        description = findViewById(R.id.txtDes);
        title = findViewById(R.id.txtTitleBlog);

        Intent intent = getIntent();
        title.setText(intent.getStringExtra("title"));
        imageView.setImageResource(intent.getIntExtra("imageSource", 0));
        description.setText(intent.getStringExtra("description"));
    }
}
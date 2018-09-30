public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String rating = intent.getStringExtra("rating");
        String comments = intent.getStringExtra("comments");

        TextView rating_tv = findViewById(R.id.rating2);
        TextView comments_tv = findViewById(R.id.comments2);

        rating_tv.setText("Rating:"+rating);
        comments_tv.setText("Comments:"+comments);
    }
}

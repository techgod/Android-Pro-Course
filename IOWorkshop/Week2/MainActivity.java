public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et = findViewById(R.id.editText1);
        Button bt = findViewById(R.id.button1);
        final RatingBar rb = findViewById(R.id.ratingBar1);


        final Intent it = new Intent(this,SecondActivity.class);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = et.getText().toString();
                float rat = rb.getRating();
                String rating = String.valueOf(rat);
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),rating,Toast.LENGTH_LONG).show();
                startActivity(it);
            }
        });
        }

}

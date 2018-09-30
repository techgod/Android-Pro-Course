public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et = findViewById(R.id.editText1);

        Button bt = findViewById(R.id.button1);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = et.getText().toString();
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
            }
        });
        }

}

package camp.bso.inf.scoringboard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button detailpersib;
    Button detailpersija;

    Button UpPersib, DownPersib;
    Button UpPersija, DownPersija;
    Button Reset;
    Button Berita;

    int SetValPersib = 0;
    int SetValPersija = 0;

    TextView skorpersib;
    TextView skorpersija;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        skorpersib = (TextView) findViewById(R.id.skorpersib);
        skorpersija = (TextView) findViewById(R.id.skorpersija);

        detailpersib = (Button) findViewById(R.id.detailpersib);
        detailpersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), detailpersib.class);
                startActivity(i);
            }
        });

        detailpersija = (Button) findViewById(R.id.detailpersija);
        detailpersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), detailpersija.class);
                startActivity(i);
            }
        });

        UpPersib = (Button) findViewById(R.id.UpPersib);
        UpPersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetValPersib = SetValPersib + 1;
                skorpersib.setText(String.valueOf(SetValPersib));
            }
        });

        DownPersib = (Button) findViewById(R.id.DownPersib);
        DownPersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetValPersib = SetValPersib - 1;
                skorpersib.setText(String.valueOf(SetValPersib));
                if(SetValPersib<0){
                    SetValPersib=0;
                    skorpersib.setText(String.valueOf(SetValPersib));
                }
            }
        });

        UpPersija = (Button) findViewById(R.id.UpPersija);
        UpPersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetValPersija = SetValPersija + 1;
                skorpersija.setText(String.valueOf(SetValPersija));
            }
        });

        DownPersija = (Button) findViewById(R.id.DownPersija);
        DownPersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetValPersija = SetValPersija - 1;
                skorpersija.setText(String.valueOf(SetValPersija));
                if(SetValPersija<0){
                    SetValPersija=0;
                    skorpersija.setText(String.valueOf(SetValPersija));
                }
            }
        });

        Reset = (Button) findViewById(R.id.Reset);
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetValPersib = 0;
                SetValPersija = 0;
                skorpersib.setText(String.valueOf(SetValPersib));
                skorpersija.setText(String.valueOf(SetValPersib));
            }
        });

        Berita = (Button) findViewById(R.id.Berita);
        Berita.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                String urllink = "http://www.goal.com/id/berita/persib-bandung-gagal-di-piala-presiden-2018-umuh-muchtar-ini/1g39r3bxwrhmh1ls1fsg85igv4";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
        }
    });

    }

}

package id.co.aminfaruq.ingatsunnah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Daftar3 extends AppCompatActivity {

    @BindView(R.id.btnDaftar3)
    Button btnDaftar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar3);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnDaftar3)
    public void onViewClicked() {
        Intent intent = new Intent(this,Daftar4.class);
        startActivity(intent);
    }
}

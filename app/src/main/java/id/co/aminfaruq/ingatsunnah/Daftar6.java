package id.co.aminfaruq.ingatsunnah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Daftar6 extends AppCompatActivity {

    @BindView(R.id.btnDaftar6)
    Button btnDaftar6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar6);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnDaftar6)
    public void onViewClicked() {
        Intent intent = new Intent(this,DaftarAkhir.class);
        startActivity(intent);
    }
}

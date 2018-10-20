package id.co.aminfaruq.ingatsunnah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Daftar5 extends AppCompatActivity {

    @BindView(R.id.btnDaftar5)
    Button btnDaftar5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar5);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnDaftar5)
    public void onViewClicked() {
        Intent intent = new Intent(this,Daftar6.class);
        startActivity(intent);
    }
}

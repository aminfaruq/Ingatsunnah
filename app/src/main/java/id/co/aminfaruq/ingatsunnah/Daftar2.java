package id.co.aminfaruq.ingatsunnah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Daftar2 extends AppCompatActivity {

    @BindView(R.id.btnDaftar2)
    Button btnDaftar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar2);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnDaftar2)
    public void onViewClicked() {
        Intent intent = new Intent(this,Daftar3.class);
        startActivity(intent);
    }
}

package id.co.aminfaruq.ingatsunnah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Daftar1 extends AppCompatActivity {

    @BindView(R.id.btnDaftar1)
    Button btnDaftar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar1);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnDaftar1)
    public void onViewClicked() {
        Intent intent = new Intent(this,Daftar2.class);
        startActivity(intent);
    }
}

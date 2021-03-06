package com.example.pay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class SelectTypeActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_type);
        findViewById(R.id.chargePhone).setOnClickListener(this);
        findViewById(R.id.payWater).setOnClickListener(this);
        findViewById(R.id.scanBar).setOnClickListener(this);
        findViewById(R.id.watchLimit).setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.chargePhone:
			Intent i1=new Intent(SelectTypeActivity.this,PhoneChargeActivity.class);
			startActivity(i1);
			break;
		case R.id.payWater:
			Intent i2=new Intent(SelectTypeActivity.this,WaterPayActivity.class);
			startActivity(i2);
			break;
		case R.id.scanBar:
			Intent i3=new Intent(SelectTypeActivity.this,ScanBarActivity.class);
			startActivity(i3);
			break;
		case R.id.watchLimit:
			Intent i4=new Intent(SelectTypeActivity.this,AccountInfoActivity.class);
			startActivity(i4);
			break;
		}
		
	}
}

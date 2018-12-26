package com.bwie.yinzhiyou.yinzhiyou20181226;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * Name
     */
    private EditText mEditText;
    private EditText mEditPwd;
    /**
     * Button
     */
    private Button mButtonLogin;
    /**
     * Button
     */
    private Button mButtonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

        mEditText = (EditText) findViewById(R.id.editText);
        mEditPwd = (EditText) findViewById(R.id.editPwd);
        mButtonLogin = (Button) findViewById(R.id.button_login);
        mButtonLogin.setOnClickListener(this);
        mButtonRegister = (Button) findViewById(R.id.button_register);
        mButtonRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.button_login:
                break;
            case R.id.button_register:
                break;
        }
    }
}

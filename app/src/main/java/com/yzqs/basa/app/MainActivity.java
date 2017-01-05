package com.yzqs.basa.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final int MORNING_TO_WORK = 0;
    private static final int MORNING_OFF_WORK = 1;
    private static final int AFTERNOON_TO_WORK = 2;
    private static final int AFTERNOON_OFF_WORK = 3;
    private static final int OVERTIME_TO_WORK = 4;
    private static final int OVERTIME_OFF_WORK = 4;


    @InjectView(R.id.action_a)
    FloatingActionButton actionA;
    @InjectView(R.id.action_b)
    FloatingActionButton actionB;
    @InjectView(R.id.action_c)
    FloatingActionButton actionC;
    @InjectView(R.id.action_d)
    FloatingActionButton actionD;
    @InjectView(R.id.action_e)
    FloatingActionButton actionE;
    @InjectView(R.id.action_f)
    FloatingActionButton actionF;
    @InjectView(R.id.multiple_actions)
    FloatingActionsMenu multipleActions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        initView();
    }

    private void initView() {
        actionA.setOnClickListener(this);
        actionB.setOnClickListener(this);
        actionC.setOnClickListener(this);
        actionD.setOnClickListener(this);
        actionE.setOnClickListener(this);
        actionF.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.action_a:
                break;
            case R.id.action_b:
                break;
            case R.id.action_c:
                break;
            case R.id.action_d:
                break;
            case R.id.action_e:
                break;
            case R.id.action_f:
                break;
        }
        multipleActions.toggle();
    }
}
package com.bignerdranch.android.beatbox;

import android.support.v7.app.AppCompatActivity;

public abstract class SingleFragmentActivity extends AppCompatActivity {

  protected abstract android.app.Fragment createFragment();

  //    @LayoutRes
  //    protected int getLayoutResId() {
  //        return R.layout.activity_masterdetail;
  //    }
  //
  //    @Override
  //    protected void onCreate(Bundle savedInstanceState) {
  //        super.onCreate(savedInstanceState);
  //        setContentView(getLayoutResId());
  //
  //        FragmentManager fm = getSupportFragmentManager();
  //        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
  //        if (fragment == null) {
  //            fragment = createFragment();
  //            fm.beginTransaction()
  //                    .add(R.id.fragment_container, fragment)
  //                    .commit();
  //        }
  //    }
}

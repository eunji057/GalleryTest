package kr.hs.emirim.eunji057.gallerytest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Gallery gallery;
    ImageView imgMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gallery=(Gallery)findViewById(R.id.gallery_1);
        imgMain=(ImageView)findViewById(R.id.imgv_main);
        MyGalleryAdapter adapter=new MyGalleryAdapter(this);
        gallery.setAdapter(adapter);
    }

    public class MyGalleryAdapter extends BaseAdapter{
        Context context;
        int[] posterIDs={R.drawable.amsal, R.drawable.august, R.drawable.boo, R.drawable.hae, R.drawable.her,
                        R.drawable.king, R.drawable.mebe, R.drawable.ms, R.drawable.notebook, R.drawable.now};

        public MyGalleryAdapter(Context context){
            this.context=context;
        }
        public int getCount(){
            return posterIDs.length;
        }
        public View getView(int position, View convertView, ViewGroup parent){
            ImageView imgV=new ImageView(context);
            imgV.setLayoutParams(new Gallery.LayoutParams(100, 150));
            imgV.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imgV.setPadding(5, 5, 5, 5);
            imgV.setImageResource(posterIDs[position]);
            return imgV;
        }
        public long getItemId(int position){
            return 0;
        }
        public Object getItem(int position){
            return null;
        }
    }
}

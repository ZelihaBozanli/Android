package com.example.myaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomerListView extends AppCompatActivity {

    private List<NewsModel> lstNews = new ArrayList<>();
    private ListView lvNews;
    private CustomAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list_view);

        lvNews=(ListView)findViewById(R.id.lv_news);
        //layouttaki listview ile eşledik.Artık Layouttaki listview gibidir.

        //lstNews arayüze gösterdiğimiz l

        lstNews.add(new NewsModel("Artık Boğaz'da denize girilebilecek","n büyük planlamalarının Fatih'te yaşayan gençlerin sportif alanlara ve faaliyetlere ulaşmasını sağlamak olduğunu vurgulayan Turan, \"Fatih'in bir tarafı kara surları bir tarafı da denizle çevrili ama gençlerin denize güvenli bir şekilde girmeleri için bir yer yok . Şu andaki en büyük düşüncemiz şu; denizde kontrollü olarak, altından deniz suyunun geçtiği büyük bir platform oluşturmak. Gençler bu platformun üzerinde güneşlenip, denize girebilecek\" diye konuştu."));
        lstNews.add(new NewsModel("Rakibini perişan etti! Maç sonunda Türkçe mesaj gönderdi","UFC Londra'da karşı karşıya gelen Jorge Masvidal ve Darren Till maçında, Masvidal rakibini acımasız bir şekilde Knockout etti. ABD'li dövüşçü müsabaka sonunda Türkçe konuşarak ailesini çok sevdiğini söyledi."));
        lstNews.add(new NewsModel("İstanbul'da define faciası!","Silivri Gümüşyaka Mahallesi'nde bir evin altında define aramak için tünel kazan 2 kişi göçük altında kaldı."));
        lstNews.add(new NewsModel("Marketin içinde gömüldüler","Rusya'nın St. Petersburg kentinde bir markette zemin çöktü. Çökme esnasında o alanda bulunan kasiyer ve müşteri oluşan çukura düşerek yaralandı."));
        lstNews.add(new NewsModel("Diriliş Ertuğrul'un Turgut Bey'i Cengiz Çoşkun'un büyük değişimi...","'Böyle mi Olacaktı' dizisinin kötü karakteri Şebnem Özinal'ın son halini görenler şoke oldu."));

        myAdapter=new CustomAdapter(this,lstNews);
        lvNews.setAdapter(myAdapter);
        lvNews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(CustomerListView.this,WebViewActivity.class);
                        startActivity(intent);
            }
        });
    }
}

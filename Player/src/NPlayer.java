import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.w3c.dom.Element;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class NPlayer {


    private JComboBox comboBox1;
    private JPanel Panel1;
    private JTextField textField1;
    private JButton button1;
    private Map<String, String> dictionary = new HashMap<String, String>();
    private Map<String, String> dictionaryPlayers = new HashMap<String, String>();
    public NPlayer() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = dictionary.get(comboBox1.getSelectedItem().toString());
                String playerName = dictionaryPlayers.get(comboBox1.getSelectedItem().toString());

                textField1.setText(s+""+playerName);
            }
        });
    }

    public static void main(String[] args) throws IOException {
        NPlayer nPlayer = new NPlayer();

        ParseSITE ps = new ParseSITE();
       /* String strText =
                Jsoup
                        .connect("http://www.useragentstring.com/")
                        .userAgent("Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Mobile Safari/537.36")
                        .get()
                        .text();

        System.out.println(strText);*/
        String url = "http://fan-naruto.ru/load/anime_onlajn/ongoingi/van_pis_smotret_russkie_subtitry_vse_serii/51-1-0-2489";
        Elements elements = ps.getUrl(url);
        Elements elements1 =ps.getSite("http://video.sibnet.ru/video2663676");
        for (int j = 0; j <elements1.size() ; j++) {


             String  s = elements1.get(j).toString();
             if (s.indexOf("src:")>1) {
                 String d = s.substring(s.indexOf("src:"));
                 String result = d.substring(d.indexOf("\""));
                 String[] objects = result.split(",");
                 String sz = objects[0].substring(1, objects[0].lastIndexOf("\""));
                 System.out.println(sz);
             }

        }
        String key = null;
        String value = null;
        String player = null;
        for (int i = 0; i <elements.size() ; i++) {

            key = elements.get(i).text();
            value = elements.get(i).attr("data-id");
            player= elements.get(i).attr("data-p");
            nPlayer.dictionary.put(key,value);
            nPlayer.dictionaryPlayers.put(key,player);
            nPlayer.comboBox1.addItem(key);
        }
        player = "";
        JFrame frame = new JFrame("NPlayer");
        frame.setContentPane(nPlayer.Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}

import org.jsoup.select.Elements;

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
        String url = "http://fan-naruto.ru/load/anime_onlajn/ongoingi/van_pis_smotret_russkie_subtitry_vse_serii/51-1-0-2489";
        Elements elements = ps.getUrl(url);

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

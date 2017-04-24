package pl.sda;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by jakubwrabel on 12.01.2017.
 */
public class TestWindow extends JFrame {
    public TestWindow() throws HeadlessException {
        //        return Joiner.on(" ").join(Arrays.stream(text.split("")).map(x -> biMap.get(x.toLowerCase())).collect(Collectors.toList()));

        setVisible(true);
        setLayout(null);
        setSize(500, 500);

        JList<String> jList = new JList<>();
        jList.setSize(200, 200);
        jList.setLocation(0, 0);
        add(jList);

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(() -> System.out.println("sds"));

//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 100, 300, TimeUnit.HOURS);
//        threadPoolExecutor.execute();

        String[] data = new String[]{"Mama", "tata"};
        jList.setListData(data);
        jList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (jList.getValueIsAdjusting()) {
                    System.out.println(jList.getSelectedValue());
                }
            }
        });
    }

    public static void main(String[] args) {
        new TestWindow();
    }
}

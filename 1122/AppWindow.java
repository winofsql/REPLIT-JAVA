package action;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class AppWindow extends BaseWindow {

    private JPanel jContentPane = null;
    private JButton jButton = null;

    // 社員コード
    private JLabel lblScode = null;
    private JTextField jScode = null;

    public int mainWidth = 600;
    public int mainHeight = 400;
    public String titleString = "Swing 簡易サンプル";

    // *****************************************************
    // ボタン作成とクリックイベント
    // *****************************************************
    private JButton getJButton() {
        if (jButton == null) {
            jButton = new JButton();
            // メインウインドウに対して、100x30 のボタンを追加
            jButton.setBounds(
                new Rectangle(
                    (mainWidth/2)-50, ((mainHeight-40)/2)-15,
                    100, 30
            )
            );
            jButton.setText("実行");
            jButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {

                    MsgOk("こんにちは");

                }
            });
        }
        return jButton;
    }

    // *****************************************************
    // コンストラクタ
    // *****************************************************
    public AppWindow() {
        super();
        initialize();
    }

    // *****************************************************
    // 初期処理
    // *****************************************************
    private void initialize() {
        // ウインドウサイズの決定
        this.setSize(mainWidth, mainHeight);

        // ウインドウ位置の変更
        centerWindow(-200);

        // パネルを適用
        this.setContentPane(getJContentPane());

        // タイトルセット
        this.setTitle(titleString);

        // カレントディレクトリの表示
        File cur = new File("");
        System.out.println(cur.getAbsolutePath());
    }

    // *****************************************************
    // 画面( パネル作成 )
    // *****************************************************
    private JPanel getJContentPane() {
        if (jContentPane == null) {
            jContentPane = new JPanel();
            jContentPane.setLayout(null);
            jContentPane.add(getJButton(), null);

            lblScode = new JLabel("社員コード");
            lblScode.setBounds(60, 30, 80, 19);
            jContentPane.add(lblScode);

            jScode = new JTextField();
            jScode.setBounds(150, 30, 60, 19);
            jContentPane.add(jScode);
        }
        return jContentPane;
    }

}

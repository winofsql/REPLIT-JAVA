package action;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class AppWindow extends BaseWindow {

    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    private JPanel jContentPane = null;
    private JButton jButton = null;

    // 社員コード
    private JLabel lblScode = null;
    private JTextField jScode = null;

    // 氏名
    private JLabel lblSname = null;
    private JTextField jSname = null;

    // フリガナ
    private JLabel lblFuri = null;
    private JTextField jFuri = null;

    // 性別
    private JLabel lblSeibetu = null;
    private JTextField jSeibetu = null;

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
            jButton.setBounds( 250, 30-7, 100, 30 );
            jButton.setText("実行");
            jButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {

                    try {
                        conn = DriverManager.getConnection(
                            "jdbc:mysql://localhost/lightbox?user=root&password=&characterEncoding=UTF-8"
                        );

                        // ステートメント
                        stmt = conn.createStatement();
                        // SQL 実行
                        String sCode = jScode.getText();
                        rs = stmt.executeQuery("select * from 社員マスタ where 社員コード = '" + sCode + "'");

                        // 一行取り出し
                        rs.next();

                        // 社員名
                        String sName = rs.getString("氏名");
                        jSname.setText(sName);

                        // 社員名
                        String sFuri = rs.getString("フリガナ");
                        jFuri.setText(sFuri);


                        // 整数
                        int seibetu = rs.getInt("性別");
                        if ( seibetu == 0 ) {
                            System.out.println("男性");
                        }
                        else {
                            System.out.println("女性");
                        }
                        jSeibetu.setText(seibetu+"");

                        // 文字列
                        String seibetu2 = String.format("%d", seibetu);
                        if ( seibetu2.equals("0") ) {
                            System.out.println("男性");
                        }
                        else {
                            System.out.println("女性");
                        }

                        // while( rs.next() ) {

                        //     System.out.println(rs.getString("社員コード"));
                        //     System.out.println(rs.getString("氏名"));
                        //     System.out.println(rs.getString("フリガナ"));
                        //     System.out.println(rs.getString("所属"));
                        //     System.out.println(rs.getString("性別"));
                        //     System.out.println(rs.getString("作成日"));
                        //     System.out.println(rs.getString("更新日"));
                        //     System.out.println(rs.getString("給与"));
                        //     System.out.println(rs.getString("手当"));
                        //     System.out.println(rs.getString("管理者"));
                        //     System.out.println(rs.getString("生年月日"));

                        // }

                        rs.close();
                        stmt.close();
                        conn.close();

                    }
                    catch (Exception ex) {
                        System.out.println( ex.getMessage() );
                        ex.printStackTrace();
                    }

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

            lblSname = new JLabel("氏名");
            lblSname.setBounds(60, 30+50, 80, 19);
            jContentPane.add(lblSname);

            jSname = new JTextField();
            jSname.setBounds(150, 30+50, 120, 19);
            jContentPane.add(jSname);

            lblFuri = new JLabel("フリガナ");
            lblFuri.setBounds(60, 30+50+30, 80, 19);
            jContentPane.add(lblFuri);

            jFuri = new JTextField();
            jFuri.setBounds(150, 30+50+30, 120, 19);
            jContentPane.add(jFuri);

            lblSeibetu = new JLabel("性別");
            lblSeibetu.setBounds(60, 30+50+30+30, 80, 19);
            jContentPane.add(lblSeibetu);

            jSeibetu = new JTextField();
            jSeibetu.setBounds(150, 30+50+30+30, 30, 19);
            jContentPane.add(jSeibetu);


        }
        return jContentPane;
    }

}

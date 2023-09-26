## 🟩 金曜 MEMO

- ### ✅ 9月15日

- ### Replit 上でクリップボードにある画像を CTRL + V すると画像ファイル化できる
  - WIN + V を活用しよう
    - [Windows キーを使ったショートカットで作業効率をアップ](https://www.microsoft.com/ja-jp/biz/smb/column-shortcuts-using-windows-key.aspx)

- ### JavaScript で HTML を出力する方法
  ```javascript
  document.write("<h1>こんにちは世界</h1>");
  ```

- ### Replit を使ってメモ作成
  - ### [マークダウンを使おう](https://gist.github.com/mignonstyle/083c9e1651d7734f84c99b8cf49d57fa)
    - ### ファイル名.md
    - ### テーブル
      | タイトル1 | タイトル2 |
      | --- | --- |
      | 明細 セル(1,1)  | 明細 セル(1,2)  |
      | 明細 セル(2,1)  | 明細 セル(2,2)  |
      | 明細 セル(3,1)  | 明細 セル(3,2)  |
      | 明細 セル(4,1)  | 明細 セル(4,2)  |

      ```
      - ### Replit を使ってメモ作成
        - ### [マークダウンを使おう](https://gist.github.com/mignonstyle/083c9e1651d7734f84c99b8cf49d57fa)
          - ### ファイル名.md
          - ### テーブル
            | タイトル1 | タイトル2 |
            | --- | --- |
            | 明細 セル(1,1)  | 明細 セル(1,2)  |
            | 明細 セル(2,1)  | 明細 セル(2,2)  |
            | 明細 セル(3,1)  | 明細 セル(3,2)  |
            | 明細 セル(4,1)  | 明細 セル(4,2)  |
      ```
      

<br>

- ### DesktoOK の利用
  ![Untitled](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/assets/1501327/d6cf6646-caa4-4b86-a474-5438981f7b02)
 
  ![Untitled](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/assets/1501327/11f77708-7847-4b49-a627-ba242c964f28)

- ### Eclipse で Swing
  ![Untitled](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/assets/1501327/c1041e02-5bd6-4615-91d3-f6b128db4c03)

  ![Untitled](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/assets/1501327/f0bf129d-0305-46c3-bdcc-4948df3ab282)

  ![Untitled](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/assets/1501327/6c4e8aeb-130d-4d15-8297-6231adf32118)

  ![Untitled](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/assets/1501327/a15ac74f-262d-4d1e-8121-7e0cfbad15d9)

  ![Untitled](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/assets/1501327/c2e9d9c5-0d99-467d-b4f2-6f432cc57704)

  ![Untitled](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/assets/1501327/6df2276a-05b1-4f99-a6de-194855ed1811)

  ![Untitled](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/assets/1501327/85f54103-bc50-44cd-af11-c9d181a8ffbe)

  - ### static 内での実行

    ```java
    import java.awt.EventQueue;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JPanel;
    import javax.swing.JTextField;
    import javax.swing.border.EmptyBorder;
    
    public class Main {
    
        private static void createAndShowGUI() {
    
            // ウインドウ
            JFrame jFrame = new JFrame("Hello World Swing Example");
            jFrame.setLayout(null);
            jFrame.setSize(500, 360);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
            // ラベル( 表示のみのテキスト)
            JLabel label = new JLabel("New label");
            label.setBounds(50, 52, 143, 13);
            // ラベルを追加
            jFrame.add(label);
    
      		  JTextField textField = new JTextField();
        		textField.setBounds(217, 49, 96, 19);
        		textField.setColumns(10);
        		jFrame.add(textField);
          
            // ボタン
            JButton jButton = new JButton("TEST");
            jButton.setBorderPainted(false);
        		jButton.setBounds(48, 85, 91, 21);
            // クリックイベント
            jButton.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
        
                System.out.println(textField.getText());
        
              }
            });
    
            // ボタンを追加
            jFrame.add(jButton);
    
    
            // ウインドウを表示
            jFrame.setVisible(true);
        }
        
      public static void main(String[] args) {
        createAndShowGUI();
      }
    }
    ```
  
- ### Windows 上で SQLite3 コマンドの実行
  - ### [sqlite3 for windows (command-line tools)](https://www.sqlite.org/download.html)

    ![Untitled](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/assets/1501327/905b3545-7301-4f82-a62e-fc875ee416ff)

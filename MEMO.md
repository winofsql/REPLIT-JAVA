## 🟩 金曜 MEMO

|  |  |  |  |  |  |  |  |  |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| [9月15日](MEMO.md#-9月15日) | [9月22日](MEMO.md#-9月22日) | [9月29日](MEMO.md#-9月29日) | [10月06日](MEMO.md#-10月06日) | [10月13日](MEMO.md#-10月13日) | [10月20日](MEMO.md#-10月20日) | [10月27日](MEMO.md#-10月27日) | [11月10日](MEMO.md#-11月10日) | [11月17日](MEMO.md#-11月17日) |

- ## ✅ 9月15日

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

## ✅ 9月22日

- ### ZOOM のメモの共有機能のテスト
- ### Eclipse でバッチ Java のプロジェクト
  - #### JDBC ドライバを登録して MySQL と SQLite3 でテスト

- ### VScode + XAMPP で Tomcat サンプル実行

- ### lightbox デスクトップアイコンの簡単な説明
  ![Untitled](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/assets/1501327/36e25469-549e-48a4-9775-100ac5de6897)

- ### Advanced IP Scanner
  ![Untitled](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/assets/1501327/0b88159e-1061-4d77-a5fb-162ced3f517b)

  - #### Windows のファイル共有
    ![Untitled](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/assets/1501327/d89117ed-2258-44b3-8ef5-b9a597f3bdb0)

 
## ✅ 9月29日

- ### Google Chrome の 白のウインドウを使って、主なログインを終了時にログアウトする
  - [chrome-policy-logout.reg](https://github.com/winofsql/policies-chrome/blob/main/chrome-policy-logout.reg)
  - 白い Chrome では CTRL + T で閉じたタブをもう一度開く事ができる
  - 閲覧履歴も見れる
  ```
  "1"="[*.]google.com"
  "2"="github.com"
  "3"="replit.com"
  "4"="[*.]lolipop.jp"
  "5"="paiza.jp"
  "6"="[*.]zoom.us"
  "7"="twitter.com"
  ```

- ### Replit で Bash テンプレートで Linux の簡単なコマンドを実行
  - vi をインストールしてみる
    - 終了は : を押して、q を入力して Enter

- ### Replit のPHP Server に GitHub のサンプルをダウンロードして実行する
  - PHP Web Server テンプレートを使用
  - 以下テキストファイルに書き込む掲示板のインストールコマンド
  ```
  export PS1="$ "
  git clone https://github.com/winofsql/php-board-v02-textfile.git
  cd php-board-v02-textfile
  rm -rf .git
  cd ..
  ```
  - 以下データベースに書き込む掲示板のインストールコマンド
  ```
  export PS1="$ "
  git clone https://github.com/winofsql/php-board-v06-database.git
  cd php-board-v02-textfile
  rm -rf .git
  cd ..
  ```

- ### Excel の勉強
  - ### スタート画面なしの設定( いきなりワークシート画面 )
  - ### デフォルトで PC に保存する( F12 のほうが速い )
  - ### CTRL + E で、部分取り出しオートフィル
    - ### SQLの窓で MDB から 社員マスタのデータを使って Excel をエクスポート
    - ### 列の整列
      1. 列の選択
      2. 選択内の境界をどこでもいいからダブルクリック
      3. 分解したい列の右横に列を作成
      4. 先頭行のみ分解した値をセット
      5. その行のタイトル部分で CTRL + E

- ### SQLの窓の勉強
  - ### MDB -> Excel へのエクスポート
    - 複数テーブルを指定すると、テーブル毎にシートが作成されます


## ✅ 10月06日

- ### Windows リテラシー
  - ### [コンピュ－タの管理](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/tree/main/windows/control)
  - ### グループポリシーエディタ
  - ### [ターミナル](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/tree/main/windows/terminal)
    - コマンドプロンプト
      - 環境変数
      - 現在いるディレクトリ をエクスプローラで開く
 - ### [ショートカットキー](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/tree/main/short-cut-key)
   -  Windows
   -  Excel

## ✅ 10月13日

- ### SQLの窓の利用
  - SQLの窓の表示をSQL化する
  - CSV 出力
  - 他 RDBMS へのエクスポート
  - ODBC 経由で SQlite にリンクされた MDB を開いて SQlite のテーブルを処理する

- ### Access と Excel をデータベース、またはデータベースツールとして利用する
  - ### Access
    - ODBC 経由で他のデータベースのテーブルをリンクして使用する
  - ### Excel
    - SQL の窓から MySQLまたはAccess のテーブルを Excel としてエクスポートして利用
    - SQL の窓から MySQLまたはAccess のテーブルを CSV としてエクスポートして利用
    - CSV を Excel を開いた時の注意
      - ユーザ形式でフォーマットし、クリップボードにコピーして手作業でデータを加工する

## ✅ 10月20日

- ### Access と Excel をデータベース、またはデータベースツールとして利用する
  - ### Access
    - UI でテーブルを結合して SQLを取得する
  - ### Excel
    - CSV の設定インポート
    - CSV の正規表現加工
- ### Windows アプリケーション
  - アプリケーションショートカットフォルダ
  - HOSTSファイル
  - syswow64 フォルダ( 32ビット用アプリケーシラン )
  - タスクマネージャからの管理者権限実行


## ✅ 10月27日
  - ### 🟧 タスクマネージャ
        ( 1:タスクバーを右クリック / 2:CTRL+SHIFT+ESC / 3:CTRL+ALT+DEL の画面のタスクマネージャ )
    - 新しいタスクを実行する
    - 設定で、常に玉枝に表示するで、Window を小さくして個人情報等を隠す( 動画作成時等 )
    - スタートアップアプリ
      - フォルダ　
        - shell:startup / ユーザのログイン時に実行するショートカット等を保存するフォルダ
        - shell:Common Startup / 共通
          - [参照](https://www.den-tsu.net/windowsshell/)
      - レジストリエントリ
         - HKLM\Software\Microsoft\Windows\CurrentVersion\Run
         - HKCU\Software\Microsoft\Windows\CurrentVersion\Run
  - ### 🟧 コントロールパネル
  - ### 🟧 レジストリエディタ
    - レジストリエントリ
      | 名称 | 実行
      | :--- | :--- 
      | システム自動起動 | HKLM\Software\Microsoft\Windows\CurrentVersion\Run
      | ユーザ自動起動 | HKCU\Software\Microsoft\Windows\CurrentVersion\Run
      | ODBCドライバ(64) | HKLM\SOFTWARE\ODBC\ODBCINST.INI
      | ODBCドライバ(32) | HKLM\SOFTWARE\WOW6432Node\ODBC\ODBCINST.INI
  - ### 🟧 プログラムと機能
  - ### 🟧 Excel の自動化
    - JavaScript( TypeScript )
      - Microsoft 的にあきらかに未完成
        - VBA と同様に記録でコードが作成されるが、バグあり
          - 実行の場所が決まっておらず、とりあえずボタンをシートに張り付けて終わり
    - VBA ( マクロ ) / 開発メニューを設定で表示させる
      - ### マクロの使い方
        1. 開発メニューからマクロの記録
        2. 記録終了
        3. マクロアイコンで存在確認
        4. 保存
      - ### 実行方法
        - 自分のメニュー
          1. メニユーに追加
          2. 実行( セキュリティエラー )
          3. 一旦、メニーから削除して再度保存( Microsoft のバグ??? )
  - ### 🟧 Google スプレッドシート( GAS : JavaScript )
    1. Google アカウントでログイン
    2. スプレッドシートアイコンを選ぶ
        - テンプレートギャラリーから欲しいサンプルをクリック
        - 指示に従って実行( メニューから )
        - 一回目は、認証
        - ２回目以降が通常の運用
    3. 実行部分の UI の確認
        - 拡張機能 => Apps Script 
  - [SQL問題](https://winofsql.jp/src/database/winofsql/?src=sql-test-a)


## ✅ 11月10日
  - ### 🟧 金曜用試験問題の一つを解説
    - [2022-03.pdf](https://github.com/winofsql/examination-data/blob/main/2022-03.pdf)
      - Windowsキーのショートカット
      - タスクマネージャ
  - ### 🟧 [vscode.dev](https://vscode.dev/) でブックマークレット用コードを編集
    - ブックマークレットとして登録(ブックマーク)して動作確認
    - 拡張をインストールして、SHIFT + ALT + F で JavaScript の自動フォーマット
    
  - ### 🟧 Chrome の機能
    - #### Chrome でページ内の要素を削除
      - インスペクタ => 要素 => 削除
      - コンソール
        - javascript で削除
          - document.getElementById("id文字列").remove();
    - #### デベロッパーツール起動
      - F12 または、右クリックから検証
    - #### ブックマーク作成方法
    - #### JavaScript の無効
      - 設定のデバッグ
        - 設定は F1 で開く
    - #### コンソールのコマンドで SHIFT + Enter で改行のあるコード作成
    - #### 印刷
      - CTRL + P
      - 詳細設定でヘッダーとフッターのチェックを外す
      - 送信先を PDF に保存

## ✅ 11月17日
  - ### WEB ページを JavaScript で参照
    - console.log と console.dir
      - 前者は toString、後者は オブジェクトとして プロパティとメソッドの一覧
    - [var elements = document.getElementsByTagName(name)](https://developer.mozilla.org/ja/docs/Web/API/Document/getElementsByTagName)
    - [var elements = document.getElementsByName(name)](https://developer.mozilla.org/ja/docs/Web/API/Document/getElementsByName)
    - [var element = document.getElementById(id)](https://developer.mozilla.org/ja/docs/Web/API/Document/getElementById)
      - [Document.getElementsByClassName()](https://developer.mozilla.org/ja/docs/Web/API/Document/getElementsByClassName)

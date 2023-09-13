- ## Shell > sqlite3 データベースファイル名

  - ### データベースファイル名 を lightbox.sqlite3 とすると、
    - #### 実行後、lightbox.sqlite3 を読み込む
      ```
      sqlite3 lightbox.sqlite3
      ```
      - #### 🔴 sqlite3 のインストール 
      ![image](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/assets/1501327/f4dbd672-09fe-496f-9490-3f71b6f0a283)

    - #### 🔴 sqlite3 の終了は .q
   
    <br><br>

  - ### sqlite3 で実行した場合は、データベースは読み込まれて無い
    - #### 🔴 .restore lightbox.sqlite3 で読み込む事ができます。

  - ### 途中実行した　SQL文での更新はメモリ上なので、lightbox.sqlite3 に上書きしたい場合
    - #### 🔴 .save lightbox.sqlite3

  - ### shell での sqlite3 の引数の hrlp は sqlite3 --help
  - ### sqlite3 内のコマンドの help　は .help
  - ### 各コマンドの詳細 help は .help ドット無しのコマンド名( 例: .help restore )
    ```
    sqlite> .help restore
    .restore ?DB? FILE       Restore content of DB (default "main") from FILE
    ``` 
  - ### 画面のクリアは .shell clear
    - #### .shell は、shell のコマンドの実行
    - #### 🔴 Shell プロンプトでは CTRL + L でクリア

- ## Shell > sqlite3 データベースファイル名

  - ### データベースファイル名 を lightbox.sqlite3 とすると、
    - #### 実行後、lightbox.sqlite3 を読み込む
      ```
      sqlite3 lightbox.sqlite3
      ```
      - #### 🔴 sqlite3 のインストール 
      ![image](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/assets/1501327/f4dbd672-09fe-496f-9490-3f71b6f0a283)

    - #### 🔴 sqlite3 の終了は .q

    - #### wget のインストール
      ![image](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/assets/1501327/3ef0fc59-5841-4fed-8aa3-03e2b33f6e92)
    - #### 必要ファイルを WEB から取得
      ![image](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/assets/1501327/bb96f14a-1b05-49d1-a878-8db22865bbc5)

 
    <br><br>

  - ### sqlite3 で実行した場合は、データベースは読み込まれて無い
    - #### 🔴 .restore lightbox.sqlite3 で読み込む事ができます。

  - ### 途中実行した　SQL文での更新はメモリ上なので、lightbox.sqlite3 に上書きしたい場合
    - #### 🔴 .save lightbox.sqlite3

  - ### shell での sqlite3 の引数の help は sqlite3 --help
  - ### sqlite3 内のコマンドの help　は .help
  - ### 各コマンドの詳細 help は .help ドット無しのコマンド名( 例: .help restore )
    ```
    sqlite> .help restore
    .restore ?DB? FILE       Restore content of DB (default "main") from FILE
    ``` 
  - ### 画面のクリアは .shell clear
    - #### .shell は、shell のコマンドの実行
    - #### 🔴 Shell プロンプトでは CTRL + L でクリア
   
  - ### テーブル一覧は .tables
  - ### CREATE 文表示は .sch( .schema ) : 他と重ならない場合コマンド文字列の省略可
  - ### .read ファイル名 で、ファイル内のコマンド( SQL は実行行毎に最後にセミコロン )
  - ### .import で csv 等からテーブルにデータを投入
  - ### ▲ 用の SQL は .mode コマンドで出力
  ```
      .mode MODE ?OPTIONS?     Set output mode
       MODE is one of:
         ascii       Columns/rows delimited by 0x1F and 0x1E
         box         Tables using unicode box-drawing characters
         csv         Comma-separated values
         column      Output in columns.  (See .width)
         html        HTML <table> code
         insert      SQL insert statements for TABLE
         json        Results in a JSON array
         line        One value per line
         list        Values delimited by "|"
         markdown    Markdown table format
         qbox        Shorthand for "box --width 60 --quote"
         quote       Escape answers as for SQL
         table       ASCII-art table
         tabs        Tab-separated values
         tcl         TCL list elements
       OPTIONS: (for columnar modes or insert mode):
         --wrap N       Wrap output lines to no longer than N characters
         --wordwrap B   Wrap or not at word boundaries per B (on/off)
         --ww           Shorthand for "--wordwrap 1"
         --quote        Quote output text as SQL literals
         --noquote      Do not quote output text
         TABLE          The name of SQL table used for "insert" mode
    🔴 box
    ┌───────┬───────┐
    │ 社員コード │  氏名   │
    ├───────┼───────┤
    │ 0001  │ 浦岡 友也 │
    │ 0002  │ 山村 洋代 │
    │ 0003  │ 多岡 冬行 │
    │ 0004  │ 高田 冬美 │
    │ 0005  │ 内高 友之 │
    └───────┴───────┘
    🔴 csv
    0001,"浦岡 友也"
    0002,"山村 洋代"
    0003,"多岡 冬行"
    0004,"高田 冬美"
    0005,"内高 友之"
    🔴 html
    <TR><TD>0001</TD>
    <TD>浦岡 友也</TD>
    </TR>
    <TR><TD>0002</TD>
    <TD>山村 洋代</TD>
    </TR>
    <TR><TD>0003</TD>
    <TD>多岡 冬行</TD>
    </TR>
    <TR><TD>0004</TD>
    <TD>高田 冬美</TD>
    </TR>
    <TR><TD>0005</TD>
    <TD>内高 友之</TD>
    </TR>
    🔴 insert
    INSERT INTO "社員マスタ" VALUES('0001','浦岡 友也');
    INSERT INTO "社員マスタ" VALUES('0002','山村 洋代');
    INSERT INTO "社員マスタ" VALUES('0003','多岡 冬行');
    INSERT INTO "社員マスタ" VALUES('0004','高田 冬美');
    INSERT INTO "社員マスタ" VALUES('0005','内高 友之');
    🔴 json
    [{"社員コード":"0001","氏名":"浦岡 友也"},
    {"社員コード":"0002","氏名":"山村 洋代"},
    {"社員コード":"0003","氏名":"多岡 冬行"},
    {"社員コード":"0004","氏名":"高田 冬美"},
    {"社員コード":"0005","氏名":"内高 友之"}]
    🔴 line
    社員コード = 0001
             氏名 = 浦岡 友也
    
    社員コード = 0002
             氏名 = 山村 洋代
    
    社員コード = 0003
             氏名 = 多岡 冬行
    
    社員コード = 0004
             氏名 = 高田 冬美
    
    社員コード = 0005
             氏名 = 内高 友之
    🔴 markdown
    | 社員コード |  氏名   |
    |-------|-------|
    | 0001  | 浦岡 友也 |
    | 0002  | 山村 洋代 |
    | 0003  | 多岡 冬行 |
    | 0004  | 高田 冬美 |
    | 0005  | 内高 友之 |
    🔴 quote
    ┌────────┬─────────┐
    │ 社員コード  │   氏名    │
    ├────────┼─────────┤
    │ '0001' │ '浦岡 友也' │
    │ '0002' │ '山村 洋代' │
    │ '0003' │ '多岡 冬行' │
    │ '0004' │ '高田 冬美' │
    │ '0005' │ '内高 友之' │
    └────────┴─────────┘
    🔴 quote
    '0001','浦岡 友也'
    '0002','山村 洋代'
    '0003','多岡 冬行'
    '0004','高田 冬美'
    '0005','内高 友之'
    🔴 table
    +-------+-------+
    | 社員コード |  氏名   |
    +-------+-------+
    | 0001  | 浦岡 友也 |
    | 0002  | 山村 洋代 |
    | 0003  | 多岡 冬行 |
    | 0004  | 高田 冬美 |
    | 0005  | 内高 友之 |
    +-------+-------+
    🔴 tabs
    0001	浦岡 友也
    0002	山村 洋代
    0003	多岡 冬行
    0004	高田 冬美
    0005	内高 友之
    🔴 tcl
    "0001" "\346\265\246\345\262\241 \345\217\213\344\271\237"
    "0002" "\345\261\261\346\235\221 \346\264\213\344\273\243"
    "0003" "\345\244\232\345\262\241 \345\206\254\350\241\214"
    "0004" "\351\253\230\347\224\260 \345\206\254\347\276\216"
    "0005" "\345\206\205\351\253\230 \345\217\213\344\271\213"
    🔴 column
    社員コード  氏名   
    -----  -----
    0001   浦岡 友也
    0002   山村 洋代
    0003   多岡 冬行
    0004   高田 冬美
    0005   内高 友之
    
  ```

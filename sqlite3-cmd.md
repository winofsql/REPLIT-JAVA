- ## Shell > sqlite3 データベースファイル名

  - ### データベースファイル名 を lightbox.sqlite3 とすると、
    - #### 実行後、lightbox.sqlite3 を読み込む

  - ### sqlite3 で実行した場合は、データベースは読み込まれて無い
    -#### .restore lightbox.sqlite3 で読み込む事ができます。

  - ### 途中実行した　SQL文での更新はメモリ上なので、lightbox.sqlite3 に上書きしたい場合
    - #### .save lightbox.sqlite3

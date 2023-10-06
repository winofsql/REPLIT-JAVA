## コマンドプロンプト

- ### 環境変数の表示
  - SET
    - ### 特定の環境変数の表示
      - echo %PATH%
      - 但し、PATH 環境変数に関しては、path コマンドがあります
      - Windows UI にて環境変数のメンテナンスは以下
        ```
        powershell -NoProfile -ExecutionPolicy unrestricted -WindowStyle hidden -Command "start rundll32.exe sysdm.cpl,EditEnvironmentVariables -verb runas"
        ```
        ![image](https://github.com/winofsql/REPLIT-Java-PHP-js-Python/assets/1501327/2d3028cc-c780-435d-bc9a-4d69842eacd7)

  - ### 現在いるディレクトリ をエクスプローラで開く
    - START .

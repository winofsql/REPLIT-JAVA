## アプリケーション
| 名称 | 実行
| :--- | :--- 
| メモ帳 | notepad
| 電卓 | calc
| スクリーンキーボード | osk
| ペイント | mspaint
| タスクマネージャ | taskmgr ( CTRL + SHIFT + ESC )
| コントロールパネル | control
| 拡大鏡 | magnify : WIN + プラス,WIN + マイナス,WIN + ESC
| ODBCデータソースアドミニストレータ(64) | odbcad32 ( 32ビット用は syswow64 フォルダ内 )
| レジストリエディタ | regedit
| リモートデスクトップ接続 | mstsc
| リモートデスクトップの設定( 受信側 ) | SystemPropertiesRemote
| ユーザとグループ | netplwiz
| 共有フォルダ | fsmgmt.msc
| プログラムと機能 | control appwiz.cpl
| ファイアウォール詳細 | mmc wf.msc
| ネットワーク接続一覧 | RunDLL32 shell32.dll,Control_RunDLL ncpa.cpl 


## HOSTSファイル
```
notepad.exe %SystemRoot%\system32\drivers\etc\hosts
```
## レジストリエントリ

| 名称 | 実行
| :--- | :--- 
| PC名 | HKLM\System\CurrentControlSet\Control\ComputerName\ComputerName
| システム自動起動 | HKLM\Software\Microsoft\Windows\CurrentVersion\Run
| ユーザ自動起動 | HKCU\Software\Microsoft\Windows\CurrentVersion\Run
| ODBCドライバ(64) | HKLM\SOFTWARE\ODBC\ODBCINST.INI
| ODBCドライバ(32) | HKLM\SOFTWARE\WOW6432Node\ODBC\ODBCINST.INI

## アプリケーションショートカットフォルダ
shell:Common StartUp
( この一つ上 )

control => Windows ツール

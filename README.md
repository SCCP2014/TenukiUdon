# 歌のデータを管理するアプリケーション（名称未定）


### 1.アプリケーションのコンセプト

　カラオケで歌える曲のレパートリーを容易に管理できるようにするアプリ。データの追加は手動入力、できればAPIを使って半自動化したい。また、JOYSOUNDやDAMの公式アプリケーションと同様に、「Now Singing」のような形で歌っている曲をTwitterに投稿できるようにする（したい）。

　需要があるかどうかは分からない。

### 2.アプリケーションの仕様

　曲名、アーティスト、音域データ(不可能？)、JOY,~~DAMの曲番号データ~~（いらない）、歌いやすさ（個人の感覚で）、~~BPM~~（いらない）をデータベースにリストとして登録する。歌詞データ、ジャンルデータなどはできればAPIを使って自動的に検索し登録されるようにしたい。

　同時に、アーティスト名~~や音域、歌詞やジャンル~~（曲名は言わずもがな）から検索する機能を実装したい。Now Singingを投稿する機能はTwitter APIを利用する予定。

　現在決定している仕様は上記の通りです。随時追加するかもしれません。

### 3.目標

　データリスト（曲名、アーティスト、音域データ）の管理、曲の検索とNow Singing投稿機能を実装するのが最低目標。可能であれば他の機能も実装する。

### 4.レイアウト(予定)

メイン画面にデータの一覧をリスト表示

1.メニューボタン->検索してデータ追加or手動でデータ追加

2.各データの詳細ボタンを押すと「曲名・アーティスト名」のほかのデータも表示され、「Twitterに投稿する」ボタンを表示
(Twitter認証は最初の一回ボタンが押された時だけ行う)

3.Twitter投稿のボタンと一緒にデータ編集、削除ボタンも表示
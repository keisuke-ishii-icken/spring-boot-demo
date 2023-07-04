# About This Project

Spring BootをベースとしたHTTP(App) Serverのサンプル

## Programs

### 中核

* DemoApplication.java: メインのクラス。これを実行することで組み込みTomcatベースのApp Serverが起動する
* Controller, Service...: API, 業務ロジッククラス

### オプション

* AopComponent.java: AOP処理を担うクラス
* DemoConfig.java: Configのルート。DI設定を記述することでConfigをプログラマティックに記述できる
* DemoFilter1.java, DemoFilter2.java: Filter処理。DemoConfigからコールされる。アクセスの度に共通処理を行う。


## DI container

Springは強力なDI containerを有しており、リソースの管理やアノテーションを使用したコードの簡略化が可能

## 起動方法

### 開発用

DemoApplication.javaを実行する(dev-toolsの設定をしておくと、hot reloadして開発イテレーションが増加する)

localhost:18080/testにアクセスできればOK

### build(リリース時などで使用)

```
./gradlew build
java -jar build/libs/demo1-0.0.1-SNAPSHOT.jar
```

localhost:18080/testにアクセスできればOK

## Tips

* Swagger/Open APIを使用することでCode Orientedな開発を実現する
* ORMの使用は注意(n+1問題。結合したりORMのルールに振り回されないように)
* AOP/Filter機能を有効活用する
  * AOPは横断的共通処理に使用(ログ出力などに使用。適用設定を誤ると煩雑になるので注意)
  * Filterは前後の共通処理に使用(利用シーン：共通的なバリデーションや認証フィルターなど)
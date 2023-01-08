 DROP TABLE IF EXISTS coffees;

 CREATE TABLE coffees (
    id int unsigned AUTO_INCREMENT,
    productName VARCHAR(20) NOT NULL,
    countryOfOrigin VARCHAR(20) NOT NULL,
    degreeOfRoasting VARCHAR(20) NOT NULL,
    aroma int,
    acidity int,
    bitterTaste int,
    sweetTaste int,
    rich int,
    100gPrice decimal(7, 2),
    200gPrice decimal(7, 2),
    PRIMARY KEY (id)
  );

 INSERT INTO coffees (productName, countryOfOrigin, degreeOfRoasting, aroma, acidity, bitterTaste, sweetTaste, rich, 100gPrice, 200gPrice) VALUES
 ("ブルーマウンテン", "ジャマイカ", "浅煎り", 3, 2, 1, 2, 3, 2850, 5650),
 ("ハワイ　エクストラファンシー", "アメリカ", "やや浅煎り", 2, 1, 2, 2, 3, 1700, 3350),
 ("モカ　マタリ", "イエメン", "やや浅煎り", 3, 1, 1, 2, 3, 950, 1850),
 ("クリスタルマウンテン", "キューバ", "浅煎り", 3, 2, 1, 2, 2, 1000, 1950),
 ("ペルー・チャンチャマイヨ", "ペルー", "浅煎り", 2, 1, 2, 2, 3, 700, 1350),
 ("ストラウエシ・トラジャ", "インドネシア", "深煎り", 2, 0, 3, 2, 3, 800, 1550),
 ("グァテマラ SHB", "グァテマラ", "深煎り", 2, 1, 3, 2, 3, 700, 1350),
 ("ブラジル・サントス NO.2", "ブラジル", "強・深煎り", 2, 0, 2, 2, 3, 700, 1350),
 ("キリマンジャロAA", "タンザニア", "やや深煎り", 2, 2, 1, 1, 2, 700, 1350),
 ("マンデリン　グレードⅠ", "インドネシア", "やや深煎り", 2, 0, 2, 2, 3, 700, 1350),
 ("コロンビア・スプレモ", "コロンビア", "強・深煎り", 2, 0, 2, 3, 3, 700, 1350),
 ("マラウィゲイシャ AA", "マラウィ", "やや深煎り", 3, 1, 2, 2, 3, 850, 1650),
 ("ケニア AA", "ケニア", "やや深煎り", 2, 2, 1, 2, 2, 700, 1350),
 ("デカフェ（カフェインレス）", "コロンビア", "やや深煎り", 2, 0, 2, 2, 2, 700, 1350),
 ("ガラパゴス　ブルボン", "エクアドル", "やや深煎り", 2, 1, 2, 2, 2, 950, 1850),
 ("ヒマラヤン　アラビカ", "ネパール", "やや深煎り", 2, 1, 2, 2, 2, 950, 1850);

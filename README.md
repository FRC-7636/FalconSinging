這是由[Allen95Wei](https://github.com/Alllen95Wei)某天遊手好閒，因而誕生的Falcon唱歌程式。
## 設置
* 馬達：請在[Robot.java的第24~27行](https://github.com/FRC-7636/FalconSinging/blob/master/src/main/java/frc/robot/Robot.java#L24-L27)輸入`CAN ID`及`CANivore名稱 (如有)`：
```Java
  private final TalonFX singer1 = new TalonFX(1, "cantivore");  // <你的CAN ID>, <你的CANivore名稱，若無則忽略>
  private final TalonFX singer2 = new TalonFX(3, "cantivore");
  private final TalonFX singer3 = new TalonFX(5, "cantivore");
  private final TalonFX singer4 = new TalonFX(7, "cantivore");
```
## 音樂
可在[Robot.java的第33行](https://github.com/FRC-7636/FalconSinging/blob/master/src/main/java/frc/robot/Robot.java#L33)
```Java
    orchestra.loadMusic("Yoru-Ni-Kakeru.chrp");
```
填入CHRP檔名。
### 內建
你可以填入我們已經處理好的CHRP檔案：
* Driftveil-City.chrp
* Yoru-Ni-Kakeru.chrp
* rickroll.chrp
### 自製CHRP檔
1. 準備好MIDI音檔
 * **注意：同一音軌同時間僅能有一個音**
2. 使用[Phoenix Tuner X的「CHRP Converter」](https://pro.docs.ctr-electronics.com/en/latest/docs/tuner/tools/chrp-converter.html)，將MIDI轉為CHRP
3. 將CHRP檔放置於`src/main/deploy`資料夾中
4. 在[Robot.java的第33行](https://github.com/FRC-7636/FalconSinging/blob/master/src/main/java/frc/robot/Robot.java#L33)直接填入檔名

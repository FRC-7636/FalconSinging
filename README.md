這是由[Allen95Wei](https://github.com/Alllen95Wei)某天遊手好閒，因而誕生的Falcon唱歌程式。\
請依自己的機器人配置，編輯[Robot.java的第24~27行](https://github.com/FRC-7636/FalconSinging/blob/master/src/main/java/frc/robot/Robot.java#L24-L27)：
```Java
  private final TalonFX singer1 = new TalonFX(1, "cantivore");  // <你的CAN ID>, <你的CANivore名稱，若無則忽略>
  private final TalonFX singer2 = new TalonFX(3, "cantivore");
  private final TalonFX singer3 = new TalonFX(5, "cantivore");
  private final TalonFX singer4 = new TalonFX(7, "cantivore");
```
可在[第33行](https://github.com/FRC-7636/FalconSinging/blob/master/src/main/java/frc/robot/Robot.java#L33)
```Java
    orchestra.loadMusic("Yoru-Ni-Kakeru.chrp");
```
填入我們已經處理好的CHRP檔案：
* Driftveil-City.chrp
* Yoru-Ni-Kakeru.chrp
* rickroll.chrp

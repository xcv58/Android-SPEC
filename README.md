# Usage

## build
In terminal:
```bash
git clone https://github.com/xcv58/Android-SPEC.git
cd Android-SPEC
./gradlew assembleDebug
ls app/build/outputs/apk/app-debug.apk
```

## install
connect your Android device with your Laptop/Desktop, then:
```bash
adb install app/build/outputs/apk/app-debug.apk
```

If you already installed this app, use:
```bash
adb install -r app/build/outputs/apk/app-debug.apk
```

The ```-r``` will override existing one.
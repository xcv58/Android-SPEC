#!/bin/bash
# Waiting for device.
# Target device: lge-aosp_on_hammerhead-02c98b1dd023f5d8
# Uploading file
# local path: /Users/xcv58/Dropbox/Buffalo/605/project-605/Android/SPEC/app/build/outputs/apk/app-debug.apk
# remote path: /data/local/tmp/com.xcv58.spec
# Installing com.xcv58.spec
# DEVICE SHELL COMMAND: pm install -r "/data/local/tmp/com.xcv58.spec"
# pkg: /data/local/tmp/com.xcv58.spec
# Success


# Launching application: com.xcv58.spec/com.xcv58.spec.MainActivity.
# DEVICE SHELL COMMAND:
adb shell am start -n "com.xcv58.spec/com.xcv58.spec.MainActivity" -a android.intent.action.MAIN -c android.intent.category.LAUNCHER -e hello_key hello_value
# Starting: Intent { act=android.intent.action.MAIN cat=[android.intent.category.LAUNCHER] cmp=com.xcv58.spec/.MainActivity }

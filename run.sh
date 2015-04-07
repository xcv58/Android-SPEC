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


# Launching application: com.xcv58.spec/com.xcv58.spec.android.activities.MainActivity.
# DEVICE SHELL COMMAND:

# adb shell am start -n "com.xcv58.spec/com.xcv58.spec.android.activities.MainActivity" -a android.intent.action.MAIN -c android.intent.category.LAUNCHER -e hello_key hello_value

# adb shell am broadcast -a com.whereismywifeserver.intent.TEST --es sms_body "test from adb" -n com.whereismywifeserver/.IntentReceiver
adb shell am startservice -a "com.xcv58.spec.intentservice" -e intent_key intent_value

# Starting: Intent { act=android.intent.action.MAIN cat=[android.intent.category.LAUNCHER] cmp=com.xcv58.spec/.MainActivity }

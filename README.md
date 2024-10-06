# infotainment_broadcast
Communication between Android system events and infotainment applications.

adb command to generate a broadcast of internet events through terminal:
use adb with root permissions: adb root
airplane mode changed: adb shell am broadcast -a android.intent.action.AIRPLANE_MODE


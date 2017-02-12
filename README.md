# MyMurloc android application
This android application displays a picture of a murloc, different one for land/port. The picture hides 2*3 grid of buttons,  when clicking each of the buttons the phone produces murloc sounds. Each button - side of the picture - is responsible for different sound kinds, some of them pick a random sound from list of specific sounds. For example murloc has 3 different attack sounds, when user taps in the top right corner of the screen, a random of these 3 sounds is picked and played.

### Requirements
* Java 8
* Android Studio 2.2.2+
* Phone

### Compatibility
* minSdkVersion: 15
* targetSdkVersion: 25

### Running the project
* gradle build
* run on emulator/device as android studio project

### File structure
<pre>
├── app
│   ├── libs
│   └── src
│       ├── androidTest
│       │   └── java
│       │       └── com
│       │           └── vdm
│       │               └── mymurloc
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── vdm
│       │   │           └── mymurloc
│       │   └── res
│       │       ├── drawable-land-hdpi
│       │       ├── drawable-port-hdpi
│       │       ├── layout
│       │       ├── menu
│       │       ├── mipmap-hdpi
│       │       ├── mipmap-mdpi
│       │       ├── mipmap-xhdpi
│       │       ├── mipmap-xxhdpi
│       │       ├── mipmap-xxxhdpi
│       │       ├── raw
│       │       ├── values
│       │       ├── values-v21
│       │       └── values-w820dp
│       └── test
│           └── java
│               └── com
│                   └── vdm
│                       └── mymurloc
└── gradle
    └── wrapper
</pre>

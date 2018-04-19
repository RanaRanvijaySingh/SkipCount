fastlane documentation
================
# Installation

Make sure you have the latest version of the Xcode command line tools installed:

```
xcode-select --install
```

Install _fastlane_ using
```
[sudo] gem install fastlane -NV
```
or alternatively using `brew cask install fastlane`

# Available Actions
## Android
### android beta
```
fastlane android beta
```
Start beta deployment
### android cleanBuild
```
fastlane android cleanBuild
```
Run clean command
### android createReleaseBuild
```
fastlane android createReleaseBuild
```
Create release build
### android betaDeploy
```
fastlane android betaDeploy
```
Push build on beta
### android incrementBuild
```
fastlane android incrementBuild
```

### android incrementBuildCode
```
fastlane android incrementBuildCode
```

### android incrementBuildName
```
fastlane android incrementBuildName
```

### android gitCommit
```
fastlane android gitCommit
```


----

This README.md is auto-generated and will be re-generated every time [fastlane](https://fastlane.tools) is run.
More information about fastlane can be found on [fastlane.tools](https://fastlane.tools).
The documentation of fastlane can be found on [docs.fastlane.tools](https://docs.fastlane.tools).

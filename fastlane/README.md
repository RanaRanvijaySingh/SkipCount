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
Increment build code and name
### android incrementBuildCode
```
fastlane android incrementBuildCode
```
Increment build code
### android incrementBuildName
```
fastlane android incrementBuildName
```
Increment build name
### android gitCommit
```
fastlane android gitCommit
```
Make new commit
### android gitTag
```
fastlane android gitTag
```
Create new tag

----

This README.md is auto-generated and will be re-generated every time [fastlane](https://fastlane.tools) is run.
More information about fastlane can be found on [fastlane.tools](https://fastlane.tools).
The documentation of fastlane can be found on [docs.fastlane.tools](https://docs.fastlane.tools).

This is a sample project demonstrating an issue with datadog when used in a kotlin multiplatform project exporting an umbrella XC framework for iOS.

See this issue for more details: https://github.com/DataDog/dd-sdk-kotlin-multiplatform/issues/94

### How to reproduce the issue
1. Clone the repository.
2. Run `make ios-project` to generate and open the iOS project in Xcode.
3. Build the project in Xcode, you should see the error `ld: framework 'DatadogObjc' not found` in the build logs.
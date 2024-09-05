# Trinsic API Java Library

![Version](https://img.shields.io/jitpack/version/com.github.trinsic-id/sdk-java-api)
[![Build Status](https://github.com/trinsic-id/sdk/actions/workflows/api-java-release.yml/badge.svg)](https://github.com/trinsic-id/sdk/actions?query=branch%main)

The Trinsic API Java library provides convenient access to the Trinsic API from
applications written in Java.

## Documentation

See the [Trinsic docs](https://docs.trinsic.id/docs/) for more detailed information on how to start integrating with our identity acceptance network.

## Installation

If you are using maven add the following yout `pom.xml` file:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
	     <groupId>com.github.trinsic-id</groupId>
	    <artifactId>sdk-java-api</artifactId>
	    <version>Tag</version>
	</dependency>
</dependencies>
```

If you are using gradle:

```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
    implementation 'com.github.trinsic-id:sdk-java-api:Tag'
}
```

## Usage

The package needs to be configured with your app's access token, which is
available in the [Trinsic Dashboard](https://dashboard.trinsic.id).

```java
var apiClient = new ApiClient();

apiClient.setRequestInterceptor(interceptor -> {
    interceptor.setHeader("Authorization", "Bearer " + "your-access-token");
});

var attachments = new AttachmentsApi(apiClient);
var network = new NetworkApi(apiClient);
var sessions = new SessionsApi(apiClient);
```

You can find a full Java example in the [samples](https://github.com/trinsic-id/sdk/tree/main/api-java/samples) folder.

## SDK Versioning

Trinsic follows a Semantic Versioning (SemVer) process where all releases will have a version X.Y.Z (like 1.0.0) pattern wherein Z would be a bug fix (e.g., 1.0.1), Y would be a minor release (1.1.0) and X would be a major release (2.0.0). We permit any breaking changes to only be released in major versions and strongly recommend reading changelogs before making any major version upgrades.

## Support

Our SDKs follow the [Semantic Versioning](https://semver.org) ("SemVer") scheme. 

For example, the version number `1.13.0` has a major version of `1`, a minor version of `13`, and a patch version of `0`.

Breaking changes are only introduced alongside a new major version.

## More Information

- [API Reference](https://docs.trinsic.id/reference)
- [Developer Guide](https://docs.trinsic.id/docs/developer-tools)
- [Our Blog](https://trinsic.id/blog/)
- [Schedule a demo](https://trinsic.id/contact/)

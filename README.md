> NOTICE
> 
> This software (or technical data) was produced for the U. S. Government under contract, and is subject to the Rights in Data-General Clause 52.227-14, Alt. IV (DEC 2007)
> 
> (C) 2018 The MITRE Corporation. All Rights Reserved.

# Summary

This reference project provides a template for Java-based BIQT Providers.

### Build and Install

#### Prerequisites

This guide targets both CentOS Linux 7.4 and Windows 10.

The following software must be installed on the local system:
  * Apache Maven 3.5.2
  * BIQT
  * Java SE JDK 9

**Note:** BIQT must be built with Java bindings enabled.

#### Build

##### CentOS Linux 7.4

```bash
cp $BIQT_HOME/biqt*.jar src/main/resources
mvn package
cp -R JavaExample $BIQT_HOME/providers
```

##### Windows 10

```
copy "%BIQT_HOME%/biqt*.jar" src/main/resources
mvn package
xcopy JavaExample "%BIQT_HOME%/providers" /s /e /y /i
```
# A SBT plugin for CXF to generate java sources from WSDL using WSDL2Java ![PR Event](https://github.com/CareCloud/sbt-cxf/workflows/Build%20and%20Test/badge.svg?event=pull_request)
# Sbt-cfx 

![CI/CD](https://github.com/CareCloud/sbt-cfx/actions/workflows/publish.yml/badge.svg)

Installation
------------

To use this plugin use the addSbtPlugin command within your project's `plugins.sbt` file:

```scala
addSbtPlugin("com.carecloud" % "sbt-cxf" % "x.x.x")
```

For example with `build.sbt`:

```scala
CxfKeys.wsdls += Wsdl("example", "http://example.com/service?wsdl")
```

Run the following at the sbt console:
```scala
show cxfWsdl2java
```

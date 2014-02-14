finagle-example
===============

An example Finagle Client / Server using Thrift based on https://github.com/twitter/finagle/tree/master/finagle-example

This project consists of a single server and client which send and receive a 'hello' message. The service code is generated by thrift (to allow cross-language service usage).

## Installation

`` git checkout https://github.com/drei01/finagle-example.git ``

## Usage

For use with Intellij run:

`` sbt gen-idea ``

Then run:

`` sbt compile ``

`` sbt run ``

## Server

![finagle server](https://s3-eu-west-1.amazonaws.com/matt-reid-images/finagle-thrift-server.png)

## Client

![finagle client](https://s3-eu-west-1.amazonaws.com/matt-reid-images/finagle-thrift-client.png)

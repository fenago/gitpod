FROM gitpod/workspace-full

# Install OpenJDK 17 (or your preferred version)
RUN sudo apt-get update && sudo apt-get install -y openjdk-17-jdk maven

ENV JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64

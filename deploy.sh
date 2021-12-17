./gradlew clean build -p with-webflux
./gradlew clean build -p without-webflux

cd with-webflux && docker build -t cesarlemos/with-webflux:stable .
cd ..
cd without-webflux && docker build -t cesarlemos/without-webflux:stable .

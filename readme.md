All the money is in packer/packer-spike.json

instructions:
============================
1. brew install packer
2. ./gradlew bootRepackage
3. packer build -var "artifact_path=build/libs/packer-spike-0.0.1-SNAPSHOT.jar" -var "version=1.0" packer/packer-spike.json

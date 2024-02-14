#!/bin/bash
cd "$(dirname "$0")"
java -cp ".:lib/*" -Djava.security.policy=lib/client.policy client.QTestLauncher server=qtest2.mathcs.emory.edu "$@" >/dev/null 2>/dev/null


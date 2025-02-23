#!/bin/bash

DIRECTORY="../"

OLD_TEXT="ComposeMultiplatformSample"
NEW_TEXT="ComposeMultiplatformSample"

find "$DIRECTORY" -name "scripts" -o -name ".git" -prune -o -type f -print | while read -r file; do
    sed -i "s|$OLD_TEXT|$NEW_TEXT|g" "$file"
    echo "Replaced in $file"
done

echo "Done!"
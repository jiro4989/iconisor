#!/bin/bash

set -eux

outdir=$1

jlink --module-path ./jmods/javafx-jmods-14.0.1/ \
  --add-modules javafx.base,javafx.controls,javafx.swing,javafx.graphics,javafx.fxml \
  --compress=2 \
  --output "$outdir"

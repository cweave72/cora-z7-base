include hw-design.inc

HDF = "system.hdf"

FILESEXTRAPATHS_prepend := "${THISDIR}/cora-zynq7:"
SRC_URI = " \
           file://system.hdf \
           file://fpga-bit-to-bin.py \
           "

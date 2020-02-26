common-themes/,
  umount /snap/gtk-common-themes/*,
  umount /snap/gtk-common-themes/*/,
  # .. variant with mimic at /snap/gtk-common-themes/818/
  # Allow reading the mimic directory, it must exist in the first place.
  /snap/gtk-common-themes/818/ r,
  # Allow setting the read-only directory aside via a bind mount.
  /tmp/.snap/snap/gtk-common-themes/818/ rw,
  mount options=(rbind, rw) /snap/gtk-common-themes/818/ -> /tmp/.snap/snap/gtk-common-themes/818/,
  # Allow mounting tmpfs over the read-only directory.
  mount fstype=tmpfs options=(rw) tmpfs -> /snap/gtk-common-themes/818/,
  # Allow creating empty files and directories for bind mounting things
  # to reconstruct the now-writable parent directory.
  /tmp/.snap/snap/gtk-common-themes/818/*/ rw,
  /snap/gtk-common-themes/818/*/ rw,
  mount options=(rbind, rw) /tmp/.snap/snap/gtk-common-themes/818/*/ -> /snap/gtk-common-themes/818/*/,
  /tmp/.snap/snap/gtk-common-themes/818/* rw,
  /snap/gtk-common-themes/818/* rw,
  mount options=(bind, rw) /tmp/.snap/snap/gtk-common-themes/818/* -> /snap/gtk-common-themes/818/*,
  # Allow unmounting the auxiliary directory.
  # TODO: use fstype=tmpfs here for more strictness (LP: #1613403)
  umount /tmp/.snap/snap/gtk-common-themes/818/,
  # Allow unmounting the destination directory as well as anything
  # inside.  This lets us perform the undo plan in case the writable
  # mimic fails.
  umount /snap/gtk-common-themes/818/,
  umount /snap/gtk-common-themes/818/*,
  umount /snap/gtk-common-themes/818/*/,
  # .. variant with mimic at /snap/gtk-common-themes/818/share/
  # Allow reading the mimic directory, it must exist in the first place.
  /snap/gtk-common-themes/818/share/ r,
  # Allow setting the read-only directory aside via a bind mount.
  /tmp/.snap/snap/gtk-common-themes/818/share/ rw,
  mount options=(rbind, rw) /snap/gtk-common-themes/818/share/ -> /tmp/.snap/snap/gtk-common-themes/818/share/,
  # Allow mounting tmpfs over the read-only directory.
  mount fstype=tmpfs options=(rw) tmpfs -> /snap/gtk-common-themes/818/share/,
  # Allow creating empty files and directories for bind mounting things
  # to reconstruct the now-writable parent directory.
  /tmp/.snap/snap/gtk-common-themes/818/share/*/ rw,
  /snap/gtk-common-themes/818/share/*/ rw,
  mount options=(rbind, rw) /tmp/.snap/snap/gtk-common-themes/818/share/*/ -> /snap/gtk-common-themes/818/share/*/,
  /tmp/.snap/snap/gtk-common-themes/818/share/* rw,
  /snap/gtk-common-themes/818/share/* rw,
  mount options=(bind, rw) /tmp/.snap/snap/gtk-common-themes/818/share/* -> /snap/gtk-common-themes/818/share/*,
  # Allow unmounting the auxiliary directory.
  # TODO: use fstype=tmpfs here for more strictness (LP: #1613403)
  umount /tmp/.snap/snap/gtk-common-themes/818/share/,
  # Allow unmounting the destination directory as well as anything
  # inside.  This lets us perform the undo plan in case the writable
  # mimic fails.
  umount /snap/gtk-common-themes/818/share/,
  umount /snap/gtk-common-themes/818/share/*,
  umount /snap/gtk-common-themes/818/share/*/,
  # .. variant with mimic at /snap/gtk-common-themes/818/share/icons/
  # Allow reading the mimic directory, it must exist in the first place.
  /snap/gtk-common-themes/818/share/icons/ r,
  # Allow setting the read-only directory aside via a bind mount.
  /tmp/.snap/snap/gtk-common-themes/818/share/icons/ rw,
  mount options=(rbind, rw) /snap/gtk-common-themes/818/share/icons/ -> /tmp/.snap/snap/gtk-common-t
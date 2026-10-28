# Purple Menu build

Build in the cloud (no PC needed):
1. Create a GitHub repo, upload this folder.
2. Actions tab > "Build APK" > Run workflow.
3. Download the PurpleMenu-apk artifact (app-debug.apk).

Local: git clone imgui v1.90.9 into app/src/main/cpp/imgui, then `gradle assembleDebug`.

IMPORTANT: this APK just carries libpurplemenu.so. It does nothing on its own.
You still need to (a) fill in the TODO(version) offsets/hooks in purple_menu.cpp
and (b) load the .so into your Minecraft copy (Zygisk/Magisk module, or a
repackaged Minecraft that calls System.loadLibrary("purplemenu")).

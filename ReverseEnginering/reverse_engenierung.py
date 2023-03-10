import subprocess

# Replace "myapp.apk" with the name of your APK file
apk_file = "myapp.apk"

# Replace "output_folder" with the name of the folder where you want to save the decompiled source code
output_folder = "output_folder"

# Run the APKTool command to decompile the APK file and save the decompiled source code to the output folder
subprocess.run(["apktool", "d", apk_file, "-o", output_folder], check=True)

# The decompiled source code should now be in the "output_folder" directory

del D:\REPOZYTORIA GIT\KODILLA\build\libs*.jar
call gradlew build
IF EXIST D:\REPOZYTORIA GIT\KODILLA\build\libs*.jar goto copyFile
goto errorMessage

:copyFile
copy D:\REPOZYTORIA GIT\KODILLA\build\libs*.jar c:\project
goto end

:errorMessage
echo Compilation Error

:end
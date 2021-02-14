del \build\libs*.jar
call gradlew build
IF EXIST \build\libs*.jar goto copyFile
goto errorMessage

:copyFile
copy \build\libs*.jar c:\project
goto end

:errorMessage
echo Compilation Error

:end
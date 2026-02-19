cmake_minimum_required(VERSION 3.22.1)

project("meuapp")

# Diz para o Android compilar o main.cpp como biblioteca
add_library(
    meuapp
    SHARED
    main.cpp
)

# Bibliotecas do Android que vamos usar
target_link_libraries(
    meuapp
    android
    log
)

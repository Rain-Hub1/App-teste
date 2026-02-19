// Este é seu código C++!
// Ele recebe uma chamada do Java e retorna um texto

#include <jni.h>
#include <string>

// Esta função é chamada pelo Java quando o botão é clicado
extern "C" JNIEXPORT jstring JNICALL
Java_com_exemplo_meuapp_MainActivity_mensagemDoCpp(
        JNIEnv* env,
        jobject /* this */) {

    // Troque o texto aqui para o que quiser mostrar!
    std::string mensagem = "Olá! Este texto veio do C++!";
    return env->NewStringUTF(mensagem.c_str());
}

#include <jni.h>


JNIEXPORT jint JNICALL
Java_com_example_victo_mathematicalndk_MainActivity_add(JNIEnv *env, jobject instance, jint a,
                                                        jint b) {

    // TODO
    return (a+b);
}

JNIEXPORT jint JNICALL
Java_com_example_victo_mathematicalndk_MainActivity_multiply(JNIEnv *env, jobject instance, jint a,
                                                             jint b) {

    // TODO
    return (a*b);
}

JNIEXPORT jint JNICALL
Java_com_example_victo_mathematicalndk_MainActivity_division(JNIEnv *env, jobject instance, jint a,
                                                             jint b) {

    // TODO
    jint first = a;
    jint second = b;
    jint res = a/b;

    return res;
}

JNIEXPORT jint JNICALL
Java_com_example_victo_mathematicalndk_MainActivity_diference(JNIEnv *env, jobject instance, jint a,
                                                              jint b) {

    // TODO
    return (a-b);
}
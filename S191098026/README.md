1. SteganographyEncoder 是一个自己定义的类加载器，主要功能是
    完成自定义的一个加载类的过程，在findClass方法中，可以看到类字节码的加载不是通过.class文件，而是根据url获取图片，在经过SteganographyEncoder.decodeByteArray()将隐图片进行解码最终得到的byte[]，得到类的字节码，通过字节码生成一个类的对象。这也解释了task4的通过别的同学的图片设置sorter的过程，这个过程是无需源码，源码就包含在图片中


    本次作业使用的均为本地的绝对路径
2. 选择排序
    ![](https://raw.githubusercontent.com/jwork-2021/jw03-Direction-cy/main/S191098026.SelectSorter.png)

    归并排序
    ![](https://raw.githubusercontent.com/jwork-2021/jw03-Direction-cy/main/S191098026.MergeSorter.png)

3. 选择排序
    [![asciicast](https://asciinema.org/a/fcsiUB6Pt2uyDy9BeCjLnkvlr.svg)](https://asciinema.org/a/fcsiUB6Pt2uyDy9BeCjLnkvlr)

    归并排序
    [![asciicast](https://asciinema.org/a/IDP4Fyrq48qACQeIJQKnzTmaT.svg)](https://asciinema.org/a/IDP4Fyrq48qACQeIJQKnzTmaT)

4. 在众多仓库中选取了图片
    ![](https://raw.githubusercontent.com/jwork-2021/jw03-191220042/main/example.QuickSorter.png)

    结果如下
    [![asciicast](https://asciinema.org/a/6RiiDPfVvMHctQPNyPoZ2mmLM.svg)](https://asciinema.org/a/6RiiDPfVvMHctQPNyPoZ2mmLM)



# Coroutine Scope

Kotlin Coroutines, asenkron olarak çalışan kodu basitleştirmek için Android'de kullanabileceğimiz bir asenkron tasarım modelidir. Android'de, Main Thread’i  bloklayabilecek ve uygulamamızın yanıt vermemesine neden olabilecek uzun süreli işlemleri yönetmemize yardımcı olur.

## Coroutines'in Özellikleri Nelerdir? 
**Lightweight (Hafiflik) :** Birçok Coroutine’i tek bir thread üzerinde çalıştırabiliriz. Buna rağmen coroutine, çalıştığı thread’i bloklamaz. Bu sayede birçok eş zamanlı işlemi desteklerken bellekten de tasarruf sağlar.

**Fewer Memory Leaks (Daha Az Bellek Sızıntısı) :** Coroutine’in çalıştığı scope iptal edildiğinde, o scope dahilindeki coroutine'ler de iptal edilir.

**Built-In Cancellation Support (Yerleşik İptal Desteği) :** İptal Desteği, çalışan coroutine hiyerarşisi aracılığıyla otomatik olarak yayılır.

**Jetpack Integration (Jetpack Entegrasyonu) :** Çoğu Jetpack kütüphanesi, tam coroutine desteği sağlar.

## Sonuç

#### 1) Çalıştırdığımız sonsuz döngü kitlenmeye sebep oldu mu ? 

* Evet kitlenmeye sebep oldu.
* Coroutine Scope sadece döngü kırıldıktan sonra çalıştı.

#### 2) Kilitlenmeye sebep olmadan Coroutine Scope çalışır mı ?

* Oluşturduğumuz sonsuz döngü ana thread üzerinde çalıştığı için, döngüyü bitirmeden Coroutine Scope çalışmaz.
* Eğer oluşturduğumuz sonsuz döngüyü kırarsak Coroutine Scope çalışır.


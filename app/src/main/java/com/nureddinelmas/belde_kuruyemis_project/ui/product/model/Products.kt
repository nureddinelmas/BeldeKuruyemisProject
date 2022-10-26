package com.nureddinelmas.belde_kuruyemis_project.ui.product.model

import android.media.Image
import java.io.Serializable

data class Products (
	var id: Int,
	var name:String,
	var image: String,
	var description :String?
		) : Serializable


	
	
	val tuzlufistik = Products(1, "Tuzlu Fıstık", "https://www.beldekuruyemis.com.tr/yuklemeler/slayt/2.jpg","Fıstık ağacı, İran ve Afganistan da dahil olmak üzere Orta Asya bölgelerine özgüdür. Arkeoloji, fıstık tohumlarının MÖ 6750 kadar erken bir tarihte yaygın bir gıda olduğunu gösterir. Antep fıstığının günümüzde yetiştirilen türü Pistacia vera’nın, en eski örneği modern Özbekistan'daki Djarkutan'dan olan ilk Tunç Çağında Orta Asya'da yetiştirildi. Antep fıstığı ağacının ana vatanı Orta Doğu ve Orta Asya'dır. Arkeolojik kanıtlar Antep fıstığının MÖ 6750 tarihlerinde tüketilmiş olduğunu göstermektedir. Ağaç 10m (33ft) boya kadar büyür. Yaprak döken ince uzun karşılıklı (pinnate) yaprakları 10–20 santimetre (4–8inç) uzunluğundadır. Bitkiler, ayrı erkek ve dişi ağaçlara sahip iki evciklidir. Çiçekler taç yapraklı, ayrı eşeylive salkımlarda bulunur.\n" +
			"\n" +
			"Antep fıstıkları genellikle taze veya kavrulmuş ve tuzlu olarak bütün olarak yenir ve ayrıca fıstıklı dondurma, kulfi, spumoni, fıstık yağı, fıstık ezmesive baklava, fıstıklı çikolata, fıstıklı helva , fıstıklı lokumveya biscotti ve mortadella gibi soğuk kesim şekerlemelerde kullanılır. Amerikalılar, taze fıstık veya fıstıklı puding, krem şanti ve konserve meyveli fıstık salatası yapar. Fıstık kabuğu doğal olarak bej renklidir ama ticari fıstıklar kırmızıya veya yeşile boyanabilir. Başlangıçta, kabuklardaki kabuklu yemişlerin elle toplanmasından kaynaklanan lekeleri gizlemek için boya uygulanıyordu. 21.yy'da fıstıkların çoğu makine ile hasat edilir ve kabuklar lekesiz kalır.")
	val ceviz = Products(2, "Ceviz", "https://www.beldekuruyemis.com.tr/yuklemeler/kayitlar/520x585/toptan-ceviz-1-10.jpg","Fıstık ağacı, İran ve Afganistan da dahil olmak üzere Orta Asya bölgelerine özgüdür. Arkeoloji, fıstık tohumlarının MÖ 6750 kadar erken bir tarihte yaygın bir gıda olduğunu gösterir. Antep fıstığının günümüzde yetiştirilen türü Pistacia vera’nın, en eski örneği modern Özbekistan'daki Djarkutan'dan olan ilk Tunç Çağında Orta Asya'da yetiştirildi. Antep fıstığı ağacının ana vatanı Orta Doğu ve Orta Asya'dır. Arkeolojik kanıtlar Antep fıstığının MÖ 6750 tarihlerinde tüketilmiş olduğunu göstermektedir. Ağaç 10m (33ft) boya kadar büyür. Yaprak döken ince uzun karşılıklı (pinnate) yaprakları 10–20 santimetre (4–8inç) uzunluğundadır. Bitkiler, ayrı erkek ve dişi ağaçlara sahip iki evciklidir. Çiçekler taç yapraklı, ayrı eşeylive salkımlarda bulunur.\n" +
			"\n" +
			"Antep fıstıkları genellikle taze veya kavrulmuş ve tuzlu olarak bütün olarak yenir ve ayrıca fıstıklı dondurma, kulfi, spumoni, fıstık yağı, fıstık ezmesive baklava, fıstıklı çikolata, fıstıklı helva , fıstıklı lokumveya biscotti ve mortadella gibi soğuk kesim şekerlemelerde kullanılır. Amerikalılar, taze fıstık veya fıstıklı puding, krem şanti ve konserve meyveli fıstık salatası yapar. Fıstık kabuğu doğal olarak bej renklidir ama ticari fıstıklar kırmızıya veya yeşile boyanabilir. Başlangıçta, kabuklardaki kabuklu yemişlerin elle toplanmasından kaynaklanan lekeleri gizlemek için boya uygulanıyordu. 21.yy'da fıstıkların çoğu makine ile hasat edilir ve kabuklar lekesiz kalır.")

val cekirdek = Products(3, "Çekirdek", "https://www.beldekuruyemis.com.tr/yuklemeler/kayitlar/520x585/toptan-cekirdek-1-19.jpg","Fıstık ağacı, İran ve Afganistan da dahil olmak üzere Orta Asya bölgelerine özgüdür. Arkeoloji, fıstık tohumlarının MÖ 6750 kadar erken bir tarihte yaygın bir gıda olduğunu gösterir. Antep fıstığının günümüzde yetiştirilen türü Pistacia vera’nın, en eski örneği modern Özbekistan'daki Djarkutan'dan olan ilk Tunç Çağında Orta Asya'da yetiştirildi. Antep fıstığı ağacının ana vatanı Orta Doğu ve Orta Asya'dır. Arkeolojik kanıtlar Antep fıstığının MÖ 6750 tarihlerinde tüketilmiş olduğunu göstermektedir. Ağaç 10m (33ft) boya kadar büyür. Yaprak döken ince uzun karşılıklı (pinnate) yaprakları 10–20 santimetre (4–8inç) uzunluğundadır. Bitkiler, ayrı erkek ve dişi ağaçlara sahip iki evciklidir. Çiçekler taç yapraklı, ayrı eşeylive salkımlarda bulunur.\n" +
		"\n" +
		"Antep fıstıkları genellikle taze veya kavrulmuş ve tuzlu olarak bütün olarak yenir ve ayrıca fıstıklı dondurma, kulfi, spumoni, fıstık yağı, fıstık ezmesive baklava, fıstıklı çikolata, fıstıklı helva , fıstıklı lokumveya biscotti ve mortadella gibi soğuk kesim şekerlemelerde kullanılır. Amerikalılar, taze fıstık veya fıstıklı puding, krem şanti ve konserve meyveli fıstık salatası yapar. Fıstık kabuğu doğal olarak bej renklidir ama ticari fıstıklar kırmızıya veya yeşile boyanabilir. Başlangıçta, kabuklardaki kabuklu yemişlerin elle toplanmasından kaynaklanan lekeleri gizlemek için boya uygulanıyordu. 21.yy'da fıstıkların çoğu makine ile hasat edilir ve kabuklar lekesiz kalır.")
val kuruuzum = Products(4, "Kuru Üzüm", "https://www.beldekuruyemis.com.tr/yuklemeler/kayitlar/520x585/kuru-uzum-toptancisi-1-29.jpg","Fıstık ağacı, İran ve Afganistan da dahil olmak üzere Orta Asya bölgelerine özgüdür. Arkeoloji, fıstık tohumlarının MÖ 6750 kadar erken bir tarihte yaygın bir gıda olduğunu gösterir. Antep fıstığının günümüzde yetiştirilen türü Pistacia vera’nın, en eski örneği modern Özbekistan'daki Djarkutan'dan olan ilk Tunç Çağında Orta Asya'da yetiştirildi. Antep fıstığı ağacının ana vatanı Orta Doğu ve Orta Asya'dır. Arkeolojik kanıtlar Antep fıstığının MÖ 6750 tarihlerinde tüketilmiş olduğunu göstermektedir. Ağaç 10m (33ft) boya kadar büyür. Yaprak döken ince uzun karşılıklı (pinnate) yaprakları 10–20 santimetre (4–8inç) uzunluğundadır. Bitkiler, ayrı erkek ve dişi ağaçlara sahip iki evciklidir. Çiçekler taç yapraklı, ayrı eşeylive salkımlarda bulunur.\n" +
		"\n" +
		"Antep fıstıkları genellikle taze veya kavrulmuş ve tuzlu olarak bütün olarak yenir ve ayrıca fıstıklı dondurma, kulfi, spumoni, fıstık yağı, fıstık ezmesive baklava, fıstıklı çikolata, fıstıklı helva , fıstıklı lokumveya biscotti ve mortadella gibi soğuk kesim şekerlemelerde kullanılır. Amerikalılar, taze fıstık veya fıstıklı puding, krem şanti ve konserve meyveli fıstık salatası yapar. Fıstık kabuğu doğal olarak bej renklidir ama ticari fıstıklar kırmızıya veya yeşile boyanabilir. Başlangıçta, kabuklardaki kabuklu yemişlerin elle toplanmasından kaynaklanan lekeleri gizlemek için boya uygulanıyordu. 21.yy'da fıstıkların çoğu makine ile hasat edilir ve kabuklar lekesiz kalır.")

val kayisi = Products(5, "Kayısı", "https://www.beldekuruyemis.com.tr/yuklemeler/kayitlar/520x585/toptan-kayisi-1-35.jpg","Fıstık ağacı, İran ve Afganistan da dahil olmak üzere Orta Asya bölgelerine özgüdür. Arkeoloji, fıstık tohumlarının MÖ 6750 kadar erken bir tarihte yaygın bir gıda olduğunu gösterir. Antep fıstığının günümüzde yetiştirilen türü Pistacia vera’nın, en eski örneği modern Özbekistan'daki Djarkutan'dan olan ilk Tunç Çağında Orta Asya'da yetiştirildi. Antep fıstığı ağacının ana vatanı Orta Doğu ve Orta Asya'dır. Arkeolojik kanıtlar Antep fıstığının MÖ 6750 tarihlerinde tüketilmiş olduğunu göstermektedir. Ağaç 10m (33ft) boya kadar büyür. Yaprak döken ince uzun karşılıklı (pinnate) yaprakları 10–20 santimetre (4–8inç) uzunluğundadır. Bitkiler, ayrı erkek ve dişi ağaçlara sahip iki evciklidir. Çiçekler taç yapraklı, ayrı eşeylive salkımlarda bulunur.\n" +
		"\n" +
		"Antep fıstıkları genellikle taze veya kavrulmuş ve tuzlu olarak bütün olarak yenir ve ayrıca fıstıklı dondurma, kulfi, spumoni, fıstık yağı, fıstık ezmesive baklava, fıstıklı çikolata, fıstıklı helva , fıstıklı lokumveya biscotti ve mortadella gibi soğuk kesim şekerlemelerde kullanılır. Amerikalılar, taze fıstık veya fıstıklı puding, krem şanti ve konserve meyveli fıstık salatası yapar. Fıstık kabuğu doğal olarak bej renklidir ama ticari fıstıklar kırmızıya veya yeşile boyanabilir. Başlangıçta, kabuklardaki kabuklu yemişlerin elle toplanmasından kaynaklanan lekeleri gizlemek için boya uygulanıyordu. 21.yy'da fıstıkların çoğu makine ile hasat edilir ve kabuklar lekesiz kalır.")
val kuruincir = Products(6, "Kuru İncir", "https://www.beldekuruyemis.com.tr/yuklemeler/kayitlar/520x585/toptan-incir-1-41.jpg","")

val findik = Products(7, "Fındık", "https://www.beldekuruyemis.com.tr/yuklemeler/kayitlar/520x585/toptan-findik-1-48.jpg","")
val badem = Products(8, "Badem", "https://www.beldekuruyemis.com.tr/yuklemeler/kayitlar/520x585/findik-toptancisi-1-50.jpg","")


val karisikcerez = Products(9, "Karışık Çerez", "https://www.beldekuruyemis.com.tr/yuklemeler/slayt/2.jpg","")
val antepfistigi = Products(10, "Antep Fıstığı", "https://www.beldekuruyemis.com.tr/yuklemeler/kayitlar/520x585/tuzlu-fistik-imalat-bagcilar-1-7.jpg","")

val leblebi = Products(11, "Leblebi", "https://www.beldekuruyemis.com.tr/yuklemeler/slayt/2.jpg","")
val hurma = Products(12, "Hurma", "https://www.beldekuruyemis.com.tr/yuklemeler/kayitlar/520x585/cekirdek-istoc-toptanci-1-26.jpg","")

val fistik = Products(13, "Fıstık", "https://www.beldekuruyemis.com.tr/yuklemeler/slayt/2.jpg","")
val lokum = Products(14, "Lokum", "https://www.beldekuruyemis.com.tr/yuklemeler/kayitlar/520x585/toptan-kabuklu-findik-1-47.jpg","")

val kurukayisi = Products(15, "Kuru Kayısı", "https://www.beldekuruyemis.com.tr/yuklemeler/kayitlar/520x585/kayisi-toptancisi-1-39.jpg","")
val cevizlisucuk = Products(16, "Cevizli Sucuk", "https://www.beldekuruyemis.com.tr/yuklemeler/kayitlar/520x585/toptan-incir-fiyatlari-1-42.jpg","")

val duguncerezleri = Products(17, "Dügün Çerezleri", "https://www.beldekuruyemis.com.tr/yuklemeler/kayitlar/520x585/kuru-uzum-cesitleri-1-33.jpg","")
val kinacerezi = Products(18, "Kına Çerezleri", "https://www.beldekuruyemis.com.tr/yuklemeler/kayitlar/520x585/tuzlu-fistik-imalat-istoc-1-6.jpg","")

var productList : ArrayList<Products> = arrayListOf(tuzlufistik, ceviz, cekirdek, kuruuzum, kayisi, kuruincir, findik, badem, karisikcerez, antepfistigi,
	leblebi, hurma, fistik,
	lokum, kurukayisi, cevizlisucuk,
	duguncerezleri,
	kinacerezi)
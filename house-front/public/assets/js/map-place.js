if($('#hero-map').length){
$(function() {

    var LocsA = [
        {
            lat: 40.740178,
            lon: -74.190194,
            imageUrl: 'assets/images/property/property-1.jpg',
            title: 'Friuli-Venezia Giulia',
            address: '568 E 1st Ave, Miami',
            html: ['<div class="property-item map-property-item"><div class="property-inner"><div class="image"><a href="single-properties.html"><img src="assets/images/property/property-1.jpg" alt=""></a>',
                    '<ul class="property-feature"><li><span class="area"><img src="assets/images/icons/area.png" alt="">550 平米</span></li>',
                    '<li><span class="bed"><img src="assets/images/icons/bed.png" alt="">6</span></li>',
                    '<li><span class="bath"><img src="assets/images/icons/bath.png" alt="">4</span></li>',
                    '<li><span class="parking"><img src="assets/images/icons/parking.png" alt="">3</span></li></ul></div>',
                    '<div class="content"><div class="left"><h3 class="title"><a href="single-properties.html">江南宅院</a></h3><span class="location"><img src="assets/images/icons/marker.png" alt="">锦江区东大街下东大街568号</span></div>',
                    '<div class="right"><div class="type-wrap"><span class="price">￥550<span>/月</span></span><span class="type">出租</span></div></div></div></div></div>',
                ].join(''),
            icon: 'assets/images/icons/map-marker-2.png',
            animation: google.maps.Animation.BOUNCE
        },
        {
            lat: 40.733617,
            lon: -74.171150,
            imageUrl: 'assets/images/property/property-2.jpg',
            title: 'Marvel de Villa',
            address: '450 E 1st Ave, New Jersey',
            html: ['<div class="property-item map-property-item"><div class="property-inner"><div class="image"><a href="single-properties.html"><img src="assets/images/property/property-2.jpg" alt=""></a>',
                    '<ul class="property-feature"><li><span class="area"><img src="assets/images/icons/area.png" alt="">550 平米</span></li>',
                    '<li><span class="bed"><img src="assets/images/icons/bed.png" alt="">6</span></li>',
                    '<li><span class="bath"><img src="assets/images/icons/bath.png" alt="">4</span></li>',
                    '<li><span class="parking"><img src="assets/images/icons/parking.png" alt="">3</span></li></ul></div>',
                    '<div class="content"><div class="left"><h3 class="title"><a href="single-properties.html">木马山别墅</a></h3><span class="location"><img src="assets/images/icons/marker.png" alt="">城北大道450附22号</span></div>',
                    '<div class="right"><div class="type-wrap"><span class="price">￥550<span>/月</span></span><span class="type">出租</span></div></div></div></div></div>',
                ].join(''),
            icon: 'assets/images/icons/map-marker-2.png',
            animation: google.maps.Animation.BOUNCE
        },
        {
            lat: 40.743011,
            lon: -74.247100,
            title: 'Ruposi Bangla Cottage',
            imageUrl: 'assets/images/property/property-3.jpg',
            address: '215 L AH Rod, California',
            html: ['<div class="property-item map-property-item"><div class="property-inner"><div class="image"><a href="single-properties.html"><img src="assets/images/property/property-3.jpg" alt=""></a>',
                    '<ul class="property-feature"><li><span class="area"><img src="assets/images/icons/area.png" alt="">550 平米</span></li>',
                    '<li><span class="bed"><img src="assets/images/icons/bed.png" alt="">6</span></li>',
                    '<li><span class="bath"><img src="assets/images/icons/bath.png" alt="">4</span></li>',
                    '<li><span class="parking"><img src="assets/images/icons/parking.png" alt="">3</span></li></ul></div>',
                    '<div class="content"><div class="left"><h3 class="title"><a href="single-properties.html">皇家一号公寓</a></h3><span class="location"><img src="assets/images/icons/marker.png" alt="">锦江区福字街215号</span></div>',
                    '<div class="right"><div class="type-wrap"><span class="price">￥550<span>/月</span></span><span class="type">出租</span></div></div></div></div></div>',
                ].join(''),
            icon: 'assets/images/icons/map-marker-2.png',
            animation: google.maps.Animation.BOUNCE
        },
        {
            lat: 40.711150,
            lon: -74.214998,
            title: 'MayaKanon de Villa',
            imageUrl: 'assets/images/property/property-4.jpg',
            address: '12 EA 1st Ave, Washington',
            html: ['<div class="property-item map-property-item"><div class="property-inner"><div class="image"><a href="single-properties.html"><img src="assets/images/property/property-4.jpg" alt=""></a>',
                    '<ul class="property-feature"><li><span class="area"><img src="assets/images/icons/area.png" alt="">550 平米</span></li>',
                    '<li><span class="bed"><img src="assets/images/icons/bed.png" alt="">6</span></li>',
                    '<li><span class="bath"><img src="assets/images/icons/bath.png" alt="">4</span></li>',
                    '<li><span class="parking"><img src="assets/images/icons/parking.png" alt="">3</span></li></ul></div>',
                    '<div class="content"><div class="left"><h3 class="title"><a href="single-properties.html">龙城一号别墅</a></h3><span class="location"><img src="assets/images/icons/marker.png" alt="">龙泉驿区南山大道333号附12号</span></div>',
                    '<div class="right"><div class="type-wrap"><span class="price">￥550<span>/月</span></span><span class="type">出租</span></div></div></div></div></div>',
                ].join(''),
            icon: 'assets/images/icons/map-marker-2.png',
            animation: google.maps.Animation.BOUNCE
        },
        {
            lat: 40.690010,
            lon: -74.151753,
            title: '668 L 2nd Ave, Boston',
            imageUrl: 'assets/images/property/property-5.jpg',
            address: '568 E 1st Ave, Miami',
            html: ['<div class="property-item map-property-item"><div class="property-inner"><div class="image"><a href="single-properties.html"><img src="assets/images/property/property-5.jpg" alt=""></a>',
                    '<ul class="property-feature"><li><span class="area"><img src="assets/images/icons/area.png" alt="">550 平米</span></li>',
                    '<li><span class="bed"><img src="assets/images/icons/bed.png" alt="">6</span></li>',
                    '<li><span class="bath"><img src="assets/images/icons/bath.png" alt="">4</span></li>',
                    '<li><span class="parking"><img src="assets/images/icons/parking.png" alt="">3</span></li></ul></div>',
                    '<div class="content"><div class="left"><h3 class="title"><a href="single-properties.html">春天花园别墅</a></h3><span class="location"><img src="assets/images/icons/marker.png" alt="">金牛区琴台西路668号</span></div>',
                    '<div class="right"><div class="type-wrap"><span class="price">￥550<span>/月</span></span><span class="type">出租</span></div></div></div></div></div>',
                ].join(''),
            icon: 'assets/images/icons/map-marker-2.png',
            animation: google.maps.Animation.BOUNCE
        },
        {
            lat: 40.697590,
            lon: -74.263164,
            title: 'Radison de Villa',
            imageUrl: 'assets/images/property/property-6.jpg',
            address: '12 1st Ave, New Yourk',
            html: ['<div class="property-item map-property-item"><div class="property-inner"><div class="image"><a href="single-properties.html"><img src="assets/images/property/property-6.jpg" alt=""></a>',
                    '<ul class="property-feature"><li><span class="area"><img src="assets/images/icons/area.png" alt="">550 平米</span></li>',
                    '<li><span class="bed"><img src="assets/images/icons/bed.png" alt="">6</span></li>',
                    '<li><span class="bath"><img src="assets/images/icons/bath.png" alt="">4</span></li>',
                    '<li><span class="parking"><img src="assets/images/icons/parking.png" alt="">3</span></li></ul></div>',
                    '<div class="content"><div class="left"><h3 class="title"><a href="single-properties.html">万科西山别墅</a></h3><span class="location"><img src="assets/images/icons/marker.png" alt="">高新区蜀都大道12号</span></div>',
                    '<div class="right"><div class="type-wrap"><span class="price">￥550<span>/月</span></span><span class="type">出租</span></div></div></div></div></div>',
                ].join(''),
            icon: 'assets/images/icons/map-marker-2.png',
            animation: google.maps.Animation.BOUNCE
        },
        {
            lat: 40.729979,
            lon: -74.271992,
            title: 'Marvel de Villa',
            imageUrl: 'assets/images/property/property-7.jpg',
            address: '450 E 1st Ave, New Jersey',
            html: ['<div class="property-item map-property-item"><div class="property-inner"><div class="image"><a href="single-properties.html"><img src="assets/images/property/property-7.jpg" alt=""></a>',
                    '<ul class="property-feature"><li><span class="area"><img src="assets/images/icons/area.png" alt="">550 平米</span></li>',
                    '<li><span class="bed"><img src="assets/images/icons/bed.png" alt="">6</span></li>',
                    '<li><span class="bath"><img src="assets/images/icons/bath.png" alt="">4</span></li>',
                    '<li><span class="parking"><img src="assets/images/icons/parking.png" alt="">3</span></li></ul></div>',
                    '<div class="content"><div class="left"><h3 class="title"><a href="single-properties.html">木马山别墅</a></h3><span class="location"><img src="assets/images/icons/marker.png" alt="">城北大道450附22号</span></div>',
                    '<div class="right"><div class="type-wrap"><span class="price">￥550<span>/月</span></span><span class="type">出租</span></div></div></div></div></div>',
                ].join(''),
            icon: 'assets/images/icons/map-marker-2.png',
            animation: google.maps.Animation.BOUNCE
        },
        {
            lat: 40.749702,
            lon: -74.163631,
            title: 'MayaKanon de Villa',
            imageUrl: 'assets/images/property/property-8.jpg',
            address: '12 EA 1st Ave, Washington',
            html: ['<div class="property-item map-property-item"><div class="property-inner"><div class="image"><a href="single-properties.html"><img src="assets/images/property/property-8.jpg" alt=""></a>',
                    '<ul class="property-feature"><li><span class="area"><img src="assets/images/icons/area.png" alt="">550 平米</span></li>',
                    '<li><span class="bed"><img src="assets/images/icons/bed.png" alt="">6</span></li>',
                    '<li><span class="bath"><img src="assets/images/icons/bath.png" alt="">4</span></li>',
                    '<li><span class="parking"><img src="assets/images/icons/parking.png" alt="">3</span></li></ul></div>',
                    '<div class="content"><div class="left"><h3 class="title"><a href="single-properties.html">龙城一号别墅</a></h3><span class="location"><img src="assets/images/icons/marker.png" alt="">龙泉驿区南山大道333号附12号</span></div>',
                    '<div class="right"><div class="type-wrap"><span class="price">￥550<span>/月</span></span><span class="type">出租</span></div></div></div></div></div>',
                ].join(''),
            icon: 'assets/images/icons/map-marker-2.png',
            animation: google.maps.Animation.BOUNCE
        },
        {
            lat: 40.718971,
            lon: -74.323219,
            title: 'Azorex de South Villa',
            imageUrl: 'assets/images/property/property-9.jpg',
            address: '668 L 2nd Ave, Boston',
            html: ['<div class="property-item map-property-item"><div class="property-inner"><div class="image"><a href="single-properties.html"><img src="assets/images/property/property-9.jpg" alt=""></a>',
                    '<ul class="property-feature"><li><span class="area"><img src="assets/images/icons/area.png" alt="">550 平米</span></li>',
                    '<li><span class="bed"><img src="assets/images/icons/bed.png" alt="">6</span></li>',
                    '<li><span class="bath"><img src="assets/images/icons/bath.png" alt="">4</span></li>',
                    '<li><span class="parking"><img src="assets/images/icons/parking.png" alt="">3</span></li></ul></div>',
                    '<div class="content"><div class="left"><h3 class="title"><a href="single-properties.html">春天花园别墅</a></h3><span class="location"><img src="assets/images/icons/marker.png" alt="">金牛区琴台西路668号</span></div>',
                    '<div class="right"><div class="type-wrap"><span class="price">￥550<span>/月</span></span><span class="type">出租</span></div></div></div></div></div>',
                ].join(''),
            icon: 'assets/images/icons/map-marker-2.png',
            animation: google.maps.Animation.BOUNCE
        },
        {
            lat: 40.748350,
            lon: -74.323219,
            title: 'Radison de Villa',
            imageUrl: 'assets/images/property/property-10.jpg',
            address: '12 1st Ave, New Yourk',
            html: ['<div class="property-item map-property-item"><div class="property-inner"><div class="image"><a href="single-properties.html"><img src="assets/images/property/property-10.jpg" alt=""></a>',
                    '<ul class="property-feature"><li><span class="area"><img src="assets/images/icons/area.png" alt="">550 平米</span></li>',
                    '<li><span class="bed"><img src="assets/images/icons/bed.png" alt="">6</span></li>',
                    '<li><span class="bath"><img src="assets/images/icons/bath.png" alt="">4</span></li>',
                    '<li><span class="parking"><img src="assets/images/icons/parking.png" alt="">3</span></li></ul></div>',
                    '<div class="content"><div class="left"><h3 class="title"><a href="single-properties.html">万科西山别墅</a></h3><span class="location"><img src="assets/images/icons/marker.png" alt="">高新区蜀都大道12号</span></div>',
                    '<div class="right"><div class="type-wrap"><span class="price">￥550<span>/月</span></span><span class="type">出租</span></div></div></div></div></div>',
                ].join(''),
            icon: 'assets/images/icons/map-marker-2.png',
            animation: google.maps.Animation.BOUNCE
        }


    ];

    new Maplace({
        map_div: '#hero-map',
        controls_div: '.map-property-controls',
        controls_on_map: false,
        controls_type: 'list',
        controls_cssclass: 'map-property-slider',
        view_all: false,
        locations: LocsA,
        map_options: {
            zoom: 13,
            scrollwheel: false,
            stopover: true
        }
    }).Load();

});

}
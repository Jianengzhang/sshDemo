$(function () {
    $.ajax({
        type: "get",
        url: "/district/getProvinces.do",
        dataType: "json",
        success: function (data) {
            var selPro = data.data[0];
            $.each(data.data, function (i, item) {
                var $option = '<option code=' + item.id + ' value=' + item.name + '>' + item.name + '</option>';
                $("#station").append($option);
            });
            // $('#province option[value="' + selPro.name + '"]').attr("selected", "true");
            $('#province option[value="未选"]').attr("selected", "true");
        }
    })
});

$('#province').change(function () {
    var _this = $(this);
    var provinceCode = _this.find('option:selected').attr('code');
    if (undefined != provinceCode) {
        var cityUrl = "/district/getCities.do?provinceId=" + provinceCode;
    } else {
        var cityUrl = "/district/getCities.do?provinceId=0";
    }
    masterAddrC(cityUrl, 'city');
    setTimeout(function () {
        var cityCode = $('#city').find('option').eq(0).attr('code');
        if (cityCode != undefined) {
            var countyUrl = '/district/getCounties.do?cityId=' + cityCode;
        } else {
            var countyUrl = '/district/getCounties.do?cityId=0';
        }
        masterAddrC(countyUrl, 'county');
        setTimeout(function () {
            var countyCode = $('#county').find('option').eq(0).attr('code');
            if (undefined != countyCode) {
                var villageUrl = '/district/getVillages.do?countyId=' + countyCode;
            } else {
                var villageUrl = '/district/getVillages.do?countyId=0';
            }
            masterAddrC(villageUrl, 'village');
            setTimeout(function () {
                $('#province').attr('provinceId', provinceCode);
                $('#city').attr('cityId', $('#city').find().eq(0).attr('code'));
                $('#county').attr('countyId', $('#county').find().eq(0).attr('code'));
                $('#village').attr('villageId', $('#village').find().eq(0).attr('code'));
            }, 300)
        }, 400);
    }, 500);
});
function masterAddrC(url, select) {
    $.ajax({
        url: url,
        success: function (data) {
            $('#' + select).html('');
            var $option = '<option>未选</option>';
            $('#' + select).append($option);
            if (null != data.data) {
                $.each(data.data, function (i, item) {
                    var $option = '<option code=' + item.id + ' value=' + item.name + '>' + item.name + '</option>';
                    $('#' + select).append($option);
                });
            }
        },
        error: function () {
            console.log("fail");
        }
    });
}
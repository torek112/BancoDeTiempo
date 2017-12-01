$(document).ready(function() {
    $("#botonDevolver").on("click", function (e) {
        e.preventDefault();
        var checked = $("input[type=checkbox]:checked");
        var devueltos = [];
        $.each(checked, function (i, value) {
            // console.log(typeof(value));
            // console.log("index", i, "value", value.value);
            devueltos.push(value.value);
        });

        var url = window.location.href;
        console.log("url:", url);
        console.log(checked[0].value);
        console.log(".........");
        console.log(checked.eq(0).attr("name"));
        //console.log(checked[0].attr("name"));
        //console.log(devueltos);
        if (checked.length > 0) {
            var host = window.location.host;
            var name = checked.eq(0).attr("name");
            if (name != null) {
                var idCredito = name.replace("devolverprod", "");
                console.log(idCredito);
                // var csrfParameter = $("meta[name='_csrf_parameter']").attr("content");
                var csrfToken = $("meta[name='_csrf']").attr("content");
                console.log("csrfToken", csrfToken);
                var csrfHeader = $("meta[name='_csrf_header']").attr("content");  // THIS WAS ADDED
                console.log("csrfHeader", csrfHeader);
                //var data = {};
                /*data[csrfParameter] = csrfToken;
                data["devueltos"] = devueltos;
                var headers = {};*/
                // headers[csrfHeader] = csrfToken;
                /*$(document).ajaxSend(function(e, xhr, options) {
                    xhr.setRequestHeader(header, token);
                });*/
                $.ajax({
                    type: "post",
                    beforeSend: function (xhr) {
                        xhr.setRequestHeader(csrfHeader, csrfToken);
                    },
                    url: "/detallePedido/devolver/" + idCredito,
                    data: {devueltos: devueltos},
                    xhrFields: {withCredentials: true},
                    success: function (data) {
                        window.location.replace(url);
                        // console.log("Success ", data);
                    }
                });
            }
        } else {
            // TODO: Mostrar algún tipo de mensaje al usuario
            console.log("ERROR. No hay elementos enviados");
        }
        // console.log("Checked", checked);
    })
});
$(document).ready(function() {
    $("#escrituraProtegidos").on("click", function (e) {
        var checkbox=$("#escrituraProtegidos");
        if (checkbox.is(":checked")){
        	$("#clavePrivada").prop('disabled', false);
        	$("#cuenta").prop('disabled', false);
        	$("#cif").prop('disabled', false);
        }else{
        	$("#clavePrivada").prop('disabled', true);
        	$("#cuenta").prop('disabled', true);
        	$("#cif").prop('disabled', true);
        }
    })
});
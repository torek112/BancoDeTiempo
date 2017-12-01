$(document).ready(function() {

    var $redsysForm = $("form#RedsysForm");
    if ($redsysForm.length != 0) {
        console.log("Existe el formulario");
        $redsysForm.submit();
    } else {
        console.log("No existe");
    }

});
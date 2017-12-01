/** Función para filtrar la fecha */
$.fn.dataTable.ext.search.push(
    function (oSettings, aData, iDataIndex) {
        var iFini = document.getElementById('minFecha').value;
        var iFfin = document.getElementById('maxFecha').value;
        var iStartDateCol = 0;
        var iEndDateCol = 0;

        // iFini = iFini.substring(6, 10) + iFini.substring(3, 5) + iFini.substring(0, 2);
        iFini = iFini.substring(0, 4) + iFini.substring(5,7) + iFini.substring(8,10);
        // iFfin = iFfin.substring(6, 10) + iFfin.substring(3, 5) + iFfin.substring(0, 2);
        iFfin = iFfin.substring(0, 4) + iFfin.substring(5,7) + iFfin.substring(8,10);

        var datofini = aData[iStartDateCol].substring(6, 10) + aData[iStartDateCol].substring(3, 5) + aData[iStartDateCol].substring(0, 2);
        var datoffin = aData[iEndDateCol].substring(6, 10) + aData[iEndDateCol].substring(3, 5) + aData[iEndDateCol].substring(0, 2);


        if (iFini === "" && iFfin === "") {
            return true;
        }
        else if (iFini <= datofini && iFfin === "") {
            return true;
        }
        else if (iFfin >= datoffin && iFini === "") {
            return true;
        }
        else if (iFini <= datofini && iFfin >= datoffin) {
            return true;
        }
        return false;
    }
);

/** Función para filtrar la cantidad total */
$.fn.dataTable.ext.search.push(
    function (oSettings, aData, iDataIndex) {
        var min = parseInt( $('#minTotal').val(), 10 );
        var max = parseInt( $('#maxTotal').val(), 10 );
        var cantidadTotal = parseFloat( aData[3].replace("€","") ) || 0; // use data for the age column

        if ( ( isNaN( min ) && isNaN( max ) ) ||
            ( isNaN( min ) && cantidadTotal <= max ) ||
            ( min <= cantidadTotal && isNaN( max ) ) ||
            ( min <= cantidadTotal && cantidadTotal <= max ) )
        {
            return true;
        }
        return false;
    }
);

/** Función para filtrar el restante */
$.fn.dataTable.ext.search.push(
    function (oSettings, aData, iDataIndex) {
        var min = parseInt( $('#minRest').val(), 10 );
        var max = parseInt( $('#maxRest').val(), 10 );
        var restante = parseFloat( aData[4].replace("€","") ) || 0; // use data for the age column

        if ( ( isNaN( min ) && isNaN( max ) ) ||
            ( isNaN( min ) && restante <= max ) ||
            ( min <= restante && isNaN( max ) ) ||
            ( min <= restante && restante <= max ) )
        {
            return true;
        }
        return false;
    }
);

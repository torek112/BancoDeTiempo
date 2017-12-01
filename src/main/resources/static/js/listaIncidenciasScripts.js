/** Función para filtrar la fecha */
$.fn.dataTable.ext.search.push(
    function (oSettings, aData, iDataIndex) {
        var iFini = document.getElementById('minFechaAp').value;
        var iFfin = document.getElementById('maxFechaAp').value;
        var iStartDateCol = 1;
        var iEndDateCol = 1;

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
/** Función para filtrar la fecha */
$.fn.dataTable.ext.search.push(
    function (oSettings, aData, iDataIndex) {
        var iFini = document.getElementById('minFechaAc').value;
        var iFfin = document.getElementById('maxFechaAc').value;
        var iStartDateCol = 2;
        var iEndDateCol = 2;

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

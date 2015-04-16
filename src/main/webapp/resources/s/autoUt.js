function _autoUtil(){

    this.deleteAuto = function (id) {
        if (confirm("Are you sure?")){
            window.location="/deleteAuto/"+id;
        }
    }
}
var AutoUtil = new _autoUtil();
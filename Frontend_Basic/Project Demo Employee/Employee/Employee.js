
//Bat form Add Employee
function employeeAdd() {
    var add = document.getElementById("addEmployee");
    add.style.visibility = "visible";

    var updateE = document.getElementById("updateEmployee");
    updateE.style.visibility = "hidden";
}

//Bat form update Employee
function saveUpEmployee() {
    var updateE = document.getElementById("updateEmployee");
    updateE.style.visibility = "visible";

    var add = document.getElementById("addEmployee");
    add.style.visibility = "hidden";

    selectRows();
}

//Bat List View
function listViewEmployee() {
    var updateE = document.getElementById("updateEmployee");
    updateE.style.visibility = "hidden";

    var add = document.getElementById("addEmployee");
    add.style.visibility = "hidden";
}

//Tạo biến update
var table = document.getElementById("table-add"), rIndex;
var fullnameU = document.getElementById("upFullname");
var ageU = document.getElementById("upAge");
var genderU = document.getElementById("upGender");
var departU = document.getElementById("upDepartment");
var emailU = document.getElementById("upEmail");
var phoneU = document.getElementById("upPhone");

//Select Row
function selectRows() {
    for (var i = 0; i < table.rows.length; i++) {
        table.rows[i].onclick = function () {
            rIndex = this.rowIndex;
            fullnameU.value = this.cells[1].innerHTML;
            ageU.value = this.cells[2].innerHTML;
            switch (this.cells[3].innerHTML) {
                case 'Male':
                    genderU.selectedIndex = '0';
                    break;
                case 'Female':
                    genderU.selectedIndex = '1';
                    break;
                case 'Unknown':
                    genderU.selectedIndex = '2';
                    break;
            }
            departU.value = this.cells[4].innerHTML;
            emailU.value = this.cells[5].innerHTML;
            phoneU.value = this.cells[6].innerHTML;
        }
    }
}

selectRows();

//Update Row
function updateRows() {
    if (fullnameU.value !== '' && ageU.value !== ''
        && departU.value !== '' && emailU.value !== '' && phoneU.value !== '') {
        if (ageU.value >= 18 && ageU.value <= 70) {
                if (phoneU.value.length >= 9 && phoneU.value.length <= 12) {
                    table.rows[rIndex].cells[1].innerHTML = fullnameU.value;
                    table.rows[rIndex].cells[2].innerHTML = ageU.value;
                    table.rows[rIndex].cells[3].innerHTML = genderU.value;
                    table.rows[rIndex].cells[4].innerHTML = departU.value;
                    table.rows[rIndex].cells[5].innerHTML = emailU.value;
                    table.rows[rIndex].cells[6].innerHTML = phoneU.value;
                } else {
                    alert('Nhap so dien thoai tu 9 - 12 so')
                }
        } else {
            alert('Nhap tuoi tu 18 - 70')
        }
    } else {
        alert('Nhap day du thong tin')
    }
}

//Add Rows
//Tạo biến add
var fullname = document.getElementById("addFullname");
var age = document.getElementById("addAge");
var gender = document.getElementById("addGender");
var depart = document.getElementById("addDepartment");
var email = document.getElementById("addEmail");
var phone = document.getElementById("addPhone");
var icon = document.getElementById("icon-update");

function saveEmployee() {
    if (fullname.value !== '' && age.value !== ''
        && depart.value !== '' && email.value !== '' && phone.value !== '') {
        if (age.value >= 18 && age.value <= 70) {
            if (typeof phoneU.value == 'number') {
                if (phone.value.length >= 9 && phone.value.length <= 12) {
                    var lengthTable = table.rows.length
                    var newData = table.insertRow(lengthTable);

                    var cell0 = newData.insertCell(0);
                    var cell1 = newData.insertCell(1);
                    var cell2 = newData.insertCell(2);
                    var cell3 = newData.insertCell(3);
                    var cell4 = newData.insertCell(4);
                    var cell5 = newData.insertCell(5);
                    var cell6 = newData.insertCell(6);
                    var cell7 = newData.insertCell(7);


                    cell0.innerHTML = lengthTable;
                    cell1.innerHTML = fullname.value;
                    cell2.innerHTML = age.value;
                    cell3.innerHTML = gender.value;
                    cell4.innerHTML = depart.value;
                    cell5.innerHTML = email.value;
                    cell6.innerHTML = phone.value;
                    cell7.innerHTML = `<img id="icon-save" src="icon-save.jpg" alt="icon-save" onclick="saveRow()" style="visibility: hidden;">
                <img id="icon-update"src="icon-update.jpg" alt="icon-update" onclick="updateRow()">
                <img id="icon-delete" src="icon-delete.jpg" alt="icon-delete" onclick="deleteRow(this)">`
                } else {
                    alert('Nhap so dien thoai tu 9 - 12 so')
                }
            } else {
                alert('So dien thoai phai la so')
            }
        } else {
            alert('Nhap tuoi tu 18 - 70')
        }
    } else {
        alert('Nhap day du thong tin')
    }

}
//Delete
function deleteRow(row) {
    var d = row.parentNode.parentNode.rowIndex;
    document.getElementById("table-add").deleteRow(d);
    // update STT
    var lengthTable = table.rows.length
    for (var i = 1; i < lengthTable; i++) {
        table.rows[i].cells[0].innerHTML = i;
    }
}

//Update Row by icon
function updateRow() {
    document.getElementById("icon-save").style.visibility = "visible";

}

//SaveUpdate Row by icon
function saveRow() {
    document.getElementById("icon-save").style.visibility = "hidden";
}




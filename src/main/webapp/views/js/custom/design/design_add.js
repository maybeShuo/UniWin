var allMaterialList = null;

$(document).ready(function(){
    highlightTab('nav-design','nav-design-add');
    $(".input-file").on("change","input[type='file']",function(){
        var filePath=$(this).val();
        var arr=filePath.split('\\');
        var fileName=arr[arr.length-1];
        $(".showFileName").html(fileName);
    });

    $("#material-bind-table > tbody").on("click", "tr", (e) => {
        var $tr = $(e.currentTarget);
        var id = $tr.find(".id").html();
        $tr.find("input").prop("checked", true);
        $("input[name=selected-material-id]").val(id);
        $("#add-material-button").data("item", $tr.data("item"));
    });

    $("#add-material-button").on("click", bindMaterial);


    $("#material-design-table > tbody").on("click", "tr", (e) => {
        var $tr = $(e.currentTarget);
        var id = $tr.find(".id").html();
        $tr.find("input").prop("checked", true);
    });

    $("#add-material").on("click", (e) => {
        var $modal = $("#modal-material-bind");
        $modal.modal("show");
    });
    loadMaterialList();

    var inputDelay = null;

    $("input[name=material-qid]").on("input", (e) => {
        if (inputDelay !== null)
        {
            window.clearTimeout(inputDelay);
            inputDelay = null;
        }
        inputDelay = window.setTimeout(() => {
            filterMaterial();
        }, 500);
    });
    $("input[name=material-qname]").on("input", (e) => {
        if (inputDelay !== null)
        {
            window.clearTimeout(inputDelay);
            inputDelay = null;
        }
        inputDelay = window.setTimeout(() => {
            filterMaterial();
        }, 500);
    });


    $("#remove-material").on("click", (e) => {
        $("#material-design-table > tbody").find("input:checked").parent().parent("tr").remove();
    });


    $("#submit").on("click", () => {
        sendImg().then(res => {
            if (res)
            {
                var imgUrl = res;
                var code = $("#design-code").val();
                var name = $("#design-name").val();
                var description = $("#design-description").val();
                var $trArr = $("#material-design-table > tbody").children("tr");
                var mList = [];
                $.each($trArr, (i, tr) => {
                    var $tr = $(tr);
                    mList.push({
                        id: parseInt($tr.find(".mid").html()),
                        amount: parseInt($tr.find(".amount").html())
                    });
                });
                console.log(mList);

                if (imgUrl && code && name)
                {

                    addDesign({
                        imgUrl,
                        name,
                        code,
                        description,
                        materials: JSON.stringify(mList)
                    });
                }
                else
                {
                    alert("input invaild!");
                }
            }
        });
    });

});

function addDesign(params)
{
    var url = "./";
    postDataByAjax(url, params).then((res) => {
        if (res.result === 1) {
            alert("添加款式成功");
            location.href = "./designlist";
        }
        else
        {
            alert("添加款式失败");
        }
    });
}

function sendImg()
{
    var formdata = new FormData();
    var fileObj = document.getElementById("input-file").files;
    var url = "../../main/uploadPicture";
    formdata.append("file", fileObj[0]);

    return new Promise((resolve, reject) => {
        $.ajax({
            url : url,
            type : 'post',
            data : formdata,
            cache : false,
            contentType : false,
            processData : false,
            dataType : "json",
            success : function(data) {
                resolve(data.data.url);
            }
        });
    });
}

function bindMaterial(e)
{
    var $modal = $("#modal-material-bind");
    var id = $modal.find("input[name=selected-material-id]").val();
    var usage = $modal.find("input[name=material-usage]").val();
    $modal.find("input").val("");
    $modal.modal("hide");

    var $tbody = $("#material-design-table> tbody");
    var item = $("#add-material-button").data("item");
    var $tr = $(`
        <tr>
            <td>
                <input type="radio" name="selected"/>
            </td>
            <td class="mid">${item.id}</td>
            <td>${item.name}</td>
            <td class="amount">${usage}</td>
        </tr>
    `);
    $tbody.append($tr);
}

function loadMaterialList()
{
    var url = "../materials";
    getDataByAjax(url, {
        page: 1,
        num: 10,
        operation: "NORMAL"
    }).then((data) => {
        if (data.result === 1)
        {
            allMaterialList = data.data.list;
            renderMaterialTable(data.data.list);
        }
    });
}

function renderMaterialTable(data)
{
    var list = data;
    var $tbody = $("#material-bind-table > tbody");
    $tbody.children("tr").remove();

    if (list.length > 0) {
        list.forEach((item) => {
            renderMaterialItem(item, $tbody);
        });
    }
}

function renderMaterialItem(item, $tbody)
{
    var $tr = $(`
        <tr>
            <td>
                <input type="radio" name="selected"/>
            </td>
            <td class="id">${item.id}</td>
            <td>${item.number}</td>
            <td>${item.name}</td>
        </tr>
    `);
    $tr.data("item", item);
    $tbody.append($tr);
}

function filterMaterial()
{
    var qid = $("input[name=material-qid]").val();
    var qname = $("input[name=material-qname]").val();
    console.log(typeof qid);
    console.log(allMaterialList);

    var dataList = null;
    if (qid !== "" && qname !== "")
    {
        dataList = allMaterialList.filter((item) => {
            var id = item.id + "";
            return id.includes(qid) && item.name.includes(qname);
        });
        renderMaterialTable(dataList);
    }
    else if (qid === "" && qname !== "")
    {
        dataList = allMaterialList.filter((item) => {
            return item.name.includes(qname);
        });
        renderMaterialTable(dataList);
    }
    else if (qid !== "" && qname === "")
    {
        dataList = allMaterialList.filter((item) => {
            var id = item.id + "";
            return id.includes(qid);
        });
        renderMaterialTable(dataList);
    }
    else
    {
        renderMaterialTable(allMaterialList);
    }
}

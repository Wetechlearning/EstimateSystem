// @fileOverview 社員一覧画面
// @name 社員一覧画面js
// @author　spr
// @version 1

console.log(2222222222);

// displayUpdate(upload_file)　CSV取込
// file : 表示が必要なデータ (HTML要素のID)
function fileUpload(upload_file) {

  if (typeof upload_file === "string") {
    const fileElement = document.getElementById(`${upload_file}`);
    if (fileElement) {
      // 参照ボタン　イベント　ファイル導入
      fileElement.addEventListener("change", function () {
        const file = fileElement.files[0];
        const reader = new FileReader();

        // フイルム　アップロード
        reader.readAsText(file);

        reader.addEventListener("load", function load_file(upload_file) {
          console.log(reader.result);

          // 処理完了 reader(load)イベント削除
          reader.removeEventListener("load", load_file);
        });

      })

    }
    }

}

fileUpload("nmDataPatn_input");
fileUpload("nmDataPatn_3_input");
fileUpload("nmDataPatn_2_input");

// --------- 検索データ表示 ---------

// data-name属性で要素を取得する
function getElementByDataName(element_body, myData, dataName) {

  return element_body.querySelector(`[${dataName}="${myData}"]`);
}

function elementsByDataName(element_body, keyBody, dataName = "") {
  const elements = {};
  for (let key in keyBody) {
    const element = getElementByDataName(element_body, key, dataName);

    if (keyBody.hasOwnProperty(key) && element) {
      elements[key] = element;

      console.log(elements[key]);
    }

  }

  return elements;
}

// ------ 画面更新 ------

// 一つの検索結果を画面に更新
function updateDisplay(data_obj, elements, method = "") {
  console.log(elements)
  console.log(0);

  if (method === "online") {

  }

  if (method === "local") {

    for (let key in elements) {

      if (elements[key].type === "checkbox") {
        elements[key].checked = data_obj[key];
      } else if (elements[key].tagName === "SPAN") {
        elements[key].innerHTML = data_obj[key];
      } else {
        elements[key].value = data_obj[key];
      }


    }

  }

}

// 全ての検索結果を画面上に表示させる
function creatTable(data=[], data_container, method=
                        {method: "", model: {}, keyBody: {}, dataName: ""}) {

  const fragment = document.createDocumentFragment();

    for (let i=0;i < data.length;i++) {
      const element = method.model.cloneNode(true);
      element.removeAttribute("id");
      element.removeAttribute("style");
      element.querySelectorAll('[id]').forEach(el => el.removeAttribute('id'));

      const elementsSaveBody = elementsByDataName(element, method.keyBody, method.dataName);

      updateDisplay(data[i], elementsSaveBody, method.method);

      console.log(i,data[i]);
      console.log(elementsSaveBody);

      fragment.appendChild(element);
    }

  data_container.appendChild(fragment);
  console.log(data_container);
}

// 検索実行ボタン
const btnSearch_input = document.getElementById("btnSearch_input");
// 検索結果表示コンテナ
const shaIn_data_container = document.getElementById("shaIn_data_container");
// 検索結果表示モデル
const tr_model = document.getElementById("shaIn_model");

// 実行ボタン　イベント
function shaInSearchResult() {
  // データコンテナ　初期状態保存
  const shaIn_data_container_def = shaIn_data_container.innerHTML;
  // フッタコンテナ
  const pagination = document.querySelector('.pagination');

  const asyncForm = document.getElementById("async-form");

  btnSearch_input.addEventListener("click", async function (event) {

    // データ
    event.preventDefault();

    const url = asyncForm.getAttribute("action");
    const formData = new FormData(asyncForm);

    // ページ数取得、ページ1データ取得
    try {
      const response = await fetch(url, {
        method: "POST",
        body: formData,
      });

      if (response.ok) {
        const responseData = await response.text();
        const searchResult = JSON.parse(`${responseData}`);

        totalItems =  parseInt(searchResult.count);
        shaInList = searchResult.data;

        totalPages = Math.ceil(totalItems / itemsPerPage);

        console.log(totalPages);
      } else {
        console.error("提交失败");
      }
    } catch (error) {
      console.error("提交失败", error);
    }

    // コンテナ初期化
    shaIn_data_container.innerHTML = shaIn_data_container_def;

    // フッタ初期化
    const pageItems = pagination.querySelectorAll(".page") ?
        pagination.querySelectorAll(".page") : {};
    pageItems.forEach(item => {
      item.parentNode.removeChild(item);
    });

    // データチェック
    if (shaInList && shaInList !== []) {
      creatTable(shaInList, shaIn_data_container,
          {method:"local", model: tr_model, keyBody: shaInModel, dataName: "data-sRmodel"});
      shaIn_data_container.style.display = "table";
    } else {
      // データがない場合　結果表示コンテナ不表示にする
      shaIn_data_container.style.display = "none";
    }

    console.log(shaInList);

    // フッタ
    for (let i = 1; i <= totalPages; i++) {
      const item = document.createElement('span');
      const link = document.createElement('a');
      link.href = `list/search/page?page=${i}`;
      link.innerText = i.toString();

      item.classList.add('page');

      if (i === currentPage) {
        item.classList.add('active');
      }
      item.appendChild(link);
      pagination.appendChild(item);

      // ページ変更
      item.addEventListener("click", async function(event) {
        event.preventDefault();

        const url = event.target.getAttribute("href");

        // 検索データ取得
        try {
          const response = await fetch(url);

          if (response.ok) {
            const responseData = await response.text();
            const searchResult = JSON.parse(`${responseData}`);

            totalItems =  parseInt(searchResult.count);
            shaInList = searchResult.data;

            totalPages = Math.ceil(totalItems / itemsPerPage);
          } else {
            console.error("请求失败");
          }
        } catch (error) {
          console.error("请求失败", error);
        }

        // コンテナ初期化
        shaIn_data_container.innerHTML = shaIn_data_container_def;

        // データチェック
        if (shaInList && shaInList !== []) {
          creatTable(shaInList, shaIn_data_container,
              {method:"local", model: tr_model, keyBody: shaInModel, dataName: "data-sRmodel"});
          shaIn_data_container.style.display = "table";
        } else {
          // データがない場合　結果表示コンテナ不表示にする
          shaIn_data_container.style.display = "none";
        }

      });
    }

  });

}

shaInSearchResult();






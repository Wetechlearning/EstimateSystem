
console.log(2222)

const openModalBtn = document.getElementById('btnSearchBusho_input');

openModalBtn.onclick = function () {

  console.log(1111)

  const url = "list/search";
  let shaInListPage = "";
  try {
    const response = fetch(url, {
      method: "GET",
    });

    if (response.ok) {
      shaInListPage = response;
    } else {
      console.error("失败");
    }
  } catch (error) {
    console.error("失败", error);
  }


  window.open(shaInListPage);
};


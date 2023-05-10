
console.log(2222)

const openModalBtn = document.getElementById('btnSearchBusho_input');

openModalBtn.onclick = async function () {

  const url = "list";
  const headers = new Headers({
    "Content-Type": "text/html"
  });

  let shaInListPage = "";
  try {
    const response = await fetch(url, {
      method: "GET",
      headers: headers
    });

    if (response.ok) {
      console.log(response);
      shaInListPage = await response.text();

      // const newTab = window.open();
      // newTab.document.body.innerHTML = shaInListPage;

      const newWindow = window.open("", "newwin", "width=1200,height=600");
      newWindow.document.write(shaInListPage);

      // ウィンドウに合わせてHTMLコンテンツを等比例で縮小して表示する

      // const contentWidth = newWindow.document.body.scrollWidth;
      // const windowWidth = newWindow.innerWidth;
      // const scale = windowWidth / contentWidth;
      // newWindow.document.body.style.transformOrigin = "top left";
      // newWindow.document.body.style.transform = "scale(" + scale + ")";

    } else {
      console.error("失败");
    }
  } catch (error) {
    console.error("失败", error);
  }

};


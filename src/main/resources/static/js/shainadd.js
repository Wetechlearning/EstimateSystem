
// ------ 検索ポップアップ ------
// windows
const width = 850;
const height = 580;

function openSearchBtn() {
  const openSearchBtn = document.getElementById('btnSearchBusho_input');

  if(openSearchBtn) {
    openSearchBtn.addEventListener("click", async function () {

      const url = "list-popup";
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

          // ポップアップ画面
          const newWindow = window.open("", "", `width=${width},height=${height}`);
          newWindow.document.write(shaInListPage);
          // 主画面がリロードとき、自動的にポップアップ画面も閉じる
          window.addEventListener('beforeunload', function() {
            if (newWindow && !newWindow.closed) {
              newWindow.close();
            }
          });

        } else {
          console.error("失败");
        }
      } catch (error) {
        console.error("失败", error);
      }

    });
  }

}

openSearchBtn();

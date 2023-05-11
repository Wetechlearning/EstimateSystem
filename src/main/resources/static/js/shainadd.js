
console.log(2222)
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

          const newWindow = window.open("", "newwin", "width=1200,height=800");
          newWindow.document.write(shaInListPage);

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

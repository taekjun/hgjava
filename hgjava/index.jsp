<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<table class="table">
	<tr>
		<th>도서코드</th>
		<td><input type="text" id="bcode"></td>
	</tr>
	<tr>
		<th>도서명</th>
		<td><input type="text" id="bname"></td>
	</tr>
	<tr>
		<th>저자</th>
		<td><input type="text" id="bauthor"></td>
	</tr>
	<tr>
		<th>출판사</th>
		<td><input type="text" id="bpress"></td>
	</tr>
	<tr>
		<th>금액</th>
		<td><input type="text" id="bprice"></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<button id="addBtn">저장</button>
			<button id="deleteBtn">선택삭제</button>
		</td>
	</tr>
</table>
<div id="show">
	<table class="table" id="tableList">
		<thead>
			<tr>
				<th><input type="checkbox"></th>
				<th>도서코드</th>
				<th>도서명</th>
				<th>저자</th>
				<th>출판사</th>
				<th>가격</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody id="list">

		</tbody>
	</table>
</div>


<script>

fetch("./data/books.json")
.then(resolve => resolve.json())
.then(result => {
	$(result).each((idx, item, ary) => {
		let delBtn = $('<button>삭제</button>')
		
		$('<tr />').append(
			$('<td><input class="chk" type="checkbox"></td>'),
			$('<td />').text(item.book_code),
			$('<td />').text(item.book_name),
			$('<td />').text(item.author),
			$('<td />').text(item.press),
			$('<td />').text(item.price),
			delBtn
		 ).appendTo($('#tableList tbody'));
		
		//삭제버튼 기능.
		delBtn.on('click', function(e) {
			delBtn.parent().remove();
		})
		//선택삭제버튼 기능.
		$('#deleteBtn').on('click', function(e) {
		$('.chk:checked').parent().parent().remove();
	})
	})
})
.catch(err => console.log(err,"err"));

<!-- 데이터 추가/삭제 -->
// 등록 이벤트(click)
$('#addBtn').on('click', function(e) {
	let bookCode = $('#bcode').val();
	let bname = $('#bname').val();
	let author = $('#bauthor').val();
	let press = $('#bpress').val();
	let price = $('#bprice').val();
	let delBtn = $('<button>삭제</button>')
	
	$('#list').append(
			$('<tr />').append($('<td />').append(
					$('<input class="chk"/>').attr('type', 'checkbox')),
					$('<td />').text(bookCode),
					$('<td />').text(bname),
					$('<td />').text(author),
					$('<td />').text(press),
					$('<td />').text(price)).append(delBtn));
			
	$('#bcode').val('');
	$('#bname').val('');
	$('#bauthor').val('');
	$('#bpress').val('');
	$('#bprice').val('');
	
	//삭제버튼 기능.
	delBtn.on('click', function(e) {
		delBtn.parent().remove();
	})
	
	//선택삭제버튼 기능.
	$('#deleteBtn').on('click', function(e) {
		$('.chk:checked').parent().parent().remove();
	})
});




//체크박스 change 이벤트.
$('thead input[type="checkbox"]').on('change', function(e) {
	let trueOrFalse = $(this).prop('checked');
	$('tbody input[type="checkbox"]').prop('checked', trueOrFalse);

})
<!-- end 데이터 추가/삭제 -->
</script>
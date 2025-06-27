function limitarDigitos(input, maxLength) {
	const $input = $(input); // converte o DOM em jQuery

	// Remove mensagens de erro anteriores, se existirem
	$input.siblings('.erroMesage').remove();

	if ($input.val().trim().length > maxLength) {
		$input.addClass('invalidInput');
		erroMesage($input);
	} else {
		$input.removeClass('invalidInput');
	}
}

$('#ano').on('blur', limitarDigitosAno);

function limitarDigitosAno() {
	const input = $(this);
	const value = input.val(); // Correção aqui

	input.siblings('.erroMesage').remove(); // Remove mensagens antigas

	if (value.length !== 4) {
		input.addClass('invalidInput');
		erroMesage(input);
	} else {
		input.removeClass('invalidInput');
	}
}

function erroMesage($input) {
	const inputName = $input.attr('name');

	switch (inputName) {
		case "orgcodigo":
			$input.after('<span class="erroMesage">* Código do órgão pode ter no máximo 5 dígitos.</span>');
			break;
		case "folcod":
			$input.after('<span class="erroMesage">* Código da folha pode ter no máximo 3 dígitos.</span>');
			break;
		case "hdranoref":
			$input.after('<span class="erroMesage">* Ano de referência precisa ter 4 dígitos.</span>');
			break;
		case "hdrtipopag":
			$input.after('<span class="erroMesage">* Tipo de pagamento não pode ter mais de 2 digitos.</span>');
			break;
		case "hdrdespag":
			$input.after('<span class="erroMesage">* Descrição do pagamento não pode ter mais de 20 caracteres.</span>');
			break;
		case "hdrqtdcred":
			$input.after('<span class="erroMesage">* Quantidade de registros não pode ter mais de 6 digitos.</span>');
			break;

		// adicione outros casos conforme necessário
	}
}

$(document).ready(function() {

	$('.monetario').mask('#.##0,00', { reverse: true });

	$('.monetario').on('input change blur', function() {
		validarQtdDigitosAntesVirgula(this);
	});

	$('form input, form select, form').on('focus', function() {
		$('.erro').fadeOut('slow'); // ou .remove() se quiser sumir completamente
	});

});

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
	//validarFormulario();
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
	//validarFormulario();
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
		case "lcomatrgdf":
			$input.after('<span class="erroMesage">* Matrícula do servidor precisa ter 8 dígitos.</span>');
			break;
		case "lconomserv":
			$input.after('<span class="erroMesage">* Nome do servidor pode ter até 37 caracteres.</span>');
			break;
		case "lcovlrcred":
			$input.after('<span class="erroMesage">* Valor do pagamento a ser creditado pode ter até 8 dígitos antes da vírgula.</span>');
			break;
		case "lcoageconta":
			$input.after('<span class="erroMesage">* Agência da conta pode ter até 3 dígitos.</span>');
			break;
		case "lcoconta":
			$input.after('<span class="erroMesage">* Número da conta corrente pode ter até 6 dígitos.</span>');
			break;
		case "lcodgvconta":
			$input.after('<span class="erroMesage">* Dígito da conta pode ter apenas 1 caracter.</span>');
			break;
		case "tpgtpconta":
			$input.after('<span class="erroMesage">* O tipo da conta corrente pode ter apenas 1 dígito.</span>');
			break;
		case "lcobancopag":
			$input.after('<span class="erroMesage">* Banco de pagamento pode ter até 3 dígitos.</span>');
			break;
		case "lcoagepag":
			$input.after('<span class="erroMesage">* Agência de pagamento pode ter até 4 dígitos.</span>');
			break;
		case "lcoufebanco":
			$input.after('<span class="erroMesage">* UF da agência de pagamento pode ter até 2 dígitos.</span>');
			break;
		case "lcocpf":
			$input.after('<span class="erroMesage">* CPF inválido.</span>');
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
		case "trlvlrcred":
			$input.after('<span class="erroMesage">* Valor total dos créditos não pode ter mais de 12 dígitos antes digitos antes da vírgula.</span>');
			break;
		case "hdrvlrcred":
			$input.after('<span class="erroMesage">* Valor total dos créditos não pode ter mais de 12 dígitos antes digitos antes da vírgula.</span>');
			break;

		// adicione outros casos conforme necessário
	}
}

function validarQtdDigitosAntesVirgula(input) {
	const $input = $(input);
	const valor = $input.val();

	// Remove separador de milhar e extrai parte inteira
	const parteInteira = valor.split(',')[0].replace(/\./g, '');

	if (parteInteira.length > 12) {
		$input.addClass('invalidInput');

		// Remove mensagem anterior se já existir
		$input.siblings('.erroMesage').remove();

		erroMesage($input);
	}
}


function removerCaracteresEspeciais(input) {
	const $input = $(input);
	let valor = $input.val();

	// Mantém apenas letras, números e espaços
	valor = valor.replace(/[^a-zA-Z0-9À-ÿ\s]/g, '');

	$input.val(valor);
}


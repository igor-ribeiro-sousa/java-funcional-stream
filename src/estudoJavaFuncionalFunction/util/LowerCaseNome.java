package estudoJavaFuncionalFunction.util;

import java.util.function.Function;

import estudoJavaFuncionalFunction.entidade.Produto;

public class LowerCaseNome implements Function<Produto, String>{

	@Override
	public String apply(Produto p) {
		return p.getNome().toLowerCase();
	}

}

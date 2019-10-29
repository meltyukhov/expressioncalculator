package com.bodick;

import com.bodick.lexemes.*;
import com.bodick.lexemes.Number;

public interface Visitor {
    public void forNumber(Number number);

    public void forOperator(Operator operator);

    public void forOpeningBracket(OpeningBracket bracket);

    public void forClosingBracket(ClosingBracket bracket);

    public void forFinalize(Finalize finalize);
}

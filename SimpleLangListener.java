// Generated from src/main/grammar/SimpleLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleLangParser}.
 */
public interface SimpleLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(SimpleLangParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(SimpleLangParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(SimpleLangParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(SimpleLangParser.GenericSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(SimpleLangParser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(SimpleLangParser.GenericAssocListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(SimpleLangParser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(SimpleLangParser.GenericAssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(SimpleLangParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(SimpleLangParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(SimpleLangParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(SimpleLangParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(SimpleLangParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(SimpleLangParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(SimpleLangParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(SimpleLangParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(SimpleLangParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(SimpleLangParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(SimpleLangParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(SimpleLangParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(SimpleLangParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(SimpleLangParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(SimpleLangParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(SimpleLangParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(SimpleLangParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(SimpleLangParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(SimpleLangParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(SimpleLangParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(SimpleLangParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(SimpleLangParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(SimpleLangParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(SimpleLangParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(SimpleLangParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(SimpleLangParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(SimpleLangParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(SimpleLangParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(SimpleLangParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(SimpleLangParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(SimpleLangParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(SimpleLangParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(SimpleLangParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(SimpleLangParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(SimpleLangParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(SimpleLangParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimpleLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimpleLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(SimpleLangParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(SimpleLangParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SimpleLangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SimpleLangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(SimpleLangParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(SimpleLangParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(SimpleLangParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(SimpleLangParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(SimpleLangParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(SimpleLangParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(SimpleLangParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(SimpleLangParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(SimpleLangParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(SimpleLangParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(SimpleLangParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(SimpleLangParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(SimpleLangParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(SimpleLangParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(SimpleLangParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(SimpleLangParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(SimpleLangParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(SimpleLangParser.StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(SimpleLangParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(SimpleLangParser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(SimpleLangParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(SimpleLangParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(SimpleLangParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(SimpleLangParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(SimpleLangParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(SimpleLangParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(SimpleLangParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(SimpleLangParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(SimpleLangParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(SimpleLangParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(SimpleLangParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(SimpleLangParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(SimpleLangParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(SimpleLangParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(SimpleLangParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(SimpleLangParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(SimpleLangParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(SimpleLangParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(SimpleLangParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(SimpleLangParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(SimpleLangParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(SimpleLangParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(SimpleLangParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(SimpleLangParser.AlignmentSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(SimpleLangParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(SimpleLangParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(SimpleLangParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(SimpleLangParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#vcSpecificModifer}.
	 * @param ctx the parse tree
	 */
	void enterVcSpecificModifer(SimpleLangParser.VcSpecificModiferContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#vcSpecificModifer}.
	 * @param ctx the parse tree
	 */
	void exitVcSpecificModifer(SimpleLangParser.VcSpecificModiferContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(SimpleLangParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(SimpleLangParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(SimpleLangParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(SimpleLangParser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(SimpleLangParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(SimpleLangParser.GccAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(SimpleLangParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(SimpleLangParser.GccAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(SimpleLangParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(SimpleLangParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(SimpleLangParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(SimpleLangParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(SimpleLangParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(SimpleLangParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(SimpleLangParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(SimpleLangParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(SimpleLangParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(SimpleLangParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(SimpleLangParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(SimpleLangParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(SimpleLangParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(SimpleLangParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(SimpleLangParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(SimpleLangParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(SimpleLangParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(SimpleLangParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(SimpleLangParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(SimpleLangParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(SimpleLangParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(SimpleLangParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(SimpleLangParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(SimpleLangParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(SimpleLangParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(SimpleLangParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(SimpleLangParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(SimpleLangParser.DesignatorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(SimpleLangParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(SimpleLangParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(SimpleLangParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(SimpleLangParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(SimpleLangParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(SimpleLangParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(SimpleLangParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(SimpleLangParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(SimpleLangParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(SimpleLangParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(SimpleLangParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(SimpleLangParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(SimpleLangParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(SimpleLangParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(SimpleLangParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(SimpleLangParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(SimpleLangParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(SimpleLangParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(SimpleLangParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(SimpleLangParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(SimpleLangParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(SimpleLangParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(SimpleLangParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(SimpleLangParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(SimpleLangParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(SimpleLangParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(SimpleLangParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(SimpleLangParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(SimpleLangParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(SimpleLangParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(SimpleLangParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(SimpleLangParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(SimpleLangParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(SimpleLangParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(SimpleLangParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(SimpleLangParser.DeclarationListContext ctx);
}
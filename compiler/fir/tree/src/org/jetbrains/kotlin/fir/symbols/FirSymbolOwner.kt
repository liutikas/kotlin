/*
 * Copyright 2010-2018 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.symbols

import org.jetbrains.kotlin.fir.declarations.FirNamedDeclaration

interface FirSymbolOwner<E> where E : FirNamedDeclaration, E : FirSymbolOwner<E> {
    val symbol: FirBasedSymbol<E>
}
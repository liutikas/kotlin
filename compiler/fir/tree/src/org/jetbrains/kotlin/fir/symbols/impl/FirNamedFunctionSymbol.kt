/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.symbols.impl

import org.jetbrains.kotlin.fir.declarations.FirNamedFunction
import org.jetbrains.kotlin.fir.symbols.CallableId
import org.jetbrains.kotlin.fir.types.ConeKotlinType

class FirNamedFunctionSymbol(
    override val callableId: CallableId,
    val isFakeOverride: Boolean = false,
    // Actual for fake override only
    val overriddenSymbol: FirNamedFunctionSymbol? = null
) : FirFunctionSymbol<FirNamedFunction>() {
    override val parameters: List<ConeKotlinType>
        get() = emptyList()
}

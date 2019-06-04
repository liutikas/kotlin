/*
 * Copyright 2000-2018 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.types.impl

import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.expressions.FirAnnotationCall
import org.jetbrains.kotlin.fir.types.ConeKotlinErrorType
import org.jetbrains.kotlin.fir.types.ConeKotlinType
import org.jetbrains.kotlin.fir.types.FirErrorTypeRef

class FirErrorTypeRefImpl(
    session: FirSession,
    psi: PsiElement?,
    override val reason: String
) : FirErrorTypeRef(session, psi) {
    override val annotations = mutableListOf<FirAnnotationCall>()

    override val type: ConeKotlinType = ConeKotlinErrorType(reason)
}
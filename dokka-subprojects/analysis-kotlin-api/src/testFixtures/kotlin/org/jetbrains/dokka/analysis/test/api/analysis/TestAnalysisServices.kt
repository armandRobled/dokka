/*
 * Copyright 2014-2023 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package org.jetbrains.dokka.analysis.test.api.analysis

import org.jetbrains.dokka.analysis.kotlin.KotlinAnalysisPlugin
import org.jetbrains.dokka.analysis.kotlin.internal.ModuleAndPackageDocumentationReader
import org.jetbrains.dokka.analysis.kotlin.internal.SampleProviderFactory

/**
 * Services exposed in [KotlinAnalysisPlugin] that are ready to be used.
 *
 * This class exists purely for convenience and to reduce boilerplate in tests.
 * It is analogous to calling `context.plugin<KotlinAnalysisPlugin>().querySingle { serviceName }`.
 */
class TestAnalysisServices(
    val sampleProviderFactory: SampleProviderFactory,
    val moduleAndPackageDocumentationReader: ModuleAndPackageDocumentationReader
)
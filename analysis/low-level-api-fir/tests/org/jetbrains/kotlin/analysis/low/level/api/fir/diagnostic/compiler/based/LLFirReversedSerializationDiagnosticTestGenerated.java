/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir.diagnostic.compiler.based;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
public class LLFirReversedSerializationDiagnosticTestGenerated extends AbstractLLFirReversedSerializationDiagnosticTest {
  @Nested
  @TestMetadata("plugins/kotlinx-serialization/testData/diagnostics")
  @TestDataPath("$PROJECT_ROOT")
  public class Diagnostics {
    @Test
    @TestMetadata("abstractCustomSerializer.kt")
    public void testAbstractCustomSerializer() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/abstractCustomSerializer.kt");
    }

    @Test
    public void testAllFilesPresentInDiagnostics() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/kotlinx-serialization/testData/diagnostics"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), true);
    }

    @Test
    @TestMetadata("companionObjectSerializers.kt")
    public void testCompanionObjectSerializers() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/companionObjectSerializers.kt");
    }

    @Test
    @TestMetadata("customSerializers.kt")
    public void testCustomSerializers() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/customSerializers.kt");
    }

    @Test
    @TestMetadata("DuplicateSerialName.kt")
    public void testDuplicateSerialName() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/DuplicateSerialName.kt");
    }

    @Test
    @TestMetadata("EnumDuplicateSerialName.kt")
    public void testEnumDuplicateSerialName() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/EnumDuplicateSerialName.kt");
    }

    @Test
    @TestMetadata("externalSerialierJava.kt")
    public void testExternalSerialierJava() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/externalSerialierJava.kt");
    }

    @Test
    @TestMetadata("ExternalSerializers.kt")
    public void testExternalSerializers() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/ExternalSerializers.kt");
    }

    @Test
    @TestMetadata("GeneratedSerializerInaccessible.kt")
    public void testGeneratedSerializerInaccessible() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/GeneratedSerializerInaccessible.kt");
    }

    @Test
    @TestMetadata("GenericArrays.kt")
    public void testGenericArrays() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/GenericArrays.kt");
    }

    @Test
    @TestMetadata("IncorrectTransient.kt")
    public void testIncorrectTransient() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/IncorrectTransient.kt");
    }

    @Test
    @TestMetadata("IncorrectTransient2.kt")
    public void testIncorrectTransient2() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/IncorrectTransient2.kt");
    }

    @Test
    @TestMetadata("InheritableInfo.kt")
    public void testInheritableInfo() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/InheritableInfo.kt");
    }

    @Test
    @TestMetadata("JsonRedundantFormat.kt")
    public void testJsonRedundantFormat() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/JsonRedundantFormat.kt");
    }

    @Test
    @TestMetadata("JsonRedundantFormatViaAliasedImport.kt")
    public void testJsonRedundantFormatViaAliasedImport() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/JsonRedundantFormatViaAliasedImport.kt");
    }

    @Test
    @TestMetadata("JsonRedundantFormatViaTypeAlias.kt")
    public void testJsonRedundantFormatViaTypeAlias() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/JsonRedundantFormatViaTypeAlias.kt");
    }

    @Test
    @TestMetadata("KeepGeneratedSerializerDiagnostic.kt")
    public void testKeepGeneratedSerializerDiagnostic() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/KeepGeneratedSerializerDiagnostic.kt");
    }

    @Test
    @TestMetadata("LazyRecursionBug.kt")
    public void testLazyRecursionBug() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/LazyRecursionBug.kt");
    }

    @Test
    @TestMetadata("LocalAndAnonymous.kt")
    public void testLocalAndAnonymous() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/LocalAndAnonymous.kt");
    }

    @Test
    @TestMetadata("metaSerializableNested.kt")
    public void testMetaSerializableNested() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/metaSerializableNested.kt");
    }

    @Test
    @TestMetadata("NoSuitableCtorInParent.kt")
    public void testNoSuitableCtorInParent() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/NoSuitableCtorInParent.kt");
    }

    @Test
    @TestMetadata("NonSerializable.kt")
    public void testNonSerializable() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/NonSerializable.kt");
    }

    @Test
    @TestMetadata("NullabilityIncompatible.kt")
    public void testNullabilityIncompatible() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/NullabilityIncompatible.kt");
    }

    @Test
    @TestMetadata("ParamIsNotProperty.kt")
    public void testParamIsNotProperty() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/ParamIsNotProperty.kt");
    }

    @Test
    @TestMetadata("ParametrizedExternalSerializers.kt")
    public void testParametrizedExternalSerializers() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/ParametrizedExternalSerializers.kt");
    }

    @Test
    @TestMetadata("repeatableSerialInfo.kt")
    public void testRepeatableSerialInfo() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/repeatableSerialInfo.kt");
    }

    @Test
    @TestMetadata("serializableCompanionOfSerializable.kt")
    public void testSerializableCompanionOfSerializable() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/serializableCompanionOfSerializable.kt");
    }

    @Test
    @TestMetadata("SerializableEnums.kt")
    public void testSerializableEnums() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/SerializableEnums.kt");
    }

    @Test
    @TestMetadata("SerializableIgnored.kt")
    public void testSerializableIgnored() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/SerializableIgnored.kt");
    }

    @Test
    @TestMetadata("serializerFromOtherModule.kt")
    public void testSerializerFromOtherModule() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/serializerFromOtherModule.kt");
    }

    @Test
    @TestMetadata("SerializerTypeCompatibleForSpecials.kt")
    public void testSerializerTypeCompatibleForSpecials() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/SerializerTypeCompatibleForSpecials.kt");
    }

    @Test
    @TestMetadata("SerializerTypeIncompatible.kt")
    public void testSerializerTypeIncompatible() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/SerializerTypeIncompatible.kt");
    }

    @Test
    @TestMetadata("SerializerTypeIncompatibleViaTypealias.kt")
    public void testSerializerTypeIncompatibleViaTypealias() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/SerializerTypeIncompatibleViaTypealias.kt");
    }

    @Test
    @TestMetadata("Transients.kt")
    public void testTransients() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/Transients.kt");
    }

    @Test
    @TestMetadata("typeAliases.kt")
    public void testTypeAliases() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/typeAliases.kt");
    }

    @Test
    @TestMetadata("typeAliasesCustomized.kt")
    public void testTypeAliasesCustomized() {
      runTest("plugins/kotlinx-serialization/testData/diagnostics/typeAliasesCustomized.kt");
    }
  }

  @Nested
  @TestMetadata("plugins/kotlinx-serialization/testData/firMembers")
  @TestDataPath("$PROJECT_ROOT")
  public class FirMembers {
    @Test
    @TestMetadata("abstractAndSealed.kt")
    public void testAbstractAndSealed() {
      runTest("plugins/kotlinx-serialization/testData/firMembers/abstractAndSealed.kt");
    }

    @Test
    public void testAllFilesPresentInFirMembers() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/kotlinx-serialization/testData/firMembers"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("classWithCompanionObject.kt")
    public void testClassWithCompanionObject() {
      runTest("plugins/kotlinx-serialization/testData/firMembers/classWithCompanionObject.kt");
    }

    @Test
    @TestMetadata("classWithGenericParameters.kt")
    public void testClassWithGenericParameters() {
      runTest("plugins/kotlinx-serialization/testData/firMembers/classWithGenericParameters.kt");
    }

    @Test
    @TestMetadata("defaultProperties.kt")
    public void testDefaultProperties() {
      runTest("plugins/kotlinx-serialization/testData/firMembers/defaultProperties.kt");
    }

    @Test
    @TestMetadata("enums.kt")
    public void testEnums() {
      runTest("plugins/kotlinx-serialization/testData/firMembers/enums.kt");
    }

    @Test
    @TestMetadata("externalSerializers.kt")
    public void testExternalSerializers() {
      runTest("plugins/kotlinx-serialization/testData/firMembers/externalSerializers.kt");
    }

    @Test
    @TestMetadata("inlineClasses.kt")
    public void testInlineClasses() {
      runTest("plugins/kotlinx-serialization/testData/firMembers/inlineClasses.kt");
    }

    @Test
    @TestMetadata("metaSerializable.kt")
    public void testMetaSerializable() {
      runTest("plugins/kotlinx-serialization/testData/firMembers/metaSerializable.kt");
    }

    @Test
    @TestMetadata("multipleProperties.kt")
    public void testMultipleProperties() {
      runTest("plugins/kotlinx-serialization/testData/firMembers/multipleProperties.kt");
    }

    @Test
    @TestMetadata("privatePropertiesSerialization.kt")
    public void testPrivatePropertiesSerialization() {
      runTest("plugins/kotlinx-serialization/testData/firMembers/privatePropertiesSerialization.kt");
    }

    @Test
    @TestMetadata("serializableObject.kt")
    public void testSerializableObject() {
      runTest("plugins/kotlinx-serialization/testData/firMembers/serializableObject.kt");
    }

    @Test
    @TestMetadata("serializableWith.kt")
    public void testSerializableWith() {
      runTest("plugins/kotlinx-serialization/testData/firMembers/serializableWith.kt");
    }

    @Test
    @TestMetadata("serializableWithCompanion.kt")
    public void testSerializableWithCompanion() {
      runTest("plugins/kotlinx-serialization/testData/firMembers/serializableWithCompanion.kt");
    }

    @Test
    @TestMetadata("serializerInLocalClass.kt")
    public void testSerializerInLocalClass() {
      runTest("plugins/kotlinx-serialization/testData/firMembers/serializerInLocalClass.kt");
    }

    @Test
    @TestMetadata("serializerViaCompanion.kt")
    public void testSerializerViaCompanion() {
      runTest("plugins/kotlinx-serialization/testData/firMembers/serializerViaCompanion.kt");
    }
  }
}

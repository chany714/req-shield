/*
 *  Copyright 2024 LY Corporation
 *
 *  LY Corporation licenses this file to you under the Apache License,
 *  version 2.0 (the "License"); you may not use this file except in compliance
 *  with the License. You may obtain a copy of the License at:
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  License for the specific language governing permissions and limitations
 *  under the License.
 */

package com.linecorp.cse.reqshield.spring.webflux.annotation

import com.linecorp.cse.reqshield.reactor.config.ReqShieldWorkMode
import com.linecorp.cse.reqshield.support.constant.ConfigValues.MAX_ATTEMPT_GET_CACHE
import java.lang.annotation.Inherited

@Target(AnnotationTarget.FUNCTION, AnnotationTarget.ANNOTATION_CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Inherited
annotation class ReqShieldCacheable(
    val cacheName: String,
    val key: String = "",
    val isLocalLock: Boolean = true,
    val lockTimeoutMillis: Long = 3000,
    val decisionForUpdate: Int = 90,
    val maxAttemptGetCache: Int = MAX_ATTEMPT_GET_CACHE,
    val timeToLiveMillis: Long = 10 * 60 * 1000,
    val reqShieldWorkMode: ReqShieldWorkMode = ReqShieldWorkMode.CREATE_AND_UPDATE_CACHE,
)

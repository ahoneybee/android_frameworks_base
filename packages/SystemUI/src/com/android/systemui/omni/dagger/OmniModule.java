/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.systemui.omni.dagger;

import android.app.Service;

import com.android.systemui.omni.OmniSettingsService;
import com.android.systemui.omni.OmniSettingsServiceImpl;
import com.android.systemui.omni.SplitScreenService;
import com.android.systemui.omni.OmniSystemUIService;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module
public interface OmniModule {
    /** */
    @Binds
    OmniSettingsService provideOmniSettingsService(OmniSettingsServiceImpl impl);

    /** */
    @Binds
    @IntoMap
    @ClassKey(SplitScreenService.class)
    public abstract Service bindSplitScreenService(SplitScreenService service);
    
    /** */
    @Binds
    @IntoMap
    @ClassKey(OmniSystemUIService.class)
    public abstract Service bindOmniSystemUIService(OmniSystemUIService service);
}

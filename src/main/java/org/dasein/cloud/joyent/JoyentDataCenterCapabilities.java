/**
 * Copyright (C) 2009-2014 Dell, Inc
 * See annotations for authorship information
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */

package org.dasein.cloud.joyent;

import org.dasein.cloud.AbstractCapabilities;
import org.dasein.cloud.dc.DataCenterCapabilities;

import javax.annotation.Nonnull;
import java.util.Locale;

/**
 * User: daniellemayne
 * Date: 04/07/2014
 * Time: 16:30
 */
public class JoyentDataCenterCapabilities extends AbstractCapabilities<SmartDataCenter> implements DataCenterCapabilities {
    public JoyentDataCenterCapabilities(@Nonnull SmartDataCenter provider) {
        super(provider);
    }
    @Override
    public String getProviderTermForDataCenter(Locale locale) {
        return "dc zone";
    }

    @Override
    public String getProviderTermForRegion(Locale locale) {
        return "datacenter";
    }

    @Override
    public boolean supportsAffinityGroups() {
        return false;
    }

    @Override
    public boolean supportsResourcePools() {
        return false;
    }

    @Override
    public boolean supportsStoragePools() {
        return false;
    }

    @Override
    public boolean supportsFolders() {
        return false;
    }
}

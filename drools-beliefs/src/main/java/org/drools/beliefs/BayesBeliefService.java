/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.drools.beliefs;

import org.drools.beliefs.bayes.BayesBeliefSystem;
import org.drools.core.common.NamedEntryPoint;
import org.drools.core.common.TruthMaintenanceSystem;
import org.kie.internal.runtime.beliefs.KieBeliefService;

public class BayesBeliefService implements KieBeliefService {
    private int index;

    @Override
    public String getBeliefType() {
        return "Bayesian";
    }

    @Override
    public Class getServiceInterface() {
        return null;
    }

    public Object createBeliefSystem(Object ep,
                                     Object tms) {
        return new BayesBeliefSystem( (NamedEntryPoint)ep, (TruthMaintenanceSystem)tms);
    }

}
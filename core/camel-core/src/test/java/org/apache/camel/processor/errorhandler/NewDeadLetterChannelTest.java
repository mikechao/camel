/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.processor.errorhandler;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.errorhandler.DeadLetterChannelDefinition;
import org.junit.jupiter.api.Test;

@Deprecated
public class NewDeadLetterChannelTest extends ContextTestSupport {

    @Test
    public void testNewDeadLetterChannel() throws Exception {
        getMockEndpoint("mock:dead").expectedMessageCount(1);

        template.sendBody("direct:start", "Hello World");

        assertMockEndpointsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                DeadLetterChannelDefinition dlc = new DeadLetterChannelDefinition();
                dlc.setDeadLetterUri("mock:dead");

                errorHandler(dlc);

                from("direct:start")
                        .throwException(new IllegalArgumentException("Forced"));
            }
        };
    }
}

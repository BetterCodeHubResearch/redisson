/**
 * Copyright 2014 Nikita Koksharov, Nickolay Borbit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.redisson.client;

import org.redisson.client.protocol.pubsub.PubSubStatusMessage.Type;

public class BaseRedisPubSubListener<V> implements RedisPubSubListener<V> {

    @Override
    public void onStatus(Type type, String channel) {
    }

    @Override
    public void onMessage(String channel, V message) {
    }

    @Override
    public void onPatternMessage(String pattern, String channel, V message) {
    }

}

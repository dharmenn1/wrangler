/*
 * Copyright © 2024 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package io.cdap.wrangler.api;

import io.cdap.cdap.api.data.schema.Schema;

import java.io.Serializable;
import java.util.List;

/**
 * Response after executing directives remotely
 * Please make sure all fields are registered with {@link io.cdap.wrangler.utils.KryoSerializer}
 */
public class RemoteDirectiveResponse implements Serializable {
    private final List<Row> rows;
    private final Schema outputSchema;

    /**
     * Only used by {@link io.cdap.wrangler.utils.KryoSerializer}
    **/
    private RemoteDirectiveResponse() {
        this(null, null);
    }

    public RemoteDirectiveResponse(List<Row> rows, Schema outputSchema) {
        this.rows = rows;
        this.outputSchema = outputSchema;
    }

    public List<Row> getRows() {
        return rows;
    }

    public Schema getOutputSchema() {
        return outputSchema;
    }
}

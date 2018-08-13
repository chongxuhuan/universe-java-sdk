/*
 * Copyright 2018 Seven Seals Technology
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yuanben.model.http;

import com.google.gson.annotations.SerializedName;
import com.yuanben.util.GsonUtil;

/**
 * <p>原本链node节点返回的transaction封装</p>
 */
public class Transaction {
    @SerializedName(value = "block_hash")
    private String blockHash;
    @SerializedName(value = "block_height")
    private Long blockHeight;
    @SerializedName(value = "data_height")
    private Long dataHeight;
    private String sender;
    private Long time;

    public String getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }

    public Long getBlockHeight() {
        return blockHeight;
    }

    public void setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
    }

    public Long getDataHeight() {
        return dataHeight;
    }

    public void setDataHeight(Long dataHeight) {
        this.dataHeight = dataHeight;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String toJson() {
        return GsonUtil.getInstance().toJson(this);
    }
}

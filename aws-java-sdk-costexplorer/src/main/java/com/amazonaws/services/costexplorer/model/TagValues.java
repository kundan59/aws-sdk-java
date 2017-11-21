/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The values that are available for a tag.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/TagValues" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagValues implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key for a tag.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The specific value of a tag.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The key for a tag.
     * </p>
     * 
     * @param key
     *        The key for a tag.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key for a tag.
     * </p>
     * 
     * @return The key for a tag.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key for a tag.
     * </p>
     * 
     * @param key
     *        The key for a tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagValues withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The specific value of a tag.
     * </p>
     * 
     * @return The specific value of a tag.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The specific value of a tag.
     * </p>
     * 
     * @param values
     *        The specific value of a tag.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The specific value of a tag.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The specific value of a tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagValues withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The specific value of a tag.
     * </p>
     * 
     * @param values
     *        The specific value of a tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagValues withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagValues == false)
            return false;
        TagValues other = (TagValues) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public TagValues clone() {
        try {
            return (TagValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.TagValuesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

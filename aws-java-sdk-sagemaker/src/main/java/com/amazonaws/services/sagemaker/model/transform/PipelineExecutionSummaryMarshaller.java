/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PipelineExecutionSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PipelineExecutionSummaryMarshaller {

    private static final MarshallingInfo<String> PIPELINEEXECUTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PipelineExecutionArn").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> PIPELINEEXECUTIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PipelineExecutionStatus").build();
    private static final MarshallingInfo<String> PIPELINEEXECUTIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PipelineExecutionDescription").build();
    private static final MarshallingInfo<String> PIPELINEEXECUTIONDISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PipelineExecutionDisplayName").build();

    private static final PipelineExecutionSummaryMarshaller instance = new PipelineExecutionSummaryMarshaller();

    public static PipelineExecutionSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PipelineExecutionSummary pipelineExecutionSummary, ProtocolMarshaller protocolMarshaller) {

        if (pipelineExecutionSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pipelineExecutionSummary.getPipelineExecutionArn(), PIPELINEEXECUTIONARN_BINDING);
            protocolMarshaller.marshall(pipelineExecutionSummary.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(pipelineExecutionSummary.getPipelineExecutionStatus(), PIPELINEEXECUTIONSTATUS_BINDING);
            protocolMarshaller.marshall(pipelineExecutionSummary.getPipelineExecutionDescription(), PIPELINEEXECUTIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(pipelineExecutionSummary.getPipelineExecutionDisplayName(), PIPELINEEXECUTIONDISPLAYNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

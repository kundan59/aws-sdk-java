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
package com.amazonaws.services.autoscaling.model;

import javax.annotation.Generated;

/**
 * <p>
 * You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling groups, launch
 * configurations, or lifecycle hooks). For more information, see <a
 * href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_DescribeAccountLimits.html"
 * >DescribeAccountLimits</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LimitExceededException extends com.amazonaws.services.autoscaling.model.AmazonAutoScalingException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new LimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public LimitExceededException(String message) {
        super(message);
    }

}

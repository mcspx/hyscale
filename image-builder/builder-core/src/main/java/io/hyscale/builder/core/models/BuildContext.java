/**
 * Copyright 2019 Pramati Prism, Inc.
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
package io.hyscale.builder.core.models;

import java.util.Map;

import io.hyscale.commons.models.DockerfileEntity;
import io.hyscale.commons.models.ImageRegistry;

public class BuildContext {

	private DockerfileEntity dockerfileEntity;
	private DockerImage dockerImage;
	/**
	 * Push registry refer to one where hyscale will push the final image
	 */
	private ImageRegistry pushRegistry;
	/**
	 * Pull registry is required to pull intermediate image
	 * Ex: In case stack image refers to image in private registry
	 */
	private ImageRegistry pullRegistry;
	private String serviceName;
	private String appName;
	private String version;
	private Map<String, String> buildArgs;
	private boolean verbose;
	private boolean tail;
	private boolean stackAsServiceImage;
	private String imageShaSum;
	private String buildLogs;
	private String pushLogs;

	public DockerfileEntity getDockerfileEntity() {
		return dockerfileEntity;
	}

	public void setDockerfileEntity(DockerfileEntity dockerfileEntity) {
		this.dockerfileEntity = dockerfileEntity;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public DockerImage getDockerImage() {
		return dockerImage;
	}

	public void setDockerImage(DockerImage dockerImage) {
		this.dockerImage = dockerImage;
	}

	public ImageRegistry getPushRegistry() {
		return pushRegistry;
	}

	public void setPushRegistry(ImageRegistry pushRegistry) {
		this.pushRegistry = pushRegistry;
	}

	public ImageRegistry getPullRegistry() {
	    return pullRegistry;
	}

	public void setPullRegistry(ImageRegistry pullRegistry) {
	    this.pullRegistry = pullRegistry;
	}

	public Map<String, String> getBuildArgs() {
	    return buildArgs;
	}

	public void setBuildArgs(Map<String, String> buildArgs) {
		this.buildArgs = buildArgs;
	}

	public boolean isVerbose() {
		return verbose;
	}

	public void setVerbose(boolean verbose) {
		this.verbose = verbose;
	}

	public boolean isTail() {
		return tail;
	}

	public void setTail(boolean tail) {
		this.tail = tail;
	}

	public boolean isStackAsServiceImage() {
		return stackAsServiceImage;
	}

	public void setStackAsServiceImage(boolean stackAsServiceImage) {
		this.stackAsServiceImage = stackAsServiceImage;
	}

	public String getImageShaSum() {
		return imageShaSum;
	}

	public void setImageShaSum(String imageShaSum) {
		this.imageShaSum = imageShaSum;
	}

	public String getBuildLogs() {
		return buildLogs;
	}

	public void setBuildLogs(String buildLogs) {
		this.buildLogs = buildLogs;
	}

	public String getPushLogs() {
		return pushLogs;
	}

	public void setPushLogs(String pushLogs) {
		this.pushLogs = pushLogs;
	}
}

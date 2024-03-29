/**
 * Copyright 2023 safenet-auth-commons
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Represents a challenge to be used in the authentication process. This class includes a name, data, and state. The name and data
 * fields describe the challenge, while the state field is used to track the progress of the challenge across multiple requests.
 * This class is used in conjunction with the AuthenticationRequest and AuthenticationResponse classes to provide a secure and
 * reliable authentication process.
 *
 * @author Cina Shaykhian
 * @contact hello@onewelco.me
 */
package com.thalesdemo.safenet.auth.commons;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(title = "AuthenticationChallenge")
public class AuthenticationChallenge {

    /**
     * The name of the challenge.
     */

    @Schema(description = "Challenge name", example = "GrIDsure")
    private String challengeName;

    /**
     * The data associated with the challenge.
     */

    @Schema(description = "Challenge data", example = "1111122222333334444455555")
    private String challengeData;

    /**
     * The state of the challenge.
     */

    @Schema(description = "Challenge state", example = "PPPPQQQQRRRR")
    private String state;

    /**
     * Empty constructor for AuthenticationChallenge class.
     */

    public AuthenticationChallenge() {
        this.state = this.challengeData = this.challengeName = "";
    }

    /**
     * Constructs a new instance of the {@code AuthenticationChallenge} class with
     * the specified challenge name, data, and state.
     *
     * @param name  the name of the challenge
     * @param data  the data associated with the challenge
     * @param state the current state of the challenge
     */

    @JsonCreator
    public AuthenticationChallenge(
            @JsonProperty("name") String name,
            @JsonProperty("data") String data,
            @JsonProperty("state") String state) {
        this.setChallengeName(name)
                .setChallengeData(data)
                .setState(state);
    }

    /**
     * Getter method for the challenge data.
     *
     * @return The challenge data.
     */

    @JsonGetter("data")
    public String getChallengeData() {
        return challengeData;
    }

    /**
     * Set the challenge data.
     *
     * @param challengeData The challenge data.
     *
     * @return The updated AuthenticationChallenge object.
     */

    @JsonSetter("challenge")
    public AuthenticationChallenge setChallengeData(String challengeData) {
        this.challengeData = challengeData;
        return this;
    }

    /**
     * Get the challenge state.
     *
     * @return The challenge state.
     */

    @JsonGetter("state")
    public String getState() {
        return state;
    }

    /**
     * Sets the state of this authentication challenge.
     *
     * @param state the state to set for this authentication challenge
     * @return the updated AuthenticationChallenge object
     */
    @JsonSetter("state")
    public AuthenticationChallenge setState(String state) {
        // Set the state of this authentication challenge to the provided state, or an
        // empty string if null
        this.state = state == null ? "" : state;
        // Return the updated AuthenticationChallenge object for method chaining
        return this;
    }

    /**
     * Get the challenge name.
     *
     * @return The challenge name.
     */

    @JsonGetter("name")
    public String getChallengeName() {
        return challengeName;
    }

    /**
     * Set the challenge name.
     *
     * @param challengeName The challenge name.
     *
     * @return The updated AuthenticationChallenge object.
     */

    @JsonSetter("name")
    public AuthenticationChallenge setChallengeName(String challengeName) {
        this.challengeName = challengeName;
        return this;
    }

}
